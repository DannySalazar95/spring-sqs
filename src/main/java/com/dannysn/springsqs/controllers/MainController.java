package com.dannysn.springsqs.controllers;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
@RequestMapping("/")
public class MainController {

    SqsTemplate sqsTemplate;

    @GetMapping(value = "/test-sqs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> testSQS() {

        sqsTemplate.send(to -> to.queue("reviewTravelRequest").payload("fhdjshfjd42343"));

        return ResponseEntity.status(HttpStatus.OK).body("success");
    }

}
