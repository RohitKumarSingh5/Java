abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "DatabasePersistence";
    }
}
class Client{
    public String persist(){
        return "Client";
    }
}
public class Assignment2Q6 {
    public static void main(String[] args) {
        Client c = new Persistence();
        FilePersistence f = new FilePersistence();
        DatabasePersistence d = new DatabasePersistence();
        System.out.println(c.persist());
        System.out.println(f.persist());
        System.out.println(d.persist());
    }
}