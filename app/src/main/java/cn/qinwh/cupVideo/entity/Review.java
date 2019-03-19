package cn.qinwh.cupVideo.po;

import java.util.Date;

public class Review {
    private Integer reviewId;

    private Integer publisherId;

    private Integer reviewLikeNumber;

    private Date reviewPublishTime;

    private Integer videoId;

    private Integer status;

    private String reviewContent;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getReviewLikeNumber() {
        return reviewLikeNumber;
    }

    public void setReviewLikeNumber(Integer reviewLikeNumber) {
        this.reviewLikeNumber = reviewLikeNumber;
    }

    public Date getReviewPublishTime() {
        return reviewPublishTime;
    }

    public void setReviewPublishTime(Date reviewPublishTime) {
        this.reviewPublishTime = reviewPublishTime;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent == null ? null : reviewContent.trim();
    }
}