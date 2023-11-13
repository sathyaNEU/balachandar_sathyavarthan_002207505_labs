/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author harshalneelkamal
 */

import data.DataStore;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
        public void getMostCommentedPost(){
        DataStore data = DataStore.getInstance();
        Post maxCommentPost = null;
        for(Post post : data.getPosts().values()){
            if(maxCommentPost==null)
                maxCommentPost = post;
            else
                if(post.getComments().size()>maxCommentPost.getComments().size())
                    maxCommentPost = post;
        }
            System.out.println("Most commented Post : "+maxCommentPost.getPostId());
        }
        
        public void getMostLikedCommentPost(){
            DataStore data = DataStore.getInstance();
            Comment mostLikedComment = null;
            for(Comment comment : data.getComments().values()){
                if(mostLikedComment==null)
                    mostLikedComment = comment;
                else
                    if(comment.getLikes()>mostLikedComment.getLikes())
                        mostLikedComment = comment;
            }
            int id = mostLikedComment.getPostId();
            System.out.println("Post which has most liked comment : "+ data.getPosts().get(id).getPostId());
        }
        
        
        public void getTop5PassiveUsers(){
            HashMap<Integer, Integer> userPostNum = new HashMap<>();
            DataStore data = DataStore.getDataStore();
            for(Post post : data.getPosts().values()){
                int user_id = post.getUserId();
                if(userPostNum.containsKey(user_id))
                    userPostNum.put(user_id, userPostNum.get(user_id)+1);
                else
                    userPostNum.put(user_id, 1);
            }
           // for(HashMap.Entry<Integer, Integer> set : userPostNum.entrySet())
            //    System.out.println(set.getKey()+"----"+set.getValue());
            ArrayList<User> userList = new ArrayList(data.getUsers().values());
            Collections.sort(userList, new UserMapComparator(userPostNum));
            System.out.println("Top 5 inactive users based on post count");
            for(int i=0;i<5;i++)
                System.out.println(userList.get(i)+", Post count = "+ userPostNum.get(userList.get(i).getId()));
        }
        
        public void getTop5PassiveCommentedUsers(){
            HashMap<Integer, Integer> userCommentedNum = new HashMap<>();
            DataStore data = DataStore.getDataStore();
            for(Comment comment : data.getComments().values()){
                int user_id = comment.getUserId();
                if(userCommentedNum.containsKey(user_id))
                    userCommentedNum.put(user_id, userCommentedNum.get(user_id)+1);
                else
                    userCommentedNum.put(user_id, 1);
            }
            //for(HashMap.Entry<Integer, Integer> set : userCommentedNum.entrySet())
             //   System.out.println(set.getKey()+"----"+set.getValue());
            ArrayList<User> userList = new ArrayList(data.getUsers().values());
            Collections.sort(userList, new UserMapComparator(userCommentedNum));
            System.out.println("Top 5 Passive Users based on Comments");
            for(int i=0; i< 5;i++)
                System.out.println(userList.get(i));
        }
        
        public void getTop5ActivePassiveOverallMetricUsers(){
            HashMap<Integer, Integer> userOverallNum = new HashMap<>();
            DataStore data = DataStore.getDataStore();
            for(Comment comment : data.getComments().values()){
                int user_id = comment.getUserId();
                if(userOverallNum.containsKey(user_id))
                    userOverallNum.put(user_id, userOverallNum.get(user_id)+1+comment.getLikes());
                else
                    userOverallNum.put(user_id, 1+comment.getLikes());
            }
            for(Post post : data.getPosts().values()){
                int user_id = post.getUserId();
                if(userOverallNum.containsKey(user_id))
                    userOverallNum.put(user_id, userOverallNum.get(user_id)+1);
                else
                    userOverallNum.put(user_id, 1);
            }
            
            //for(HashMap.Entry<Integer, Integer> set : userCommentedNum.entrySet())
             //   System.out.println(set.getKey()+"----"+set.getValue());
            ArrayList<User> userList = new ArrayList(data.getUsers().values());
            Collections.sort(userList, new UserMapComparator(userOverallNum));
            System.out.println("Top 5 Overall InActive users");
            for(int i=0; i< 5;i++)
                System.out.println(userList.get(i)+"overall activity score"+userOverallNum.get(userList.get(i).getId()));
            System.out.println("Top 5 Overall Active users");
            for(int i=userList.size()-1; i>=userList.size()-5;i--)
                System.out.println(userList.get(i)+"overall activity score = "+userOverallNum.get(userList.get(i).getId()));
        }
        
        
        
}
