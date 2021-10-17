public class HumanTest {
    public static void main(String[] args) {
        Human Gonzo = new Human("Gonzo");
        Human Rizzo = new Human("Rizzo");
        System.out.println(Gonzo.dispayName() + "'s health is : " + Gonzo.getHealthLevel());
        Rizzo.attack(Gonzo);
        System.out.println(Gonzo.dispayName() + "'s health is : " + Gonzo.getHealthLevel());
    }
}
