package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "UserProfile")
@Table(name = "user_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", length = 255, nullable = false)
    private String address;

    @Column(name = "gender")
    private Integer gender;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_user_profile"))
    private User user;

}
