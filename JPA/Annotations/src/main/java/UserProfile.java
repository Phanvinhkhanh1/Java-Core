import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "UserProfile")
@Table(name = "user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_user_profile"))
    private User user;
}
