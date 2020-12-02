package time43.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PubDTO {

    @Null
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    private String cep;

    @NotBlank
    private String telephone;

    private String comment;

}
