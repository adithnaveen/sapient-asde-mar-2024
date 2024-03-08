# sapient-asde-mar-2024






# Introduction 

- Abhirukth - from HYD - IIIT , CS, have not worked on java, worked on .net, worked on ML & AI 

- Achalla - Btech, ITER, Bhubaneshwar have worked in java, did project on android and final year project was in AI & ML 

-  Adarsh - CS, ITER Unversity, worked with java, final year project with android 

- Aman - CS IIIT KOTA, project on ai & ml, new to java 

- Ayusha - Bhubhaneshwar ITER CS, basics of java, project on ML 

- Dhananjay - CS VIT vellor, have understand of java, intern  with react & type script 

- Dhanuj - VIT Vellor, CS in Datascience, intership deep learning 

- Gaurav - BTECH CSC, Chennai, VIT, have worked with react js 

- Harsh - ranchi, CS worked with java earlier 

- Sri Hari - IIIT kota, CS worked with block chain technology worked as data engg 

- Krishan - VIT Bhopal CS, basics of java, final year project MERN 

- Kshitij - CS IIIT Kalyani, basics of java, worked with c++, knows react js and nodejs 

- Mohith - NIT Srinagar, worked with python 

- Mrinal - Btech in CS IIIT Kurnool, knows basics of Java 

- Neha - EC IIIT KOTA, basics of Java, final year on python ML 

- Paras - VIT Btech, basics of java, worked on ML final year 

- Prince - CS, ITER University worked with kotlin 

- Rajat - Btech CS IIIT kota, studies PJP, knows basics of Java 

- Shivam - CS IIIT DM Kurnool, worked with python have worked with nodejs, knows java from PJP, final year project was on Deep learning 

- Siddharth - Btech CS VIT Vellor, knows basics of java worked with react 

- Vishal - Btech CS ITR bhubhaneshwas worked with java stack worked with JDBC 

- Utkarsh - Btech IIIT Kurnool, final year project in AI & ML, basics of Java 

- Sifat - cs knows basics of java, final year project is on flutter, bengal college of engg & tech 

- vedant - IIIT kalyan, CS knows basics of Java final project 

- Sanyam - VIT CS, final year project MERN 

- Shalin gupta - Btech EC IIIT kota, knows basics of java, final year project ai ml 

- subhodip - CS basics of java, have worked with react 

- Somya - ITR Bhubhaneshwar, knows basics of java 

- Yogesh kumar - CS IIIT Kota, final year peojct AI & ML and few front end project 

- Tahoor - btech in IT nit srinagar, good with java, network simulator in java 





---- 

## workflows 

- there is problem statement which PS has it on insurance 
    - Understnad the need Groming 
    - Insurance problem statement 
    - Given - Pre Condition  
    - When - Actuals work 
    - Then - Post condition 
    - And - Multiple clause 
    - But - exception 

    - type of users 
        - Customer 
        - Agents 
        - Admin 
        - Employees 
    
    - what systems are you building 
        - login 
        - registration 
        - issue of insurance 
        - insurance claim 
        .... 

    -User stories 
```
    AC : new customer registration 
    Given the application is running on the cli mode 
    When the application shows the options 
        1. Register new user 
        2. login to the system 
        3. exit 
    When the user selects option 1 
    Then accept email, password, confirm password, dob, city state, etc 
    When the details are validate like password should have 1 special char 
    And email should have @ symbol 
    And dob should be 18 years or old 
    And city should be in india 
    Then store the record in database 
    And show message "Your registration successful"  
```
- techno functional document
- UML - Unified Modeling Language 
    - OOAD
        - context diagram 
        - Use Case - draw.io, visio, some UI drawing tool, plantuml 
        - sequence diagram 
        - class diagram (optional) - static state diagram 
        .... 
        
- write java program 
    - you should know right tools to use 
        - VS Code, java 17, intellij Community edition, maven, jenkins 


- WORM - Write Once Read Many 
- Introduction to XML 

```
    <emps> 
        <emp>
            <empid>101</empid>
            <empname>Naveen</empname>
            <age>40</age>
        <emp>

        <emp>
            <empid>101</empid>
            <empname>Naveen</empname>
            <age>40</age>
        <emp>
    </emps>
```

