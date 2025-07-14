public class Solution{
    public static void main(String[] args){
        int[] head1= {2, 4, 3};
        int[] head2 = {5, 6, 4};
        int firstVal = 0;
        int secondVal = 0;
        int res = 0;
        
        for(int i = 0; i <= head1.length - 3; i++){
            for(int j = 0; j <= head2.length - 3; j++){
                firstVal = Integer.parseInt(
                    head1[i] + "" + head1[i + 1] + "" + head1[i + 2]);
                secondVal = Integer.parseInt(
                    head2[i] + "" + head2[i + 1] + "" + head2[i + 2]);
                
                res = firstVal + secondVal;
            }
        }
        
        System.out.println(res);
    }
}
