package com.example.beautysalon.controller;

import com.example.beautysalon.mbg.model.Comment;
import com.example.beautysalon.mbg.model.User;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.service.CommentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lee
 * @date 2021.3.28  21:30
 * @description
 */
@RestController
@RequestMapping("/")
public class CommentController {

    @Resource
    private CommentService commentService;

    @PostMapping("comment/data")
    public ResponseBody getCommentData(@RequestBody String map) {

        return commentService.selectCommentByStylist(map);
    }

    @PostMapping("evaluate")
    public ResponseBody evaluate(@RequestBody Comment comment) {
        return commentService.insert(comment);
    }

    @PostMapping("user/comment")
    public ResponseBody getUserComment(@RequestBody User user) {
        return commentService.getUserComment(user);
    }
}
