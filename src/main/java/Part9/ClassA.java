package Part9;

public class ClassA {

    public void a(){
        System.out.println("a");
    }

    public static void main(String[] args){

        ClassC c = new ClassC();

        c.a();
        c.b();
        c.c();
    }
}


