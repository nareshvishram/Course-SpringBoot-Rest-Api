package com.binarybeast.in.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topic =new ArrayList<>(Arrays.asList(new Topic("1", "MANIT", "A great Institute!"),
            new Topic("2", "ECE", "A Time Pass Branch!!")));

    public List<Topic> getAllTopics() {
        return topic;
    }
    public Topic getTopicById(String id){
        return topic.stream().filter(t->t.getId().toString().equals(id)).findFirst().get();
    }
    public void addTopic(Topic t){
        topic.add(t);
    }
    public void updateById(Topic content,String id){
        int idx=0;
         for(Topic t:topic){
             if(t.getId().toString().equals(id)){
                 topic.set(idx,content);
                 break;
             }
             idx++;
         }
    }
    public void deleteById(String id){
        topic.removeIf(t->t.getId().toString().equals(id));
    }
}
