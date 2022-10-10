package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.service.MemberService;
import com.example.swaggerdemo.vo.MemberVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value="Swagger Test Controller")
@RequestMapping("/")
public class SwaggerTestController {
    @Autowired
    MemberService memberService;

    @ApiOperation(value="덧셈", notes="덧셈 사칙연산 수행")
    @GetMapping(value= "/add")
    public ResponseEntity<Integer> add (
            @ApiParam(value="1번 값", required = true, example = "1")
            @RequestParam(value="num1", required = true) int num1,
            @ApiParam(value="2번 값", required = true, example = "2")
            @RequestParam(value="num2", required = true)int num2
    ) {
        int sum = num1 + num2;

        return ResponseEntity.ok(sum);
    }

    @ApiOperation(value="회원저장", notes="회원저장기능 수행")
    @PostMapping
    public ResponseEntity<MemberVo> save(@ApiParam(example = "memberVo") MemberVo member) {
        return new ResponseEntity<MemberVo>(memberService.save(member), HttpStatus.OK);
    }
}
