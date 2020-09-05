package com.copypasteit.monaco.main.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Slider {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("monako_slider_txt")
    @Expose
    private String monakoSliderTxt;

    @SerializedName("monako_slider_image_url")
    @Expose
    private String monakoSliderImageUrl;

    @SerializedName("monako_slider_image")
    @Expose
    private String monakoSliderImage;

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

    public String getMonakoSliderTxt() {
        return monakoSliderTxt;
    }

    public void setMonakoSliderTxt(String monakoSliderTxt) {
        this.monakoSliderTxt = monakoSliderTxt;
    }

    public String getMonakoSliderImageUrl() {
        return monakoSliderImageUrl;
    }

    public void setMonakoSliderImageUrl(String monakoSliderImageUrl) {
        this.monakoSliderImageUrl = monakoSliderImageUrl;
    }

    public String getMonakoSliderImage() {
        return monakoSliderImage;
    }

    public void setMonakoSliderImage(String monakoSliderImage) {
        this.monakoSliderImage = monakoSliderImage;
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

    @Override
    public String toString() {
        return "Slider{" +
                "id='" + id + '\'' +
                ", monakoSliderTxt='" + monakoSliderTxt + '\'' +
                ", monakoSliderImageUrl='" + monakoSliderImageUrl + '\'' +
                ", monakoSliderImage='" + monakoSliderImage + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
