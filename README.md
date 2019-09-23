## Food Truck Rating Project
The purpose of this project is to, list food trucks and input information into them.
Then have a menu that lists what each Food Truck consists of, and do calculations,
such as finding the average rating and which truck has the highest rating.

### Week 2 Homework Project for Skill Distillery

### Overview
#### Installation (with JDK8 and Atom)
It is recommended that you have JDK8 and Atom.
1. Make two files FoodTruck.java and FoodTruckTester.javac
2. Copy the code from github, all except the package line and paste them respectively in the correct files and Save.
3. Type in console: javac FoodTruck.java
4. Type in console javac FoodTrucktester.java
5. Type in console: java FoodTruckTester


#### Installion (without java platform)
If you do NOT have JDK, you may use Jdoodle online, https://www.jdoodle.com/online-java-compiler-ide/
1. click on the 3 dots to rename the MyClass.java to FoodTruckTester.java
2. click on the 3 dots to make it start file
3. copy and paste the code from FoodTruckTester on my github into the coding field on Jdoodle
4. delete the package line
5. click on the 3 dots by / and click on new file
6. name it FoodTruck
7. copy the java code from FoodTruck on my github to the coding field on Jdoodle
8. delete the package line
9. click the interactive button
10. click execute
Be aware with Jdoodle there is a lot of code for it to compile, so possible bug, suggested that if bugged to execute the program again and restart.
#### Instructions
1. The user starts immediately with input information into the Food Truck array.
2. User is prompted to input Truck Name, Truck Type, Truck rating, and then is given
a unique ID. They can also limit the amount of Trucks by typing "quit" while at the Truck name option.
3. Next the user goes into the main menu which has four options.
4. The first option is to list the Trucks inputed into the array and display what
was inputed into them.
5. The second option is a calculation to find the average rating of the Trucks,
and displays what the average is.
6. The third option is a calculation to find the highest rated Truck, and
displays which truck in the array has the highest rating.
7. The user ends the program by selecting the quit option.

### Technologies/Topics Applied
1. Arrays, how to put information into and take information out of arrays.
2. ToString, this is used to display my information on each truck.
3. Getters and Setters, I used this to get and set information from and to Trucks.
4. Generating Constructors using fields, used to store my information in the correct locations.
5. For loops, used to show each Truck from an arrays and to input information into each slot in the array
6. Objects, used as storage and to not have to rely on static for the program
7. Switches, used for the main menu, to select options/ methods to be called.
8. Booleans, used for an escape out of switches and other areas I need an escape.
9. If statements, used to trigger certain events to happen based on condition
10. Visibility, used to hide information to public, confidentiality purposes
11. Counter, used to count the array length for me in case not all 5 trucks were inputted.
### Lessons Learned
1. Order matters, I had my quit statement after making a truck, so I kept getting
an empty truck.
2. Counter is very helpful when an array total length is not used so the array is
shortened and I need something to count the shortened array to help me get the
averages.
3. I think I grasped the concept of ToString, its to get a value from a private
and be able to use it within a method without exposing the value to the public.
4. It's easier to make a method do what I want rather than assigning it an output,
so basically when I need to have an output vs when I do not need an output.
