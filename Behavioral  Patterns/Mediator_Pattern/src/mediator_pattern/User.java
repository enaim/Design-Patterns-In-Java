package mediator_pattern;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;
    
    public User(ChatMediator meditor, String name){
        this.mediator = meditor;
        this.name = name;
    }
    
    public abstract void send(String message);
    public abstract void recieve(String message);
}