import java.math.BigInteger;
public class pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a= new BigInteger("2");
		int n= 1000;
		BigInteger temp= new BigInteger("10");
		BigInteger sum= new BigInteger("0");
		BigInteger ans=a.pow(n);
		//System.out.println(ans);
		while(ans.compareTo(BigInteger.ZERO)>0) {
			temp=ans.remainder(BigInteger.TEN);
			sum= sum.add(temp);
			ans=ans.divide(BigInteger.TEN);
			System.out.println(ans);
		}
		System.out.println(sum);

	}

}
