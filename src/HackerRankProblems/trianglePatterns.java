package HackerRankProblems;

public class trianglePatterns {
    //Printing triangles pattern
    public static void printingTriannglePattern(){
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printingTriannglePattern();
    }
}
