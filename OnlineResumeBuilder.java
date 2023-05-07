import java.util.Scanner;

public class OnlineResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the online resume builder!");
        
        // Personal information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        
        // Education
        System.out.print("Enter your highest level of education: ");
        String education = scanner.nextLine();
        
        System.out.print("Enter your major: ");
        String major = scanner.nextLine();
        
        System.out.print("Enter your graduation year: ");
        String graduationYear = scanner.nextLine();
        
        // Work experience
        System.out.print("Enter your work experience (title, company, dates): ");
        String workExperience = scanner.nextLine();
        
        // Skills
        System.out.print("Enter your skills (comma-separated): ");
        String[] skills = scanner.nextLine().split(",");
        
        // Print the resume
        System.out.println("\n\n");
        System.out.println("******************************");
        System.out.println("          RESUME");
        System.out.println("******************************");
        System.out.println("\n");
        
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        
        System.out.println("\nEducation");
        System.out.println(education + " in " + major + ", " + graduationYear);
        
        System.out.println("\nWork Experience");
        System.out.println(workExperience);
        
        System.out.println("\nSkills");
        for (String skill : skills) {
            System.out.println("- " + skill.trim());
        }
    }
}