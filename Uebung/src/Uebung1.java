
public class Uebung1 {
	
			static int fac(int i) {
				return i==0?1:i*fac(i-1);
				}
				public static void main(String[] args) {
				System.out.println("fac(5) = "+fac(5));
			
				System.out.println(fibonacci(x)+", ");}
				
			static long fibonacci(long x){
				if(x<=0){return 0;}
					else {
					if(x==1 || x==2){return 1;}
						else{return(fibonacci(x-2)+fibonacci(x-1));}
				}
			}
		}
