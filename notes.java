public class notes {//comment
    public static void main(String[] args){
        /*double minutes = 58.5;
        System.out.print("Time that has passed is:");
        System.out.println(minutes / 34);
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1+ 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        //concatenation in java is funny
        System.out.println("Hello, world" + 2 + 4 );
        //the result would be Hello, world24. it automatically type casts the integers as strings
        System.out.println(2 + 4 + "Hello, world");
        //but in this case it would be 6Hello, world. so it depends on the order of operands
        */


        //Taking input from the terminal
        /*         String line;
        Scanner in = new Scanner(System.in); //declares a Scanner variable called in 
        System.out.println("Type something: ");
        line = in.nextLine(); 
        System.out.println("You said: " + line);

        System.out.println("Type again: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);*/

        //inches to cm
        /* double inch;
        double cm;
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.print("How many inches?: ");
        inch = in.nextInt();
        cm = inch * 2.54;
        System.out.println(inch + " inches = " + cm + "cm");*/
        
        //Literals and constants
        // in java we use 'final' to declare constants\
        //final double cm_per_inch = 2.54;

        /* 
        %d = decimal integrer = 12345]
        %5d = decimal ineteger, padded with spaces to reach 5 position spaces
        %08d = padded with zeros, at least 8 digits = 00012345
        %f = floating point = 6.789000
        %.2f = rounded to 2 decimal places = 6.79 
               
        System.out.printf("Four thirds =  %.3f",4.0/3); //%.3f indicates the number of decimal values to be shown
        double inches=100,cm = inches * 2.54;
        System.out.printf("%d in = %f cm \n",inches,cm);// %d displays integer values
*/
    
        //Type casting
        //int x = (int) pi;
        //type casting takes precedence over arithmetic operations
    
        /*double cm;
        int feet,inches,rem;
        final double cm_per_inch = 2.54;
        final int  inch_per_foot = 12;
        Scanner in = new Scanner(System.in);

        //prompt user and get the value
        System.out.print("How many cm? :");
        cm = in.nextDouble();
        //convert
        inches = (int)(cm/cm_per_inch);
        feet = inches / inch_per_foot;
        rem = inches % inch_per_foot;
        System.out.printf("%.2f cm = %d ft, %d inches\n",cm,feet,rem);*/
        

        //Scanning bug
        /*
        When you read a String followed by an int, everything works just fine. But
        when you read an int followed by a String, something strange happens.
        
        The program then displays the prompt
        "What is your name? " and calls nextLine, which reads characters until it
        gets to a newline. But since the next character is already a newline, nextLine
        returns the empty string "".

        To solve this problem, you need an extra nextLine after nextInt.
        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine(); // read the newline
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
        This technique is common when reading int or double values that appear on
        their own line. First you read the number, and then you read the rest of the
        line, which is just a newline character.

         */

        // int = 32 bits, long = 64 bits
        // in java, the Math.log() takes to base e(natural log)
         
        // there are no 'normal functions' in java. instead, we make new methods and numbers


    // exmaple of method we can create outisde the main method and call it
    /*
     *  public static void printTime(int hour,int minute) {
        System.out.print(hour);
        System.out.print(" : " + minute);
    }
     */


     //CONDITIONALS AND LOGIC.
     /*      if(x > 0 ){
        System.out.print("x is positive");
     }
     else{
        System.out.println("x is odd");
     }


     public static void printLogarithm(double x) {
        if (x <= 0.0) {
        System.err.println("Error: x must be positive.");
        return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
        }    
        
        public static void scanDouble(Scanner input){
        System.out.print("Enter a number: ");
        if(!input.hasNextDouble()){
            String word = input.next();
            System.err.println(word + " is not a word");
            return;
        }
        else{
            double x = input.nextDouble();
            System.out.println(x * 43.5);
        }
    }*/


    //RECURSIVE METHODS
    //yk how recursion works so yea
    //bottles of beer song w recursion(in ex file)

    //Value methods
    // public static {return datatype} {methodname}(parameters){executables}
    // assign to a variable in order to access the value?
    // distance beetween two points on a line
    /*
       public static double distance(double x1,double x2,double y1, double y2){
        double diff_x = x2 - x1;
        double diff_y = y2 - y1;
        double diff_squared = diff_x*diff_x + diff_y* diff_y;
        double result = Math.sqrt(diff_squared);
        return result;
    }
     
     */

    // factorial
    /* 
     int fact = factorial(4);
    System.out.println(fact);
    
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    */
   
   // loops!
   // conjecture, collatz
   /*
    while(n!-1){
        System.out.println(n);
        if(n%2==0)n = n/2;
        else n = n *3 + 1;
    } 

    */
       

    //do-while loops in java
    /*
      Scanner input = new Scanner(System.in);
    boolean okay;
    do{
        System.out.println("Enter a number: ");
        if(input.hasNextDouble()){
            okay = true;
        }
        else{
            okay = false;
            String word = input.next();
            System.err.println(word + " is not a number");
        }
    }while(!okay);
     
     */
    
    // using while loops for timestable
        /*
     public static void printRow(int n,int columns){
        int i = 1;
        while(i <= columns){
            System.out.printf("%4d",n*i);
            i++;
        }
        System.out.println();
    }
    public static void printTable(int rows){
        int i = 1;
        while(i < rows){
            printRow(i,i);
            i++;
        }
    }

    */    
    
    //Arrays
    // datatype[] arrayname = new datatype[arraysize]
    //int[] counts = new int[4];
    // int[] a = {1,2,3,4}
    // to access elements of an array without using a loop, we can use a method in the java.util.Arrays class
    // import java.util.Arrays --> System.out.printIn(Arrays.toString(array));

    // copying arrays
    /*
      double[] a = new double[a.length];
    double[] b = a;
    for(int i = 0; i < a.length;i++){
        b[i] = a[i];
    }
    
    double[] c = Arrays.copyOf(a, a.length);
     
     */
    
     //Seraching for a position value in an array
     /*
         public static int search(double[] a,double target){
            for(int i = 0; i < a.length;i++){
                if(a[i] == target)return i;
                
            }
            return -1;
        }
         */
    
    // creating a array with pseudorandom elements
    /*
      System.out.println(Arrays.toString(randomArray(30)));
}
    public static int[] randomArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for(int i = 0;i < size;i++){
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }
     
     */
    
    //Traverse and count
    // grading using arrays (histogram)
    /*
     
      int[] scores = randomArray(30);
    int a = intRange(scores, 90, 100);
    int b = intRange(scores, 80, 90);
    int c = intRange(scores, 70, 80);
    int d = intRange(scores, 60, 70);
    int f = intRange(scores, 0, 60);
    }
    public static int intRange(int[] array, int low, int high){
        int count = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] >= low && array[i]< high){
                count++;
            }
        }
        return count;
    }
    public static int[] randomArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        for(int i = 0;i < size;i++){
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }
     */
    
    // Enhanced for loop(kinda like .forEach() in js)
    /*
     for(int value : values){
        System.out.println(values);

        //apperently doesnt work with strings. mostly arrays ig
    }
     */
    
    //Strings and things
   
    //strings are immutable
    /*
    if you want to make a change to a strig for exmaple:
    String str = "Hello";
    String uppername = str.toUpperCase();
    you would have to create a new string object
    */

    //characters
    /*
    String fruit = "banana";
    char letter = fruit.charAt(4);
    
    for(char c = 'A';c <= 'Z';c++){
        System.out.println(c);
    }
    
    */
    //substring
    /*
      String fruit = "banana";
    String sub = fruit.substring(2); //returns nana
    String sub2 = fruit.substring(2,5); //returns nan

     
     */
    
     //String traversal
    

    //for(char letter : fruit.toCharArray()){System.out.print(letter + " ");}
    //char last_letter = fruit.charAt(fruit.length()-1);
    //reversing a string

    /*
      String g = "randomString"; //user will input nthe string
    String r = "";
    for(int i = r.length()-1;i >= 0;i--){
        r +=  g.charAt(i);
    }
     
     */
    // comaparing strings
    // can use the compareTo() method to see which strings comes first alphabetically
    // the difference comapreTo() returns is the difference between the first characters in the strings that differ

    /*
      String name1 = "pineapple";
    String name2 = "pineapple";
    
    if(name1 == name2){
        System.out.println("same shi");
    }
    else{
        System.out.println("diff shi");
    }
    // code outputted same shi. explain why
    // this is bc they're in the same string pool object but if you use the 'new' keyword it wont work
    // instead you should do this:
    if(name1.equals(name2)){
        System.out.println("same shi");
    }
     
     */
    
     //String formatting
     /*
      System.out.println(timeString(19, 57)); 

    public static String timeString(int hour, int minute){
        String ampm;
        if(hour < 12){
            ampm = "AM";
            if(hour == 0){hour = 12;}
        }
        else{
            ampm = "PM";
            hour = hour - 12;
        }
        return  String.format("%02d:%02d %s", hour, minute, ampm);
    }
      */
    
    
    //NB: primitive datatypes like int, double, char do not have methods
    //instead you may use sumn called wrapper classes.
    //WRAPPER CLASSES

    /*
      double nux = 2345.23;
    String str = "12355";
    int num = Integer.parseInt(str); // converts a string into a number
    String word = Double.toString(nux); //toString()  converts any of the primitive types to a string ig
     
     */
    
    //OBJECTS
    
    // an object is a collection of data that provides a set of methods.
    // for example, a string is a collection of charcaters that provide methods like charAt() and substring
    
    //point objects(import java.awt.Point)
    /*
      The java.awt package provides a class named Point intended to represent
      the coordinates of a location in a Cartesian plane.

      to create a new point, use the 'new' operator
      Point blank;
      blank = new Point(3,4) --> 3 is the x axis and y is 4

     */

     //Attributes
     /*
      values that belong to objects are usaully called attributes or fields
      int x = blank.x
      the expression blank.x means "go to the object blank refers to and get the value of the attribute x"

      System.out.println(blank.x + ", " + blank.y); // ouputs 3,4
      int sum = blank.x * blank.x + blank.y * blank.y; outputs 25
      */

    //Objects as parameters
    /*
     we can pass objects as arguments in methods. for example,
     public static void printPoint(Point p){
        System.out.println("(" + p.x + ", " + p.y +")")
     } 
     
     public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

     //when you call println with objects, it automatically calls a method called toString and displays the result
     */

    // Objects as return types
    /*
      java.awt has a class called rectangle
      import java.awt.Rectangle

      to insatantiate,
      Rectangle {identifier} = new Rectangle(x, y, width, height)
      Rectangle box = new Rectangle(0, 0, 100, 200)

      there is a method that can let you move the box.
      box.translate(50,100) // moves it 50 to he right and 100 up
      box.grow(50,50) // adds 50 to all four sides of the box 
      
     */
    
    //Displaying objects
    /*
     public static void main(String[] args){
        Time time = new Time(11,59,59.0);
        System.out.println(time) //output -> sumn like Time@80cc7c0 (displays the name of type and address of object in hexadecimal)
        
        instead,
        we can create a method to print the attributes of the created time object
        in a form that would be user friendly. (in conjuction with dot notation)
     }
     */

    //Aliasing 
    /*
     when you assign an object to a variable, you are assigning a reference to an object.
     hence, Rectangle box1 = new Rectangle(0, 0, 100, 200);
     Rectangle box2 = box1
     now two references are to the same object so making a change to one of them changes both.
     */
    
    // Null keyword
    /*
     
    In Java, the keyword null is a special value that means \no object".
    You can declare and initialize object variables this way:
    
    Point blank = null;

    if you try to use a null value,either by accessing an attribute or incoking a method,
    java throws a NullPointerException

    Point blank = null;
    int x = blank.x; // NullPointerException
    blank.translate(50, 50); // NullPointerException
     */
    
    //Garbage collection
    /*
    Point blank = new Point(3, 4);
    blank = null;

    The first line creates a new Point object and makes blank refer to it. The
    second line changes blank so that instead of referring to the object, it refers
    to nothing.

    If there are no references to an object, there is no way to access its attributes
    or invoke a method on it. From the programmer's view, it ceases to exist.

    However it's still present in the computer's memory, taking up space.
    As your program runs, the system automatically looks for stranded objects
    and reclaims them; then the space can be reused for new objects. This process
    is called garbage collection.

     */

    //BIG INTEGER
    /*
     BigInteger is a Java class that can represent arbitrarily big integers.
    There is no upper bound except the limitations of memory size and
    processing speed.

    to use big integers import java.math.BigInteger;
    to create a big integer, simplest way is to use valueOf()

    int x = 17;
    BigInteger big = BigInteger.valueOf(x);

    Since BigIntegers are not primitive types, the usual math operators don't
    work. Instead, we have to use methods like add. To add two BigIntegers,
    invoke add on one and pass the other as an argument.

    BigInteger small = BigInterger.valueOf(17);
    BigInteger big = BigInteger.valueOf(1700000000);
    BigInteger total = small.add(big);
    BigInteger product = big.multiply(small);

     */
    
    //CLASSES
    /*
         Defining a class creates a new object type with the same name.

         Every object belongs to some object type; that is, it is an instance of
        some class.

         A class definition is like a template for objects: it specifies what at-
        tributes the objects have and what methods can operate on them.

         The new operator instantiates objects, that is, it creates new instances
        of a class.

         Think of a class like a blueprint for a house: you can use the same
        blueprint to build any number of houses.

         The methods that operate on an object type are defined in the class for
        that object.
     */
    
    // Getters and setters
    /*
     public class Person {
    // Private fields
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {  // Validate that age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person();

        // Set values using setters
        person.setName("John");
        person.setAge(25);

        // Get values using getters
        System.out.println("Name: " + person.getName());  // Output: Name: John
        System.out.println("Age: " + person.getAge());    // Output: Age: 25

        // Update and display values
        person.setAge(-5);  // Invalid age, will print a validation message
        person.displayInfo();  // Output: Name: John, Age: 25
    }
}

     */
   
    // toStringmethod
    /*
     Every object type has a method called toString that returns a string repre-
    sentation of the object. When you display an object using print or println,
    Java invokes the object's toString method.

    By default it simply displays the type of the object and its address, but you
    can override this behavior by providing your own toString method. For
    example, here is a toString method for Time:
     
    public String toStringTime(){
        return String.format("%02d:%02d:%04.1f\n",this.hour,this.minute,this.second);
        
    }
    
    */

    }
    //OUTSIDE
    //NB Point p1 = new Point(0,1 )
    // Point p2 = new Point(0,1)
    // p1 == p2 will return false as p1 and p2 may have the same value but point to different objects in memory
    //a class that uses objects from another class is called a client

    /*
     public class Time{
        //first, declaring instance variables(attributes) of the class
        private int hour; //private meaning you can only access this attribute from inside the class
        private int minute;
        private double second;

        //Constructors
        /* 
        After declaring the instance variables, the next step is to define a constructor,
        which is a special method that initializes the instance variables. The syntax
        for constructors is similar to that of other methods, except:
        
         The name of the constructor is the same as the name of the class.
        
         Constructors have no return type (and no return value).
        
         The keyword static is omitted.
         

         public Time(){
            this.hour = 0;
            this.minute = 0;
            this.second = 0.0;
        }
        // to create a new Time object,
        // Time time = new TIme()

        //constructors can also be overloaded like methods

        public Time(int hour, int minute, double second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        // more examples on constructos
        /*
         public class Car {
    String model;
    int year;

    // Default constructor
    public Car() {
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Using the default constructor
        Car car1 = new Car();
        car1.displayInfo();  // Output: Model: Unknown, Year: 0

        // Using the parameterized constructor
        Car car2 = new Car("Toyota", 2022);
        car2.displayInfo();  // Output: Model: Toyota, Year: 2022
    }
}

         */
        
        
}
/*
  class Car {
    String model;
    int year;

    // Default constructor
    public Car() {
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
 
 */

 /*
   class Circle{
        Point center;
        double radius;
        static int numberOfCircles;

        Circle() {
            numberOfCircles++;
        }
        Circle(Point center, double radius){
            numberOfCircles++;
            this.center = center; // saying the attribute center should be assigned to the parameter center
            this.radius = radius;
        }
        //class variables will have the keyword static preceeding them
        double getPerimeter(){
            return 2 * Math.PI * this.radius;
        }

        double getArea(){
            return Math.PI * this.radius * this.radius;
        }

        void setCenter(Point center){
            this.center = center;
        }

        void setRadius(double radius){
            this.radius = radius;
        }
        
        static int getNumberOfCircles(){return numberOfCircles;}
    }
  */
   
//STILL CONFUSED ABOUT STATIC AND INSTANCE METHODS?
/*
    asusuming we want a method to add two time objects

    //Static

    public static Time add(Time t1,Time t2){
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;

        if(sum.second >=60){
            sum.second -= 60.0;
            sum.minute += 1;
        }
        
        if(sum.minute >=60){
            sum.minute -= 60.0;
            sum.hour += 1;
        }

        return sum;
    }

    //Instance

    public Time add(Time that){
    
    //nb.."that" is not a keyword..its just a parameter set.
        Time sum = new Time();
        sum.hour = this.hour + that.hour;
        sum.minute = this.minute + that.minute;
        sum.second = this.second + that.second;    
    
    }
 */



