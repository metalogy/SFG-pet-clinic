package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
@Getter
@Setter
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
