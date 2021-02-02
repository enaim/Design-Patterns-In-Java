package mediator_pattern;

public class UserImpl extends User{

    public UserImpl(ChatMediator meditor, String name) {
        super(meditor, name);
    }
    
    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending Message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void recieve(String message) {
        System.out.println(this.name + ": Recieved Message: " + message);
    }
    
}