/**
 * InventoryAPI
 * Orkiv Inventory API client 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package InventoryClient.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ServiceRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-05T15:11:04.542-04:00")
public class ServiceRequest   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("recurpric")
  private String recurpric = null;

  public ServiceRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of service
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of service")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Richtext description of item
   * @return desc
  **/
  @ApiModelProperty(example = "null", value = "Richtext description of item")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ServiceRequest price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Upfront cost of service in hundreds
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "Upfront cost of service in hundreds")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ServiceRequest recurpric(String recurpric) {
    this.recurpric = recurpric;
    return this;
  }

   /**
   * Recurring monthly cost of subscription
   * @return recurpric
  **/
  @ApiModelProperty(example = "null", value = "Recurring monthly cost of subscription")
  public String getRecurpric() {
    return recurpric;
  }

  public void setRecurpric(String recurpric) {
    this.recurpric = recurpric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRequest serviceRequest = (ServiceRequest) o;
    return Objects.equals(this.name, serviceRequest.name) &&
        Objects.equals(this.desc, serviceRequest.desc) &&
        Objects.equals(this.price, serviceRequest.price) &&
        Objects.equals(this.recurpric, serviceRequest.recurpric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc, price, recurpric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    recurpric: ").append(toIndentedString(recurpric)).append("\n");
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

