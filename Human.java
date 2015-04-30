
/**
 * Human is a basic Creature
 * 
 * @author (your name) 
 * @version April 20, 2015
 */
public class Human extends Creature 
{
    // empty class - just for making creature concreate
    
    Human(){
        super();
    }
    
    Human(int str, int hp){
     //   if(str > 20){
    //        str = 20;  // cap max str
    //    }
        
    //    if(hp > 25){
    //        hp = 25;  //cap max hp
    //}
    
    super(hp, str);
}
}