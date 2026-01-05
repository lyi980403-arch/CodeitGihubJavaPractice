class Player {
    private String name;
    private int health;

    Player(String name) {
        this.name = name;
        this.health = 100;
    }

    void receiveDamage(int amount) {
        health -= amount;
        System.out.println(name + " received " + amount + " damage. Remaining health: " + health);
    }
}

public class MessageExample {
    public static void main(String[] args) {
        Player playerA = new Player("Alice");
        Player playerB = new Player("Bob");

        playerB.receiveDamage(30);
    }
}
