package recurrsion;

public class Pattern {
    static void main() {
        pattern(1 ,1 ,5);
    }
    static void pattern(int row ,int col ,int n){
              if(row > n)return ;
              if(col > row) {
                  System.out.println();
                  pattern(row+1,1,n);
                  return;
                 }
              System.out.print("*");
              pattern(row,col+1,n);

    }
}














/*static void pattern(int n,int stars){
        if(n<=0){
            return;
        }
        printPatternforRow(stars);
        System.out.println();
        pattern(n-1,5);
    }
    static void printPatternforRow(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        printPatternforRow(n-1);*/

        /*for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();*/
