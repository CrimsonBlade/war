
/**
 * Elf - magical Creature with 10% chance to do double attack damage
 * 
 * @author Joseph Rutz 
 * @version April 20, 2015
 */
public class Elf extends Creature 
{
    // empty class - just for making creature concreate
    
   Elf(){
        super();
    }
    
    Elf(int str, int hp){
     
    
    super(hp, str);
  }
  
  public int attack(){
      //as creature for my damage
      int tempAttackDamage;
      tempAttackDamage = super.attack();
      
      //roll dice (uses Creatue's rand)
      //if less than 10%, damage = damage * 2
      if(rand.nextInt(10) == 0) {
          tempAttackDamage *= 2;
          System.out.println("Boom");
          //tempAttackDamge = tempAttackDamge * 2;
        }
      
      
      return tempAttackDamage;
    }
}