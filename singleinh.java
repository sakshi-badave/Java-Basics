class parent{
    void hi(){
        System.out.println("Hi I am Sakshi");
    }
}
class child extends parent{
    void intro(){
        System.out.println("I am student at MITAOE");
    }  
  
}
public class singleinh {
       public static void main(String[] args) {
    // parent p= new parent();
    // p.hi();
    child c=new child();
    c.hi();
    c.intro();
   }
}

