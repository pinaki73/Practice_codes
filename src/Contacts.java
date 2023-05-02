public class Contacts {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phonenumber;
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Contacts(String f, String l, String a, String c, String s, int z, long p, String e) {
        this.firstname = f;
        this.lastname = l;
        this.address = a;
        this.city = c;
        this.state = s;
        this.zip = z;
        this.phonenumber = p;
        this.email = e;
    }
    public String toString(){
        return ("firstname = "+getFirstname()+ ";lastname = "+getLastname()+ ";address ="+getAddress()+ ";city ="+getCity()+ ";state = "+getState()+ ";zip = "+getZip()+ ";phonenumber = "+getPhonenumber()+ ";email = "+getEmail());
    }
}


