# sapient-asde-mar-2024







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


<br>


- Highly Cohesive -Loosely Coupled Systems
        - Oauth services 
    - DRY  - Do Not Repeat Yourself 
    - WORM - Write Once Read Many 


    ```
        public Customer insertCustomer(Customer customer) {
            // this shall insert the record to database 
        }


        public Admin insertAdmin(Admin admin) {
            // this shall insert the record to database 
        }


        public Employee insertEmployee(Employee employee) {
            // this shall insert the record to database 
        }


        // beans 

        class Customer {
            private int custId; 
            private Name name; 
            private Address address; 
            private List<String> dependencies; 
            ... 
        }


        class Admin {
            private int adminId; 
            private Name name; 
            private Address address; 
            private double salary; 
            private String role; 
            private String branchName; 

        }

        class Employee {
            private int empId; 
            private Name name; 
            private Address address; 
            private double salary; 

        }


        class Name {
            private String firstName; 
            private String middleName; 
            private String lastName; 
        }

        class Address {
              private String houseNo; 
            private String street; 
            private String city; 
            private String country; 
        }
    ```


    - YAGNI 
    - SOLID 
- Generics 

```

    - child insurance 
    - old age insurance 
    - travel insurance 
    - car insurance....  

    class Insurance {
        private int insuranceId; 
        private String insurance; 


        public Insruance(int insuranceId, String insuracne) {
            this.insuranceId = insuranceId;
            this.insurance = insurance; 
        }


        // business logic 

        public void claim() {
                if(insrarnce.equals("car")) {
                    // make the business logic for insuracn e of car... 
                }else if(insrarnce.equals("travel")) {
                     // make the business logic for insuracn e of travel... 
                }

        }

    }

    class Insurance <T> {
        private int insuranceId; 
        private T insurance; 
    }


```

- Collections 
- List, Set, Map
- how our input shall happen in application 


 
 

 # day 5 

 ```
    Employee{empId=101, empName='sifat', empSal=11223.0}, 115
    Employee{empId=101, empName='sifat', empSal=11223.0}, 115
    Employee{empId=102, empName='Neha', empSal=22113.0}, 78


    --- 


    Employee{empId=101, empName='sifat', empSal=11223.0}, 115
    Employee{empId=102, empName='Neha', empSal=22113.0}, 78
 ```


 - working with properties 

 ```
    db.properties 
    uname=naveen
    password=guessme 
    url=192.22.34.41
 ```
## work around 

1. complete program with tree map 
2. create a program which shall take the data from db.properties file 

## working with mysql 

>  mysql -u root -p

> create database sapientdb; 

> use sapientdb; 

> create table which is needed 

```
    create table employee(
        empid int primary key, 
        empname varchar(30) not null, 
        empsal decimal (10,2)
    ); 

    

```
- com.mysql.cj.jdbc.Driver





# Day 6 

##  working with Java 8 


```

    interface Comparator<t1, t2> {
        compare(T o1, T o2); 
    }

    class EmployeeSortingTemplate  {
        public List<Employee> sortEmployeeBasedOnName (List<Employee> employees) {

           Comparator<Employee> sortBasedOnName =  new Comparator() <Employee> {
                public int compare(Employee e1, Employee e2 ) {
                    return e1.getEmpName().equals(e2.getEmpName()); 
                }

            }
            return sortBasedOnName; 
        }
    }


    class EmployeeSortingTemplate  {
        public List<Employee> sortEmployeeBasedOnName (List<Employee> employees) {

           Comparator<Employee> sortBasedOnName =   ( e1,  e2 )  -> e1.getEmpName().equals(e2.getEmpName()); 
                

        }
    }


    Integer value = new Supplier<Integer>{
        public Integer get() {
            return 123; 
        }
    }

    


    Integer value = () -> 123; 



```


-- predicate cod e

``` 
    @FunctionalInterface
    interface Predicate<T>  {
        public boolean test(T t); 

        public default  Predicate <T> and (Predicate T t); 

            ... 

            static <T> Predicate<T>	isEqual(Object targetRef);
    }


    // you impl code 
    Predicate mypredicate= ... 
    Predicate.isEqual(mypredicate); 

    class Employee {
        private int empId; 
        private String empName; 
        private String lcation; 
        private double salary; 
    }


    Comparator<Employee> sortNameAscendingOrder = (e1, e2) -> e1.getEmpName().comparare(e2.getEmpName()); 
    Comparator<Employee> sortNameDescendingOrder = (e1, e2) -> e2.getEmpName().comparare(e1.getEmpName()); 
    Comparator<Employee> sortOnLocationAscending = (e1, e2) -> e1.getLocation().comparare(e2.getLocation()); 


    // can we have a comprator with and clause / or claouse / negate etc... 


```

- create a predicate which shall have people with salary > 0 and coming from particular city (end use should be able give at runtime ex: Mumbai, Bengaluru etc.. )



# Day 7 

- http request 
- new string classes
- usage of var 
- new io - NIO / NIO2 
- encapsulation 
- terraform ansible 
- records 


empName -> getEmpName(), setEmpName(); 


# Day 8 

- test with assertAll ();
- to insert customer record - 
    101, Kumar, 1234.... 
    102, Kumar2, 1234.... 
    103, Kumar3, 1234.... 
    104, Kumar4, 1234.... 

- @parameterized 

```
    mvn clean verify sonar:sonar \
  -Dsonar.projectKey=java-works \
  -Dsonar.projectName='java-works' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=sqp_90a7594a21e4926b3ee78a7628b374279e7268ea -Dmaven.test.skip=true
```

