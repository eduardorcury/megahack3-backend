package time43.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String cnpj;

    @NotBlank
    private String cep;

    @NotBlank
    private String address;

    @NotBlank
    private String number;

    @NotBlank
    private String city;

    @NotBlank
    private String uf;

    @NotBlank
    private String telephone;

    @NotBlank
    private String comment;

}
