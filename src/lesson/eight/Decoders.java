package lesson.eight;

import java.util.Base64;

/**
 * Created by igor on 10.02.2016.
 */
public class Decoders {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();

        String s = "hello world";

        System.out.println(encoder.encodeToString(s.getBytes()));

        // http://www.oracle.com/technetwork/java/embedded/resources/tech/compact-profiles-overview-2157132.html
    }
}