```
    mvn sonar:sonar \
  -Dsonar.projectKey=java-works \
  -Dsonar.projectName='java-works' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=sqp_90a7594a21e4926b3ee78a7628b374279e7268ea -Dmaven.test.skip=true
```


-- running jacoco report 
```
    $ mvn clean package install org.jacoco:jacoco-maven-plugin:0.8.8:prepare-agent -Dmaven.test.skip=true
    $ mvn  org.jacoco:jacoco-maven-plugin:0.8.8:report -Dmaven.test.skip=true
```






# Day 9 

- terraform ansible 


- solid principles 


```

    public interface IDataBase {
        connection(String userName, String password, String url); 
        connection(Properties prop); 
    }

    // adaptor class 
    class abstract DataBase implements IDataBase {
        connection(String userName, String password, String url) {}
        connection(Properties prop) {}
    }

    class MySQLConnection extends DataBase {

            //

    }

    class MongoDBConnection extends DataBase {

            //

    }
    enum DataBaseNames {MONGODB, MYSQL, POSTREGS}
    class GetMyDataBaseConnection {
        <!-- if you dont have default construcgtor then jvm will give you public default constructor  -->

        private GetMyDataBaseConnection() {}

        public static DataBase dataBase (DataBaseNames name) {
            if(name.equals(DatbaseName.MONGODB)) {
                return new MondobDBConnection();
            }else if(name.equals(DatabaseName.MYSQL)) {
                return new MySQLConnection; 
            }
            return null; 
        }
    }


        <!-- new GetMyDataBaseConnection() ; (wrong ) -->
            Database db = GetMyDataBaseConnection(DataBaseNames.MONGODB);


    public class GetConnection  {

        public Connection mySqlConnection() {

        }

        public Connection postgresConnection() {
            
        }


        public Connection mongoDBConnection() {
            
        }
    }



    display (int userId, PersonalDetails pd  Address address, Family members  Date dob, .... .... . .)


    String houseNo, String street, String city, String state, String country,


    - liskov principle 

    class Account {

        public void withdraw(Account account) {
            if(account.instanceOf(FixedTermDepositAccount.class)) {
                throw new WithDrawalNotAllowedException("sorry not allowed"); 
            }
        }
    }


```


```
    If for each object o1 of type S there is an object o2 of type T such that for all programs P defined in terms of T, the behavior of P is unchanged when o1 is substituted for o2 then S is a subtype of T.


```

```
    - D - Dependency Injection 


    - mobile 
        - id 
        - camera 
            - lens 
                - micro lens 
                - macro 
                - ultra wide.. 
            - mp's 
            - flash 
            - zoom 
            - ai enabled 
            - hd 
        - display 
        - battery 
        - processor 
        - ram
        - body 
        - cover 



    application.xml 

    <project>
        <beans>
            <bean id="mobile" class ="com.naveen.Mobile">
                <property name="id" value="samsung camera">
                <property name="lens" ref="lens">
            </bean>

            <bean id="lens" class="com.naveen.Lens">
                <property name="lensType" value="micro">
                <property name="lensSize" value="4">
            </bean>

        </beans>
    </project>

    ApplicationContext context = Spring.applicationContextGetBean("mobile"); 


```




# Day 10 

```
enum CAR {
    MARUTI, HYUNDAI, TOYOTA
}
    class abstract  Car {
        private Car() {
            System.out.println("hi car is getting created.. "); 
        }

        public static Car getCar(CAR carName ) {

            if(carName.equals(CAR.MARUTI)) {
                return new Maruti(); 
            }else if (carName.equals(CAR.TOYOTA)) {
                return new Toyota(); 
            }else if (carName.equals(CAR.HYUNDAI)) {
                return new Hyundai(); 
            }

            return null; 
        }

        public abstract  void drive(); 

    }

    class Hyundai extends Car {
        public Hyundai () {
            
        }
        public void drive() {

            hyundai Driving 
        }
    }

    class Toyota extends Car {
        public Toyota {

        } 

        public void drive() {

            toyota driving 
        }
    }

    class Maruti extends Car  {
        public Maruti() {}
        public void drive() {
            maruti driving 
        }
    }






    // you cannot access 
    Car c = Car.getCar(CAR.HYUNDAI);  

    
```


- old way of creating spring beans 

>     BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml"); 

>     BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml", "another.xml", "another1.xml"); 



```
jdbcInsurance instantiated...
Dummy Insurance Instantiated...
number of insurance(dummy) : 0
Dummy Insurance Instantiated...
number of insurance(dummy)(2) : 0
number of insurance(jdbc) : 100


------------------------------------------------


Dummy Insurance Instantiated...
number of insurance(dummy) : 0
Dummy Insurance Instantiated...
number of insurance(dummy)(2) : 0
jdbcInsurance instantiated...
number of insurance(jdbc) : 100
```


# Day 11 

- Web Server 
    - Tomcat 
    - Jetty 
    - Netty 
    - Weblogic, web sphere, glassfish, jbosss 



```
    <form>
        Enter Name <input type="text" name ="name">
        <input type="submit">
    </form>
```

```
    https://www.msn.com/en-in/news/India/actor-arundhathi-nair-on-ventilator-after-road-accident-says-sister-arathy-she-is-fighting-for-her-life/ar-BB1k5G2E?ocid=hpmsn&cvid=c75bdf8ca96244fabb5fa630a94a08ef&ei=15
```


```
    document.getElementById("myid").innerHTML = "something";  - html, css
```


```
> mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-webapp -DarchetypeArtifactId=maven-archetype-webapp

```

> http://localhost:8080/index.html
> http://localhost:8080/hi


# Day 12 

 - working with JSP 

 