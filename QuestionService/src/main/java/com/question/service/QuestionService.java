package com.question.service;

import com.question.entity.Question;

import java.util.List;

public interface QuestionService {
    Question add(Question question);
    List<Question> getAll();
    Question getById(Long id);
    List<Question> getByQuizId(Long quizId);
}
