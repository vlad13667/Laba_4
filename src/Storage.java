public class Storage<T> {
    private final T item;


    public Storage(T item) {
        this.item = item;
    }


    public T getValue(T alternative) {
        return item != null ? item : alternative;
    }


    public static <T> void printValue(Storage<T> storage, T alternative) {
        T value = storage.getValue(alternative);
        System.out.println("Извлеченное значение: " + value);
    }

}
