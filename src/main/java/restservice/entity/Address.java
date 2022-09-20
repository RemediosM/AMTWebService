package restservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import restservice.dto.AddressDto;

import javax.persistence.*;

@Entity(name = "addresses")
@NoArgsConstructor
@AllArgsConstructor
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

    public AddressDto toDto() {
        return new AddressDto(addressId, street, coordinates, city.toDto());
    }

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
