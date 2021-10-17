public class Human{
    private String name;
    protected int strength = 3; 
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    private static int numberOfHumans = 0;

    public Human (String name){
        this.name = name;
        numberOfHumans ++;// counts Human instances and stores
    }
    public static int humanCount(){
        System.out.println("there are "+ numberOfHumans + " Humans");
        return numberOfHumans;
    }
    
    public String dispayName(){
        return this.name;
    }

    public int getStrengthLevel(){
        return this.strength;
    }
    public void changeStrengthLevel(int number){
        this.stealth += number;
    }

    public int getStealthLevel(){
        return this.stealth;
    }

    public int getIntelligenceLevel(){
        return this.intelligence;
    }

    public int getHealthLevel(){
        return health;
    }

    public void healthToZero(){
        this.health = 0;
    }    

    public void increaseHealth(int num){
        this.health += num;
    }
    public void decreaseHealth(int amount){ 
        this.health -= amount;
    }

    public void attack(Human opponet){ //choose opponet when method is called
        System.out.println(opponet.dispayName() + " was attacked by " + this.name); 
        opponet.decreaseHealth(strength); //opponent health is decreased by attackers strength level
    }
}
