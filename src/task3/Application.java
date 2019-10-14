package task3;

public class Application {
    public static void main(String[] args) {
        int[] arr={97,54,354,124,48,364,846,21,86,745};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
