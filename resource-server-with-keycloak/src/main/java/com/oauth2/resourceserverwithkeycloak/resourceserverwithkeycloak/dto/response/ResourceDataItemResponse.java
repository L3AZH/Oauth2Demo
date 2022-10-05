package com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ResourceDataItemResponse {

    private String idResource;

    private String name;

    private String description;

    private Date deathTime;

    private Integer isDelete;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;
}
