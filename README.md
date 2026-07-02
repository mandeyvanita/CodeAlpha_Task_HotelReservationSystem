# CodeAlpha_Task_HotelReservationSystem
A Java-based Hotel Reservation System that allows users to book rooms, manage reservations, generate bills, and store booking records using OOP and File Handling.



# 🏨 Hotel Reservation System

A Java-based **Hotel Reservation System** that allows users to book rooms, check room availability, cancel reservations, generate bills, and manage booking records using Object-Oriented Programming (OOP) and File Handling.

---

## 📌 Features

- 🛏️ View Available Rooms
- 📅 Book a Room
- ❌ Cancel Reservation
- 👤 Customer Details Management
- 💳 Bill Generation
- 📜 Booking History
- 💾 Save Booking Data
- 📂 Load Booking Records
- 🖥️ Menu-Driven Console Application

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections (ArrayList)
- File Handling
- Exception Handling
- VS Code
- JDK 17+

---

## 📂 Project Structure

```
HotelReservationSystem
│
├── src
│   ├── Main.java
│   │
│   ├── model
│   │   ├── Room.java
│   │   ├── Customer.java
│   │   ├── Booking.java
│   │   └── Hotel.java
│   │
│   ├── service
│   │   ├── BookingService.java
│   │   ├── RoomService.java
│   │   └── FileService.java
│   │
│   ├── util
│   │   └── InputValidator.java
│   │
│   └── view
│       └── Menu.java
│
└── data
    ├── bookings.txt
    └── rooms.txt
```

---

## 🚀 How to Run

### 1. Clone Repository

```bash
git clone https://github.com/YourUsername/HotelReservationSystem.git
```

### 2. Open Project

Open the project in **VS Code**.

### 3. Open Terminal

```bash
cd HotelReservationSystem/src
```

### 4. Compile

```bash
javac Main.java model/*.java service/*.java util/*.java view/*.java
```

### 5. Run

```bash
java Main
```

---

## 📋 Menu

```
1. View Available Rooms
2. Book Room
3. Cancel Booking
4. View Booking Details
5. Generate Bill
6. Save Data
7. Load Data
8. Exit
```

---

## 💡 Sample Output

```
====================================
      HOTEL RESERVATION SYSTEM
====================================
1. View Available Rooms
2. Book Room
3. Cancel Booking
4. View Booking Details
5. Generate Bill
6. Save Data
7. Load Data
8. Exit

Enter Choice:
```

---

## 📖 Concepts Used

- Classes & Objects
- Encapsulation
- Constructors
- ArrayList
- File Handling
- Exception Handling
- Java Packages
- Menu-Driven Programming

---

## 🎯 Future Enhancements

- Online Payment Integration
- Room Categories (AC / Non-AC / Deluxe)
- Customer Login System
- MySQL Database Integration
- GUI using JavaFX/Swing
- Email Booking Confirmation

---

## 👩‍💻 Author

**Your Name**

Java Developer Intern

---

## ⭐ GitHub

If you found this project useful, don't forget to **Star ⭐ the repository**.
