package io.github.fallingyang.uaa.domain.client.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yangzifeng
 */
@Entity
@Table(name = "oauth_client_details")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "client_id", nullable = false, length = 256)
    private String clientId;



}
