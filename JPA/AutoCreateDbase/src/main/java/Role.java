import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity(name = "Role")
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private Set<User> users;
}
