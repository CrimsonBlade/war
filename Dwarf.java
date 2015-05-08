
/**
 * Dwarf is a hearty warrior with additional health.
 * 
 * @author Joseph Rutz 
 * @version 4 21, 2015
 */
public class Dwarf extends Creature
{
  

   
    
   Dwarf(){
        super();
        health += 10;
    }
    
    Dwarf(int str, int hp){
     
    
    super(hp, str);
  }
  
  
}