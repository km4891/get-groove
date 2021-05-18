import java.util.*;

public class getgroove {

    public static class Getgroove {

        
        Scanner s = new Scanner(System.in);
        int mood;
            String[] popSongs = {"Try feeding it", "Change the diaper", "Pick up and walk around", "Take temperature"};
            String[] metalSongs = {"Give baby your attention", "Try a nap", "Move or change locations", "Go for a drive", };
            String[] hippySongs = {"Keep doing what you are doing until your baby's mood changes"};
            int popindex = 0;
            int metalindex = 0;
            int hippyindex = 0;
            String name;
        
        Getgroove() {
            name = s.next();
        }
        
        Getgroove(String name) {
            this.name = name;
        }
        
        void menu() {
            System.out.println("What kind of mood are you in " + name + "?");
            System.out.println("   1. I feel like bubblegum");
            System.out.println("   2. I want to breaking something tonight");
            System.out.println("   3. I'm crunchy peanut on toast");
            System.out.println("   4. Let's get transcendental");
       
            mood = s.nextInt();
            
            if (mood == 1) {               
                int sz = popSongs.length;
                if (popindex >= sz) popindex = 0;
                System.out.println("I suggest you " + popSongs[popindex]);
                popindex++;
                
                System.out.println("Did that solve the issue? (y/n)");
                char c = s.next().charAt(0);
                if (c == 'y') mood = 3;
                
            } else if (mood == 2) {
                
                int sz = metalSongs.length;
                if (metalindex >= sz) metalindex = 0;
                System.out.println("I suggest you " + metalSongs[metalindex]);
                metalindex++;
                
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
