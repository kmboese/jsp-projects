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

## Importing an Existing Project in Eclipse
In order to import the existing project directories into Eclipse, go to File > Import > General > Existing Projects into Workspace. Next to the "Select root directory" input field, click Browse and navigate to the local repo directory on your computer and click Select Folder. You should see a list of existing projects in the Projects section, including "jspdemo", "tagdemo", and others. Click Finish, and the projects will be imported. If you don't see any projects, make sure that the Project Explorer pane is active by going to Window > Show View > and clicking on Project Explorer.

## Running a JSP File for the First Time
In order to run a JSP file on the Tomcat server, you must choose which server to run the file on in Eclipse. You can choose to manually select a server each time you run a file, or choose to always run files in a given project on a specific server. For local development, we can always run a project on the Tomcat v9.0 server we created earlier. To do this, after starting your Tomcat server, right click on an existing JSP file you want to run, go to Run As, select "Choose an existing server", select the Tomcat server we created earlier, and then check "Always use this server when running this project". If you are prompted to restart the server, go ahead and do so. Now, all JSP files in the project will be run on the Tomcat server automatically, and you will not have to select a server each time.

## *** Troubleshooting ***

### Functions Like isBlank() Not Recognized
If certain Java source files are underlined in red, and functions in them like _isBlank()_ have an error that states "isBlank() is undefined for the type String", this means that the Java Runtime Environment (JRE) in use by Eclipse is not recent enough to include these function definitions. To fix this, we need to update the JRE used by Eclipse.

Assuming you have JDK 13 installed on your computer (my version is jdk-13.0.2), in Eclipse, go to Window > Preferences > Java > Installed JREs. In the Installed JREs window, click "Add", select "Standard VM", and click "Next". A popup window will open where you can specify the location of the new JRE. Under "JRE home", click the Directory button and navigate to the Java 13 JDK root folder. On my system, this is located at "C:\Program Files\Java\jdk-13.0.2". Click "Choose Folder", and the popup window should now have the JDK information populated. Click "Finish" to add the JDK to the Eclipse JREs list. Ensure that JDK 13 is checked in the list of JDKs, so all future files added will reference this JDK as well. 

After you switch to the new JDK, you will see a popup stating that all of the Java source files in the workspace need to be rebuilt. After allowing this process to run, the Java source files should no longer have a red underline, and you should be able to run all of the existing JSP files without issue.