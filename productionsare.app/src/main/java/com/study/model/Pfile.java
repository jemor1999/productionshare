package com.study.model;

public class Pfile {
    private Integer pfileId;

    private String pfileName;

    private String pfilePath;

    private String pfileInfo;

    private Integer userId;

    public Integer getPfileId() {
        return pfileId;
    }

    public void setPfileId(Integer pfileId) {
        this.pfileId = pfileId;
    }

    public String getPfileName() {
        return pfileName;
    }

    public void setPfileName(String pfileName) {
        this.pfileName = pfileName == null ? null : pfileName.trim();
    }

    public String getPfilePath() {
        return pfilePath;
    }

    public void setPfilePath(String pfilePath) {
        this.pfilePath = pfilePath == null ? null : pfilePath.trim();
    }

    public String getPfileInfo() {
        return pfileInfo;
    }

    public void setPfileInfo(String pfileInfo) {
        this.pfileInfo = pfileInfo == null ? null : pfileInfo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pfileId=").append(pfileId);
        sb.append(", pfileName=").append(pfileName);
        sb.append(", pfilePath=").append(pfilePath);
        sb.append(", pfileInfo=").append(pfileInfo);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Pfile other = (Pfile) that;
        return (this.getPfileId() == null ? other.getPfileId() == null : this.getPfileId().equals(other.getPfileId()))
                && (this.getPfileName() == null ? other.getPfileName() == null : this.getPfileName().equals(other.getPfileName()))
                && (this.getPfilePath() == null ? other.getPfilePath() == null : this.getPfilePath().equals(other.getPfilePath()))
                && (this.getPfileInfo() == null ? other.getPfileInfo() == null : this.getPfileInfo().equals(other.getPfileInfo()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPfileId() == null) ? 0 : getPfileId().hashCode());
        result = prime * result + ((getPfileName() == null) ? 0 : getPfileName().hashCode());
        result = prime * result + ((getPfilePath() == null) ? 0 : getPfilePath().hashCode());
        result = prime * result + ((getPfileInfo() == null) ? 0 : getPfileInfo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}