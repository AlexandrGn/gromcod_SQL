package lesson2;

import java.util.Date;

public class Order {
    private long id;
    private String prodactName;
    private int price;
    private Date dateOrdered;
    private Date dateConfirmed;

    public Order(long id, String prodactName, int price, Date dateOrdered, Date dateConfirmed) {
        this.id = id;
        this.prodactName = prodactName;
        this.price = price;
        this.dateOrdered = dateOrdered;
        this.dateConfirmed = dateConfirmed;
    }

    public long getId() {
        return id;
    }

    public String getProdactName() {
        return prodactName;
    }

    public int getPrice() {
        return price;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }
}
