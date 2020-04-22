package domain;
/**
 * Клас, який представляє актора
 * @author Asus
 */
public class Artist extends Employee {
/**
 * Ініціалізація змінних
 * @param skiils
 * @param name
 * @param jobTitle
 * @param level
 * @param dept 
 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
/**
 * Ініціалізація навичок
 * @param skiils 
 */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
/**
 * Вивід значень
 * @return String
 */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
/**
 * Отримати значення навичок
 * @return S
 */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Метод, який встановлює нові навички
 * @param skills 
 */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
/**
 * Метод, який повертає список навичок
 * @return skiils
 */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
