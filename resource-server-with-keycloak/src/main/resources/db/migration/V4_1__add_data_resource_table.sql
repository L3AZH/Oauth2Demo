INSERT INTO `oauth2_resource_data`
(`id_resource`,
 `name`,
 `description` ,
 `death_time`,
 `is_deleted`,
 `created_at`,
 `created_by`,
 `updated_at`,
 `updated_by`)
VALUES(
  '12as5w3ax2fc5sa2s',
  'TestResource',
  'This is data from resource server',
  now(),
  0,
  now(),
  'SYSTEM',
  now(),
  'SYSTEM'
)