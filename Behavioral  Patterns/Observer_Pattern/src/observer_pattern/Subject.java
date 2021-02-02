package observer_pattern;

import java.util.List;
import java.util.ArrayList;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    
    public int getState(){
        return state;
    }
    
    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObserver(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}