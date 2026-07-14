<h1 align="center">
🎬 Book My Show - System Design
</h1>

<p align="center">
  <b>A Console Based BookMyShow Clone developed using Java & Object-Oriented Programming.</b>
</p>

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![OOP](https://img.shields.io/badge/OOP-System%20Design-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

</p>

---

# 🎥 Project Overview

Book My Show is a **Low-Level Design (LLD)** implementation of an online movie ticket booking system developed using **Java**.

The project demonstrates the application of **Object-Oriented Programming principles**, **Design Patterns**, and modular architecture while simulating a real-world movie booking workflow.

---

# ✨ Features

✅ Admin Login

✅ Add Movies

✅ Add Theatres

✅ Schedule Movie Shows

✅ Automatic Seat Generation

✅ View Movies

✅ View Theatres

✅ View Available Shows

✅ Book Movie Tickets

✅ Payment using

- 💳 Card
- 💰 Cash
- 📱 UPI

✅ Ticket Generation

✅ Booking History

---

# 🏗️ Project Architecture

```
                    BookMyShow
                          │
        ┌─────────────────┴─────────────────┐
        │                                   │
     Admin                               User
        │                                   │
        │                            Book Ticket
        │                                   │
   ┌────┴─────┐                       Booking
   │          │                          │
Movies     Theatres                      │
                │                        │
                ├──── Seats              │
                │                        │
                └──── Shows──────────────┘
                         │
                     Payment
              ┌──────┼────────┐
              │      │        │
            UPI    Card     Cash
```

---

# 📂 Project Structure

```
BookMyShow
│
├── Main.java
├── BookMyShow.java
│
├── Users
│   ├── User.java
│   └── Admin.java
│
├── Movies
│   └── Movie.java
│
├── Threaters
│   ├── Threater.java
│   ├── Seat.java
│   └── Show.java
│
├── Booking
│   ├── Booking.java
│   └── Ticket.java
│
├── Payment
│   ├── Payment.java
│   ├── UPI.java
│   ├── Card.java
│   ├── Cash.java
│   └── PaymentFactory.java
```

---

# 🚀 OOP Concepts Used

| Concept | Implementation |
|----------|----------------|
| Encapsulation | Private data & methods |
| Abstraction | Payment Interface |
| Inheritance | Admin extends User |
| Polymorphism | Different Payment Methods |
| Singleton Pattern | BookMyShow System |
| Factory Pattern | Payment Factory |

---

# 🎯 Booking Flow

```text
Start
   │
   ▼
Select User
   │
   ▼
Choose Movie
   │
   ▼
Choose Theatre
   │
   ▼
Choose Show
   │
   ▼
Select Seat
   │
   ▼
Choose Payment Method
   │
   ▼
Payment Successful
   │
   ▼
Generate Ticket
```

---

# 🎫 Sample Ticket

```text
==========================================================================================
                           BOOK MY SHOW - MOVIE TICKET
==========================================================================================

Booking ID : BK1001          Ticket ID : TK2001          Status : CONFIRMED

Movie      : Avengers Endgame (English)
Theatre    : PVR Cinemas, Noida
Show       : 14-Jul-2026 | 06:00 PM - 09:01 PM
Seats      : G3, G4
Payment    : UPI | ₹700 | SUCCESS

==========================================================================================
```

---

# 🛠️ Technologies Used

- Java
- OOP
- Collections Framework
- Factory Design Pattern
- Singleton Pattern


---

# ⭐ Future Improvements

- Login Authentication
- Movie Search
- Multiple Screens per Theatre
- Seat Locking
- Cancellation & Refund
- Database Integration
- GUI (JavaFX/Swing)
- Spring Boot REST APIs

---

# 👨‍💻 Author

**Gaurav Mittal**

- 💼 Java Developer
- 🚀 Passionate about System Design & Backend Development

---

<h3 align="center">
⭐ If you found this project useful, don't forget to Star the repository!
</h3>
