package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
/**
 * Rule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-29T21:58:24.855-04:00")

public class Rule   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  /**
   * Gets or Sets ruleType
   */
  public enum RuleTypeEnum {
    VAL1("val1"),

    VAL2("val2"),

    VAL3("val3"),

    VAL4("val4");

    private String value;

    RuleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RuleTypeEnum fromValue(String text) {
      for (RuleTypeEnum b : RuleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ruleType")
  private RuleTypeEnum ruleType = null;

  @JsonProperty("name")
  private String name = null;

  public Rule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rule priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Rule valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(value = "")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Rule ruleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @ApiModelProperty(value = "")
  public RuleTypeEnum getRuleType() {
    return ruleType;
  }

  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }

  public Rule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.id, rule.id) &&
        Objects.equals(this.priority, rule.priority) &&
        Objects.equals(this.valid, rule.valid) &&
        Objects.equals(this.ruleType, rule.ruleType) &&
        Objects.equals(this.name, rule.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, priority, valid, ruleType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

