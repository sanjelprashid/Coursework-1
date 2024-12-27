package com.Finaid.datastructure;

import com.Finaid.model.ScholarshipModel;
import java.util.LinkedList;

public class ApplicationQueue {
    private LinkedList<ScholarshipModel> applicationList;
    private int capacity;
   
    /**
     * Constructs an ApplicationQueue with specified capacity
     * @param capacity maximum number of applications that can be stored
     */
    public ApplicationQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.applicationList = new LinkedList<>();
        this.capacity = capacity;
    }
   
    /**
     * Adds a new scholarship application to the queue
     * @param application the scholarship application to add
     * @return current size of queue after addition, or -1 if queue is full
     */
    public int enqueue(ScholarshipModel application) {
        if (isFull()) {
            return -1;
        }
        applicationList.addLast(application);
        return applicationList.size();
    }
   
    /**
     * Removes and returns the next application from the queue
     * @return the next ScholarshipModel in the queue
     * @throws IllegalStateException if queue is empty
     */
    public ScholarshipModel dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return applicationList.removeFirst();
    }
   
    /**
     * Views the next application without removing it
     * @return the next ScholarshipModel in the queue
     * @throws IllegalStateException if queue is empty
     */
    public ScholarshipModel peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return applicationList.getFirst();
    }
   
    /**
     * Gets current size of the queue
     * @return number of applications in the queue
     */
    public int size() {
        return applicationList.size();
    }
   
    /**
     * Checks if queue is empty
     * @return true if queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return applicationList.isEmpty();
    }
   
    /**
     * Checks if queue is full
     * @return true if queue is at capacity, false otherwise
     */
    public boolean isFull() {
        return applicationList.size() >= capacity;
    }
   
    /**
     * Updates status of an application by student ID
     * @param studentId ID of student whose application needs update
     * @param newStatus new status to set
     * @return true if update successful, false if application not found
     */
    public boolean updateApplicationStatus(int studentId, String newStatus) {
        for (ScholarshipModel app : applicationList) {
            if (app.getStudentId() == studentId) {
                app.setStatus(newStatus);
                return true;
            }
        }
        return false;
    }
}