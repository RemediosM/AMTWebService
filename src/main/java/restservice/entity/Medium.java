package restservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "mediums")
@NoArgsConstructor
@Setter
@Getter
public class Medium {

    @Id
    @GeneratedValue
    @Column(name = "Medium_id")
    private Long mediumId;
    private String name;
}
