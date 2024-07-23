package advance_pattern;

public class hologram {
    public static void holowgram(int row,int colmn){
        for (int i=1; i<=row; i++){
            for (int j=1; j<=colmn; j++){
                if (i==1 || i==row || j==1 || j==colmn){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        holowgram(4,5);
    }
}
