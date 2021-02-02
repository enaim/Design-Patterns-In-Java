package mediator_pattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<User>users;
    
    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }
    
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users)
        {
            if(u != user)
                u.recieve(message);
        }
    }

}