- junit dependency 
- the pom.xml file - project object model file holds all the information needed for the dependencies 
- CLI - you need manual installation - to be used in deployment system 
- IDE - Eclipse, IntelliJ, VS Code, Sublime etc...  - mostly installed or it comes as extenstion 
```
<dependencies>

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.10.1</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.junit.jupiter1</groupId>
    <artifactId>junit-jupiter-api1</artifactId>
    <version>5.10.11</version>
    <scope>test1</scope>
</dependency>

</dependencies>
```



## working with Maven 

- Install java and set java home + path variable 
- download maven - https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip
- set path for maven - /Volumes/Kanchan/Softwares/maven/maven-3.8 - M2_HOME 
- setting path %M2_HOME%\bin



## creating maven cli project 


> mvn archetype:generate 

> mvn install 

>java -cp ./target/sample-maven-works-1.0-SNAPSHOT.jar com.sapient.App 


-- setup you maven application  with SLF4J 
 



<br>

# Day 2 


```
<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12 -->
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-log4j12</artifactId>
    <version>1.7.30</version>
    <scope>test</scope> -- what if i need conditionally ? 
</dependency>



--- 


sourceCompatibility = [1.8, 9, 10, 17]
targetCompatibility = 1.8
```


## cd / ci 

    - continues development 
    - continues integration 


> java -jar jenkins.war --httpPort=9090




- sample Jenkinsfile
```

pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "In the build process" 
            }
        }
        stage('Test') { 
            steps {
                echo "In the build test" 
            }
        }
        stage('Deploy') { 
            steps {
                echo "In the build deploy" 
            }
        }
    }
}
```



# working with mongodb 

- Structured - Normalized 
- Unstructured - Unnormalized 
- Json structure 
- CAP Theorem 
- How put the data and get the data 


- db vs dbms 

### sample data model 
```
- mohit 

{
    name: "mohit", 
    city: "Bengaluru", 
    state: "karnataka", 
    accountNo : 12345, 
    accountBalance : 332211, 
    accountBranch : "MG Road"
}

- Gaurav 

{
    id: 101, 
    name: {
        first:"Gaurav", 
        last:"Kumar"
    }, 
    address: {
        houseNo: 1243, 
        street: "some Blvd" , 
        city: "Mysuru", 
        state: "Karnataka"

    }, 
    insurance : {
        familyMembers: {
            member1:{
                relation:"father", 
                name:"Father Name", 
                age: 44,
                address:  {

                }, 
                member2:{
                    relation:"father", 
                    name:"Father Name", 
                    age: 44,
                    address:  {
                        
                    }
            }
            }
        }
    }
}

```


## working with mongodb 

>  mongod --dbpath . (to start mongodb) -- dont close the terminal 

>  mongod --dbpath . --port 27018 

> mongo  (by default looks for 27017 port number )

-- to insert a document  
> db.emps.insert({empid:101, empname:"siddharth", empsal:12345});

> db.emps.insert({empid:102, empname:"Shalin", empsal:22334});

> db.emps.insert({empid:103, empname:"paras", empsal:10000});

> db.emps.insert({empid:104, empname:"rajat", empsal:20000});

> db.emps.insert({empid:105, empname:"krishan", address: {street:"Cubbon Park", city:"Bengaluru"}});


-- to see document 
> db.emps.find(); 

> show collections; 

> db.createCollection("mycoll")




# Day 3 

- continuing mongodb 

- find - with condition (where clause)

```
    - syntax 
    > db.emps.find({selection}, {projection}); 


    > db.emps.find({empsal:{$gt: 10000}}); 
```
- multiple condition and / or 

```
-- sal > 10000 & city bengaluru 
    > db.emps.find({empsal:{$gt:10000}, city:{$eq:'Bengaluru'}})



-- sal > 10000 or city bengaluru 
    > db.emps.find({$or:[
                {
                    empsal:{$gt:10000}
                }, 
                {
                    city:{$eq:'Bengaluru'}
                }
            ]
        }
    );



```



