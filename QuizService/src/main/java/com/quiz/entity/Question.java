package com.quiz.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
    private Long id;
    private String question;
    private Long quizId;
}