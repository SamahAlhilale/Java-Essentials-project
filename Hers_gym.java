/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gymassigment;

/**
 *
 * @author samah
 */
/*
Name: samah humood ahmad alhilale
ID:441008110
Group:7
Program description:
My program's name "hers'" refers to a gym that serve to her 
every need. It offers subscriptions for three to one year and some services that does not require a membership. 
customers can even try the most recent body weight calculating technologies. 
And,it provides a cost-free BMI calculation service.
*/
import java.util.*; // using the whole package 
public class Hers_gym { 
    public static void main(String[] args) {
        // all these declared variable will be used in the checkout method for printing the receipt 
        String name,phonenum,service,workout,plan = null; /* declered variables for the user name and phone number that will have a an input from the user 
        value,services given from the gym 
        and workout type, the gym plans will have a list options
        showing to the user to choose from (phonenum as a string for validation)*/
        workout = "null"; // declared as an empty variable, so later on will be printed on the receipt with the choice the user made of the list
        service = "null"; // declared as an empty variable, so later on will be printed on the receipt with the choice the user made of the list
        int height, weight, total, month3, month6, year1, msg1, msg2 = 0, msg3,inbody, mealplan, pt, userchoice = 0, rating = 0; /*it will start with value of a zero and will be 
        increased each time the user picks an option with its own price */ 
         total = 0; /* the total of the services will be calculated into a total that will printed on the receipt,
         its intial value is zero so and it will be added the price each time the user picks any type of service from the gym. */ 
         month3 = 360; // this is the price of the 3 months gym subscribtion. and it will be added to the total value when the user picks it.also will be printed on the receipt
         month6 = 660; // this is the price of the 6 months gym subscribtion. and it will be added to the total value when the user picks it. also will be printed on the receipt
         year1 = 960; // this is the price of the 1 year gym subscribtion. and it will be added to the total value when the user picks it.also will be printed on the receipt
         pt = 1000; // this is the price of the personal trainer that will be added in the total when gets chosen by the user. also will be printed on the receipt
         inbody = 150; // the inbody check service with its price, it will be used in the additional services, that the user will choose from 
         mealplan = 2500; //the meal planning program service with its price, it will be used in the additional services, that the user will choose from
         msg1 = 150; // the massage service with its price, it will be used in the additional services, that the user will choose from
         msg1= 250;
         msg3 = 350; // the 3 hours massage service with its price, it will be used in the additional services, that the user will choose from.
        System.out.println("Welcome to (HER's gym) \n Kindly,tell us your first and last name :)"); /* welcoming message that will be out for
        the user to enter their name*/
        name = UserString(); // input function for the name (nextline) so the program will expecting a string input from the user 
        System.out.println("WELCOME " + name + " :) \n Please provide us with your phone number so we can keep you updated with our services!\n"
                + " ((Please enter a 10-digit number only))"); 
        phonenum = UserString();/*input function for the phone number (nextline) so 
        the program will expecting a string input from the user. and the phone number was declared as string for validating that the number isn't 
        longer than 10 numbers */
            if(phonenum.length() < 10){ /*with this condition and method the phone number will be checked first with the length method by checking
                the numbers index as string and making sure it's only 10 numbers */  
            System.out.println("The Phone number you have entered contains invalid format please re-enter your phone number " ); /* this message will be out
            for the user when a number is lesser than 10 is enterd */ 
                    phonenum = UserString(); // using the input method for the phone number as a string to be able to make sure that is the number length is 10
        }
        System.out.println("Would you like a list of all of our services provided by us? Kindly type \n > (1). as Yes \n > (2). as No "); /*mesaage for user
        that shows up and choose from*/
         userchoice =  UserInt(); // using the input method so than the user can enter an integer value
        do{ // if the user dosen't pick neither of 1 and 2 a massage will show up of re-entering a value
            if (userchoice==1 | userchoice==2) // if the entered valuse equal 1 or 2 then the user will be proceed to the program
                break; // after finishing it will break these lines and be proceeded  to the rest of the program
       System.out.println("The number you entered is incorrect! \n *Kindly re-enter the correct number*");// message for the user to renter a correct number 
        System.out.println("Would you like a list of all of our services provided by us? Kindly type \n > (1). as Yes \n > (2). as No ");
        userchoice =  UserInt(); // using the input method so than the user can enter an integer value
        } while (userchoice!= 1 & userchoice !=2); // in case the user entered value wasn't 1 and 2 keep asking for entering a value again
  if (userchoice!=2){ // if the user ented value was 1 which means a yes, the user will be proceed to the plans list
        do {
            System.out.println("Please enter the plan number you would lik to select. \n > (1). three months subscription :360 Saudi Riyals \n > (2). six months subscription :660 Saudi Riyals"
               +" \n > (3). one year subscription :960 Saudi Riyals \n *you must pay 1,000 Saudi Riyals to include a personal trainer in your plan*" //this is the plans list for the user to choose from
                + "\n ALL PRICES INCLUDE VAT"); // all the prices of the plans and service includes the 15% VAT
                // an option for the user to choose when not interested in the plans
            userchoice =  UserInt(); // using the input method so than the user can enter a value
        switch(userchoice){ // using switch for each option the user may choose 
            case 1:  // message to pick the workout type// if this user picks the first option
            System.out.println("kindley, pick the number of the workout that will be included in your plan" + " \n > (1). Aerobics" + " \n > (2). Pilates" + " \n > (3). Weight Lifting");/*
            now that the user choosed the plan, and will be asked whick workout to choose */           
            userchoice =  UserInt();
            if (userchoice == 1) { // if the user picks the first option he will be choosing the first workout for 3 months plan
                System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                plan = "3 months subscription";
                workout = "Aerobics"; // this is the case when the user choose a 3 month plan with an aerobics workout
                total = month3; // the 3 months price will be in the total now 
                break; // after finishing it will break these lines and be proceeded  to the rest of the program
            } else { // if the user choosed another options
                
                if (userchoice == 2) { // if the user picks the second option he will be choosing the second workout for 3 months plan
                    System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                    plan= "3 months subscription";
                    workout = "Pilates"; // this is the case when the user choose a 3 month plan with an pilates workout
                    total = month3; // the 3 months price will be in the total now
                    break; // after finishing it will break these lines and be proceeded  to the rest of the program
                } else { // if the user choosed another options
                    if (userchoice == 3) { // if the user picks the third option he will be choosing the third workout for 3 months plan
                        System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                        plan = "3 months subscription";
                        workout = "Weight Lifting"; // this is the case when the user choose a 3 month plan with an weight lifting workout
                       total = month3; // the 3 months price will be in the total now
                       break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    } //end if
                } // end else
            }// end fist else 
              break; // end case 1 if the user didn't choose the 3 months plan, it will break it and proceed to the other avilable plans
            case 2: /* in case the user choosed the 6 months plan, it will be asked whick preferd workout to choose */
            System.out.println("kindley, pick the number of the workout that will be included in your plan" + " \n > (1). Aerobics" +" \n > (2). Pilates" + " \n > (3). Weight Lifting"); /* message to pick the workout type
            it will show up to the user to pick from*/
 
            userchoice =  UserInt();
            if (userchoice == 1) { // if the user picks the first option workout for a 6 month plan
                System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                plan = "6 months subscription "; // this will be later used in the bill
                workout = "Aerobics"; // this will be later used in the bill
                total = month6; // the 6 months price will be in the total now
                break; // after finishing it will break these lines and be proceeded  to the rest of the program
            } else { // if the user choosed another options
                if (userchoice == 2) { // if condition to pick a second option workout for a 6 months plan
                    System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                    plan = "6 months subscription"; // this will be later used in the bill
                    workout = "Pilates"; // this will be later used in the bill
                    total = month6; // the 6 months price will be in the total now
                    break; // after finishing it will break these lines and be proceeded  to the rest of the program
                } else { // if the user choosed another options
                    if (userchoice == 3) { // if the user picks the third option workout for a 6 month plan
                        System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                        plan = "6 months subscription"; // this will be later used in the bill
                        workout = "Weight Lifting"; // this will be later used in the bill
                        total = month6; // the 6 months price will be in the total now
                    } // end if
                } // end else
            } //end fist else 
            break; // it will stop case 2 after choosing it and not will continue with the next option in the list
            case 3:
            System.out.println("kindley, pick the number of the workout that will be included in your plan" +" \n > (1). Aerobics" + " \n > (2). Pilates" + "\n > (3). Weight Lifting");
            userchoice =  UserInt();
            if (userchoice == 1) { // if the user picks the first option workout for a 1 year plan
                System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                plan = "1 year subscription"; // this will be later used in the bill
                workout = "Aerobics"; // this will be later used in the bill
                total = year1; // the 1 year price will be in the total now
                break; // after finishing it will break these lines and be proceeded  to the rest of the program
            } else { // if the user choosed another options
                if (userchoice == 2) { // if the user picks the second option workout for a 1 year plan
                    System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                    plan = "1 year subscription"; // this will be later used in the bill
                    workout = "Pilates"; // this will be later used in the bill
                    total = year1;  // the 1 year price will be in the total now
                    break; // after finishing it will break these lines and be proceeded  to the rest of the program
                } else { // if the user choosed another options
                    if (userchoice == 3) { // if the user picks the third option workout for a 1 year plan
                        System.out.println("We appreciate you choosing this plan and wish you a wonderful journey!");
                        plan = "1 year subscription"; // this will be later used in the bill
                        workout = "Weight Lifting"; // this will be later used in the bill
                        total = year1;  // the 1 year price will be in the total now
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    }
                }
            }
           break; // it will stop case 3 after choosing it and not will continue with the next option in the list
            default: // when none of the cases is true it will print a message to the user to re-enter
                System.out.println("The number you entered is incorrect! \n *Kindly re-enter the correct number*"); // message indictating that the user enterd a wrong value
                   } // end switch 
         if (userchoice==1 | userchoice==2 | userchoice==3){
            break;  // after finishing it will break these lines and be proceeded  to the rest of the program
        }
        }while(userchoice!=1 | userchoice!=2 | userchoice!=3);
            System.out.println("if you want a personal trainer in your plan you must pay 1,000 Saudi Riyals kindly type \n > (1). as a yes \n > (2). as a no"); // message for the user
              userchoice =  UserInt();  // input function for choosing a pt
            if (userchoice == 1) { // if the user choosed the first option (yes)
         
               System.out.println("Your plan now includes a personal trainer");  // if the user enter 1 (yes)/ this message will printed 
                plan = plan + " personal trainer included"; // this will be printed in the bill
                total = total+pt; // personal trainer is now included in the total price
            } 
             } // end of if userchoice!=2 
            System.out.println("||we offer some services that do not require a gym membership||" // message will show to the user for additiona service
                    + "\n Would like more information on them? "
                    + "kindly, type \n > (1). as a Yes \n > (2). as a No"); // message for the user for picking any further services         
            userchoice =  UserInt(); // input for the the choice the user will choose.
        { // if the user skips the services 
         
           if (userchoice == 1) { // if the user picks 1 (yes) 
               
                do{    
                  System.out.println("we provide additional services to enhance your gym experience \n (kindly type the number of the service from 1 to 3)" 
                        + "\n > (1). Inbody check FOR 150 Saudi Riyals" 
                        + "\n > (2). Meal Planning Program FOR 2500 Saudi Riyals"
                        + "\n > (3). Massage Area FOR FOR 1 hour (250 Saudi Riyals) FOR 3 hours (350 Saudi Riyals"
                        + "\n ALL PRICES INCLUDE VAT");
                        
                userchoice =  UserInt(); // input for the user choice for any of these services 
                switch(userchoice){ 
                case 1: // if the user choses the first service
                    System.out.println("With the Inbody Check up You will be able to measure your muscle mass, fat mass, and body composition \n"
                            + " > kindely, type (1) if you would like to know only your body fat and muscle mass "
                            + "\n> kindely, type (2) if you would like to know your whole body composition "
                            + "\n (in-depth look at your body broken down into body fat muscle mass,and water weight)"
                            + "\n> kindely, type (3) if you would like to know your body weight only");
              userchoice =  UserInt(); // using an input method instead of scanner
                    service = "inboody check"; // will printed in the bill
                   
                    if (userchoice == 1) { // if the user choses the first option in the inbody check
                        System.out.println("We guarantee the best in-body check experience!");
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    }
                    if (userchoice==2){ // if the user choses the second option in the inbody check
                      System.out.println("We guarantee the best in-body check experience!");
                      break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    }
                    if (userchoice==3){ // if the user choses the third option in the inbody check
                        System.out.println("We guarantee the best in-body check experience!");
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    } 
                    total = total+inbody; // inbody will be included in the total
                    break; //end case 1, after finishing it will break these lines and be proceeded  to the rest of the program
                case 2: // if the user picks the second service
                    System.out.println("With the guidance of our nutritionist, you will be able to achieve your goals with the assistance of our meal planning program \n"
                            + " > kindely, type (1) for a weight and muscles gain meal plan \n"
                            + " > kindely, type (2) for a weight loss meal plan \n "
                            + " > kindely, type (3) for calorie deficit meal plan"); // prompt message for the user to pick an option
                       userchoice =  UserInt();   // using an input method instead of scanner
                    service = "meal planning program"; // to be used in the bill 
                    if (userchoice == 1) { // if the user picks the first option of the meal plan
                        System.out.println("We sincerely hope that we can help you live a healthier lifestyle!");
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    } 
                    if (userchoice==2){ // if the user picks the second option of the meal plan
                        System.out.println("We sincerely hope that we can help you live a healthier lifestyle!");
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    }
                    if (userchoice==3){ // if the user picks the third option of the meal plan
                    System.out.println("We sincerely hope that we can help you live a healthier lifestyle!");
                    break; // after finishing it will break these lines and be proceeded  to the rest of the program
                            }
                    total = total+mealplan;// the meal plan  will be included in the total
                    break; //end case 2,after finishing it will break these lines and be proceeded  to the rest of the program 
                case 3: // in case the user picks the third service 
                  System.out.println("Massage is a crucial step in healing and relaxing your muscles!"
                       + " \n You can schedule a massage for one-hour or two-hour or three-hour with the assistance of our massage therapist :)"
                       + " \n > kindely, type (1) for a one-hour massage "
                       + " \n > kindely, type (2) for a two-hour massage"
                          + " \n > kindely, type (3) for a three-hour massage"); // prompt message for the user to pick an option
                    userchoice =  UserInt(); // using an input method instead of scanner
                    if (userchoice == 1) { // if the user picks the first option 
                        System.out.println("We hope you have a pleasant time :) ");
                        service = "massage for one-hour"; // to be printed in the bill
                        total = total+msg1; // 1 hour massage will be included in the total
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    }
                    if (userchoice==2) { // if the user picks the second option
                        System.out.println("We hope you have a pleasant time :) ");
                        service = "massage for two-hour"; // to be printed in the bill
                        total = total+msg2;  // 2 hours massage  will be included in the total
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    }
                    // end else 
                    if (userchoice==3){ // if the user picks the third option
                         System.out.println("We hope you have a pleasant time :) ");
                        service = "massage for three-hour"; // to be printed in the bill
                        total = total+msg3; //3 hours massage  will be included in the total
                        break; // after finishing it will break these lines and be proceeded  to the rest of the program
                    }
                    break; //end case 3,after finishing it will break these lines and be proceeded  to the rest of the program
                default: // when none of the cases is true it will print a message to the user to re-enter
               System.out.println("The number you entered is incorrect! \n *Kindly re-enter the correct number*");/*in case the user enterd invalid 
               value this message will be printed*/
                    } // end switch 
                  if (userchoice==1 | userchoice==2 | userchoice==3){ /*if the user choosed the first or second or thuird options, then break it and
                      proceed to the rest of the program*/
            break; // // after finishing it will break these lines and be proceeded  to the rest of the program
        }
                }while(userchoice!=1 | userchoice!=2 | userchoice !=3); /* if the user enterd a wrong value which is not from the options 1 or 2 or 3 
                so when this happens the user will be asked to re-enter a correct value*/
                   
           
        System.out.println("We offer you the chance to use our free BMI calculation service to get started Kindly type \n (1).Yes \n (2). No"); /*message for 
        the user */
        userchoice =  UserInt(); // using an input method instead of scanner (to get an integer value)
        if (userchoice == 1) { // in case the user chooses the first option 
            System.out.println("Please tell us your weight in Kilograms ");
            weight =  UserInt(); // using input function for the weight value will be entered by the user
            System.out.println("Please tell us your height in centimetres ");
            height =  UserInt(); // // using input function for the height value will be entered by the user
            double BMI = weight/ Math.pow((double) height/100,(double)2); // this equation will calculate the bmi 
        if(BMI <= 24.9 && BMI >= 18.5){ // if the bmi is lesser than 24.9 and lesser 18.5 it will print that it is in the normal rate
            System.out.printf("We'd like to let you know that your BMI is: %.2f", BMI); // using printf to show only 2 digits after coma, to avoid long numbers
            System.out.println( "\n and It is in the normal BMI Rate"); // calcuating BMI and showing a message that it is in the normal rate
        }
        else {
            if(BMI > 24.9) { // if the calcuated bmi value is higher than 24.9 it will print message showing it's higher than normal
                  System.out.printf("We'd like to let you know that your BMI is: %.2f", BMI); // using printf to show only 2 digits after coma, to avoid long numbers
             System.out.println("\n and It is higher than the normal BMI Rate"); // message for the user shows the bmi result 
            }
            else {
            if(BMI < 18.5) { // if the calculated bmi valuse is lesster than 18.5
            System.out.printf("We'd like to let you know that your BMI is: %.2f", BMI); // using prinf for pritning only two digits after the coma
             System.out.println("\n and It is lower than the normal BMI Rate");  // message for the user shows the bmi result
            } // end if
            } // end else
        } // end else
        } // end user choice 
       
        // calling class to print 
        CheckOut(name,phonenum,plan,service,workout,total); // this method will be used for the bill, and the 
        //components of the method are orderd from first (name)to last (total)
        do{
       rating = UserInt(); // using the input method to get a value from the user
      if(rating<=5 && rating > 2 ){ // if the rating value entered is 5 or equal 5 and the rating value entered is higher than 1 
            System.out.println("We are very pleased to hear this, Thank you for your feedback :) "); // it will print this thanking message if the condition was true
        } 
      else if(rating==1 || rating==2) { // if the rating value entered was 1 or 2, an apology message will be printed 
            System.out.println("we apologize for not meeting your needs and we will try harder to improve our services!"); // rating the service loop, if the rating is 3 stars or lesser it will print an apology, other will print a thanking message
        
      }else{ System.out.println("The number you entered is incorrect! \n *Kindly re-enter the correct number*"); /* in case the user entered a
      different value from known the rating values(1 to 5), the user will be asked again to enter a correct value */ 
      }
     
      } while(rating<1 | rating > 5); // this condition setting a specific values for rating. which means the rating needs to be between 1 to 5 only
  System.out.println("THANK YOU FOR YOUR TIME!"); // after asking the user for the rating, this thanking message will be printed  
        }
    }
                }
         // end of main
    // end of class
        public static String UserString(){ // this method will be used instead of user a scanner each time to ask for an input
        Scanner input= new Scanner(System.in);
        return (input.nextLine());} // this method is for the values that need a string to be entered

