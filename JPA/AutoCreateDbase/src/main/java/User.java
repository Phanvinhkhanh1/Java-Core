import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity(name = "User")
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname", nullable = false, length = 255, unique = true)
    private String fullName;

    @Column(name = "username", nullable = false, length = 255)
    private String userName;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "created_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "modified_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @Transient
    private String additionalProperty;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "role_id", nullable = false, updatable = false)})
    @OrderBy("name")
    private Set<Role> roles;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private UserProfile userProfile;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    @OrderBy("title")
    private Set<Post> posts;


}
