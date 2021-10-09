package homework.tema7_MyMobilePhone;

public class Calls {
    private Contacts contact;


    public Calls(Contacts contact) {
        this.contact = contact;
    }


    @Override
    public String toString() {
        return "Calls{" +
                "phoneNumber='" + contact + '\'' +
                '}';
    }
}
