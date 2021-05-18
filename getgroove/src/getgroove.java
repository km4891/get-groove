import java.util.*;

public class getgroove {

    public static class Getgroove {

        
        Scanner s = new Scanner(System.in);
        int mood;
            String[] cryingsolutions = {"Try feeding it", "Change the diaper", "Pick up and walk around", "Take temperature"};
            String[] fussysolutions = {"Give baby your attention", "Try a nap", "Move or change locations", "Go for a drive", };
            String[] happysolutions = {"Keep doing what you are doing until your baby's mood changes"};
            int cryingindex = 0;
            int fussyindex = 0;
            int happyindex = 0;
            String name;
        
        Getgroove() {
            name = s.next();
        }
        
        Getgroove(String name) {
            this.name = name;
        }
        
        void menu() {
            System.out.println("What's wrong with " + name + "?");
            System.out.println("   1) My baby is crying");
            System.out.println("   2) My baby is fussy");
            System.out.println("   3) My baby is happpy");
       
            mood = s.nextInt();
            
            if (mood == 1) {               
                int sz = cryingsolutions.length;
                if (cryingindex >= sz) cryingindex = 0;
                System.out.println("I suggest you " + cryingsolutions[cryingindex]);
                cryingindex++;
                
                System.out.println("Did that solve the issue? (y/n)");
                char c = s.next().charAt(0);
                if (c == 'y') mood = 3;
                
            } else if (mood == 2) {
                
                int sz = fussysolutions.length;
                if (fussyindex >= sz) fussyindex = 0;
                System.out.println("I suggest you " + fussysolutions[fussyindex]);
                fussyindex++;
                
                System.out.println("Did that solve the issue? (y/n)");
                char c = s.next().charAt(0);
                if (c == 'y') mood = 3;
            }       
            
        }
        
        int getmood() {
            return mood;
        }
        String getname() {
            return name;
        }
        
        
    }
   
    
    
    public static void main(String[] args) {

        System.out.println("Name");
        Getgroove name1 = new Getgroove();
        Getgroove name2 = new Getgroove("Fred");
     
        
        
        
        System.out.println("Lets help " + name1.name + " get their groove back");
        while (name1.getmood() != 3) {
            name1.menu();
        }
        System.out.println("Good");
        
        System.out.println("");
        
        System.out.println("Will you help " + name2.name + " get their groove back?");
        while (name2.getmood() != 3) {
            name2.menu();
        }
        System.out.println("Good");
       

    }
     
}
