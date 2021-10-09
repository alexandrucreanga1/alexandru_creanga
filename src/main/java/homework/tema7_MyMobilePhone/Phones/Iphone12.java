package homework.tema7_MyMobilePhone.Phones;

import homework.tema7_MyMobilePhone.Contacts;
import homework.tema7_MyMobilePhone.Message;

import java.util.ArrayList;

public class Iphone12 extends MyMobilePhone {

    private final int batteryLife;

    public Iphone12 (String brand, String model, int batteryLife, String myNumber) {
        super(brand, model,batteryLife, myNumber);
        this.setColor("white");
        this.setMaterial("metal");
        this.batteryLife = batteryLife;
        this.setImei("54354375499563248");
        this.setMyContacts(new ArrayList<Contacts>());
        this.setMySentMessages(new ArrayList<Message>());
        this.setMyCalls(new ArrayList<Contacts>());
    }

}
