// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

class Sorting_two_sorted_arrays_without_extraspace
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int arr1[] = new int[n];
		    int arr2[] = new int[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Integer.parseInt(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    new MergeSort().merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class MergeSort
{
    public static void merge(int arr1[], int arr2[], int n, int m) 
    {
        int gap=m+n;
        int i=0;
        int a=0;
        int b=0;
        while(gap>1){
          //  System.out.print(gap);
            gap=(gap/2)+(gap%2);
           for(i=0;i+gap<m+n;i++){
               if(i+gap>=n){
                
                 if(i>=n)
                 {
                     if(arr2[i-n]>arr2[(i+gap)-n]){
                   int temp=arr2[i-n];
                   arr2[i-n]=arr2[(i+gap)-n];
                   arr2[(i+gap)-n]=temp;
                  //  System.out.println(a+" "+b);
                   continue;
               }
               else{
                   continue;
               }
                 }
                 if(arr1[i]>arr2[(i+gap)-n]){
                   int temp=arr1[i];
                   arr1[i]=arr2[(i+gap)-n];
                   arr2[(i+gap)-n]=temp;
                       //   System.out.println(a+" "+b);
                 
                 
                   continue;
               }
               else
               {
                   continue;
               }
               }
               else{
                  
               
               if(arr1[i]>arr1[i+gap]){
                   int temp=arr1[i];
                   arr1[i]=arr1[i+gap];
                   arr1[i+gap]=temp;
                       //   System.out.println(i+gap+" "+i);
               }}
             
           }
        /**    for(int j=0;j<n;j++){
                  System.out.print(arr1[j]);
              }
               System.out.println();
              for(int j=0;j<m;j++){
                  System.out.print(arr2[j]);
              }
               System.out.println();
               */
        }
    }
}
