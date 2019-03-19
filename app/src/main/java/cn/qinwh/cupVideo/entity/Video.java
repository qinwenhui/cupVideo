package cn.qinwh.cupVideo.po;

import java.util.Date;

public class Video {
    private Integer videoId;

    private String videoTitle;

    private String videoPath;

    private String videoDesc;

    private Integer publisherId;

    private Date videoPublishTime;

    private String videoImage;

    private Integer videoLikeNumber;

    private Integer videoReviewNumber;

    private Integer videoPlayNumber;

    private Integer status;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc == null ? null : videoDesc.trim();
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Date getVideoPublishTime() {
        return videoPublishTime;
    }

    public void setVideoPublishTime(Date videoPublishTime) {
        this.videoPublishTime = videoPublishTime;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage == null ? null : videoImage.trim();
    }

    public Integer getVideoLikeNumber() {
        return videoLikeNumber;
    }

    public void setVideoLikeNumber(Integer videoLikeNumber) {
        this.videoLikeNumber = videoLikeNumber;
    }

    public Integer getVideoReviewNumber() {
        return videoReviewNumber;
    }

    public void setVideoReviewNumber(Integer videoReviewNumber) {
        this.videoReviewNumber = videoReviewNumber;
    }

    public Integer getVideoPlayNumber() {
        return videoPlayNumber;
    }

    public void setVideoPlayNumber(Integer videoPlayNumber) {
        this.videoPlayNumber = videoPlayNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}