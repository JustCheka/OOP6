package homework;

public class PersisterReport implements Reportable{
    private final User user;

    public PersisterReport(User user){
        this.user = user;
    }
    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
