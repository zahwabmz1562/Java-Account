public class Address {
    private String city;
    private String postalcode;
    private String addressDetail;

    public Address(String city, String postalcode, String addressDetail) {
        this.city = city;
        this.postalcode = postalcode;
        this.addressDetail = addressDetail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public void infoAdressDetail(){
        System.out.println("Alamat Lengkap");
        System.out.println("City                            : " + city);
        System.out.println("postalcode                      : " + postalcode);
        System.out.println("addressDetail                   : " + addressDetail);
    }
}


