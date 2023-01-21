/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.essence.essence;

/**
 *
 * @author NunoPires
 */
public class Nobel {
    private String Title, NoteText, Collection;
    private String Hash;
    private String fontFamily, fontStyle, backgroundColor;

    public Nobel(String Title, String NoteText, String Collection, String Hash, String fontFamily, String fontStyle, String backgroundColor) {
        this.Title = Title;
        this.NoteText = NoteText;
        this.Collection = Collection;
        this.Hash = Hash;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.backgroundColor = backgroundColor;
    }

    public Nobel() {
        
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getNoteText() {
        return NoteText;
    }

    public void setNoteText(String NoteText) {
        this.NoteText = NoteText;
    }

    public String getCollection() {
        return Collection;
    }

    public void setCollection(String Collection) {
        this.Collection = Collection;
    }

    public String getHash() {
        return Hash;
    }

    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    
    
    
}
