package lesson6.Homework4;

import java.util.Date;

public class ForumPosts {
    private long id;

    private ForumSubcategories forumSubcategories;
    private ForumCategories forumCategories;
    private ForumPosts parrentForumPosts;

    private String title;
    private String content;
    private boolean isPoll;
    private Date date;
    private long ip;

    public ForumPosts(long id, ForumSubcategories forumSubcategories, ForumCategories forumCategories,
                      ForumPosts parentForumPosts, String title, String content, boolean isPoll, Date date, long ip) {
        this.id = id;
        this.forumSubcategories = forumSubcategories;
        this.forumCategories = forumCategories;
        this.parrentForumPosts = parrentForumPosts;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public ForumSubcategories getForumSubcategories() {
        return forumSubcategories;
    }

    public ForumCategories getForumCategories() {
        return forumCategories;
    }

    public ForumPosts getParrentForumPosts() {
        return parrentForumPosts;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isPoll() {
        return isPoll;
    }

    public Date getDate() {
        return date;
    }

    public long getIp() {
        return ip;
    }
}
