package com.binarybeast.in.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TopicController {

    @Autowired
    TopicService ts;

    @RequestMapping("/topics")
    public List<Topic> allTopics() {

        return ts.getAllTopics();
    }


    @RequestMapping("/topic/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return ts.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        ts.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
    public void updateById(@RequestBody Topic topic, @PathVariable String id) {
        ts.updateById(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteById(@PathVariable String id) {
        ts.deleteById(id);
    }
}


