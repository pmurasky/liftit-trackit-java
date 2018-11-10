package murasky.workit_trackit.controller;

import murasky.workit_trackit.entity.Muscle;
import murasky.workit_trackit.repository.MuscleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @Autowired
    private MuscleRespository respository;

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        List<Muscle> muscles = respository.findAll();
        return muscles.stream().map(n -> n.getName()).collect(Collectors.joining());
    }
}
