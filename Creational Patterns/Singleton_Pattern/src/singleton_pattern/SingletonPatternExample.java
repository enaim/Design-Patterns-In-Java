package singleton_pattern;

public class SingletonPatternExample {

    public static void main(String[] args) {
        
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
