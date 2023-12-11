package com.kafka.cabdriver.controller;

import com.kafka.cabdriver.service.CabDriverLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/drivers")
@RequiredArgsConstructor
public class CabDriverLocationController {

    private final CabDriverLocationService cabDriverLocationService;

    @GetMapping
    public ResponseEntity<?> updateLocation() throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            cabDriverLocationService.updateLocation(Math.random() + ", "+ Math.random());
            Thread.sleep(1000);
        }

        return ResponseEntity.ok().body("Hi");
    }
}
