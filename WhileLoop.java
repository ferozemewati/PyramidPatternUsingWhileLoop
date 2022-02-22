public class WhileLoop {
    public static void main(String[] args) {
        int a=5, i=1,j=1;
        while (i<=a){
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.print("\n");
            i++;
            j=1;
        }
    }
}
