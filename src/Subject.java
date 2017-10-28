import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    public void unSubcribe(Observer observer){
        observers.remove(observer);
    }

    protected void notifyObservers(){
        for (Observer ob :observers) {
            ob.updateWeather(this);
        }
    }

}
