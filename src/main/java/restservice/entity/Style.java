package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "styles")
@NoArgsConstructor
@Setter
@Getter
public class Style {

    @Id
    @GeneratedValue
    @Column(name = "Style_id")
    private Long styleId;
    private String name;
}
