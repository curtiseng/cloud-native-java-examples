package io.github.fallingyang.uaa.domain.client.service;

import io.github.fallingyang.uaa.domain.client.entity.Client;
import io.github.fallingyang.uaa.domain.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author yangzifeng
 */
@Service
public class HandingFetchClient {

    private ClientRepository clientRepository;

    public HandingFetchClient(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Optional<Client> getClientById(String clientId) {
        return clientRepository.findOneByClientId(clientId);
    }
}
