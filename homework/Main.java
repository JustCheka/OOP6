package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        User user1 = new User("Bob 2");

        PersisterReport report = new PersisterReport(user);
        report.report();

        PersisterSave save = new PersisterSave(user);
        save.save();

        PersisterReport report1 = new PersisterReport(user1);
        report1.report();


        PersisterSave save1 = new PersisterSave(user1);
        save1.save();

    }
}