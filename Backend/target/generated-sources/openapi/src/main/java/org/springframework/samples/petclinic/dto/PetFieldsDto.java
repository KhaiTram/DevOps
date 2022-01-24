package org.springframework.samples.petclinic.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Editable fields of a pet.
 */
@ApiModel(description = "Editable fields of a pet.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:27:44.251950+07:00[Asia/Bangkok]")
public class PetFieldsDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("birthDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private Date birthDate;

  @JsonProperty("typeId")
  private Integer typeId;

  public PetFieldsDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the pet.
   * @return name
  */
  @ApiModelProperty(example = "Leo", required = true, value = "The name of the pet.")
  @NotNull

@Size(max=30) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PetFieldsDto birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * The date of birth of the pet.
   * @return birthDate
  */
  @ApiModelProperty(example = "Tue Sep 07 07:00:00 ICT 2010", value = "The date of birth of the pet.")

  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public PetFieldsDto typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * The type of the pet.
   * @return typeId
  */
  @ApiModelProperty(example = "1", value = "The type of the pet.")


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetFieldsDto petFields = (PetFieldsDto) o;
    return Objects.equals(this.name, petFields.name) &&
        Objects.equals(this.birthDate, petFields.birthDate) &&
        Objects.equals(this.typeId, petFields.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, birthDate, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetFieldsDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

