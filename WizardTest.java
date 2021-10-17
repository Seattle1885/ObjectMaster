public class WizardTest {
    public static void main(String[] args) {
        Wizard MerlinWizard = new Wizard("Merlin");
        Wizard HoudiniWizard = new Wizard("Houdini");
        Human Chris = new Human("Chris");
        Ninja NinjaTom = new Ninja("Ninja Tom");
        Samurai SamuraiTim = new Samurai("Samurai Tim");
        //System.out.println(Chris.dispayName());

        //System.out.println(NinjaTom.dispayName()+ " stealth level is at "+ NinjaTom.getNinjaStealth());
        
        Chris.attack(MerlinWizard);

        //System.out.println(MerlinWizard.getStrengthLevel()); //display wizard health default from Human class 100

        System.out.println(HoudiniWizard.dispayName() + " health is : "  + HoudiniWizard.getHealthLevel());
        //System.out.println(HoudiniWizard.dispayName() + " was attacked ");
        MerlinWizard.fireball(HoudiniWizard);
        System.out.println(HoudiniWizard.dispayName() + " health is : "  + HoudiniWizard.getHealthLevel());
        MerlinWizard.heal(HoudiniWizard);
        MerlinWizard.heal(HoudiniWizard);
        MerlinWizard.heal(HoudiniWizard);
        System.out.println(HoudiniWizard.dispayName()+ " health is : "+ HoudiniWizard.getHealthLevel());
        Wizard.wizardsCount();
        Human.humanCount();
        NinjaTom.dispayName();
        Ninja.getNinjaCount();
        Samurai.getSamuraiCount();

        SamuraiTim.attack(MerlinWizard);
        SamuraiTim.getHealthLevel();
        
        SamuraiTim.deathBlow(MerlinWizard);

        System.out.println(SamuraiTim.dispayName() + " current health is :" + SamuraiTim.getHealthLevel());
        MerlinWizard.getHealthLevel();
        SamuraiTim.getHealthLevel();
        SamuraiTim.meditate();
        SamuraiTim.getHealthLevel();
    }
}
