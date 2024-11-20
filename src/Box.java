class Box<T> {
    private T item;

    public void put(T item) {
        if (this.item != null) {
            throw new IllegalStateException("Коробка уже занята!");
        }
        this.item = item;
    }

    public T get() {
        if (this.item == null) {
            throw new IllegalStateException("Коробка пуста!");
        }
        T tempItem = this.item;
        this.item = null;
        return tempItem;
    }

    public String isEmpty() {
        return this.item == null ? "да" : "нет";
    }

}