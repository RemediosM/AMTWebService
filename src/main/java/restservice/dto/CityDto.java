package restservice.dto;

import lombok.*;
import restservice.entity.City;
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CityDto {
    Long cityId;
    String name;
    CountryDto countryDto;
    
    public City toEntity() {
        return new City(cityId, name, countryDto.toEntity() );
    }
}
