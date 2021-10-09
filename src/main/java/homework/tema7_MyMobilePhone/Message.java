package homework.tema7_MyMobilePhone;
import homework.tema7_MyMobilePhone.Contacts;

public class Message {
   // private String phoneNumber;
    private Contacts contact;
    private String sms;



    public Message(Contacts contact, String sms) {
        this.contact = contact;
        this.sms = sms;
    }


    @Override
    public String toString() {
        return "Message{" +
                "phoneNumber='" + contact + '\'' +
                ", sms='" + sms + '\'' +
                '}';
    }

}
