package testingagriculture.User;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {

    public List<User> GetUsers() {
        return List.of(
                new User(
                        1L,
                        "rolnik",
                        "stały",
                        5,
                        LocalDate.of(2020, Month.JANUARY, 1),
                        "12345678901",
                        "jan.kowalski@example.com",
                        "123456789",
                        "obsługa maszyn rolniczych, uprawa roślin",
                        "Kowalewo, Wiejska 1",
                        "12-345"
                )
        );
    }
}
