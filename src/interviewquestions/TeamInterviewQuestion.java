package interviewquestions;

public class TeamInterviewQuestion {

	public static void main(String[] args) {
		int [] irr= {4,8,19,49,1090};
	    System.out.println("en büyük sayi:"+getLargest(irr,5));
	        
	    }
	    public static int getLargest(int [] a,int total) {
	        int temp;
	        for(int i=0;i<total;i++) {
	            for(int j=i+1;j<total;j++) {
	                if(a[i]>a[j]) {
	                    temp=a[i];
	                    a[i]=a[j];
	                    a[j]=temp;} } }
	                
	            return a[total-1];

	}

}
