package Participant;

public class Player {
    private String name;
    private String username;
    private int age;

    public Player(int id,String name, String username, int age) {
        this.id=id;
        this.name = name;
        this.username = username;
        this.age = age;
    }
    public Player(int id){
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
