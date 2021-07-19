package com.inquisitor.strategy.swagger.design.controller;

import com.inquisitor.strategy.swagger.design.controller.vo.BoardGameVo;
import io.swagger.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultBoardGameController implements BoardGameController {

    @Override
    public ResponseEntity<BoardGameVo> create(BoardGameVo boardGameVo) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<BoardGameVo> get(Integer idBoardGame) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<List<BoardGameVo>> findAll() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> evilOperationToDoSomethingNasty() {
        return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
