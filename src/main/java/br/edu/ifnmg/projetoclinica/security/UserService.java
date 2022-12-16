package br.edu.ifnmg.projetoclinica.security;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;

/**
 *
 * @author Thiago Riquelmo
 */
@Stateless
public class UserService
        implements UserServiceLocal {

    @PersistenceContext(unitName = "secureApp")
    EntityManager em;

    @Inject
    Pbkdf2PasswordHash passwordHasher;

    @Override
    public User createUser(String name, String username, String password, String group) {

        Map<String, String> parameters = new HashMap<>();
        parameters.put("Pbkdf2PasswordHash.Iterations", "3071");
        parameters.put("Pbkdf2PasswordHash.Algorithm", "PBKDF2WithHmacSHA512");
        parameters.put("Pbkdf2PasswordHash.SaltSizeBytes", "64");
        passwordHasher.initialize(parameters);

        User newUser = new User(
                name,
                username,
                passwordHasher.generate(
                        password.toCharArray()),
                group);
        em.persist(newUser);
        return newUser;
    }

    @Override
    public List<User> getAllUsers() {
        return em.createNamedQuery("User.all", User.class).getResultList();
    }

    @Override
    public Optional<User> getUser(String username) {
        return em.createNamedQuery("User.byUsername", User.class)
                .setParameter("username", username)
                .getResultList()
                .stream()
                .findFirst(); // Can be null (Optional)...
    }

}