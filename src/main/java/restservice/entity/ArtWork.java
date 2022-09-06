package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "art_works")
@NoArgsConstructor
@Setter
@Getter
public class ArtWork {
    @Id
    @GeneratedValue
    @Column(name = "Art_id")
    private Long artWorkId;
    private String name;
    @Column(name = "Url_address")
    private String urlAddress;
    private String description;
    private Integer year;
    @OneToMany(mappedBy = "artWork")
    private Set<Meme> memes;
    @ManyToOne
    @JoinColumn(name="Author_id", nullable=false)
    private Author author;
    @ManyToOne
    @JoinColumn(name="Style_id", nullable=false)
    private Style style;
    @ManyToOne
    @JoinColumn(name="Museum_id", nullable=false)
    private Museum museum;

}
