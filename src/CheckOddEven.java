public class CheckOddEven {
    public boolean Odd(int num)
    {
        if(num%2 !=0)
        {
            System.out.println(num+" : Odd");
            return true;
        }

        else
        {
            System.out.println(num+" : Even");
            return false;
        }
    }
}
