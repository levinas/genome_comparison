
package us.kbase.workspaceservice;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: has_object_params</p>
 * <pre>
 * Input parameters for the "has_object" function.
 *         object_type type - type of the object to be checked for existance (an essential argument)
 *         workspace_id workspace - ID of the workspace containing the object to be checked for existance (an essential argument)
 *         object_id id - ID of the object to be checked for existance (an essential argument)
 *         int instance - Version of the object to be checked for existance (an optional argument; the current object is checked if no version is provided)
 *         string auth - the authentication token of the KBase account to associate with this object check command (an optional argument)
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "instance",
    "type",
    "workspace",
    "auth"
})
public class HasObjectParams {

    @JsonProperty("id")
    private String id;
    @JsonProperty("instance")
    private Long instance;
    @JsonProperty("type")
    private String type;
    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("auth")
    private String auth;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HasObjectParams withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("instance")
    public Long getInstance() {
        return instance;
    }

    @JsonProperty("instance")
    public void setInstance(Long instance) {
        this.instance = instance;
    }

    public HasObjectParams withInstance(Long instance) {
        this.instance = instance;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public HasObjectParams withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public HasObjectParams withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("auth")
    public String getAuth() {
        return auth;
    }

    @JsonProperty("auth")
    public void setAuth(String auth) {
        this.auth = auth;
    }

    public HasObjectParams withAuth(String auth) {
        this.auth = auth;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((("HasObjectParams"+" [id=")+ id)+", instance=")+ instance)+", type=")+ type)+", workspace=")+ workspace)+", auth=")+ auth)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
