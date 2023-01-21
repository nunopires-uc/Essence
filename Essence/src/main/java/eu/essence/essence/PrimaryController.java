package eu.essence.essence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class PrimaryController{
    
    @FXML
    private ComboBox<?> CollectionComboBox;

    @FXML
    private MenuItem EditBgc;

    @FXML
    private MenuItem EditFont;

    @FXML
    private MenuItem ExportCollectionPDF;

    @FXML
    private ListView<String> ListViewNotes;

    @FXML
    private MenuItem NewNote;

    @FXML
    private TextArea NoteDescription;

    @FXML
    private MenuItem OpenNote;

    @FXML
    private MenuItem SaveNote;

    @FXML
    private MenuItem SetSaveOnline;

    @FXML
    private TextField Title;
    
    @FXML
    private Button MyButton;
    
    @FXML
    private Label SaveCondition;
    
    private boolean currentNobelSaved = false;
    
    private File file;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void setDescription() throws IOException{
        NoteDescription.setText("Start");
    }
   
    @FXML
    private void getDescription(){
        System.out.println(NoteDescription.getText());
    }
    
    @FXML
    public void initialize(){
        
        NoteDescription.setStyle("-fx-focus-color: transparent;-fx-faint-focus-color: transparent;");
        NoteDescription.setText("Start");
        //ListViewNotes = new ListView<String>();  
        ListViewNotes.getItems().add("oi");
        SaveNote.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));
    }
    
    @FXML
    private void newNote(){
        Title.setText("");
        NoteDescription.setText("");
        currentNobelSaved = false;
    }
    
    @FXML
    private void DescriptionUpdated(){
        SaveCondition.setText("*");
    }
    
    @FXML
    private void writeNote(){
        
        Nobel myNobel = new Nobel();
        
        if(!currentNobelSaved){
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save");
            fileChooser.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.*"));
            //File file = fileChooser.showOpenDialog(new Stage());
            file = fileChooser.showSaveDialog(new Stage());
        }
        
        System.out.println(file.getAbsolutePath());
        
        try{
            String filename = file.getName();
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(NoteDescription.getText());
            myWriter.close();
            SaveCondition.setText("");
            System.out.println("File Written");
            
            if (Title.getText().equals("")){
                ListViewNotes.getItems().add(filename);
            }else{
                ListViewNotes.getItems().add(Title.getText());
            }
            
            currentNobelSaved = true;
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
