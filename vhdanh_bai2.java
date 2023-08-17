public class vhdanh_bai2{


    public static void main(String[] args) {
        double tong=0;
        int n = 6;

        for(int i=1; i<n+1;i++){

        if(i%2==0){

            tong = tong + (1.0/i);
        }

        }

        System.out.println("Tong ket qua la = " + tong );
    }


}