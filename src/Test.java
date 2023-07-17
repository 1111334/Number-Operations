
public class Test {
    public static void main(String[] args) {

        int a = 15;
        int b = a + 1;

        a += 5;
        a -= 4 ;
        b += 1;

        System.out.println(a);
        System.out.println(b);

        boolean isShots = b % 2 != 0;
     // boolean isMultiplyOf3 = (b * (b + 1)) % 3 == 0;
        boolean isMultiplyOf3 = Math.floorMod(b * (b + 1), 3) == 0 ;
        System.out.println(isShots && isMultiplyOf3);
        




    }

}













































