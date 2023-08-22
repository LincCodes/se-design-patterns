public abstract class Observable {
    abstract public void addObserver(Observer observer);
    abstract public void removeObserver(Observer observer);
    abstract public void notifyObservers();
}
