package com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.controller;


import com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.dto.response.ResourceDataItemResponse;
import com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.service.ResourceDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resource")
@RequiredArgsConstructor
public class ResourceDataController {

    private final ResourceDataService resourceDataService;

    @GetMapping("/all-data")
    public ResponseEntity<List<ResourceDataItemResponse>> getAllResourceData(){
        return resourceDataService.getAllDataResource();
    }
}
