package lesson6.Homework4;

import java.util.Date;

public class ForumPollsOptionsVotes {
    private long id;

    private ForumPollsOptions forumPollsOptions;
    private Users users;

    private Date date;
    private long ip;

    public ForumPollsOptionsVotes(long id, ForumPollsOptions forumPollsOptions, Users users, Date date, long ip) {
        this.id = id;
        this.forumPollsOptions = forumPollsOptions;
        this.users = users;
        this.date = date;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public ForumPollsOptions getForumPollsOptions() {
        return forumPollsOptions;
    }

    public Users getUsers() {
        return users;
    }

    public Date getDate() {
        return date;
    }

    public long getIp() {
        return ip;
    }
}
