class DisplayValue<T> {
    T t;

    DisplayValue(T t) {
        this.t = t;
    }

    public void display() {
        System.out.println(t);
    }
}

public class GenericExample {
    public static void main(String args[]) {
        // Integer
        DisplayValue<Integer> iValue = new DisplayValue<>(25);
        iValue.display();

        // Double
        DisplayValue<Double> dValue = new DisplayValue<>(15.6);
        dValue.display();

        // String
        DisplayValue<String> sValue = new DisplayValue<>("Hai");
        sValue.display();
    }
}
