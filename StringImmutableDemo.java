import java.io.*;
import java.lang.*;
class StringImmutableDemo{
    public static void main(String args[])
    {
        String s="Sasi";
        s=s.concat("site");
        System.out.println("After concatenating s1 and s2:"+s);
        String r="Rupa";
        r=r.concat("Tapa");
        System.out.println("After concatenating s1 and s2:"+r);

    }
}
