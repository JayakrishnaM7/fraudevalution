package com.ibm.dip.model.retrieve;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.retrieve.EvaluaterqFraudEvaluationAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * evaluaters
 */
@ApiModel(description = "evaluaters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-04T04:52:17.100Z[GMT]")

public class Evaluaterq   {
  @JsonProperty("FraudEvaluationAssessment")
  private EvaluaterqFraudEvaluationAssessment fraudEvaluationAssessment;

  public Evaluaterq fraudEvaluationAssessment(EvaluaterqFraudEvaluationAssessment fraudEvaluationAssessment) {
    this.fraudEvaluationAssessment = fraudEvaluationAssessment;
    return this;
  }

  /**
   * Get fraudEvaluationAssessment
   * @return fraudEvaluationAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluaterqFraudEvaluationAssessment getFraudEvaluationAssessment() {
    return fraudEvaluationAssessment;
  }

  public void setFraudEvaluationAssessment(EvaluaterqFraudEvaluationAssessment fraudEvaluationAssessment) {
    this.fraudEvaluationAssessment = fraudEvaluationAssessment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluaterq evaluaterq = (Evaluaterq) o;
    return Objects.equals(this.fraudEvaluationAssessment, evaluaterq.fraudEvaluationAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudEvaluationAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluaterq {\n");
    
    sb.append("    fraudEvaluationAssessment: ").append(toIndentedString(fraudEvaluationAssessment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

