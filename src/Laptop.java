public class Laptop implements Comparable<Laptop> {
    int ram;
    int price;
    String brandName;

    public Laptop(int ram, int price, String brandName) {
        super();
        this.ram = ram;
        this.price = price;
        this.brandName = brandName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", price=" + price +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public int compareTo(Laptop o) {
        return this.ram>o.ram?1:-1;
    }
}
