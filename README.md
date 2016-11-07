### ORM-Toybox

---

The ORM Toybox is a collection of java programs to demonstrate some of the different approaches to bridging the object-relational gap. It has been uploaded to github to demonstrate technologies like MyBatis, JDBC, and others to a senior-level university database class.

---

#### Git

You already know something about **git** if you are reading this document. It is hosted on Github. You will need clone it with the following command :

```git clone https://github.com/MikeJfromVA/orm-toybox.git```

A guide to using git on the command-line follows. It is worth taking the time to master this tool.

[Git CL Guide] (http://rogerdudler.github.io/git-guide/)

[ORM-Toybox] (https://github.com/MikeJfromVA/orm-toybox)

---

#### Maven

You must install Maven to compile and run this code. Maven will also download the dependencies automatically. Once Maven is installed and the project is cloned, you can do a test compile with this command:

```mvn compile```

[Maven]  (https://maven.apache.org)

---

#### The Code

The Java code contains a simple demo of JDBC and MyBatis.

---

#### The Database

The code requires a running PostgreSQL database. The database host, database name, username, and password are hardcoded in **mybatis-confix.xml** and **JDBCDemo.java**. The included SQL script **customerInvoice.sql** needs to be run on the database before running any of the Java programs.

---

#### Eclipse

You need the M2Eclipse plugin for Eclipse to edit and run this code. 

Once it is installed, you can create a new Maven Project to manage this code. Move this entire repository into your Eclipse workspace before creating the Eclipse project. As long as the folder in the workspace and the project are both called **orm-demo**, Eclipse should be smart enough to import all files and index them properly. Make sure you keep the *Default Location* option checked when creating the project.

[M2E Instructions] (http://stackoverflow.com/questions/8620127/maven-in-eclipse-step-by-step-installation)
[M2Eclipse] (http://www.eclipse.org/m2e/)

[Bringing existing source into Eclipse] (http://stackoverflow.com/questions/2636201/how-to-create-a-project-from-existing-source-in-eclipse-and-then-find-it)



