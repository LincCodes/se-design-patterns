import java.util.ArrayList;

public class Inventory implements Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(String message){
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    @Override
    public void addedItem(String item){
            notifyObservers("Added Item - " + item);
    }
    @Override
    public void removedItem(String item){
            notifyObservers("Removed item - " + item);
    }
}