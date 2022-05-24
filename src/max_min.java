public class max_min {
    public int max(int[] arr)
    {
        int max = arr[0];
        for(int i=1; i < arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public int min(int[] arr)
    {
        int min = arr[0];
        for(int i=1; i < arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }

        return min;
    }
}
