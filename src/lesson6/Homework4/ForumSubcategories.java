package lesson6.Homework4;

import java.util.Date;

public class ForumSubcategories {
    private long id;
    private ForumCategories forumCategories;
    private String title;
    private String description;
    private Date date;
    private long ip;

    public ForumSubcategories(long id, ForumCategories forumCategories, String title, String description, Date date, long ip) {
        this.id = id;
        this.forumCategories = forumCategories;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public ForumCategories getForumCategories() {
        return forumCategories;
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
