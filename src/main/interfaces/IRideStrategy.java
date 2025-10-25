package main.interfaces;

// Strategy Interface

public interface IRideStrategy {
    float calculateFare(int distance, int passengers);
    String getETA(int distance);
    String getName();
}