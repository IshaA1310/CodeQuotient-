import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
    	while(t>0){
			int n=s.nextInt();
          	int[] arr=new int[n];
          	for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
            }
          	int r=s.nextInt();
          	r%=n;
          	reverse(arr,0,r-1);
          	reverse(arr,r,n-1);
          	reverse(arr,0,n-1);
          	for(int i=0;i<n;i++){
              if(i==n-1) System.out.print(arr[i]);
              else System.out.print(arr[i]+" ");
            }System.out.println();
          	t--;
        }
    }
  	public static void reverse(int arr[],int s,int e){
		while(s<=e){
          int temp=arr[s];
          arr[s]=arr[e];
          arr[e]=temp;
          s++;
          e--;
        }
    }
}
