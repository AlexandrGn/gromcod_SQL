package lesson6.Homework4;

import java.util.Date;

public class ForumCategories {
    private long id;
    private String title;
    private String description;
    private Date date;
    private long ip;

    public ForumCategories(long id, String title, String description, Date date, long ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public long getIp() {
        return ip;
    }
}
