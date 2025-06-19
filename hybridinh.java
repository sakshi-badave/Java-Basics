interface grand{
    public void hi();
}
interface parent1 extends grand{
    public void intro();
}
interface parent2 extends grand{
    public void coure();
}
class child implements parent1,parent2 {
    public void hi(){
        System.out.println("Hi I am ABC");
    }
    public void intro(){
        System.out.println("I am studing at ABD");
    }
    public void coure(){
        System.out.println("AIML");
    }
}
public class hybridinh {

    public static void main(String[] args) {
        child c=new child();
        c.hi();
        c.intro();
        c.coure();
    }
}