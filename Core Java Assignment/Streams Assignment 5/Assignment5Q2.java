import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
        HashMap<Integer,Integer> m = (HashMap<Integer, Integer>) news.
                stream().
                collect(Collectors.groupingBy(News::getNewsId,Collectors.summingInt(a->1)));

        int max = 0;
        int maxKey = 0;

        for(Map.Entry map:m.entrySet()){
            if(max<(int) map.getValue()){
                max = (int) map.getValue();
                maxKey = (int) map.getKey();
            }
        }
        return maxKey;

    }

    public static int budgetCount (List < News > news) {
        return (int)news.stream().filter(x-> x.getComment().contains("budget"))
                .count();
    }
    public static String maxCommentsByUser (List < News > news) {
        HashMap<String,Integer> m = (HashMap<String, Integer>) news.
                stream().
                collect(Collectors.groupingBy(News::getCommentByUser,Collectors.summingInt(a->1)));

        String user = null;
        int max = 0;

        for(Map.Entry map:m.entrySet()){
            if(max< (int) map.getValue()){
                max = (int) map.getValue();
                user = (String) map.getKey();
            }
        }

        return user;
    }

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
        Map<String,Integer> m = news.
                stream().
                collect(Collectors.groupingBy(News::getCommentByUser,Collectors.summingInt(a->1)));

         Map<String, Integer> s =  m.entrySet().stream().sorted(reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (oldValue, newValue)-> oldValue, LinkedHashMap::new));
         return s;

    }

    public static void main(String[] args) {}
}
class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
