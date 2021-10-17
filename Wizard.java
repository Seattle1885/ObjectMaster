public class Wizard extends Human {
    private int health = 50;
    private int intelligence = 8;
    private static int wizardCount = 0;

    public Wizard(String name) {
        super(name);
        wizardCount++;
    }
    public static int wizardsCount(){
        System.out.println("there are "+ wizardCount + " wizards");
        return wizardCount;
    }

    public String deathMessage(){
        System.out.println("Sorry "+ this.dispayName()+ ", you're dead");
        return "Sorry,"+ this.dispayName()+ " you're dead";
    }

    public int getHealthLevel(){
        if (health <= 0){
            deathMessage();
        }
        return this.health;
    }

    public void increaseHealth(int intelligence){
        this.health += intelligence;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    //method to heal(human) by wizards intelligence
    public void heal(Human healHuman){
        healHuman.increaseHealth(intelligence);       
    }

    public void decreaseHealth(int amount){ 
        this.health -= amount;
    }

    public void fireball(Human opponent){
        System.out.println("opponent is :" + opponent.dispayName());
        System.out.println(this.dispayName()+ "'s Strength is : " + strength);
        System.out.println("Intelligence is :"+intelligence);
        opponent.decreaseHealth(intelligence * 3);   
    }
}
