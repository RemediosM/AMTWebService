package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "cities")
@NoArgsConstructor
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue
    @Column(name = "City_id")
    private Long cityId;
    private String name;

    @ManyToOne
    @JoinColumn(name="Country_id", nullable=false)
    private Country country;

    @OneToMany(mappedBy = "city")
    private Set<Address> addresses;
}
