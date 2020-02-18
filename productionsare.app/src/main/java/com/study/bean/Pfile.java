package com.study.bean;

public class Pfile {
//    id
    private Integer pfileId;
//    文件名，含路径
    private String pfileName;
//    路径，不含文件名
    private String pfilePath;
//    文件描述
    private String pfileInfo;

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
            && (this.getPfileInfo() == null ? other.getPfileInfo() == null : this.getPfileInfo().equals(other.getPfileInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPfileId() == null) ? 0 : getPfileId().hashCode());
        result = prime * result + ((getPfileName() == null) ? 0 : getPfileName().hashCode());
        result = prime * result + ((getPfilePath() == null) ? 0 : getPfilePath().hashCode());
        result = prime * result + ((getPfileInfo() == null) ? 0 : getPfileInfo().hashCode());
        return result;
    }
}