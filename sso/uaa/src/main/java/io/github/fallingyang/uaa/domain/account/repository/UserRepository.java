package io.github.fallingyang.uaa.domain.account.repository;

import io.github.fallingyang.uaa.domain.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author yangzifeng
 */
@Repository
public interface UserRepository extends JpaRepository<Account, String> {

    /**
     * find one by login, use by security use service
     * @param login login
     * @return user
     */
    Optional<Account> findOneByLogin(String login);
}