- sorting and limit 
```
    - 1 is ascending , -1 is descending, and you can give multiple sorts 

    - in ascending 
    > db.emps.find({empsal:{$gt: 10000}}).sort({empsal:1})


    - in descending  
    > db.emps.find({empsal:{$gt: 10000}}).sort({empsal:-1})

    - in descending  and to check if empsal exists 
    > db.emps.find({empsal:{$exists:true}}).sort({empsal:-1})

    - in descending  and to check if empsal exists + limit 
    > db.emps.find({empsal:{$exists:true}}).sort({empsal:-1}).skip(1).limit(2)


```

- find - with projection (select empid, empname from emp)

```
 > db.emps.find(
        {empsal:{$exists:true}}, 
        {empname:1, empsal:1, _id:0}
    ).sort({empsal:-1}).skip(1).limit(2) 

```
- updated 

```
    // syntax 
    > db.emps.update({condition, if you dont give condition then all records are updated}, {values to update}, {by default update will update only 1 record, if you want multiple then specify multiple true }); 


    - to identify records which does not have city and empsal more than 10000 
     and update city with bengaluru + multiple records 
    
    > db.emps.update(
        {
            city: {$exists:false}, 
            empsal: {$gt:10000}
        }, 
        {$set:{city:'Bengaluru'}},
        {multi:true}
    );

    > db.emps.update(
        {
            city: {$exists:false}, 
            empsal: {$lte:10000}
        }, 
        {$set:{city:'Mumbai'}},
        {multi:true}
    );

    - showing  multi true 


    > db.emps.update({}, {$set:{country:'India'}}, {multi:true}); 

```

- upsert 
```
    - if the records are matching then update if not insert 

    > db.emps.update({empname:'Neha'},{$set:{city:'Mysuru'}},{upsert:true}); 

```
- insert int better way 
```
    - use save - when _id not matching then it inserts, when matching it updates 

    - db.emps.save({"_id" : ObjectId("65e94bf13d857dfa53c4389f"), empid:110, empname:'Mohit', city:'Delhi'})
```
- delete 
```
    > db.emps.remove({empid:110}); 

```

- working with embeded document

```
   > db.embedrec.save({
    id: 101, 
    name: {
        first:"Gaurav", 
        last:"Kumar"
    }, 
    address: {
        houseNo: 1243, 
        street: "some Blvd" , 
        city: "Mysuru", 
        state: "Karnataka"
    }
    });

    > db.embedrec.find({id:{$eq:101}})

    > db.embedrec.find({'name.first':{$eq:'Gaurav'}})

```

- creating indexes - 
```
    > db.emps.find({empname:'siddharth'}).explain('executionStats');

    - db.emps.createIndex({empname:1})
    - db.emps.createIndex({empname:-1, city:1})

```

- to analyse the query + amount of time taken for execution (before and after index )
 


## for CPS 
- will tak what user stories 
    - pod 1 - Adarsh 
    - pod 2 - Dhananjay 
    - pod 3 - Sri Hari 
    - pod 4 - Vishal 
    - pod 5 - Achalla 
    - pod 6 - Dhanuj 
    
- Sequence Diagram 
- Usecase Diagram 
- setup java project, create necessary packages, exception, beans, etc 






# Day 4 

- how our input shall happen in application 
- 

## GIT 

- SVN - Subversion 
- CVS - Mercury 
- VSS Code - Microsoft 
.... 
- Git 
    - who we are 
        1. local - folder level 
        2. global - user level  -
```
            2.1  git config --global user.name "Naveen Kumar"
            2.2  git config --global user.email "naveen.kumar@publicissapient.com"


            2.3  git config --system user.name "Naveen Kumar" + user email 
            2.4  git config --local user.name "Naveen Kumar"


```            
        3. system - system level 

>  git log --graph --decorate --oneline 


### Branching Stratergy 

- Mono Repo 
    - single branch 
    - every body shall contribute 
    - folders 
- Branching Stragergy 
    - CPS 
    
- Assessment 
    - git clone https://tools.publicis.sapient.com/bitbucket/scm/psifab/assessment-week-1.git
    - in this branch there shall be a filed called dummy.txt
    - git branch mohit-6543
    - git checkout mohit-6543 -> switchecd to the branch 
    - write your code for 85 mins 
    - git push mohit-6543

 