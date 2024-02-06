//Gracie Hackworth, ALC Software Development, February 5th, 2024
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creates a list
        ArrayList<String> myTasks = new ArrayList<>();

        //starts the loop by allowing user to make a first choice
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Please choose an option: \n(1)Add a task. \n(2)Remove a task. \n(3)Update a task. \n(4)List all tasks. \n(0)Exit.");
        String userChoice = input.nextLine();

        // starts loop to continue as long as user choice doesn't equal 0
        while (!(userChoice.equals("0"))) {
            //user choices, at the beginning of the loop so it shows up before prompting another response
            if (userChoice.equals("1"))
                addTask(myTasks);
            if(userChoice.equals("2"))
                removeTask(myTasks);
            if(userChoice.equals("3"))
                updateTask(myTasks);
            if (userChoice.equals("4"))
                viewTasks(myTasks);
            System.out.println("\nPlease choose an option: \n(1)Add a task. \n(2)Remove a task. \n(3)Update a task. \n(4)List all tasks. \n(0)Exit.");
            userChoice = input.nextLine();
        }
        //goodbye message :)
        if (userChoice.equals("0"))
            System.out.println("\n~ Goodbye! ~");
    }

    //1, add a task
    static void addTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat task would you like to add?");
        String taskToAddToList = input.nextLine();
        a.add(taskToAddToList);
    }
    //2, remove a task
    static void removeTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat task would you like to remove? (List starts at 0.)");
        System.out.println(a);
        int taskToRemove = input.nextInt();
        a.remove(taskToRemove);

    }
    //3, update a task
    static void updateTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat task would you like to update? (List starts at 0.)");
        System.out.println(a);
        int updateTask = input.nextInt();
        System.out.println("What description would you like to write for this updated task?");
        String updatedTaskDesc = input.nextLine();
        a.set(updateTask, updatedTaskDesc);
        System.out.println("\nYour updated tasks...");
        System.out.println(a);
    }
    //4, list all tasks
    static void viewTasks(ArrayList<String> a){
        System.out.println("\nHere's a list of your tasks...");
        System.out.println(a);
    }
}