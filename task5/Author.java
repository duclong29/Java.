package exe5;

import javax.swing.undo.AbstractUndoableEdit;

public class Author {
    private String name;
    private String gmail;
    private char gender;

    public Author (String name, String gmail, char gender) {
        this.name = name;
        this.gmail = gmail;
        this.gender = gender;
    }

    public String getName () {
        return name;
    }

    public String getGmail () {
        return gmail;
    }

    public char getGender () {
        return gender;
    }

    public void setGmail (String gmail) {
        this.gmail = gmail;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setGender (char gender) {
        this.gender = gender;
    }

    public String toString () {
        return "Name author is : " + name + ", Gmail author is : " + gmail + ", Gender author is : " + gender;
    }

    public static void main(String[] args) {
        Author a = new Author("chu duc long", "chuduclong29062000@gmail.com", 'm');
        System.out.println("Name author is : " + a.getName());
        System.out.println("Gmail author is : " + a.getGmail());
        System.out.println("Gender author is : " + a.getGender());
        System.out.println(a);
        System.out.println("------------------------------");
        a.setGmail("chuthihuong21081997@gamil.com");
        a.setName("chu thi buong");
        a.setGender('o');
        System.out.println(a);
    }
}
