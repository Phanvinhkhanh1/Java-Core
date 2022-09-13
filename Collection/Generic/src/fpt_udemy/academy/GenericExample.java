package fpt_udemy.academy;


public class GenericExample {
    public static void main(String[] args) {
        KeyValuePair<Integer, String> keyValuePair = new KeyValuePair<>(100, "Phan Vinh Khanh");
        Integer key = keyValuePair.getKey();
        String value = keyValuePair.getValue();
        System.out.println("Key = " + key + ", " + "Value = " + value);
    }
}
