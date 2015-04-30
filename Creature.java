import java.util.Random;
/**
 * Abstract class Creature- implements all of its methods but is abstract
 * in order to maintain the context of all combatants being creaures
 * but the 'basic' creature of human exists to give contextual name
 * @author Crosbie and Rutz
 * @version April 20, 2015
 */
public abstract class Creature
{
  protected int health; // when health drops to 0 creature is dead
  private int strength; // used to calcultae maximum damage
  protected static Random rand = new Random();
  
  /**
  * Default constructor with base states of 12 health and strength
  * 
  */  
  Creature(){
      health = 12;
      strength = 12;
      
      // or call the other constructor
      //this (12,12);
   }

   /**
   * Creature recieves h and s to indicate max health and strength
   * 
   * @param h inital hitpoints
   * @param s strength used to determine damage
   */
   Creature(int h, int s){
      health = h;
      strength = s;
  }
  
  /**
   * Attack causes 1 - strength points of damage to Creature
   * 
   * @return damage caused by attack
   */
  public int attack(){
      return rand.nextInt(strength) +  1;
    }
  
    
    /**
     * Take Damge removes d hitpoints from Creatures health
     * 
     * @param damage - damage to subtract from health
     */
    public void takeDamage(int damage){
        health -= damage;
        //health = health - damage;
    }
    
    /**
     * 
     * @return true if health > 0, else false
     */
    public boolean isAlive(){
        boolean alive = false;
            if (health > 0){
                alive = true;
            }
            return alive;
            
        //return health > 0;   this single statement does same thing  
        }
    }
  

