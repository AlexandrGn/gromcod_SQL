package lesson6.Homework3;

import java.util.Date;

public class Orders {
    private long id;

    private Customers customers;
    private Employees employees;
    private Shippers shippers;

    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private String freight;
    private String shipName;
    private String shipAdress;
    private String shipCity;
    private String shipRegion;
    private long shipPostal;
    private String shipCountry;

    public Orders(long id, Customers customers, Employees employees, Shippers shippers, Date orderDate,
                  Date requiredDate, Date shippedDate, String shipVia, String freight, String shipName,
                  String shipAdress, String shipCity, String shipRegion, long shipPostal, String shipCountry) {
        this.id = id;
        this.customers = customers;
        this.employees = employees;
        this.shippers = shippers;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAdress = shipAdress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostal = shipPostal;
        this.shipCountry = shipCountry;
    }

    public long getId() {
        return id;
    }

    public Customers getCustomers() {
        return customers;
    }

    public Employees getEmployees() {
        return employees;
    }

    public Shippers getShippers() {
        return shippers;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public String getShipVia() {
        return shipVia;
    }

    public String getFreight() {
        return freight;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipAdress() {
        return shipAdress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public long getShipPostal() {
        return shipPostal;
    }

    public String getShipCountry() {
        return shipCountry;
    }
}
