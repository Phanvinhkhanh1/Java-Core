import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Data
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserProfile userProfile;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "role_id", nullable = false, updatable = false)})
    private Set<Role> roles;

    @Column(name = "full_name", length = 255, nullable = false)
    private String fullName;

    @Column(name = "user_name", length = 255, nullable = false)
    private String userName;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @Column(name = "created_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "modified_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @Lob
    @Column(name = "avatar", nullable = false, length = Integer.MAX_VALUE)
    private byte[] avatar;

    @Transient
    private String additionProperty;
}
