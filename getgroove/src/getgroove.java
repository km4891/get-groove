import java.util.*;

public class getgroove {

    public static class Getgroove {

        
        Scanner s = new Scanner(System.in);
        int mood;
            String[] popSongs = {
                "Britney Spears - Hit Me Baby One More Time (https://www.youtube.com/watch?v=C-u5WLJ9Yk4)",
                "Michael Jackson - Billie Jean (https://www.youtube.com/watch?v=Zi_XLOBDo_Y)", 
                "Madonna - Get Into The Groove (https://www.youtube.com/watch?v=52iW3lcpK5M)",
                "*NSYNC - Bye Bye Bye (https://www.youtube.com/watch?v=Eo-KmOd3i7s)"};
            String[] metalSongs = {
                "Limp Bizkit - Break Stuff (https://www.youtube.com/watch?v=ZpUYjpKg9KY)",
                "Twisted Sister - We're Not Gonna Take It (https://www.youtube.com/watch?v=V9AbeALNVkk)",
                "Black Sabbath - Iron Man (https://www.youtube.com/watch?v=5s7_WbiR79E)", 
                "White Zombie - More Human Than Human (https://www.youtube.com/watch?v=E0E0ynyIUsg)", };
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
            System.out.println("   3. I'm crunchy peanut butter on toast");
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
