package working.Java_projects;

import java.util.Scanner;

public class SelfIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("It's self introduction. You just have to answer the questions and your self introduction will be ready.");
        System.out.println(".................................................................................................");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter which city are you from: ");
        String city = sc.nextLine();

        System.out.print("Qualification: ");
        String education = sc.nextLine();

        System.out.print("Enter your college name: ");
        String college = sc.nextLine();

        System.out.print("Enter your hobbies: ");
        String hobbies = sc.nextLine();

        System.out.print("The company you're applying for: ");
        String company = sc.nextLine();

        System.out.println("First of all, thank you for giving me this opportunity to introduce myself. My name is "
                + capitalizeWords(name) + ". I am from " + capitalizeWords(city)
                + ". I have completed my " + education.toUpperCase()
                + " from " + capitalizeWords(college) + ". My hobbies are " + capitalizeWords(hobbies)
                + ". My strengths are that I am a hardworking and self-motivated person with strong communication skills. "
                + "I am a quick learner. My short-term goal is to get a job in a reputable company. "
                + "My long-term goal is to achieve a good position like yours, where I can build my career and contribute to the growth of "
                + capitalizeWords(company) + ".");

        sc.close();
    }

    // Capitalizes the first letter of EACH word, lowercases the rest of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}