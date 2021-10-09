package homework.tema7_MyMobilePhone;

public class Contacts {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contacts(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static Contacts createContact (String firstName, String lastName, String phoneNumber) {
        return new Contacts(firstName, lastName, phoneNumber);
    }

    public static void addNewContact (String firstName,String lastName, String phoneNumber) {
        Contacts newContact = Contacts.createContact(firstName,lastName,phoneNumber);
    }



}
