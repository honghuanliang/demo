package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 平台端团队管理
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/platform/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping(value = "/query")
    public R<IPage<TeamPageDTO>> queryTest() {
        System.out.println("Hello, World!");
    }

}


