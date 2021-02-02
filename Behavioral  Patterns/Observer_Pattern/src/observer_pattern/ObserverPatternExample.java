package observer_pattern;

public class ObserverPatternExample {

    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("First state chnage: 15");
        subject.setState(15);
        
        System.out.println("Second state chnage: 10");
        subject.setState(10);
    }
    
}
