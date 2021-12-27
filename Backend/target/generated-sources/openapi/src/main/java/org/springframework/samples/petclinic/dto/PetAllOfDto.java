package org.springframework.samples.petclinic.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.dto.PetTypeDto;
import org.springframework.samples.petclinic.dto.VisitDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * PetAllOfDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-27T13:36:42.507895900+01:00[Europe/Berlin]")
public class PetAllOfDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("type")
  private PetTypeDto type;

  @JsonProperty("visits")
  @Valid
  private List<VisitDto> visits = new ArrayList<>();

  public PetAllOfDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the pet.
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "The ID of the pet.")
  @NotNull

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PetAllOfDto type(PetTypeDto type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PetTypeDto getType() {
    return type;
  }

  public void setType(PetTypeDto type) {
    this.type = type;
  }

  public PetAllOfDto visits(List<VisitDto> visits) {
    this.visits = visits;
    return this;
  }

  public PetAllOfDto addVisitsItem(VisitDto visitsItem) {
    if (this.visits == null) {
      this.visits = new ArrayList<>();
    }
    this.visits.add(visitsItem);
    return this;
  }

  /**
   * Vet visit bookings for this pet.
   * @return visits
  */
  @ApiModelProperty(required = true, readOnly = true, value = "Vet visit bookings for this pet.")
  @NotNull

  @Valid

  public List<VisitDto> getVisits() {
    return visits;
  }

  public void setVisits(List<VisitDto> visits) {
    this.visits = visits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetAllOfDto petAllOf = (PetAllOfDto) o;
    return Objects.equals(this.id, petAllOf.id) &&
        Objects.equals(this.type, petAllOf.type) &&
        Objects.equals(this.visits, petAllOf.visits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, visits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetAllOfDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
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

