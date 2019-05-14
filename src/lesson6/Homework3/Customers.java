package lesson6.Homework3;

public class Customers {
    private long id;
    private String name;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private long postalCode;
    private String country;
    private long phone;
    private long fax;

    public Customers(long id, String name, String contactName, String contactTitle, String address,
                     String city, String region, long postalCode, String country, long phone, long fax) {
        this.id = id;
        this.name = name;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public long getPhone() {
        return phone;
    }

    public long getFax() {
        return fax;
    }
}
