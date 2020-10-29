package io.github.fallingyang.uaa.domain.client.repository;

import io.github.fallingyang.uaa.domain.client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author yangzifeng
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

    /**
     * find one by client id
     * @param clientId clientId
     * @return client
     */
    Optional<Client> findOneByClientId(String clientId);
}
