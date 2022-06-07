package co.edu.unbosque.demo.jpa.repositories;

import co.edu.unbosque.demo.jpa.entities.UserApp;

import java.util.Optional;

public interface UserAppRepository {

    Optional<UserApp> findByEmail(String email);

    Optional<UserApp> save(UserApp userApp);

}
