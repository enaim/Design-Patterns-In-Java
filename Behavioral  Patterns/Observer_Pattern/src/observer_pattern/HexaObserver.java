package observer_pattern;

public class HexaObserver extends Observer{
    HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
            
    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState() ).toUpperCase());
    }
}