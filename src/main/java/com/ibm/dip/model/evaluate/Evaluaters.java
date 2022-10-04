package com.ibm.dip.model.evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.evaluate.EvaluatersFraudEvaluationAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * evaluaters
 */
@ApiModel(description = "evaluaters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-04T04:52:17.100Z[GMT]")

public class Evaluaters   {
  @JsonProperty("FraudEvaluationAssessment")
  private EvaluatersFraudEvaluationAssessment fraudEvaluationAssessment;

  public Evaluaters fraudEvaluationAssessment(EvaluatersFraudEvaluationAssessment fraudEvaluationAssessment) {
    this.fraudEvaluationAssessment = fraudEvaluationAssessment;
    return this;
  }

  /**
   * Get fraudEvaluationAssessment
   * @return fraudEvaluationAssessment
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluatersFraudEvaluationAssessment getFraudEvaluationAssessment() {
    return fraudEvaluationAssessment;
  }

  public void setFraudEvaluationAssessment(EvaluatersFraudEvaluationAssessment fraudEvaluationAssessment) {
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
    Evaluaters evaluaters = (Evaluaters) o;
    return Objects.equals(this.fraudEvaluationAssessment, evaluaters.fraudEvaluationAssessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudEvaluationAssessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluaters {\n");
    
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

