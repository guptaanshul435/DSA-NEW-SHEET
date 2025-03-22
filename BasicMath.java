//Basic Math
class BasicMath{

// cont the digit from the number
static void countDigit(int num){ 
   while(num>0){
   // it will give me the remender of num%10 means last digit
   int rem=num%10;
   System.out.println(rem);
   // it will give me the fully deviced number (num/10)
   num=num/10;
   }
}

static void reverseNumber(int num){
	int reverse=0;
	while(num>0){
		int rem=num%10;
		reverse=rem+reverse*10;
		num=num/10;
	}
	System.out.println(reverse);
}

static void checkPalindrom(int num){
	int reverse=0;
	int temp=num;
	while(num>0){
		int rem=num%10;
		reverse=rem+reverse*10;
		num=num/10;
	}
	if(temp==reverse){
		System.out.println("Number is palindrom");
	}else{
		System.out.println("Number is not palindrom");
	}
}

public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {  
                a = a % b;
            }
            else {    
                b = b % a;
            }
        }
        if(a == 0) {
            return b;
        }
        return a;
    }
	
	static void findAmstrongNum(int num){
		int amsn=0;
		int temp=num;
		while(num>0){
			int rem=num%10;
			amsn=amsn+(rem*rem*rem);
			num=num/10;
		}
		if(amsn==temp)
			System.out.println("This is an amsn number");
		else 
			System.out.println("This is not an amsn number");
	}
	
	static void allDivisor(int num){ 
		for(int i=1;i<num/2;i++){
			if(num%i==0){
				if(num/i!=i){
				System.out.println(num/i);
				System.out.println(i);
				}
			}
		}
	}
	
	static void primeNumber(int num){
		
		int count=0;
		for(int i=1;i<Math.sqrt(num);i++){
			if(num%i==0){
				++count;
				if(num/i!=i){
					++count;
				}
			}
		}
		if(count==2){
			System.out.println("Number is prime");
		}else{
			System.out.println("Number is not prime");
		}
		
	}
	

public static void main(String args[]){
    int num=17;
	
	int num1=30,num2=40;
    //countDigit(num);
	//reverseNumber(num);
	//checkPalindrom(num);
	//System.out.println(findGcd(num1,num2));
	//findAmstrongNum(num);
	//allDivisor(num);
	
	primeNumber(num);
	
}


}