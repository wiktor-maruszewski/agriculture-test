package testingagriculture.User;

import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));

        existingUser.setName(user.getName());
        existingUser.setSurname(user.getSurname());
        existingUser.setPassword(user.getPassword());
        existingUser.setCategory(user.getCategory());
        existingUser.setType(user.getType());
        existingUser.setTaskAmount(user.getTaskAmount());
        existingUser.setHireDate(user.getHireDate());
        existingUser.setPesel(user.getPesel());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        existingUser.setQualifications(user.getQualifications());
        existingUser.setAddress(user.getAddress());
        existingUser.setZipCode(user.getZipCode());

        userRepository.save(existingUser);
    }

}