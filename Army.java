import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
/**
 * Army is an array list that holds a group of creature objects.
 * also can fight against another army or solo creature object.
 * 
 * @author Joseph Rutz 
 * @version 4 22, 2015
 */
public class Army
{
   public ArrayList<Creature> army ;
   public ArrayList<Creature> foe ;
   protected Human human1;
   protected Dwarf dwarf1;
   protected Elf elf1;
   protected Balrog balrog1;
   protected CyberDemon cyberDemon1;
   protected Creature creature1;
   
    /**
     * Creates and empty Army
     */
    Army()
    {
        // initialise instance variables
        army = new ArrayList<Creature>();
    }

    /**
     * Creates and army and fills it with the units you pick
     */
    Army(int humans, int dwarves, int elves, int balrogs, int cyberdemons){
        super();
        army = new ArrayList<Creature>();
        int i;
        foe = new ArrayList<Creature>();
        for(i = 0; i < humans; i++ ){
        
        human1 = new Human();
        
        army.add(human1);
        System.out.println("Human");
       }
       
        for(i = 0; i < dwarves; i++ ){
       
        dwarf1 = new Dwarf();
       
        army.add(dwarf1);
        System.out.println("Dwarf");
       }
        
        for(i = 0; i < elves; i++ ){
        
        elf1 = new Elf();
        
        army.add(elf1);
        System.out.println("Elf");
       }
        
        for(i = 0; i < balrogs; i++ ){
        
        balrog1 = new Balrog();
       
        army.add(balrog1);
        System.out.println("Balrog");
       }
        
        for(i = 0; i < cyberdemons; i++ ){
        
        cyberDemon1 = new CyberDemon();
        
        army.add(cyberDemon1);
        System.out.println("CyberDemon");
       }
        
    }
    
    
   /**
    * Methods to add indivdual units to an army
    */ 
    public void addHuman(Creature Human)
   {
       army.add(Human);
    }
    
    public void addElf(Creature Elf)
   {
       army.add(Elf);
    }
    
   public void addDwarf(Creature Dwarf)
   {
       army.add(Dwarf);
    }
   
   public void addBalrog(Creature Balrog)
   {
       army.add(Balrog);
    } 
    
   public void addCyberDemon(Creature CyberDemon)
   {
       army.add(CyberDemon);
    } 
    
   
   /**
    * Method to alow an army to fight another army
    */ 
   public void goToWar(ArrayList<Creature> foe)
   {
       foe = new ArrayList<Creature>();
       Creature soldier1 = null;
       Creature soldier2 = null;
       int attackDamage1;
       int attackDamage2;
       Iterator<Creature> it = army.iterator();
       Iterator<Creature> itr = foe.iterator();
       if (!soldier1.isAlive()){
        
        while(it.hasNext()) {
           soldier1 = it.next();
           
        }
    }
    if (!soldier2.isAlive()){
          
        while(itr.hasNext()) {
              soldier2 = itr.next();
        }
    }
       
       while(soldier1.isAlive() && soldier2.isAlive()){
           attackDamage1 = soldier1.attack();
           attackDamage2 = soldier2.attack();
           soldier1.takeDamage(attackDamage2);
           soldier2.takeDamage(attackDamage1);
           
        }
        
        
    }
   
   
}
