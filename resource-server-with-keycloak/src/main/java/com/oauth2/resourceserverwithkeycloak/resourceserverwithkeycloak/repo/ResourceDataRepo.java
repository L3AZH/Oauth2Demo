package com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.repo;

import com.oauth2.resourceserverwithkeycloak.resourceserverwithkeycloak.dto.entity.ResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceDataRepo extends JpaRepository<ResourceEntity, String> {
}
