import java.util.Random;

public class SortingAlgorithm {
    public int[] Sort(int[] list){
        int x = 0;
        boolean flag = false;
        int temp;

        do{
            x = 0;
            flag = false;
            do {

                if(list[x] > list[x+1]){
                    //Sorts a number
                    temp = list[x];
                    list[x] = list[x+1];
                    list[x+1] = temp;

                    flag = true;
                }

                x++;

            }while(x+1<=list.length-1);
        }while((flag));

        return list;
    }

    public int[] doNotUseSort(int lowerBound, int upperBound, int length){
        Random random = new Random();
        int[] arr = new int[length];
        Boolean error = false;

        do {
            error = false;
            for (int i = 0; i < length; i++) {
                arr[i] = random.nextInt(lowerBound, upperBound);
            }
            for (int i = 0; i < length; i++) {
                //Gör koden finare

                if (i + 1 <= arr.length -1){
                    if (arr[i] <= arr[i+1]){
                        continue;
                    }
                    else {
                        error = true;
                    }
                }
            }
        } while (error);
        return arr;
    }
}
