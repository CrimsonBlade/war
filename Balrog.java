
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon 
{
    // empty class - just for making creature concreate
    
   Balrog(){
        super();
        health = 50;
    }
    
    Balrog(int str, int hp){
     
    
    super(hp, str);
  }
  
  public int attack(){
      //as creature for my damage
      int tempAttackDamage;
      tempAttackDamage = super.attack();
      tempAttackDamage += super.attack();
      
            
      
      return tempAttackDamage;
    }
}