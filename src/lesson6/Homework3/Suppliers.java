package lesson6.Homework3;

public class Suppliers {
    long supplierId;

    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private long postalCode;
    private String country;
    private long phone;
    private long fax;
    private String home_page;

    public Suppliers(long supplierId, String companyName, String contactName, String contactTitle,
                     String address, String city, String region, long postalCode, String country,
                     long phone, long fax, String home_page) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.home_page = home_page;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public String getCompanyName() {
        return companyName;
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

    public String getHome_page() {
        return home_page;
    }
}
