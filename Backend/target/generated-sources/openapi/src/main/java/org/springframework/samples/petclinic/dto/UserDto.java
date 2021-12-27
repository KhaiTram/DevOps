package org.springframework.samples.petclinic.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.samples.petclinic.dto.RoleDto;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * An user.
 */
@ApiModel(description = "An user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-27T13:36:42.507895900+01:00[Europe/Berlin]")
public class UserDto   {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("roles")
  @Valid
  private List<RoleDto> roles = null;

  public UserDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username
   * @return username
  */
  @ApiModelProperty(example = "john.doe", required = true, value = "The username")
  @NotNull

@Size(min=1,max=80) 
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password
   * @return password
  */
  @ApiModelProperty(example = "1234", value = "The password")

@Size(min=1,max=80) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates if the user is enabled
   * @return enabled
  */
  @ApiModelProperty(example = "true", value = "Indicates if the user is enabled")


  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UserDto roles(List<RoleDto> roles) {
    this.roles = roles;
    return this;
  }

  public UserDto addRolesItem(RoleDto rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * The roles of an user
   * @return roles
  */
  @ApiModelProperty(value = "The roles of an user")

  @Valid

  public List<RoleDto> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleDto> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto user = (UserDto) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.enabled, user.enabled) &&
        Objects.equals(this.roles, user.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, enabled, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

