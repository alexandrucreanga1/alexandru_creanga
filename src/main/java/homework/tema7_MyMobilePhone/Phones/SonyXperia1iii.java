package homework.tema7_MyMobilePhone.Phones;

import homework.tema7_MyMobilePhone.Contacts;
import homework.tema7_MyMobilePhone.Message;

import java.util.ArrayList;

public class SonyXperia1iii extends MyMobilePhone {

    private final int batteryLife;

    public SonyXperia1iii(String brand, String model, int batteryLife, String myNumber) {
        super(brand, model,batteryLife, myNumber);
        this.setColor("black");
        this.setMaterial("aluminium");
        this.batteryLife = batteryLife;
        this.setImei("54354375498578324");
        this.setMyContacts(new ArrayList<Contacts>());
        this.setMySentMessages(new ArrayList<Message>());
        this.setMyCalls(new ArrayList<Contacts>());
    }


}