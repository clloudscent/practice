package Record;

public class DiaryVO {
    private String id;
    private String title;
    private String content;
    private String createdDate;
    private String updatedDate;
    private String writer;

    public DiaryVO(String id, String title, String content, String createdDate, String updatedDate, String writer){
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdDate =createdDate;
        this.updatedDate = updatedDate;
        this.writer = writer;
    }

    public DiaryVO() {

    }

    public DiaryVO(String title, String content, String today, String inputId) {
        this.title = title;
        this.content = content;
        this.createdDate = today;
        this.updatedDate = today;
        this.writer = inputId;
    }

    public DiaryVO(String updateInputId, String updateTitle, String updateContent) {
        this.id = updateInputId;
        this.title = updateTitle;
        this.content = updateContent;
    }


    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getCreatedDate(){
        return createdDate;
    }
    public void setCreatedDate(String createdDate){
        this.createdDate = createdDate;
    }
    public String getUpdatedDate(){
        return updatedDate;
    }
    public void setUpdatedDate(String updatedDate){
        this.updatedDate = updatedDate;
    }
    public String getWriter(){
        return writer;
    }
    public void setWriter(String writer){
        this.writer = writer;
    }
}
