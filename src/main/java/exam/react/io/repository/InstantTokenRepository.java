package exam.react.io.repository;

import java.util.HashSet;
import java.util.Set;

public class InstantTokenRepository {

    private static final Set<String> TOKENS = new HashSet<>();

    public static void add(final String token) {
        TOKENS.add(token);
    }

    public static boolean contains(final String token) {
        return TOKENS.contains(token);
    }
}
