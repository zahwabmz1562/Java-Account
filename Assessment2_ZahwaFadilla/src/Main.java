import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        //PANGGILAN
        System.out.println("NAMA KONTAK");
        Contact ct = new Contact("Zahwa Fadilla" , "zahwafadilla@gmail.com" , "085607728077");
        Contact ct1 = new Contact("zahraatiqah" , "zahrah@gmail.com" , "08233028192981");
        ContactGroup cg = new ContactGroup("PBO");
        Account ac = new Account("ZAHWA" ,"12345");
        System.out.println("=====================================================");
        cg.addContact(ct1);
        cg.addContact(ct);
        cg.openContactGroup(ac);
        System.out.println("TRIMAKASIH !!!");
    }
}

