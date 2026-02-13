package com.example.broadcast;

public class Main {

    public static void main(String[] args) {

        BroadcastEngine engine = new BroadcastEngine();

        // Create template
        GraphicsTemplate lowerThirdTemplate = new GraphicsTemplate(
                "Lower Third",
                "News"
        );

        // Create scene from template
        GraphicsScene scene = engine.createScene(lowerThirdTemplate);

        // Inject dynamic data
        scene.updateField("headline", "Breaking News");
        scene.updateField("name", "John Doe");
        scene.updateField("location", "New York");

        // Queue and play
        engine.queueScene(scene);
        engine.playNext();

        // Stop scene
        engine.stopCurrent();
    }
}
