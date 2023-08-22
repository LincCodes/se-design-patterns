public interface Observable {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(String message);
    public void addedItem(String item);
    public void removedItem(String item);
}