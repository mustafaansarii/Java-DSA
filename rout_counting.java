public class rout_counting {
    public static void main(String[] args) {
        String dir="NS";
        int n=dir.length();
        int x=0, y=0;
        for (int i=0;i<n; i++){
            char dire=dir.charAt(i);
            if (dire=='S'){
                y--;
            }else if(dire=='N') {
                y++;
            }
            else if(dire=='W') {
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        System.out.println((float)Math.sqrt((X2+Y2)));

    }
}
