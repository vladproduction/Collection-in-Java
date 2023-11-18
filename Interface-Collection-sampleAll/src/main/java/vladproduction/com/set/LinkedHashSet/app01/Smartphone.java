package vladproduction.com.set.LinkedHashSet.app01;

public class Smartphone {
    public int price;

    public String toString(){
        return "Smartphone="+price;
    }

    public int hashCode(){
        return price;
    }
}
