package generic;

public class Generic<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Example with Integer
        Generic<Integer> intObj = new Generic<>();
        intObj.setValue(10);
        System.out.println("Integer value: " + intObj.getValue());

        // Example with String
        Generic<String> strObj = new Generic<>();
        strObj.setValue("Hello");
        System.out.println("String value: " + strObj.getValue());
    }
}
