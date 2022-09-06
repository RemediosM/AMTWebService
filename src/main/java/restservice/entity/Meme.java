package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "memes")
@NoArgsConstructor
@Setter
@Getter
public class Meme {
    @Id
    @GeneratedValue
    @Column(name = "Meme_id")
    private Long memeId;
    @Column(name = "Url_address")
    private String urlAddress;
    @ManyToOne
    @JoinColumn(name="Art_id", nullable=false)
    private ArtWork artWork;
}
