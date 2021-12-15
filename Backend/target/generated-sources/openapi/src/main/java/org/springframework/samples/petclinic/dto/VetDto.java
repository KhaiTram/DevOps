package org.springframework.samples.petclinic.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.dto.SpecialtyDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * A veterinarian.
 */
@ApiModel(description = "A veterinarian.")
<<<<<<< Updated upstream
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-07T17:03:01.073859+01:00[Europe/Berlin]")
=======
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-12T09:11:45.298002900+01:00[Europe/Berlin]")
>>>>>>> Stashed changes
public class VetDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("specialties")
  @Valid
  private List<SpecialtyDto> specialties = new ArrayList<>();

  public VetDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the vet.
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "The ID of the vet.")
  @NotNull

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VetDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the vet.
   * @return firstName
  */
  @ApiModelProperty(example = "James", required = true, value = "The first name of the vet.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public VetDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the vet.
   * @return lastName
  */
  @ApiModelProperty(example = "Carter", required = true, value = "The last name of the vet.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public VetDto specialties(List<SpecialtyDto> specialties) {
    this.specialties = specialties;
    return this;
  }

  public VetDto addSpecialtiesItem(SpecialtyDto specialtiesItem) {
    if (this.specialties == null) {
      this.specialties = new ArrayList<>();
    }
    this.specialties.add(specialtiesItem);
    return this;
  }

  /**
   * The specialties of the vet.
   * @return specialties
  */
  @ApiModelProperty(required = true, value = "The specialties of the vet.")
  @NotNull

  @Valid

  public List<SpecialtyDto> getSpecialties() {
    return specialties;
  }

  public void setSpecialties(List<SpecialtyDto> specialties) {
    this.specialties = specialties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VetDto vet = (VetDto) o;
    return Objects.equals(this.id, vet.id) &&
        Objects.equals(this.firstName, vet.firstName) &&
        Objects.equals(this.lastName, vet.lastName) &&
        Objects.equals(this.specialties, vet.specialties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, specialties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VetDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    specialties: ").append(toIndentedString(specialties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

