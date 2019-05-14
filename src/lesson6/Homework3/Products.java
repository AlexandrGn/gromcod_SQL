package lesson6.Homework3;

public class Products {
    private long id;
    private String name;

    private Suppliers suppliers;
    private Categories categories;

    private int quantityPerUnit;
    private int unitPrice;
    private int unitsInStock;
    private int unitsInOrder;
    private int reorderLevel;
    private int discontinued;

    public Products(long id, String name, Suppliers suppliers, Categories categories, int quantityPerUnit,
                    int unitPrice, int unitsInStock, int unitsInOrder, int reorderLevel, int discontinued) {
        this.id = id;
        this.name = name;
        this.suppliers = suppliers;
        this.categories = categories;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsInOrder = unitsInOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public Categories getCategories() {
        return categories;
    }

    public int getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public int getUnitsInOrder() {
        return unitsInOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public int getDiscontinued() {
        return discontinued;
    }
}
