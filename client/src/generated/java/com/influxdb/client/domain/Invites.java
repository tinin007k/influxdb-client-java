/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.Invite;
import com.influxdb.client.domain.InvitesLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Invites
 */

public class Invites {
  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private InvitesLinks links = null;

  public static final String SERIALIZED_NAME_INVITES = "invites";
  @SerializedName(SERIALIZED_NAME_INVITES)
  private List<Invite> invites = new ArrayList<>();

  public Invites links(InvitesLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InvitesLinks getLinks() {
    return links;
  }

  public void setLinks(InvitesLinks links) {
    this.links = links;
  }

  public Invites invites(List<Invite> invites) {
    this.invites = invites;
    return this;
  }

  public Invites addInvitesItem(Invite invitesItem) {
    if (this.invites == null) {
      this.invites = new ArrayList<>();
    }
    this.invites.add(invitesItem);
    return this;
  }

   /**
   * Get invites
   * @return invites
  **/
  @ApiModelProperty(value = "")
  public List<Invite> getInvites() {
    return invites;
  }

  public void setInvites(List<Invite> invites) {
    this.invites = invites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invites invites = (Invites) o;
    return Objects.equals(this.links, invites.links) &&
        Objects.equals(this.invites, invites.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, invites);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invites {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

