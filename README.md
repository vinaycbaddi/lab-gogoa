![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | GOGOA

## A Quick Introduction

A simple lab to explain about java inheritance 



## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Go through the instructions carefully.***
2. ***Do not modify the entire code.***
3. ***Edit the code as per the instructions.***
4. ***Go to Java Resources -> src folder.***
5. ***You will have 3 packages src/controller, src/model and src/service.***
6. ***Create appropirate Classes inside the specified package as per the instructions given.***
7. ***Once the progressions are completed follow the instructions to run the application and test your code.***
 
## Run the Project
1. ***Right - click on the project.***
2. ***Go to Run as -> Run on server.***
3. ***You can check the output in eclipse browser or in your browser.***
4. ***Uncomment the codes in each controller to run the project.***


## Input Format
1. ***Inputs are defined in each progressions*** 

## Output Format
1. ***Output would be the user details and total fare***


## Progression - 1 
1. ***Create a parent class called Hotel inside the model package with the following arguments***
   - ***private int noOfPersons***
	  - ***private String classType***
	  - ***private int rates***
	  - ***private LocalDate from***
   - ***private LocalDate to***
   - ***private String triptype***
2. ***Generate appropriate getters and setters.***
3. ***Generate the constructor Flight(int noOfPersons, int rates, String busType, LocalDate from,LocalDate to,String triptype) in Flight class.***


## Progression - 2
1. ***Create a parent class called Flight inside the model package with the following arguments***
   - ***private int noOfPersons***
	  - ***private String roomType***
	  - ***private int rates***
	  - ***private String occupancy***
   - ***private LocalDate fromdate***
   - ***private LocalDate todate***
2. ***Generate appropriate getters and setters.***
3. ***Generate the constructor Hotel(int noOfPersons, String roomType, int rates,String occupancy,LocalDate fromdate,LocalDate todate) Hotel class.***

## Progression - 3
1. ***Create a parent class called Train inside the model package with the following arguments***
   - ***private int noOfPersons***
	  - ***private String berth***
	  - ***private int rates***
	  - ***private LocalDate date***
2. ***Generate appropriate getters and setters.***
3. ***Generate the constructor Train(int noOfPersons, int rates, String berth, LocalDate date) in Train class.***

## Progression - 4
1. ***Create a parent class called Bus inside the model package with the following arguments***
   - ***private int noOfPersons***
	  - ***private String busType***
	  - ***private int rates***
	  - ***private LocalDate date***
2. ***Generate appropriate getters and setters.***
3. ***Generate the constructor Bus(int noOfPersons, int rates, String busType, LocalDate date) in Bus class.***

## Progression - 5
1. ***Create a class called as Booking inside the service package.***
2. ***Create a method public double booking(int noOfPersons,int rates).***
3. ***The booking method should return the total rate.***

## Progression - 6
1. ***Create a class called as FareCalculator.***
2. ***FareCalculator should extend the Booking Class and should use the booking method defined in Booking Class.***
3. ***FareCalculator has 4 methods as mentioned below.***
   - ***public double book(Hotel hotel)***
   - ***public double book(Flight flight)***
   - ***public double book(Train train)***
   - ***public double book(Bus bus)***
4. ***Each method should return the user details and total fare***


Happy Coding ProGrad ❤️
