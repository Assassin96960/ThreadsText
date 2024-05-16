public class Cloth implements Comparable<Cloth> {
    String cloth;
    String name;
    double price;

    public Cloth(String cloth, double price) {
        this.cloth = cloth;
        this.price = price;
    }

    public Cloth(String cloth, String name, double price) {
        this.cloth = cloth;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Cloth o) {

        if(this.price<o.price)
        {
            return -1;
        }
        else{return 1;}
    }
}
