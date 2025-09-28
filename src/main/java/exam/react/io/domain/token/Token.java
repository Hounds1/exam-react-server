package exam.react.io.domain.token;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Token {

    private final String token = UUID.randomUUID().toString();

    public static Token generate() {
        return new Token();
    }
}
