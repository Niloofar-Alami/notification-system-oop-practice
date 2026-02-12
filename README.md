Notification System (OOP Practice)

A simple Java project demonstrating Inheritance and Polymorphism through a basic notification system.  
Each notification type extends a common base class and implements its own version of the send() method.

Features
- Abstract base class: Notification
- Three concrete implementations:
  - EmailNotification
  - SMSNotification
  - PushNotification
- Demonstrates:
  - Inheritance
  - Method overriding
  - Polymorphism
  - Clean OOP structure

Project Structure:
src/
 ├── EmailNotification.java
 ├── Main.java
 ├── Notification.java
 ├── PushNotification.java
 └── SMSNotification.java
 

How It Works:
Each notification type overrides the send() method to print a custom message.

Example output:

Sending EMAIL to black@example.com: Welcome!
Sending SMS to 0912...: Your code is 1234
Sending PUSH notification to black: New message!

How to Run:
Compile and run using any Java IDE or terminal.

What I Learned:
- How polymorphism allows different objects to share a unified interface  
- How inheritance helps reduce code duplication  
- How to design clean, extensible OOP structures  
