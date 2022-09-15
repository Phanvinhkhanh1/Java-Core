import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity(name = "Category")
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    @OrderBy("title")
    private Set<Post> posts;
}
