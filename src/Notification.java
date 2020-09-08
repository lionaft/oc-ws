public class Notification {
    private int id;
    private String name;
    private String description;

    public Notification(int Id, String Name, String Description) {
        id = Id;
        name = Name;
        description = Description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
