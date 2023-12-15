public class Main {
    public static void main(String[] args) {
        int i = 1234;

        String a = Integer.toString(i);
        System.out.println(a);

        String w = Integer.toBinaryString(i);
        System.out.println(w);

        String p =Integer.toHexString(i);
        System.out.println(p);

        String d = "1234";

        int j = Integer.parseInt(d);
        System.out.println(j);

        String q = Integer.toBinaryString(Integer.parseInt(d));
        System.out.println(q);
    }
}