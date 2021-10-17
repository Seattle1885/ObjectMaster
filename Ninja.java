public class Ninja extends Human{
    private int stealth = 10;
    private static int NinjaCount = 0;

    public Ninja(String name){ // every intstances created must provide a name in parameters -->("Rob")<-- 
        super(name);
        NinjaCount++; 
    }

    public void steal(Human opponent){
        System.out.println(" ");
        System.out.println("***** Stealing in progress***");
        System.out.println(this.dispayName() + " stole from " + opponent.dispayName());
        System.out.println(this.dispayName() + "s current stealth is : " + this.stealth);
        System.out.println(" ");
        opponent.decreaseHealth(stealth); //opponent health is decreased by attackers stealth level
        System.out.println(this.dispayName() + "'s current health is : " + this.getHealthLevel());
        this.increaseHealth(stealth); 
        System.out.println(this.dispayName() + "'s current health is : " + this.getHealthLevel());
        System.out.println("***** Stealing in progress ended***");
        System.out.println(" ");

    }
    public int getStealthLevel(){ // returns stealth level of Ninja
        return this.stealth;
    }

    public void runAway(){
        System.out.println("****Runaway in progress****");
        System.out.println(this.dispayName()+ " current health is : "+ this.getHealthLevel());
        this.decreaseHealth(10);
        System.out.println("Because you ran away " + this.dispayName() + ", your health is now : " + this.getHealthLevel());
        System.out.println("****Runaway in progress ended****");
        System.out.println(" ");
    }

    public static int getNinjaCount(){ // returns count of intances of Ninja created
        System.out.println("There are "+ NinjaCount + " Ninjas");
        System.out.println(" ");
        return NinjaCount;
    }
}
