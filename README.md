# Oauth2Demo

## Build with:
`Java 17.0.1` `Gradle`

## Demo with Spring Authorized Server 

### Source Include:
`client` `sever-authenticate` `resource-server`

#### Link spring-projects/spring-authorization-server:
```
https://github.com/spring-projects/spring-authorization-server 
```

#### Config
1. Install MySQL( MySQL 8.0.23), MySQL WorkBench
2. Create database with name "oauth2-db"
3. Build and Run 3 Project above( data will automatic init in your database schema using Flyaway DB migration)

#### Note
You should truncate 4 table in your database schema when you build and run the demo at 2nd, 3rd, 4th ,.. time
1. oauth2_authorization
2. oauth2_authorization_consent
3. oauth2_registered_client
4. oauth2_resource_data



## Demo with Keycloak(19.0.2)

### Source Include:
`resource-server-with-keycloak`

### Config
1. Download KeyCloak zip file if you want to use the newest version or you can use mine
2. Start KeyCloack Authentication Server by commanline in cmd(Windown)  or terminal(Linux or MacOs)
#### Window
```bash
./kc.bat start-dev
```
#### Linux, MacOs
```bash
./kc.sh start-dev
```
3. Create admin account when you started first time
4. Set up Realms, Client, Client Scope, User, you can find more infomation by those link below
```
Key Cloak

VIE
https://huongdanjava.com/vi/keycloak

SPRING BOOT BLOG
https://www.baeldung.com/spring-boot-keycloak
```
5. Build and Run the `resource-server-with-keycloak` project
