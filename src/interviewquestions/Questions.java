package interviewquestions;

public class Questions {

	public static void main(String[] args) {
		   int arr[]= {3,6,134,785,4536};
	        System.out.println("en büyük eleman:"+getLargeNummer(arr,arr.length));
	        
	    }
	    public static int getLargeNummer(int a[],int total) {
	        int max=0;
	        for(int i=0;i<total;i++) {
	            if(a[i]>max) {
	                max=a[i];
	            }
	        }
	        return max;

	}

}
