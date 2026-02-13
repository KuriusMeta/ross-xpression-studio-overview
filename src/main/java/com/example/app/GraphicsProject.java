package com.ross.app;

/**
 * Represents a simple graphics project model.
 */
public class GraphicsProject {

    private String projectName;
    private String category;
    private boolean isLiveEnabled;

    public GraphicsProject(String projectName, String category, boolean isLiveEnabled) {
        this.projectName = projectName;
        this.category = category;
        this.isLiveEnabled = isLiveEnabled;
    }

    public void displayProjectInfo() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Category: " + category);
        System.out.println("Live Enabled: " + (isLiveEnabled ? "Yes" : "No"));
    }

    // Getters
    public String getProjectName() {
        return projectName;
    }

    public String getCategory() {
        return category;
    }

    public boolean isLiveEnabled() {
        return isLiveEnabled;
    }
}
