import java.util.*;

public class getgroove {

    public static class Getgroove {

        
        Scanner s = new Scanner(System.in);
        int mood;
            String[] popSongs = {
                "Britney Spears - Hit Me Baby One More Time (https://www.youtube.com/watch?v=C-u5WLJ9Yk4)",
                "Michael Jackson - Billie Jean (https://www.youtube.com/watch?v=Zi_XLOBDo_Y)", 
                "Madonna - Get Into The Groove (https://www.youtube.com/watch?v=52iW3lcpK5M)",
                "*NSYNC - Bye Bye Bye (https://www.youtube.com/watch?v=Eo-KmOd3i7s)"
            };
            String[] metalSongs = {
                "Limp Bizkit - Break Stuff (https://www.youtube.com/watch?v=ZpUYjpKg9KY)",
                "Twisted Sister - We're Not Gonna Take It (https://www.youtube.com/watch?v=V9AbeALNVkk)",
                "Black Sabbath - Iron Man (https://www.youtube.com/watch?v=5s7_WbiR79E)", 
                "White Zombie - More Human Than Human (https://www.youtube.com/watch?v=E0E0ynyIUsg)" 
            };
            String[] hippySongs = {
                "Jefferson Airplane - White Rabbit (https://www.youtube.com/watch?v=WANNqr-vcx0&)",
                "Strawberry Alarm Clock - Peppermints & Incense (https://www.youtube.com/watch?v=4rw1_FNdy-Y)",
                "Iron Butterfly - In-A-Gadda-Da-Vida (https://www.youtube.com/watch?v=UIVe-rZBcm4)",
                "Jimi Hendrix - Purple Haze (https://www.youtube.com/watch?v=cJunCsrhJjg)"
                };
            String[] loveSongs = {
                "Marvin Gaye - Let's Get It On (https://www.youtube.com/watch?v=9vAiESu5wrA)",
                "Barry White - Can't Get Enough Of Your Love Baby (https://www.youtube.com/watch?v=WASXt0bcl6U)",
                "Clarence Carter - Strokin' (https://www.youtube.com/watch?v=P7gMkiOPSeA)",
                "Salt N Pepa - Push It (https://www.youtube.com/watch?v=vCadcBR95oU)"
            };
            int popindex = 0;
            int metalindex = 0;
            int hippyindex = 0;
            int loveindex = 0;
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
            System.out.println("   4. I'm... uh... you know....");
       
            mood = s.nextInt();
            
            if (mood == 1) {               
                int sz = popSongs.length;
                if (popindex >= sz) popindex = 0;
                System.out.println("I suggest you " + popSongs[popindex]);
                popindex++;
                
                System.out.println( name + ", are you ready to go to the mall and get the latest Tiger Beat? (y/n)");
                char c = s.next().charAt(0);
                if (c == 'y') mood = 3;
                
            } else if (mood == 2) {
                
                int sz = metalSongs.length;
                if (metalindex >= sz) metalindex = 0;
                System.out.println("I suggest you " + metalSongs[metalindex]);
                metalindex++;
                
                System.out.println("Did that get out all your angsty teen anger out? (y/n)");
                char c = s.next().charAt(0);
                if (c == 'y') mood = 5;
            
            } else if (mood == 3) {

                int sz = hippySongs.length;
                if (hippyindex >= sz) hippyindex = 0;
                System.out.println("Grab your bell bottoms and check this out " + hippySongs[hippyindex]);
                hippyindex++;

                System.out.println("Are you all groovy now? (y/n)");
                char c = s.next().charAt(0);
                if (c == 'y') mood = 5;

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
