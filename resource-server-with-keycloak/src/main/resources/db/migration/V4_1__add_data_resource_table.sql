INSERT INTO `oauth2-db`.`oauth2_resource_data`
(`id_resource`,
 `name`,
 `description`,
 `death_time`,
 `is_deleted`,
 `created_at`,
 `created_by`,
 `updated_at`,
 `updated_by`)
VALUES(
  'ec538eea-4521-11ed-b878-0242ac120002',
  'name',
  'This is data from description server',
  now(),
  0,
  now(),
  'SYSTEM',
  now(),
  'SYSTEM'
)