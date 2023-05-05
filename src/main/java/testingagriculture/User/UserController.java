package testingagriculture.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users", produces = "application/json")
    @ResponseBody
    public List<User> getUsers() {
        return userService.getAllUsers();
    }


    @GetMapping(path = "/users/{id}", produces = "application/json")
    @ResponseBody
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long id, @Valid @RequestBody User user) {
        userService.updateUser(id, user);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping(path = "/users/check", produces = "application/json")
    public ResponseEntity<User> check(@Valid @RequestBody User user) {
        User existingUser = userRepository.findByName(user.getName());
        //if (existingUser == null) {
        //    return ResponseEntity.badRequest().body(null);
        //}
        return ResponseEntity.ok(user);
    }

}
