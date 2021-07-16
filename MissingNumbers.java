package week1day2;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {5,2,3,4,6,7};
int n=arr1.length+1;
int sum=n*(n+1)/2;
int restSum=0;
for (int i = 0; i < arr1.length; i++) {
    restSum+=arr1[i];
}
int missingNumber=sum-restSum;
System.out.println("The Misssing number is "+missingNumber);

	}

}
