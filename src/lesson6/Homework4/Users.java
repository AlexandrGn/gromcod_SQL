package lesson6.Homework4;

import java.util.Date;

public class Users {
    private long id;
    private String nick;
    private String password;
    private String email;
    private Date date;
    private Float karma;
    private long ip;

    public Users(long id, String nick, String password, String email, Date date, Float karma, long ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.date = date;
        this.karma = karma;
        this.ip = ip;
    }

    public long getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate() {
        return date;
    }

    public Float getKarma() {
        return karma;
    }

    public long getIp() {
        return ip;
    }
}
