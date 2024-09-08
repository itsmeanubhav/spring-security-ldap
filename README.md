# spring-security-ldap
Using Spring security we are going to learn how to setup a Spring Boot app with Spring Security that connects to an LDAP server for authentication

For this application to work we need an LDAP server.There are bunch of different ways in which we can approach this. We can get to an existing LDAP server,
But we are going to run an DEV instance of an open source LDAP server.This LDAP server is going to be running on our machine & hold all the information in memory.
So it should not be used for an real world application.

Although with this approach we can modify some code and point it to a real LDAP server and it is going to work properly.


In this project we are having following dependencies initially

Spring Web
Spring Security


But additionally we need to add some more dependencies which are mentioned below

UnboundId - it is an opensource implementation of an ldap server and as an dependency we are using unboundid-ldapsdk

spring-ldap-core - it is an spring integration library that works with LDAP

spring-security-ldap - it helps SpringSecurity to integrate with LDAP


To configure local instances of ldap is by going to application.properties file and add following properties

									spring.ldap.embedded.port=8389
									spring.ldap.embedded.ldif=classpath:ldap-data.ldif	#this property defines the location of file which contains dummy data
									#ldif stands for ldap data interchange format.
									
									
									spring.ldap.embedded.base-dn=dc=springframework,dc=org
									#Above property mentions what our root node should be to read this property we need to go from Right to left
									#In Spring LDAP, the base distinguished name (base DN) is the entry in the directory from which LDAP clients search. The base DN is also known as the search base
									
									
									
Now to mention Spring Security for connecting it to LDAP and use it for authentication for doing so we can do so by configuring SpringSecurity for doing so we need to create 
a class which extends WebSecurityConfigurerAdapter(which now is depriciated)
although once we extend WebSecurityConfigurerAdapter we need to override somemethods									
