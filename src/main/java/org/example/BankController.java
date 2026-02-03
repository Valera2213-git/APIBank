package org.example;

import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BankController {
    private static final Logger logger = LoggerFactory.getLogger(BankController.class);

    private final UserService userService;

    @Autowired
    public BankController(UserService userService) {
        this.userService = userService;
    }

    @Transactional
    @GetMapping(value = "/balance/{id}")
    @Operation(summary = "Запрос баланса пользователя по его ID")
    public ResponseEntity<Double> getBalance(@PathVariable(name = "id") Long id) {
        Optional<User> optionalUser = userService.findUserById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return new ResponseEntity<>(user.getBalance(), HttpStatus.OK);
        }
        logger.info("Пользователь с ID:" + id + " не найден");
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}