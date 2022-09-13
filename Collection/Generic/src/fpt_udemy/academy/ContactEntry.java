package fpt_udemy.academy;

public class ContactEntry<K, V, T> extends KeyValuePair<K, V> {

    private T obj;

    public ContactEntry(K key, V value, T obj) {
        super(key, value);
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
