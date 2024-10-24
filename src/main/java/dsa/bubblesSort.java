package dsa;

public class bubblesSort {

	public static void main(String[] args) {
	
//         int a[]= {39, 19,29,12,5};
//         int temp;
//         for(int i=0; i<a.length; i++) {
//        	 
//        	 for(int j=0; j<a.length-1; j++) {
//        		 
//        		 
//        		 if(a[j]> a[j+1]) {
//        			 
//        			 temp=a[j];
//        			 a[j]=a[j+1];
//        			 a[j+1]=temp;
//        		 }
//        	 }
//         }
//
//        for(int i=0; i<a.length; i++) {
//        	System.out.print(a[i]+" ");
//        }
		
		
	// 2nd examp;
		
		
		
//		int a[]= {87,35,46,2,4,69,8,56,26,57,28,18,49,29,10,5,9,99,6,1,89};
//		
//		int temp;
//	    for(int i=0; i<=a.length; i++) {
//	    	
//	    	int flag=0;
//	    	for(int j=0; j<a.length-1; j++) {
//	    		
//	    		if(a[j]> a[j+1]) {
//	    			
//	    			temp=a[j];
//	    			a[j]=a[j+1];
//	    			a[j+1]=temp;
//	    			flag=1;
//	    			
//	    			
//	    		}
//	    	}
//	    	
//	    	if(flag==0) {
//	    		
//	    		break;
//	    	}
//	    }
//		
//		
//		for(int i=0; i<a.length; i++) {
//			
//			System.out.print(a[i] +" ");
//		}
		
		
		// compare to method 
		
		
		 String a[]= {"aarya", "shahil", "preeti", "varun", "sagar","amit", "santosh"};
		 
		 String temp;
		 
		 for(int i=0; i<a.length; i++) {
			 
			 int  flag=0;
			 
			 for(int j=0; j<a.length-1; j++) {
				 
				 if(a[j].compareTo(a[j+1])>0) {
					 
					  temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
					  flag=1;
				 }
			 }
			 
			 if(flag==0) {
				 break;
			 }
		 }
		 
		 
		 for(int i=0; i<a.length; i++) {
			 
			 System.out.print(a[i]+" ");
		 }
	}

}
