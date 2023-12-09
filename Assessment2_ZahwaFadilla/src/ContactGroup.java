public class ContactGroup {
    private String groupName;
    private Contact contact[];
    private int countContact;

    public ContactGroup(String groupName) {
        this.groupName = groupName;
        contact = new Contact[5];
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addContact(Contact contact){
        this.contact[countContact] = contact;
        this.countContact++;
    }

    public void contactGroupDetail() {
        System.out.println("Nama Group = " + groupName);
        for(int i = 0 ; i < countContact ; i++){
            System.out.println("Kontak - "+ (i+1));
            contact[i].contactDetail();
        }
    }

    public boolean openContactGroup(Account acc) {
        if(acc.checkValidity()==true){
            contactGroupDetail();
        }
        else{
            System.out.println("Data kontak anda");
        }
        return false;
    }

}


