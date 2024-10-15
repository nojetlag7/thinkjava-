

public class excersies {
   
    public static void main(String[] args) {
       /*int date=30 ,year = 2024;
        String month="September",day="Monday";
        System.out.println("American format");
        System.out.println("Date: "+day+" "+month+" "+date+", "+year);
        System.out.println("British format");
        System.out.println("Date: "+day+" "+date+"th"+" "+month+", "+year);
         */ 
        //Time.java
        
        /*
    public static void printAmerican(String day,int date, String month, int year){
            System.out.printf("%s, %s %d, %d" ,day,month,date,year);
        }
}
    
    */

        /*        int hour=18,minute=51,second=39;
        int seconds_since_midnight = hour* 3600 + minute*60 + second;
        System.out.println("Seconds since midnight: " + seconds_since_midnight + " seconds");
        System.out.println();
        int seconds_left = 24*3600 - seconds_since_midnight;
        System.out.println("Number of seconds in the day left: "+seconds_left+ " seconds");
        System.out.println();
        double dayPassedPercent = (seconds_left / (24*3600.0) * 100);
        System.out.println("Percentage of the day that has passed: "+dayPassedPercent +'%'); */

        //3.2 celsius to fahrenheit
        /* double celsius,farenheit;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degrees: ");
        
        celsius = input.nextDouble();
        farenheit = celsius * 9.0/5 + 32;
        System.out.printf("%.2f C = %.2f F", celsius,farenheit);*/
        
        //3.3 seconds -> hours,minutes,minutes

        /*
                 int seconds,hours,minutes,sec_rem;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of seconds to be converted: ");
        seconds = input.nextInt();
        hours = seconds / 3600;
        sec_rem = seconds % 3600;
        minutes = sec_rem / 60;
        sec_rem = sec_rem % 60;
        System.out.printf("%d Hours, %d minutes, and %d seconds",hours,minutes,sec_rem);
        
         */

        //3.4 Random number guess game
        /*
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println("I'm thinking of a number between 1 and 100 inclusive. Can you guess it?");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number:");
        int guess = input.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of was: " + number);

        if(guess<number){
            int miss = number - guess;
            System.out.println("You were below by: " + miss);
        }
        else if(guess>number){
            int miss = guess - number;
            System.out.println("You were above by: " + miss);
        }
        else{
            System.out.println("You guessed it!");
        }
         */

        // 3.4 practice with more methods
       //printAmerican("Satuday", 22, "July", 2024);

       //5.5 beersong
       /*
           public static void beerSong(int n){
        if(n>0){
            System.out.printf("%d bottles of beer on the wall,\n",n);
            System.out.printf("%d bottles of beer,\n",n);
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.printf("%d bottles of beer on the wall.\n",n);
            System.out.println();
            beerSong(n-1);
        }
        else{
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
            return;
        }
        beerSong(3);
       
       */
    
        //guessing game pt2

       //System.out.println(factorial(5));

       //Gauss
       /*
         System.out.println("Find exp(-x^2)");
       double x = inDouble("Enter value of x: ");
       System.out.println("myexp(" + x*-x + ") = " + gauss(x, 15)); 
       System.out.println("Math.exp(" + x*-x + ") = " + Math.exp(x*-x));
    
        */
       //don't forget. to make arrays in a string form use Arrays.toString(array)
        
       //letterHist
       /* 
                String s = "the lazy brown fox jumped over the log";
       int[] result = histogram(s);

       // Print the histogram (counts of letters)
       for (int i = 0; i < result.length; i++) {
           System.out.println((char) (i + 'a') + ": " + result[i]);}

        */

        //Strings and things
        //recurse.printString("wasyaname");
        //recurse.printBackword("hello");
        //System.out.println(recurse.reverseString("gekumye"));
        //System.out.println(recurse.isPalindrome("racecar"));
    
        //BIGINTEGERS
        //Big.display(30); //notice that the accuracy leaves around number 15. due to the integer limit
        //System.out.println(pow(32, 32)); (from ex 10.5)

        /*
         Rectangle[] rectangles = new Rectangle[3]; //null null null
        
        Scanner input = new Scanner(System.in);
        
        // Loop through the array using an index to modify the array elements
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do you want to enter the width and the height for rectangle " + (i+1) + "?(y/n)");

            char choice = input.next().charAt(0);
            if (choice == 'y') {
                System.out.println("Enter width and height:");
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            } else {
                rectangles[i] = new Rectangle();  // Use the default constructor
            }
        }
        
        // Output the rectangle dimensions
        System.out.println("The rectangles are: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println("Width: " + rectangle.getWidth() + " Height: " + rectangle.getHeight());
        }
        
        input.close();  // Close the Scanner to avoid resource leaks
    }
         */
        
        //Date birthday = new Date(2005,8,30);
        //System.out.println(birthday.toString());
    // OUTSIDE METHODS.

    //Fermat's Last Theorem(5.4)
    /*     public static void checkFermat(int a,int b,int c, int n){
        if(Math.pow(a,n) + Math.pow(b, n) == Math.pow(c, n) && n > 2){
            System.out.println("Holy smokes!Fermat was wrong!");
        }
        else{
            System.out.println("No, that doesnt work");
        }
    */    

    // guessing games methods
    /*
      public static void guess(){
        Random random = new Random();
        int correct_guess = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 inclusive. Can you guess it?");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        checkGuess(guess,correct_guess,input);

    } 

    public static void checkGuess(int guess,int correct_guess, Scanner input) {
        if(guess < correct_guess){
            System.out.println("Too low!");
            System.out.print("Try again: ");
            int new_guess = input.nextInt();

            checkGuess(new_guess, correct_guess,input);
        }
        else if(guess > correct_guess){
            System.out.println("Too high!");
            System.out.print("Try again: ");

            
            int new_guess = input.nextInt();

            checkGuess(new_guess, correct_guess,input);
        }
        else{
            System.out.println("Congrats!You got it!");
        }

    }
      
     
     */
    
     // isdivisible 6.2
     /*public static boolean isDivisible(int n, int m){
        return n % m == 0;
     } */
     
     // 6.3 isTriangle
     /*
      public static boolean isTriangle(int a,int b, int c){
        if(a+b < c || a+c <b || b+c< a){
            return false;
        }
        else{
            return true;
        }
      */
     
     //6.4 multadd and expSum
     /*
        public static double multAdd(double a,double b,double c) {
        return a * b + c;
     }

     public static double expSum(double x){
        double rhs = Math.sqrt(1-Math.exp(-x));
        return multAdd(x, Math.exp(-x), rhs);
     }

     
        System.out.println(multAdd(Math.sin(Math.PI/4.0), 0.5, Math.cos(Math.PI/4.0)));
        System.out.println(expSum(2.5));;

      */
    
    // 6.7 oddSum
    /* 
      public static int oddSum(int n){
        if(n % 2 == 0){
            n -= 1;
        }
        if(n  == 1){
            return 1;
            }
        else{
            return n + oddSum(n-2);
        }

    }
     
    */
    
    //6.8  Ackerman function
    /*
     public static int ack(int m, int n){
        if(m == 0) return n + 1;
        else if(n == 0) return ack(m - 1, 1);
        else return ack(m - 1, ack(m, n - 1));
    }
     */
    
    //7.2 Newtonian guess 
    /*
     public static double squareRoot(double num){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the square root: ");
        double guess = input.nextDouble();
        double new_guess = (guess + num/guess)/2;
        
        while(Math.abs(new_guess-guess) > 0.000001){
            guess = new_guess;
            new_guess = (guess + num/guess)/2;
        }
        return new_guess;
     */
    
    //7.4,7.5 a whole lotta mess.
    /*
      public static int factorial(int n){
        int fact = 1;
        for(int i = n;i > 1;i--){
            fact *= i;
        }
        return fact;
    }

    public static double myexp(double x){
        int n = 20; //to improve accuracy for values of x up to 30.
        double result = 1;
        double numerator = 1;
        int denominator = 1;
        for(int i = 1;i<=n;i++){
            numerator *= x;
            denominator *= i;
            result += numerator / denominator ;
        }
        return result;
        
    }

    public static void check(double x){
        double mine = myexp(x);
        double set = Math.exp(x);
        System.out.println(x + "\t" + mine + "\t" + set); //comparing created method with built in methods
        System.out.println();
    };
     
     */
    
    //7.6 exp(-x^2)

    /*
     public static double gauss(double x, int n) {
        x = -x * x;  // We need x^2 in the series
        double result = 1.0;  // Start with the first term (1)
        double term = 1.0;    // Initialize the first term
        for (int i = 1; i <= n; i++) {
            term *= x / i;    // Update term with (-x^2 / i)
            result += term;   // Add the current term to the result
        }
        return result;
    }
        
    public static double inDouble(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        return in.nextDouble();
    }
     
     */
    
     //8.1 array powArray
     /*
       public static double[] powArray(double[] array,int n){
        double[] temp = new double[array.length];
        for(int i = 0;i<array.length;i++){
            temp[i] = Math.pow(array[i],n);
        }
        return temp;
        }
         double[] test1 = {2,3,4,5,6,7,8,9,10};
      double[] result = powArray(test1, 3);
      for(double value : result){
        System.out.println(value);
      }
    
      */
     
    //8.4 indexMax
    /*
        public static int indexMax(int[] array){
        int largest = array[0];
        int position = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] > largest){
                largest = array[i];
                position = i;
            }
        }
        return position;
      } 

      int[] testcase = {2,3,238,6,7,3,754,84,87,34};
       System.out.println(indexMax(testcase));
       */
     
    //8.5 sieve of eratosthenes

    /*
         public static boolean[] sieve(int n) {
        
        // Create an array of size n to store whether each number is prime
        boolean[] isPrime = new boolean[n];
        
        // Special cases: 0 and 1 are not prime
        if (n > 0) isPrime[0] = false;  // 0 is not prime
        if (n > 1) isPrime[1] = false;  // 1 is not prime
    
        // Assume all numbers from 2 to n-1 are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
    
        // Apply the sieve algorithm: mark non-prime numbers
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as non-prime
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    
        // Return the array where isPrime[i] is true if i is prime, false otherwise
        return isPrime;

        */
       
    // 8.6 areFactors()
    /*
     public static boolean areFactors(int[] array, int target) {
        if(array.length == 0)return false;
        for(int i =0;i<array.length;i++){
            if(array[i] == 0) continue;
            if(target % array[i] != 0)return false;
        }
        return true;
    }
     */
    
    // 8.7 areprimeFactors()
    /*
     public static boolean areprimeFactors(int[] set,int n){
        for(int i = 0;i < set.length;i++){
            if(n % set[i] == 0 && isPrime(set[i])) return true;
        }
        return false;
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2;i*i <= n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
     */
    
     //8.8 maxinRange?

     /*
       public static int maxInRange(int[] array, int lowIndex, int highIndex) {
        // Base case: only one element in the range
        if (lowIndex == highIndex) {
            return array[lowIndex]; // Return that element
        }
        
        // Recursive case: split the range
        int mid = (lowIndex + highIndex) / 2;
        
        // Find the maximum in the left half and right half
        int maxLeft = maxInRange(array, lowIndex, mid);
        int maxRight = maxInRange(array, mid + 1, highIndex);
        
        // Return the maximum of the two
        return Math.max(maxLeft, maxRight);
    }

      */
     
    //9.1 testing shi
    /*
     public static void test(){
        String first = "twerp";
        String empty = "";
        boolean hot = true;
        char second = 'd';
        int third = 33;
        double fourth = 2.99;
        System.out.println(first + third); // twerp33
        System.out.println(first + second); // twerpd
        System.out.println(second + third); // 133
        System.out.println(third + second); // 133 (adding a char to a number changes the char to its ascii value)
        System.out.println(second + fourth); //102.99
        System.out.println(first + hot); //twerptrue
        // System.out.println(hot + third); != boolean + int
       // System.out.println(hot + second); != boolean + char
       System.out.println(++second); //outputs e basically
       // second = second +  1; //gives an error saying cannot convert from int to char
       System.out.println("" +  5); //makes the 5 a string duh
        
    }
     */
    
     //9.2
     /*
      public static int[] histogram(String s){
        // Initialize an array of size 26 to store the counts of each letter
        int[] histogram = new int[26];

        // Traverse the string once
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                histogram[ch - 'a']++;
            }
        }

        return histogram;
    }
      */
    
    // 9.4 recurse w strings

    /*
     public class recurse{
        public static char first(String s) {return s.charAt(0);}
    
        public static String rest(String s) {return s.substring(1);}

        public static String middle(String s) {return s.substring(1, s.length() - 1);}

        public static int length(String s) {return s.length();}
        

        public static void printString(String target){
            if(target.length() == 0){
                return;
            }
            else{
                System.out.println(first(target));
                printString(rest(target));
            }
        }
    
        public static void printBackword(String s){
            if(s.length() == 0){
                return;
            }
            else{
                printBackword(rest(s));
                System.out.println(first(s));
            }
        }
    
        public static String reverseString(String s){
            if(s.length() == 0){
                return s;
            }
            return reverseString(rest(s)) + first(s);
            
        }
    
        public static boolean isPalindrome(String s){
        if(length(s) <= 1){
            return true;
        }
        if(first(s) != s.charAt(length(s)-1)){
            return false;
        }
        return isPalindrome(middle(s));
    }

    }

     */
    
    // 9.5 isAbcderian
    /*
     // iterative
    public static boolean isAbcderian(String s){
        s = s.toLowerCase();
        if(s.length() <= 1){
            return false;
        }
        for(int i = 0;i < s.length()-1;i++){

            if(s.charAt(i) > s.charAt(i+1))return false;
        }
        return true;
    }      
        // recursive
    public static boolean isAbcderian(String s){
        if(s.length() <= 1){return true;}

        if(s.charAt(0) < s.charAt(1))return false;
        
        return isAbcderian(s.substring(1));

    }
     */
    
    // 9.6 gold doubloon
    /*
      public static boolean isDoubloon(String s){
        s = s.toLowerCase();
        
        int[] letterCount = new int[26];

        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);

            if(c >= 'a' && c <= 'z'){
                letterCount[c - 'a']++;
            }
        }
        for(int count: letterCount){
            if(count !=0 || count != 2)return false;
        }
        return true;
    }
      */
     
    //9.7 Anagrams
    /*
       public static boolean areAnagrams(String s,String s1){
        //remove spaces and convert both strings to lowercase
        s = s.replaceAll("\\s","").toLowerCase();
        s1 = s1.replaceAll("\\s","").toLowerCase();
        
        //if lengths arent equal, cant be anagrams
        if(s.length() != s1.length())return false;

        //arrays to store freq. of each letter in both strings
        int[] first = new int[26];
        int[] second = new int[26];

        //loop to count and store
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            char ch1 = s1.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                first[ch - 'a']++;
            }
            if(ch1 >= 'a' && ch1 <='z'){
                second[ch1 - 'a']++;
            }
        }
        //comparing freq of both arrays
        for(int i = 0;i < 26;i++){
            if(first[i] != second[i])return false;
        }
        return true;
      }
       */
    
       //another way using only one array
    /* 
       public static boolean areAnagrams(String s, String s1) {
        // Remove spaces and convert both strings to lowercase
        s = s.replaceAll("\\s", "").toLowerCase();
        s1 = s1.replaceAll("\\s", "").toLowerCase();
    
        // If lengths aren't equal, they can't be anagrams
        if (s.length() != s1.length()) return false;
    
        // Array to store the frequency of letters
        int[] letterCount = new int[26];
    
        // Traverse both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch1 = s1.charAt(i);
    
            if (ch >= 'a' && ch <= 'z') {
                letterCount[ch - 'a']++;
            }
            if (ch1 >= 'a' && ch1 <= 'z') {
                letterCount[ch1 - 'a']--;
            }
        }
    
        // Check if all counts are zero
        for (int count : letterCount) {
            if (count != 0) return false;
        }
    
        return true;
    }
      */
      
    //9.8 Scrabble tile?
    /*
       public class Scrabble {

    public static boolean canSpell(String tiles, String word) {
        // Create an array to store the frequency of each letter
        int[] tileCount = new int[26];

        // Count the frequency of each tile
        for (char tile : tiles.toCharArray()) {
            tileCount[tile - 'a']++;  // Assuming all tiles are lowercase letters
        }

        // Check if we can spell the word
        for (char letter : word.toCharArray()) {
            if (tileCount[letter - 'a'] == 0) {
                return false; // Not enough tiles to spell the letter
            }
            // Use one tile
            tileCount[letter - 'a']--;
        }

        return true; // Successfully spelled the word
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(canSpell("quijibo", "jib")); // true
        System.out.println(canSpell("quijibo", "bjj")); // false
        System.out.println(canSpell("abcdef", "face")); // true
        System.out.println(canSpell("abcdef", "fad"));  // true
        System.out.println(canSpell("abcdef", "faded")); // false
    }
}

       */

    //10.4 BigInterger
    /*
     public class Big{
        public static BigInteger factorial(int n){
            BigInteger result = BigInteger.ONE; //start w 1 as a BIgInteger
            for(int i = n;i>=1;i--){
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }

        public static void display(int limit){
            System.out.println("Number              Factorial");
            for(int i =1;i<=limit;i++){
                System.out.println(i + "                    " + factorial(i) );
            }
        }
    }

     */
    
     //10.5 big integer with pow
     /*
      public static BigInteger pow(int x, int n){
        if(n == 0)return BigInteger.ONE;
        
        BigInteger t = pow(x, n/2);

        if(n % 2 == 0){
            return t.multiply(t);
        }
        else{
            BigInteger y = BigInteger.valueOf(x);
            return y.multiply(t.multiply(t));
        }
     }
      */
     
      //side
      /*
       public static boolean isPalindrome(int num){
        //eliminating base cases
        if(num < 0 || (num % 10 == 0 && num != 0)){
            return false;
        }
        if(num >= 0 && num <= 9)return true;

        int reversed = 0;
        int original = num;
        while(num != 0){
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        return original == reversed;
      }
       */
      
    
    
    // 11.3 Scrabble
    /*
      class Tile{
        private char letter;
        private  int value;

        public Tile(char letter,int value){
            this.letter = letter;
            this.value = value;
        }

        //setters
        public void setLetter(char letter){
            if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
                this.letter = letter;
            }
            else{
                System.out.println("Invalid letter");
            }
        }
        public void setValue(int value){
            if(value > 0 && value <= 10){
            this.value = value;
            }
            else{
                System.out.println("Invalid value");
            }
        }

        //getters
        public char getLetter(){
            return this.letter;
        } 
        public int getValue(){return this.value;}

        public static void printTile(Tile tile){
            System.out.printf("Letter: %c, Value: %d%n",tile.letter,tile.value);
        }

        public static void testTile(){
            Tile testTile = new Tile('Z', 10);
            printTile(testTile);
        }
        
        //toString
        @Override
        public String toString() {
            return String.format("Tile[Letter: %c, Value: %d]", this.letter, this.value);
        }

        //equals method
        public boolean equals(Tile that){
            return this.letter == that.letter && this.value == that.value;
        }
    }    

     */
    
    //11.5
    // Rational test = new Rational();
    // test.setDenominator(19);
    // test.setNumerator(14);
    // System.out.println(test.toString());
    // test.Negate();
    // test.printRational();
    // test.invert();
    // test.printRational();
}
    //PUT OTHER CLASSES OUTISDE MAIN CLASS!
    
}
//Date class,11.4
/*
 class Date{
        private int year;
        private int month;
        private int day;
        
        public Date(){
            this(2000, 1, 1);
        }
        public Date(int year,int month,int day){
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public void setYear(int year){this.year = year;}
        public void setMonth(int month){this.month = month;}
        public void setDay(int day){this.day = day;}

        @Override
        public String toString(){
            return String.format("%02d-%02d-%04d",this.day,this.month,this.year);
        }
    }
 */
  //Rectangle class
    /*
     class Rectangle{
        private double width ;
        private double height;

        public Rectangle() {
            this(1.0, 1.0); //setting default values
        }

        public Rectangle(double width,double height){
            this.width = width;
            this.height = height;
        }

        public void setWidth(double width){this.width = width;}
        public double getWidth(){return this.width;}
        public void setHeight(double height){this.height = height;}
        public double getHeight(){return this.height;}

        public double getArea(){return this.height * this.width;}
        public double getPerimeter(){return 2*( this.height + this.width);}


        
    }
     */

    //Account
    /*
     class Account{
        private int id;
        private double balance;
        private double interest_rate;
        private Date dateCreated;

        public Account(){
            this(1, 0.0, 0.0);
        }
        public Account(int id,double balance,double interest_rate){
            this.id = id;
            this.balance = balance;
            this.interest_rate = interest_rate;
            this.dateCreated = new Date(); //contains the current date and time
        }
        
        //getters
        public int getId(){return this.id;}
        public double getBalance(){return this.balance;}
        public double getInterest_rate(){return this.interest_rate;}
        public Date getDatecreated(){return this.dateCreated;}

        //setters
        public void setId(int id){
            if(id > 0 && id < 1000){
            this.id = id;
            }
            else{
                System.out.println("Invalid id");
                this.id = 0;
            }
        }
        public void setBalance(double balance){this.balance = balance;}
        public void setInterest_rate(double interest_rate){this.interest_rate = interest_rate;}

        public boolean withdraw(double amount){
            if(this.balance < amount){return false;}

            this.balance -= amount; 
            return true;

        }
    
        public void deposit(double amount){
            balance += amount
        }
    }

     */

