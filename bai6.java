public class bai6
{
    
    public static void main(String[] args) {
        
    // Cho dãy số là 10 số

    
    int so_truoc = 0;
    int so_sau = 1;
    int tong=0;


    for(int i=0;i<10;i++){

        System.out.println( so_truoc );
        tong=tong+so_truoc;
        int sum = so_truoc + so_sau;
        so_truoc = so_sau;    
        so_sau = sum;

    }
    System.out.println("Tong trung binh cua day so = " + (Float)(tong/10f)  );

    }
}
