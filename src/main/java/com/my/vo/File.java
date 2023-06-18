package com.my.vo;

public class File {
    private Integer FileId;
    private String FileTitle;
    private String FromUserName;
    private String ToUserName;
    private String FileStatus;

    public File() {
    }

    public File(Integer fileId, String fileTitle, String fromUserName, String toUserName, String fileStatus) {
        FileId = fileId;
        FileTitle = fileTitle;
        FromUserName = fromUserName;
        ToUserName = toUserName;
        FileStatus = fileStatus;
    }

    @Override
    public String toString() {
        return "File{" +
                "FileId=" + FileId +
                ", FileTitle='" + FileTitle + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", ToUserName='" + ToUserName + '\'' +
                ", FileStatus='" + FileStatus + '\'' +
                '}';
    }

    public Integer getFileId() {
        return FileId;
    }

    public void setFileId(Integer fileId) {
        FileId = fileId;
    }

    public String getFileTitle() {
        return FileTitle;
    }

    public void setFileTitle(String fileTitle) {
        FileTitle = fileTitle;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFileStatus() {
        return FileStatus;
    }

    public void setFileStatus(String fileStatus) {
        FileStatus = fileStatus;
    }
}
