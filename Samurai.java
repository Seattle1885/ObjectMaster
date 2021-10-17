public class Samurai extends Human {
    private int health = 200;
    private static int samuraiCount = 0;

    public Samurai(String name){
        super(name);
        samuraiCount++; // wiil add 1 to each instances is created to count
    }

    public static int getSamuraiCount(){
        System.out.println("There are " + samuraiCount + " Samurais");
        return samuraiCount;
    }

    public String deathMessage(){
        System.out.println("Sorry, you're dead");
        return "Sorry, you're dead";
    }

    public int getHealthLevel(){ // returns Samurai's health
        if (health <= 0){
            deathMessage();
        }
        if (health <= 10){
            System.out.println("Health is low");
        }
        System.out.println(" ");
        System.out.println(this.dispayName() + " current health level is : " + health);
        return this.health;
    }

    public void deathBlow(Human opponent){// opponent lost thier life, health is 0
        System.out.println(" ");
        System.out.println("***** DeathBlow in progress***");
        System.out.println(this.dispayName() + " delt deathBlow technique to " + opponent.dispayName());
        int healthToZero = opponent.getHealthLevel();
        opponent.decreaseHealth(healthToZero);
        health = health / 2;
        System.out.println("***** DeathBlow in progress ended***");
        System.out.println(" ");
    }

    public void meditate(){// heals half of current health and add it
        int halfHealth = health / 2;
        System.out.println("Meditating increased your health by "+ halfHealth);
        health += halfHealth;
    }
}
