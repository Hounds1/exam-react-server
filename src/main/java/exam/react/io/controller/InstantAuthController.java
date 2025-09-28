package exam.react.io.controller;

import exam.react.io.domain.token.Token;
import exam.react.io.repository.InstantTokenRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/react-exam/auth")
public class InstantAuthController {

    @GetMapping("/generate")
    public ResponseEntity<Token> generate() {
        return ResponseEntity.status(HttpStatus.CREATED).body(Token.generate());
    }

    @PostMapping("/sawp")
    public ResponseEntity<Void> swap(@RequestBody Token token) {
        if (token == null) throw new IllegalArgumentException("Empty body detected.");

        InstantTokenRepository.add(token.getToken());
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
