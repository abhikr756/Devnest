package DSA_Bootcamp;

public class 4_average_between_indices {
    static float solve(int n, int[] arr, int x, int y){
        //CODE HERE 
        int sum=0,count=0;
        for(int i=x;i<=y;i++)
        {
            sum=sum+arr[i];
            count++;
        }
        return (float)sum/count;
        }
}
