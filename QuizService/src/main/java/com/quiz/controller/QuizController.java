package com.quiz.controller;

import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz addQuiz(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //get quiz by id
    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id){
        return quizService.getById(id);
    }

    @GetMapping
    public List<Quiz> getAllQuiz(){
        return quizService.getAll();
    }
}
