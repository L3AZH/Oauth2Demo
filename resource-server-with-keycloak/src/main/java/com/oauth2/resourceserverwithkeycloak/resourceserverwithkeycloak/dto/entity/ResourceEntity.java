package com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.dto.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "oauth2_resource_data")
@Getter
@Setter
public class ResourceEntity {

    @Id
    @Type(type="uuid-char")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id_resource", columnDefinition = "NVARCHAR(1024)")
    private UUID idResource;

    @Column(name = "name", columnDefinition = "NVARCHAR(225)")
    private String name;

    @Column(name = "description", columnDefinition = "NVARCHAR(1000)")
    private String description;

    @Column(name = "death_time", columnDefinition = "DATETIME")
    private Date deathTime;

    @Column(name = "is_deleted", columnDefinition = "TINYINT")
    private Integer isDelete;

    @Column(name = "created_at", columnDefinition = "DATETIME")
    private Date createAt;

    @Column(name = "created_by", columnDefinition = "VARCHAR(100)")
    private String createBy;

    @Column(name = "updated_at", columnDefinition = "DATETIME")
    private Date updateAt;

    @Column(name = "updated_by", columnDefinition = "VARCHAR(100)")
    private String updateBy;
}
