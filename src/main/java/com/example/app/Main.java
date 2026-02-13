package com.ross.app;

/**
 * Main application class
 * This is a simple Java application structure
 * for managing basic broadcast graphics information.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Ross XPression Studio Helper App ===");

        GraphicsProject project = new GraphicsProject(
                "Live News Lower Third",
                "Broadcast Graphics",
                true
        );

        project.displayProjectInfo();
    }
}
