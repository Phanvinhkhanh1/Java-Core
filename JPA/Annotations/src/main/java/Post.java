import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "Post")
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false, foreignKey = @ForeignKey(name = "fk_post_category"))
    private Category category;

}
