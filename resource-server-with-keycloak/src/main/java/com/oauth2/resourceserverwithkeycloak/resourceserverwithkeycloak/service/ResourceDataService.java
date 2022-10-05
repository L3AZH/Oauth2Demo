package com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.service;


import com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.dto.entity.ResourceEntity;
import com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.dto.response.ResourceDataItemResponse;
import com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.repo.ResourceDataRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResourceDataService {

    private final ResourceDataRepo resourceDataRepo;

    public ResponseEntity<List<ResourceDataItemResponse>> getAllDataResource(){
        List<ResourceEntity> listData = resourceDataRepo.findAll();
        List<ResourceDataItemResponse> listResponse = listData.stream().map(item ->
                ResourceDataItemResponse.builder()
                        .idResource(item.getIdResource())
                        .name(item.getName())
                        .description(item.getDescription())
                        .deathTime(item.getDeathTime())
                        .createAt(item.getCreateAt())
                        .createBy(item.getCreateBy())
                        .updateAt(item.getUpdateAt())
                        .updateBy(item.getUpdateBy()).build()
        ).toList();
        return ResponseEntity.ok(listResponse);

    }

}
