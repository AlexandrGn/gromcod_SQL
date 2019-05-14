package lesson6.Homework4;

import java.util.Date;

public class ForumPollsOptions {
    private long id;
    private ForumPosts forumPosts;
    private String title;
    private Date date;

    public ForumPollsOptions(long id, ForumPosts forumPosts, String title, Date date) {
        this.id = id;
        this.forumPosts = forumPosts;
        this.title = title;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public ForumPosts getForumPosts() {
        return forumPosts;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }
}