// Rational 11.5
    /*
       class Rational{
        private int numerator,denominator;

        public Rational(){
            this.numerator = 0;
            this.denominator = 1;
        }

        public Rational(int numerator,int denominator){
            if (denominator == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero.");
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }


        public void printRational(){
            System.out.println(this.numerator + "/" + this.denominator);
        }
        
        //setters
        public void setNumerator(int numerator){this.numerator = numerator;}
        public void setDenominator(int denominator){this.denominator = denominator;}
        //getters
        public int getNumerator(){return this.numerator;}
        public int getDenominator(){return this.denominator;}

        @Override
        public String toString(){
            return String.format("%d/%d",this.numerator,this.denominator);
        }

        //modifiers
        public void negate(){
                this.numerator *= -1;
        }
    
        public void invert(){
            if(this.numerator == 0){
                System.out.println("Cannot inverse number with numerator 0");
            }
            else{
            int temp = this.numerator;
            this.numerator = this.denominator;
            this.denominator = temp;
            }
        }
    
        public double toDouble(){
            return (double) this.numerator / this.denominator;
        }
    
        public static int gcd(int a, int b) {
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            return a;
        }
    
        public Rational reduce(){
            int gcd = gcd(this.numerator, this.denominator);
            int new_numerator = this.numerator / gcd;
            int new_denominator = this.denominator / gcd;
            return new Rational(new_numerator, new_denominator);
        }
    
        public Rational add(Rational that) {
            int solution_num = this.numerator * that.denominator + that.numerator * this.denominator;
            int solution_denom = this.denominator * that.denominator;
            return new Rational(solution_num, solution_denom).reduce();
        }
        
    }
     
     */

   