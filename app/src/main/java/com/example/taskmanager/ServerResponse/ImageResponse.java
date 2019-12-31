package com.example.taskmanager.ServerResponse;

public class ImageResponse {
    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public ImageResponse(String filename) {
        this.filename = filename;
    }
}
