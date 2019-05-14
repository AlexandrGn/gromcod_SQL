package lesson6.Homework3;

public class Categories {
    private long id;
    private String Name;
    private String Decsription;
    private String pictureLink;

    public Categories(long id, String name, String decsription, String pictureLink) {
        this.id = id;
        Name = name;
        Decsription = decsription;
        this.pictureLink = pictureLink;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getDecsription() {
        return Decsription;
    }

    public String getPictureLink() {
        return pictureLink;
    }
}
