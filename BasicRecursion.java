//Basic Recursion

class BasicRecursion{

//print something N Times
static void printNTimes(int n){
  // base condition
  // tail recursion
  /*util n is -greater than 0, we will recursivly call the fuction and print the hello. When the n will reach to 0 then if condtion become false and the fuction will compleate its excution and return to the caller and after the caller mathod there is no statement in the fuction so return back and back to the main.*/
  if(n>0){
    System.out.println("Hello");
	printNTimes(n-1);
  }
}

// print name for n time using head recursion
static void printNameNTimes(int n){
	// head recursion
	/* util n is greater than 0. we are recursivly calling the printNameNTimes once the n become lesser than 0, we will be retunred to the caller function and excute the other statement. in this case printing name is the statement will run after every return and print the name.*/
	if(n>0){
		printNameNTimes(n-1);
		System.out.println("JaiShreeRam");
	}
}

// now we have to print 1 to n using recursion
static void print1TOn(int n){
	
	//As we know that head recursion will help to print 1 to n because we are taking n in the parameter
	/* until, n>0 we will do recursivly call and once it will become 0 then condition will become falase and will return to the caller and excute ahead which means it will return from 0 and at that time n values will be one because print1TOn is called by 0 parameter then it got returned so after that we have printed n which means it will print and will return to the caller back and again print and do the same and return to the main method*/
	if(n>0){
		print1TOn(n-1);
		System.out.println(n);
	}
}

// print n to 1 using recursion
static void printnTO1(int n){
	// Tail recursion 
	/* if the n is greater than 0 the first we are printing the number and than we are calling to printnTO1 with n-1 parameter once n will become 0 than method excution will comeplete and return to the caller and after the caller we dont have any task to do we will return back to the main*/
	if(n>0){
		System.out.println(n);
		printnTO1(n-1);	
	}
}

// add n natural number
static int add10Natural(int n){
	/*we are calling add10Natural method until n becomes n becomes 0 the function work will be completed and will return the n whic means 0 and add with n ns the addtion of n and the trun will be return to the caller and agian will add with and return to the caller finally all the n values will be added and return back to main */
	if(n>0){
		return n+add10Natural(n-1);
	}
	return n;
}

//Factorial of n number

static int factOfN(int n){
	// the smiler to the addition of n natural numbers
	if(n>1){
		return n*factOfN(n-1);
	}
	return n;
}

static void reversArr(int[] arr,int n){
	//For revercing the arr, We are going to half of the arr and swaping the items from the array
	if(n>(arr.length-1)/2){
		swap(arr,n,(arr.length-1)-n);
		reversArr(arr,n-1);
	}
}

static void swap(int[] arr,int index1,int index2){
	int temp=arr[index1];
	arr[index1]=arr[index2];
	arr[index2]=temp;
}

// we have to check if the string is palidrom or not using recursion

static String strPalin(String str, int n){
	if(n>(str.length()-1)/2){
		if(str.charAt(n)==str.charAt((str.length()-1)-n)){
			strPalin(str,n-1);
		}else{
			return "String is not palindrom";
		}
	}
	return "String is palindrom";
	
}

static int fabonacciNum(int n){
	// fabonacci Number 0 1 1 2 3
	
	if(n<=1){
		return n;
	}
	
    int last=fabonacciNum(n-1);
	int sLast=fabonacciNum(n-2);
	
	
	return last+sLast;
	
	
}


public static void main(String[] args){
	int arr[]={10,20,30,40,50,60,70,80,90,100};
	//reversArr(arr,arr.length-1);
	//for(int item:arr){
		//System.out.println(item);
	//}
	//String str="naman";
	//System.out.println(strPalin(str, str.length()-1));
 //System.out.println(factOfN(5));
    System.out.println(fabonacciNum(4));

}

}