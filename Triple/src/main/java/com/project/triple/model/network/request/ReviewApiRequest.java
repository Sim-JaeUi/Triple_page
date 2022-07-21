package com.project.triple.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewApiRequest {
    private Long id;
    private String reviewNum;
    private String title;
    private String content;
    private String nickname;
    private String email;
    private String uploadPath;
    private String fileName;
    private String fileType;
    private Integer likeCount;
    private LocalDateTime regDate;
    private String ticketNum;
}
