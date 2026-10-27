package patterns;

public class Pyramid {
    static void main() {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5-1-i; j++) {
                System.out.print(" ");

            }
            for(int j = 0; j<(i*2)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