        public static int UserInt(){ // this method will be used instead of user a scanner each time to ask for an input
        Scanner input=new Scanner(System.in);
        return (input.nextInt());} // this method is for the values that need an integer to be entered
   public static void CheckOut(String name,String phonenum,String plan,String service,String workout,int total){ // this method is created to be used to the bill
            System.out.println("Proceed to checkout (Receipt)"); // receipt 
        System.out.println("HER'S GYM \n Customer Full Name : " + name +
                "\n Customer phone number:"+ phonenum +"\n customer plan: "+ plan +"\n Customer Service:" + service+ // receipt print lines
                "\n Customer workout:" + workout+"\n Total Amount:" + total+ " \n ALL PRICES INCLUDE VAT" // receipt print lines
                        + " \n THANK YOU, COME VISIT US AGAIN\n**********************************\n" // a thanking statement at the end followed by stars
                        + "We would appreciate your feedback on our services by choosing a number out of this list\n" /* this printing line include
                        the rating lines which have been made with a do-while loop earlier*/
                        + " (1) star,strongly unsatisfied." // in case the user enterd 1 or 2 an apology will appear along with "thank you for you time"
                        + " \n (2) stars, unsatisfied."
                        + " \n (3) stars,satisfied." // from her the thanking message will be printed along with "thank you for you time"
                        + " \n (4) stars,strongly satisfied. "
                        + "\n (5) stars,outstanding"); 
    }
}


