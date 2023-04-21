package testingagriculture.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // metody definiujące dostęp do bazy danych
}