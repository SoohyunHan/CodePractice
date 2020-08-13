package algorithm;

public class ProductAndSumOfDigitsInt {
	public static void main(String args[]){
		ProductAndSumOfDigitsInt aa = new ProductAndSumOfDigitsInt();
		System.out.println(aa.subtractProductAndSum(143));
	}
	public int subtractProductAndSum(int n) {
        int product = 1 ; 
        int sum = 0 ;
        while(true ){
        	if ( n == 0 ) return product - sum;
            int rest = n%10;
            sum = sum + rest;
            product = product * rest;
            n = n / 10;
        }
        
    }
}
