# jsp-projects
JSP Projects related to the Udemy JSP Course

## Getting Started
In order to run the project in this repository, you will need the following software installed on your system:
* Java (version 8 or newer)
* Eclipse (Java EE Edition)
* Apache Tomcat (version 9.0)

#### Installing Apache Tomcat
Go to the [Apache Tomcat Website](http://tomcat.apache.org) and find the download page for Apache Tomcat 9.x (currently found [here](https://tomcat.apache.org/download-90.cgi)). You will need to download the appropriate zip file based on the operating system you are using. For Windows 10 64 bit, you will want to download the zip file labeled "64-bit Windows zip". Once you have downloaded the zip file, extract it somewhere on your desktop. This guide will assume you have Apache Tomcat installed in "C:\Program Files".

### Create an Eclipse Project
After cloning the git repo, open Eclipse and create a new workspace in the newly
cloned directory.


#### Adding a Tomcat Server in Eclipse
In order to run our JSP code, we will need to deploy a Tomcat server in Eclipse that will server the JSP web applications we write. To do this in Eclipse, after loading your workspace, click on the Servers tab in the bottom toolbar in Eclipse. You should see a link that says:
```code
No servers are available. Click this link to create a new server...
```
Click on this link to open up a dialog that will let you choose a new server to add. Expand the "Apache" tab, and select the "Tomcat v9.0 Server" option. You can leave the default Server's host name and Server name if you are just using the server for local development. Click "Next".

Now you will have to specify the Tomcat installation directory on your system. On my system, this is located in 
```
C:\Program Files\Apache Software Foundation\Tomcat 9.0
```
Click OK, then click Finish. You should now see a "Tomcat v9.0 Server at localhost" entry in the Eclipse Servers tab. 

## Operating the Tomcat Server
Starting and stopping the Tomcat server is easy in Eclipse. After opening a project and creating a Tomcat server, simply click on the Servers tab in Eclipse, find the server you want to run, right click on the server entry, and select "Start". If this is your first time starting the Tomcat server on your computer, you may see a Windows firewall popup asking for permissions to allow the Tomcat server to send and receive communications. Select the type of networks you want to allow the Tomcat server to communicate on and select OK.

To stop a running Tomcat server in Eclipse, click on the Servers tab, find the running server you want to stop, right click on it, and select "Stop". To restart a server, right click on the server and select "Restart".