package employeeApp.enums;

public enum Plan {
    BASİC("BASİC", 10000.00),
    MEDİUM("MEDİUM", 5000.00),
    ADVANCED("ADVANCED", 9000.00);

    private String name;
    private double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
