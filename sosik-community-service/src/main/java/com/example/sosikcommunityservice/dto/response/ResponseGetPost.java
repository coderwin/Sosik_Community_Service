package com.example.sosikcommunityservice.dto.response;

import com.example.sosikcommunityservice.model.entity.CommentEntity;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record ResponseGetPost(
        Long memberId,
        String title,
        String content,
        Long hits,
        LocalDateTime createdAt,
        List<ResponseGetComment> comments

   ) {
}