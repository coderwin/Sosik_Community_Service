package com.example.sosikcommunityservice.service;

import com.example.sosikcommunityservice.dto.request.RequestCreateComment;
import com.example.sosikcommunityservice.dto.request.RequestUpdateComment;
import com.example.sosikcommunityservice.dto.response.ResponseCreateComment;

import java.util.List;

public interface CommentService {
    ResponseCreateComment createComment(Long memberId, RequestCreateComment commentDTO);
    RequestUpdateComment updateComment(Long commentId, RequestUpdateComment commentDTO);
    void deleteComment(Long commentId);
}
