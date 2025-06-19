class parent{
    void hi(){
        System.out.println("Hi I am ABC");
    }
}
class child extends parent{
    void intro(){
        System.out.println("I am student at ABD");
    }  
  
}
class grandchild extends child{
    void coure(){
        System.out.println("I am studing AIML");
    }
}
public class multilevelinh {
       public static void main(String[] args) {
    // parent p= new parent();
    // p.hi();
    // child c=new child();
    // c.hi();
    // c.intro();
    grandchild g=new grandchild();
    g.hi();
    g.intro();
    g.coure();
   }
    
}
