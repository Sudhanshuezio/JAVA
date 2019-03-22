set path=C:\Program Files\Java\jdk-11.0.2\bin;.;%path%
set classpath=ojdbc6.jar;.;%classpath%

color 06

cd assignment
del *.class
cd ..

javac -d . Clerk.java Employee.java Manager.java UserInterface.java InvalidAgeException.java InvalidInputException.java Connector.java  Programmer.java


javac -d . EmployeeDetails4.java

cls
java EmployeeDetails4

