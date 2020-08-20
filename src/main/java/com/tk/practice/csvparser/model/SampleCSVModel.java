package com.tk.practice.csvparser.model;

import java.util.Objects;

public class SampleCSVModel {

    private String seriesReference;
    private String period;
    private String description;
    private Integer revised;
    private Integer initiallyPublished;

    public String getSeriesReference() {
        return seriesReference;
    }

    public void setSeriesReference(String seriesReference) {
        this.seriesReference = seriesReference;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRevised() {
        return revised;
    }

    public void setRevised(Integer revised) {
        this.revised = revised;
    }

    public int getInitiallyPublished() {
        return initiallyPublished;
    }

    public void setInitiallyPublished(Integer initiallyPublished) {
        this.initiallyPublished = initiallyPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleCSVModel that = (SampleCSVModel) o;
        return Objects.equals(seriesReference, that.seriesReference) &&
                Objects.equals(period, that.period) &&
                Objects.equals(description, that.description) &&
                Objects.equals(revised, that.revised) &&
                Objects.equals(initiallyPublished, that.initiallyPublished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seriesReference, period, description, revised, initiallyPublished);
    }

    @Override
    public String toString() {
        return "SampleCSVModel{" +
                "seriesReference='" + seriesReference + '\'' +
                ", period='" + period + '\'' +
                ", description='" + description + '\'' +
                ", revised=" + revised +
                ", initiallyPublished=" + initiallyPublished +
                '}';
    }
}
