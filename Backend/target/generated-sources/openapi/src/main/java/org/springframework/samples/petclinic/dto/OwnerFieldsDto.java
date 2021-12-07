package org.springframework.samples.petclinic.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * Editable fields of a pet owner.
 */
@ApiModel(description = "Editable fields of a pet owner.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-07T17:03:01.073859+01:00[Europe/Berlin]")
public class OwnerFieldsDto   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("address")
  private String address;

  @JsonProperty("city")
  private String city;

  @JsonProperty("telephone")
  private String telephone;

  public OwnerFieldsDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the pet owner.
   * @return firstName
  */
  @ApiModelProperty(example = "George", required = true, value = "The first name of the pet owner.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public OwnerFieldsDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the pet owner.
   * @return lastName
  */
  @ApiModelProperty(example = "Franklin", required = true, value = "The last name of the pet owner.")
  @NotNull

@Pattern(regexp="^[a-zA-Z]*$") @Size(min=1,max=30) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OwnerFieldsDto address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The postal address of the pet owner.
   * @return address
  */
  @ApiModelProperty(example = "110 W. Liberty St.", required = true, value = "The postal address of the pet owner.")
  @NotNull

@Size(min=1,max=255) 
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public OwnerFieldsDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city of the pet owner.
   * @return city
  */
  @ApiModelProperty(example = "Madison", required = true, value = "The city of the pet owner.")
  @NotNull

@Size(min=1,max=80) 
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OwnerFieldsDto telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * The telephone number of the pet owner.
   * @return telephone
  */
  @ApiModelProperty(example = "6085551023", required = true, value = "The telephone number of the pet owner.")
  @NotNull

@Pattern(regexp="^[0-9]*$") @Size(min=1,max=20) 
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerFieldsDto ownerFields = (OwnerFieldsDto) o;
    return Objects.equals(this.firstName, ownerFields.firstName) &&
        Objects.equals(this.lastName, ownerFields.lastName) &&
        Objects.equals(this.address, ownerFields.address) &&
        Objects.equals(this.city, ownerFields.city) &&
        Objects.equals(this.telephone, ownerFields.telephone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, city, telephone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerFieldsDto {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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

