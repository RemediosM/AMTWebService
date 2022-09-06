package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "authors")
@NoArgsConstructor
@Setter
@Getter
public class Author {

    @Id
    @GeneratedValue
    @Column(name = "Author_id")
    private Long authorId;
    @Column(name = "First_name")
    private String firstName;
    private String surname;
    @OneToMany(mappedBy = "author")
    private Set<ArtWork> artWorks;
}
