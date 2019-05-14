package lesson6.Homework3;

import java.util.Date;

public class Employees {
    private long id;
    private String lastName;
    private String FirstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private long postalCode;
    private String country;
    private long homePhone;
    private String extension;
    private String photoLink;
    private String notes;
    private String reportsTo;

    public Employees(long id, String lastName, String firstName, String title, String titleOfCourtesy,
                     Date birthDate, Date hireDate, String address, String city, String region,
                     long postalCode, String country, long homePhone, String extension, String photoLink,
                     String notes, String reporstsTo) {
        this.id = id;
        this.lastName = lastName;
        FirstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photoLink = photoLink;
        this.notes = notes;
        this.reportsTo = reporstsTo;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHireDate() {
        return hireDate;
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

    public long getHomePhone() {
        return homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public String getNotes() {
        return notes;
    }

    public String getReportsTo() {
        return reportsTo;
    }
}
