

class C1{
    C1(){
        System.out.println("Hello C1 Constructor");
    }

    public void hey(){
        System.out.println("Hwllo");
    }
}

class C2 extends C1{
    C2(){
        System.out.println("Hello C2 Constructor");
    }
}



public class InheritanceA {
    public static void main(String[] args) {
        C1 obj = new C1();

    }
}
