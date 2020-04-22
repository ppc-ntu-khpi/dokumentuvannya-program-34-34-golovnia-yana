package domain;
/**
 * Клас, який представляє редактора
 * @author Asus
 */
public class Editor extends Artist {
/**
 * Ініціалізує змінні
 * @param electronicEditing
 * @param skiils
 * @param name
 * @param jobTitle
 * @param level
 * @param dept 
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
 * Ініцілізує змінні
 * @param electronicEditing
 * @param skiils 
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
/**
 * Ініціалізує змінні
 * @param electronicEditing 
 */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    public Editor() {
        super();
        this.electronicEditing = true;
    }
/**
 * Вивід значень
 * @return s
 */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
/**
 * Метод, що дає можливість отримати значення
 * @return electronicEditing
 */
    public boolean getPreferences() {
        return electronicEditing;
    }
/**
 * Метод, що встановлює вподобання
 * @param electronic 
 */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
