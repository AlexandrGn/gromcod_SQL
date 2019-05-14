package lesson6.Homework3;

public class Shippers {
    private long id;
    private String name;
    private long phone;

    public Shippers(long id, String name, long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }
}
