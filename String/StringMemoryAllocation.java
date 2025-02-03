package String;

public class StringMemoryAllocation {
    public static void main(String[] args) {
        // by using String literals

        // String s = "hello bhai";
        // String s1 = new String("hello by new keyword");

        // System.out.println(s);
        // System.out.println(s1);

        String s = "hello";
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = new String("hello");

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s2 == s3);

        System.out.println(System.identityHashCode(s));// store unique address
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));

    }
}
