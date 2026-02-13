package com.example.broadcast;

import java.util.LinkedList;
import java.util.Queue;

public class BroadcastEngine {

    private Queue<GraphicsScene> sceneQueue = new LinkedList<>();
    private GraphicsScene currentScene;

    public GraphicsScene createScene(GraphicsTemplate template) {
        return new GraphicsScene(template);
    }

    public void queueScene(GraphicsScene scene) {
        sceneQueue.add(scene);
        System.out.println("Scene queued: " + scene.getSceneName());
    }

    public void playNext() {
        if (sceneQueue.isEmpty()) {
            System.out.println("No scenes in queue.");
            return;
        }

        currentScene = sceneQueue.poll();
        currentScene.setStatus(SceneStatus.ON_AIR);
        System.out.println("Now Playing: " + currentScene.getSceneName());
        currentScene.render();
    }

    public void stopCurrent() {
        if (currentScene != null) {
            currentScene.setStatus(SceneStatus.STOPPED);
            System.out.println("Stopped: " + currentScene.getSceneName());
        }
    }
}
