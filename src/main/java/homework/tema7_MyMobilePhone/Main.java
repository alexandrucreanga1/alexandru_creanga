package homework.tema7_MyMobilePhone;

import homework.tema7_MyMobilePhone.Phones.Iphone12;
import homework.tema7_MyMobilePhone.Phones.MyMobilePhone;
import homework.tema7_MyMobilePhone.Phones.SonyXperia1iii;

public class Main {

    public static void main(String[] args) {
        //initialisation of 2 phones>>>>
        MyMobilePhone iphonePhone = new Iphone12("Iphone","12",10,"722565966");
        MyMobilePhone sonyPhone = new SonyXperia1iii("Sony","Xperia1iii",12,"722565965");

        System.out.println(sonyPhone);
        System.out.println(iphonePhone);

        //setting different color/material for phones>>>
        sonyPhone.setColor("red");
        sonyPhone.setMaterial("metal");

        System.out.println(sonyPhone);

        //creation of contacts>>>
        Contacts firstContact = new Contacts("Alexandru", "Creanga","720265432");
        Contacts secondContact = new Contacts("Ion","Grosu","725565669");

        sonyPhone.addNewContact(firstContact);
        sonyPhone.addNewContact(secondContact);
        sonyPhone.printContacts();

        //Sent messages to both contacts*>>>
        sonyPhone.sendMessage(firstContact,"ljfkhfskfsdjkdhkjshkjdfghfdgkjhk jsdhfdskfjhfdkfhsdkf");
        sonyPhone.sendMessage(secondContact,"ljfkhghfdgkjhk jsdhfdskfjhfdkfhsdkf");

        sonyPhone.printSentMessages();
        System.out.println(sonyPhone);

       // made multiple calls to check the history >>>>
       sonyPhone.makeCall(firstContact);
        sonyPhone.makeCall(secondContact);
        sonyPhone.makeCall(secondContact);
        sonyPhone.printCallsHistory();

    }
}
