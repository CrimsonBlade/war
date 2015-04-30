
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature 
{
    // empty class - just for making creature concreate
    
   Demon(){
        super();
    }
    
    Demon(int str, int hp){
     
    
    super(hp, str);
  }
  
  public int attack(){
      //as creature for my damage
      int tempAttackDamage;
      tempAttackDamage = super.attack();
      
      //roll dice (uses Creatue's rand)
      //if less than 5%, damage = damage  + 50
      if(rand.nextInt(20) == 0) {
          tempAttackDamage += 50;
          System.out.println("Foom");
         
        }
      
      
      return tempAttackDamage;
    }
}