package homework.tema7_MyMobilePhone.Phones;

import homework.tema7_MyMobilePhone.Contacts;
import homework.tema7_MyMobilePhone.Message;

import java.util.ArrayList;

public class MyMobilePhone {
    private String brand;
    private int batteryLife;
    private String model;
    private String color;
    private String material;
    private String imei;
    private String myNumber;

    private ArrayList<Contacts> myContacts;
    private ArrayList<Message> mySentMessages;
    private ArrayList<Contacts> myCalls;


    public MyMobilePhone(String brand, int batteryLife,String model, String color, String material, String imei, String myNumber) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
        this.mySentMessages = new ArrayList<Message>();
        this.myCalls = new ArrayList<Contacts>();
    }


    public boolean addNewContact(Contacts contact) {
        myContacts.add(contact);
        System.out.println("Contact successfully added.");
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." + this.myContacts.get(i).getFirstName() + " "
                    + this.myContacts.get(i).getLastName() + " "
                    + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean sendMessage(Contacts contact, String sms) {
        if (this.batteryLife >= 1) {
            if (sms.length() <= 500) {
                this.batteryLife -= 1;
                mySentMessages.add(new Message(contact, sms));
                System.out.println("Message Successfully sent.");
                return true;
            }
        }
        return false;
    }

    public void printSentMessages() {
        System.out.println("Sent Messages: ");
        for (int i = 0; i < this.mySentMessages.size(); i++) {
                System.out.println((i + 1) + "." + this.mySentMessages.get(i));
        }
    }

    public boolean makeCall(Contacts contact) {
        if (this.batteryLife >= 2) {
            this.batteryLife -= 2;
            myCalls.add(contact);
            System.out.println("Call Successfully made.");
            return true;
        }
        return false;
    }

    public void printCallsHistory() {
        System.out.println("Calls Made: ");
        for (int i = 0; i < this.myCalls.size(); i++) {
            System.out.println((i + 1) + "." + this.myCalls.get(i).getFirstName()+ " "
                                        +this.myCalls.get(i).getLastName()+ " " + this.myCalls.get(i).getPhoneNumber());
        }
    }



    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public MyMobilePhone(String brand, String model,int batteryLife, String myNumber) {
        this.brand = brand;
        this.model = model;
        this.myNumber = myNumber;
        this.batteryLife = batteryLife;
    }


    @Override
    public String toString() {
        return "MyMobilePhone{" +
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", imei='" + imei + '\'' +
                ", myNumber='" + myNumber + '\'' +
                '}';
    }

    public void setMyContacts(ArrayList<Contacts> myContacts) {
        this.myContacts = myContacts;
    }

    public void setMySentMessages(ArrayList<Message> mySentMessages) {
        this.mySentMessages = mySentMessages;
    }

    public void setMyCalls(ArrayList<Contacts> myCalls) {
        this.myCalls = myCalls;
    }
}
