package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "addresses")
@NoArgsConstructor
@Setter
@Getter
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "Address_id")
    private Long addressId;
    private String street;
    private String coordinates;

    @ManyToOne
    @JoinColumn(name="City_id", nullable=false)
    private City city;

    @Override
    public String toString() {
        return "Addresses{" +
                "id=" + addressId +
                ", street='" + street + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
