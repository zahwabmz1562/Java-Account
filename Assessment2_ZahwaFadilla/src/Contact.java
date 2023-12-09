public class Contact {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private Address address;

    public Contact(String name, String emailAddress, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        System.out.println("Alamat Detail");
        address = new Address("Probolinggo" , "1562" , "jl Ahmad Yani no 3");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void contactDetail(){
        System.out.println("============Data diri pengguna ==============");
        System.out.println("Nama: " + name);
        System.out.println("Alamat Email: " + emailAddress);
        System.out.println("Nomor Telepon: " + phoneNumber);
        System.out.println("Kota: " + address.getCity());
        System.out.println("Kode Pos: " + address.getPostalcode());
        System.out.println("Alamat Lengkap: " + address.getAddressDetail());
        System.out.println("================================================");
    }
}


