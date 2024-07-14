public class DAY3_IntegertoString{
// Converted Integer to String 
    public static void main(String[] args) {
        int number = 123;
        String str = String.valueOf(number);
        System.out.println(str);

        int n=234;
        String str1 = Integer.toString(n);
        System.out.println(str1);

        int nu=456;
        String str2 = String.format("%d", nu);
        System.out.println(str2);

        int num=987;
        String str3 = num + "";
        System.out.println(str3);
    }
}
