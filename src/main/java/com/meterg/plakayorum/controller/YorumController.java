package com.meterg.plakayorum.controller;

import com.meterg.plakayorum.entity.Yorum;
import com.meterg.plakayorum.service.YorumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/yorum")
public class YorumController {

    private YorumService yorumService;

    YorumController(YorumService yorumService) {
        this.yorumService = yorumService;
    }

    @GetMapping("/{plakaId}")
    public ResponseEntity<List<Yorum>> getYorumList(@PathVariable(value = "plakaId") Long plakaId) {
        Optional<List<Yorum>> yorumList = yorumService.findAllByPlakaId(plakaId);
        if (yorumList.isPresent()) {
            return ResponseEntity.ok(yorumList.get());
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<Yorum> insert(@Valid @RequestBody Yorum yorum){
        try{
            return ResponseEntity.ok(yorumService.save(yorum));
        }catch(Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
}