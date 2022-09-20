package restservice.dto;

import lombok.*;
import restservice.entity.Address;
import restservice.entity.City;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class AddressDto {

    private Long addressId;
    private String street;
    private String coordinates;
    private CityDto cityDto;

    public Address toEntity() {
        return new Address(addressId, street, coordinates, cityDto.toEntity());
    }
}
