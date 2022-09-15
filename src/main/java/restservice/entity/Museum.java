package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "museums")
@NoArgsConstructor
@Setter
@Getter
public class Museum {

    @Id
    @GeneratedValue
    @Column(name = "Museum_id")
    private long museumId;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Address_id", nullable=false)
    private Address address;
}
