package com.shop.comments.dao;

import com.mongodb.client.result.UpdateResult;
import com.shop.comments.entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentsDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public String insert(Comments comments) {
        return mongoTemplate.save(comments).get_id();
    }

    public List<Comments> findByGoodsId(Integer integers) {
        Query query = new Query(Criteria.where("goodsId").is(integers));
        return mongoTemplate.find(query, Comments.class);
    }

    public Comments delById(int buyerId, String commentsId) {
        Query query = new Query(Criteria.where("_id").is(commentsId).and("buyerId").is(buyerId));
        return mongoTemplate.findAndRemove(query, Comments.class);
    }
}
