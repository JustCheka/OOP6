package homework;

public class PersisterSave implements  Savable{
    private final User user;

    public PersisterSave(User user){
        this.user = user;
    }


    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}