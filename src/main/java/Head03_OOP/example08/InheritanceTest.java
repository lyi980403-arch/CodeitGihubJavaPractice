package Head03_OOP.example08;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();

        User b = new BusinessUser("U002", "Big show", "bigshow@gmail.com", "WWE");
        b.printUserInfo();
    }
}
