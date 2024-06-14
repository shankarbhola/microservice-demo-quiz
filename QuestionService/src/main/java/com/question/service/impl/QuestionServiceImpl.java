package com.question.service.impl;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question getById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question with id " + id + " not found"));
    }

    @Override
    public List<Question> getByQuizId(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
