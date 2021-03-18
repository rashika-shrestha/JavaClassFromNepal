package day14_Constructor_thisConcept;


//constructor overloading
public class User {

    String username;
    int age;

    public User(){
        System.out.println("default constructor called");
    }
    public User(String u){
    }
    public User(int a){
    }

    public User(String u, int a) {
        username = u;
        age = a;
        System.out.println("argumented constructor called");
    }

    public User(int a, String u) {
        username = u;
        age = a;
        System.out.println("argumented constructor called");
    }

    public static void main(String[] args) {
        User user1 = new User("raju", 11);
        User user2 = new User();
    }
}
