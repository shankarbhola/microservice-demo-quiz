package com.question.controller;

import com.question.entity.Question;
import com.question.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionService.add(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable Long id){
        return questionService.getById(id);
    }
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionByQuizId(@PathVariable Long quizId){
        return questionService.getByQuizId(quizId);
    }
}
