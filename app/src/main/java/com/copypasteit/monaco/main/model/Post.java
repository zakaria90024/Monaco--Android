package com.copypasteit.monaco.main.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("monako_name")
    @Expose
    private String monakoName;
    @SerializedName("monako_slug")
    @Expose
    private String monakoSlug;
    @SerializedName("monako_details")
    @Expose
    private String monakoDetails;
    @SerializedName("monako_image_url")
    @Expose
    private String monakoImageUrl;
    @SerializedName("monako_image")
    @Expose
    private String monakoImage;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonakoName() {
        return monakoName;
    }

    public void setMonakoName(String monakoName) {
        this.monakoName = monakoName;
    }

    public String getMonakoSlug() {
        return monakoSlug;
    }

    public void setMonakoSlug(String monakoSlug) {
        this.monakoSlug = monakoSlug;
    }

    public String getMonakoDetails() {
        return monakoDetails;
    }

    public void setMonakoDetails(String monakoDetails) {
        this.monakoDetails = monakoDetails;
    }

    public String getMonakoImageUrl() {
        return monakoImageUrl;
    }

    public void setMonakoImageUrl(String monakoImageUrl) {
        this.monakoImageUrl = monakoImageUrl;
    }

    public String getMonakoImage() {
        return monakoImage;
    }

    public void setMonakoImage(String monakoImage) {
        this.monakoImage = monakoImage;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

}
