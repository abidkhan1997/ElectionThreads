**Project Title:**  
**"Multithreaded Voting System Simulation in Java"**

**Project Description:**

In this project, you will create a multithreaded application in Java that simulates a voting process involving multiple threads representing different tasks such as checking IDs, assisting at kiosks, scanning ballots, handling voter actions, and managing election results. Each task will be executed concurrently to mimic the real-time operations of an election day scenario.

**Project Objectives:**

1. **Implement Thread Classes for Different Tasks:**
   - **ID Checker Thread:** Simulates the task of checking voter IDs. This thread verifies each voter's ID from a predefined list and allows them to proceed if they have valid identification.
   - **Kiosk Helper Thread:** Manages the kiosks where voters cast their ballots. This thread assists voters in selecting the correct kiosk and ensures that the kiosks are properly maintained.
   - **Scanning Helper Thread:** Handles the scanning of ballots after they are cast. This thread processes each ballot, ensuring they are correctly scanned and counted.
   - **Voter Thread:** Represents the voter actions, including arriving at the polling station, waiting for ID verification, casting a vote, and leaving.
   - **Election Management Thread:** Manages the overall election process, including starting the election, tallying votes, and declaring results.

2. **Thread Synchronization and Communication:**
   - Use synchronization mechanisms like `synchronized` blocks or methods, `Locks`, `Conditions`, or `Semaphore` to manage the interaction between threads. For example, ensure that a voter cannot cast a vote until their ID has been checked and verified.
   - Implement `wait()` and `notify()` or `notifyAll()` methods to facilitate communication between threads, such as notifying the scanning helper when a new ballot is ready for scanning.

3. **Simulate Real-time Operations:**
   - Each thread should simulate the passage of time for its operation using `Thread.sleep()` to mimic delays (e.g., time taken for ID checking or ballot scanning).
   - Use randomization to simulate different voter behaviors and scenarios, such as varying arrival times, different kiosk availability, and random ballot scanning times.

4. **Error Handling and Edge Cases:**
   - Implement error handling for scenarios such as invalid IDs, kiosk malfunctions, and scanning errors. Ensure that the application can gracefully handle these errors without crashing.
   - Handle edge cases where multiple voters arrive simultaneously or all kiosks are occupied.

5. **Testing and Performance Analysis:**
   - Create a set of test cases to validate the functionality of your voting system simulation, including normal operations, edge cases, and error scenarios.
   - Analyze the performance of your system, focusing on thread management, synchronization efficiency, and overall system responsiveness.

**Project Deliverables:**

1. **Source Code:** Java source files for the multithreaded voting system simulation, including a main class to start and manage the simulation.
2. **Test Cases:** A set of test cases and their results, demonstrating that the voting system functions correctly and efficiently.
