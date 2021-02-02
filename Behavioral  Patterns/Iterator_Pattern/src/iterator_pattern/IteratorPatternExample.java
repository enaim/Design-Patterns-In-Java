package iterator_pattern;

public class IteratorPatternExample {

    public static void main(String[] args) {
        NameRepository namesNameRepository = new NameRepository();
        
        Iterator iter = namesNameRepository.getIterator();
        
        while(iter.hasNext())
        {
            String name = (String)iter.next();
            System.out.println("Name: " + name);
        }
    }
    
}
