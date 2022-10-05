CREATE TABLE IF NOT EXISTS `oauth2_resource_data`
(
    `id_resource`   nvarchar(1024) PRIMARY KEY,
    `name`  nvarchar(255) NULL,
    `description` nvarchar(1000) NULL,
    `death_time` datetime NULL,
    `is_deleted` tinyint NOT NULL DEFAULT 0,
    `created_at` datetime     NULL,
    `created_by` varchar(100) NOT NULL,
    `updated_at` datetime     NULL,
    `updated_by`  varchar(100) NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;