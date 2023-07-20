package android.lab8;

public class B2_MessagePage2 {
    String timeLine , nameUser , messageChat ;
    Integer idImg ;
    public B2_MessagePage2(){}

    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getMessageChat() {
        return messageChat;
    }

    public void setMessageChat(String messageChat) {
        this.messageChat = messageChat;
    }

    public Integer getIdImg() {
        return idImg;
    }

    public void setIdImg(Integer idImg) {
        this.idImg = idImg;
    }

    public B2_MessagePage2(Integer idImg, String nameUser , String timeLine , String messageChat){
        this.idImg=idImg;
        this.nameUser=nameUser;
        this.timeLine=timeLine;
        this.messageChat=messageChat;
    }
}
