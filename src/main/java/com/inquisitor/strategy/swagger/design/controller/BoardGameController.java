package com.inquisitor.strategy.swagger.design.controller;

import com.inquisitor.strategy.swagger.design.controller.vo.BoardGameVo;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@Validated
@Api(value = "Board game")
@RequestMapping("/board-game")
public interface BoardGameController {

    @ApiOperation(value = "Create board game", notes = "This method creates a new board game based on board game geek")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Created board game")})
    @PostMapping(value = "", produces = "application/json")
    ResponseEntity<BoardGameVo> create(@RequestBody @Valid BoardGameVo boardGameVo);

    @ApiOperation(value = "Get board game", notes = "This method get board game by name")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Obtained board game")})
    @GetMapping(value = "{id-board-game}", consumes = "application/json")
    ResponseEntity<BoardGameVo> get(@ApiParam(value =  "id-board-game", example = "09721", required = true) @PathVariable("id-board-game") Integer idBoardGame);

    @ApiOperation(value = "Get random list of board game", notes = "This method find random list of board game")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Obtained random list of board game")})
    @GetMapping(value = "", produces = "application/json")
    ResponseEntity<List<BoardGameVo>> findAll();

    @ApiOperation(value = "DO SOMETHING REALLY BAD", notes = "Do something really bad", hidden = true)
    @GetMapping(value = "/EVIL", produces = "application/json")
    ResponseEntity<Void> evilOperationToDoSomethingNasty();

}
