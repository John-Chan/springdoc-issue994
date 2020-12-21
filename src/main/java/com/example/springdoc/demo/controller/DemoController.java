package com.example.springdoc.demo.controller;

import com.example.springdoc.demo.model.Groups;
import com.example.springdoc.demo.model.UserA;
import com.example.springdoc.demo.model.UserB;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @author CJ (power4j@outlook.com)
 * @date 2020/12/21
 * @since 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/demo")
@Tag(name = "demo")
public class DemoController {

    @PostMapping("/user-a")
    @Operation(summary = "create UserA")
    ResponseEntity<UserA> saveUserA(@Validated({ Groups.Create.class }) @RequestBody UserA data){
        return ResponseEntity.ok(null);
    }
    @GetMapping("/user-a/{id}")
    @Operation(summary = "get UserA")
    ResponseEntity<UserA> gerUserA(@PathVariable("id") Serializable id){
        return ResponseEntity.ok(null);
    }

    @PostMapping("/user-b")
    @Operation(summary = "create UserB")
    ResponseEntity<UserB> saveUserB(@Validated({ Groups.Create.class }) @RequestBody UserB data){
        return ResponseEntity.ok(null);
    }

    @GetMapping("/user-b/{id}")
    @Operation(summary = "get UserB")
    ResponseEntity<UserB> gerUserB(@PathVariable("id") Serializable id){
        return ResponseEntity.ok(null);
    }
}
