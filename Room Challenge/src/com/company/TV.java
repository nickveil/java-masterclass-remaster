package com.company;

public class TV {
    private String streamingService;
    private String furniture;

    public TV(String streamingService, String furniture) {
        this.streamingService = streamingService;
        this.furniture = furniture;
    }

    private String getStreamingService() {
        return streamingService;
    }

    public String getFurniture() {
        return furniture;
    }

    public String whatToWatch(){
        String program = getStreamingService();
        return "I'll watch something on " + program + ".";
    }
}
