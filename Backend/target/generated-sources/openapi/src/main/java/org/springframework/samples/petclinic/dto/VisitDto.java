package org.springframework.samples.petclinic.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.samples.petclinic.dto.VisitAllOfDto;
import org.springframework.samples.petclinic.dto.VisitFieldsDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * A booking for a vet visit.
 */
@ApiModel(description = "A booking for a vet visit.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-15T15:07:35.086524900+01:00[Europe/Berlin]")
public class VisitDto   {
  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private Date date;

  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private Integer id;

  public VisitDto date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the visit.
   * @return date
  */
  @ApiModelProperty(example = "Tue Jan 01 01:00:00 CET 2013", value = "The date of the visit.")

  @Valid

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public VisitDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description for the visit.
   * @return description
  */
  @ApiModelProperty(example = "rabies shot", required = true, value = "The description for the visit.")
  @NotNull

@Size(min=1,max=255) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VisitDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the visit.
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "The ID of the visit.")
  @NotNull

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitDto visit = (VisitDto) o;
    return Objects.equals(this.date, visit.date) &&
        Objects.equals(this.description, visit.description) &&
        Objects.equals(this.id, visit.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, description, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

