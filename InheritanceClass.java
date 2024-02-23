public class InheritanceClass {
    public static void main(String[] args) {
        System.out.println("Printing from Parents Class");
        B.printing();
    }

    public static void ParentMethod(){
        System.out.println("From Parents Method");
    }
}

class B extends InheritanceClass{
    public static void printing(){
        System.out.println("Printing from Child Class");
        System.out.println("Child Class Ends");

        ParentMethod();

    }
}