package com.example.assignment2;

import java.util.Objects;

public class PoliticalAd {
    private int adId;
    private String pageName;
    private String adText;
    private int adImpression;
    private int adClicks;
    private double adSpend;
    private String targetAudience;
    private String adDate;
    private String adCampaign;

    public PoliticalAd(int adId, String pageName, String adText, int adImpression, int adClicks, double adSpend, String targetAudience, String adDate, String adCampaign) {
        this.adId = adId;
        this.pageName = pageName;
        this.adText = adText;
        this.adImpression = adImpression;
        this.adClicks = adClicks;
        this.adSpend = adSpend;
        this.targetAudience = targetAudience;
        this.adDate = adDate;
        this.adCampaign = adCampaign;
    }

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText;
    }

    public int getAdImpression() {
        return adImpression;
    }

    public void setAdImpression(int adImpression) {
        this.adImpression = adImpression;
    }

    public int getAdClicks() {
        return adClicks;
    }

    public void setAdClicks(int adClicks) {
        this.adClicks = adClicks;
    }

    public double getAdSpend() {
        return adSpend;
    }

    public void setAdSpend(double adSpend) {
        this.adSpend = adSpend;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getAdDate() {
        return adDate;
    }

    public void setAdDate(String adDate) {
        this.adDate = adDate;
    }

    public String getAdCampaign() {
        return adCampaign;
    }

    public void setAdCampaign(String adCampaign) {
        this.adCampaign = adCampaign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoliticalAd that = (PoliticalAd) o;
        return adId == that.adId &&
                adImpression == that.adImpression &&
                adClicks == that.adClicks &&
                Double.compare(that.adSpend, adSpend) == 0 &&
                Objects.equals(pageName, that.pageName) &&
                Objects.equals(adText, that.adText) &&
                Objects.equals(targetAudience, that.targetAudience) &&
                Objects.equals(adDate, that.adDate) &&
                Objects.equals(adCampaign, that.adCampaign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adId, pageName, adText, adImpression, adClicks, adSpend, targetAudience, adDate, adCampaign);
    }

    @Override
    public String toString() {
        return "PoliticalAd{" +
                "adId=" + adId +
                ", pageName='" + pageName + '\'' +
                ", adText='" + adText + '\'' +
                ", adImpression=" + adImpression +
                ", adClicks=" + adClicks +
                ", adSpend=" + adSpend +
                ", targetAudience='" + targetAudience + '\'' +
                ", adDate='" + adDate + '\'' +
                ", adCampaign='" + adCampaign + '\'' +
                '}';
    }
}
