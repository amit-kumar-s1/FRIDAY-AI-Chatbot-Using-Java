<<<<<<< HEAD
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
=======
# 🤖 FRIDAY - AI Chatbot (Java Swing Desktop Application)

FRIDAY is a smart AI-based desktop chatbot built using **Java Swing** with a modern UI powered by **FlatLaf**. It includes real-time API integrations like Weather and Location services and a rule-based response engine that simulates intelligent assistant behavior.

---

## ✨ Features

- 💬 Rule-based chatbot engine (custom responses)
- 🌦️ Real-time Weather updates using Weather API
- 📍 Live Location detection using IP-based Location API
- 🎨 Modern UI using FlatLaf Look & Feel
- 🖼️ SVG logo support for high-quality visuals
- ⚡ Fast and lightweight Java desktop application
- 🧠 Smart command parsing system
- 🧩 Modular code structure for easy updates

---

## 📸 Screenshots

### 🏠 Main Interface
![Main UI](screenshots/main-UI.png)

### 🌦️ Weather Feature
![Weather Feature](screenshots/wea.png)

### 📍 Location Feature
![Location Feature](screenshots/location.png)

### 💬 Chat / Rule-Based Responses
![Chat Feature](screenshots/chat.png)

---

## 🛠️ Tech Stack

- Java (Core Programming)
- Java Swing (GUI Development)
- FlatLaf (Modern Look & Feel)
- REST APIs (Weather & Location)
- org.json (JSON Parsing)

---

## 📁 Project Structure

```
AI-Chatbot/
│
├── src/
│ ├── App.java
│ ├── FRIDAYWeather.java
│ ├── FRIDAYLocation.java
│ ├── fridayInAction.java
│ ├── calculation.java
│ ├── CalculatorFriday.java
│ ├── helpFriday.java
│ ├── HoverMouseEffect.java
│ ├── newChatFriday.java
│ ├── ResizeImageQuality.java
│ ├── settingFriday.java
│ └── Resources/
│ ├── FRIDAY_logo.svg
│ ├── Delete.png
│ ├── Help.png
│ ├── history.png
│ ├── Logo.png
│ ├── Logo2.png
│ ├── theme.png
│
├── lib/
├── screenshots/
│ ├── main-ui.png
│ ├── weather.png
│ ├── location.png
│ └── chat.png
│
└── README.md
```

---

## 🚀 How to Run

### 🔹 Requirements

- Java JDK 8 or higher
- Any IDE (IntelliJ IDEA / Eclipse / VS Code)
- Internet connection (for APIs)

---

## 🔹 Steps
 
1. Clone the repository:
```bash
git clone https://github.com/amit-kumar-s1/FRIDAY-Ai-Chatbot-Using-Java.git
```

2. Open the project in your IDE
Add required libraries inside lib/ folder:
- FlatLaf
- JSON library

3. Compile the project:
```bash
javac -cp ".;lib/*" src/*.java
```

4. Run the application:
```bash
java -cp ".;lib/*;src" App
```

---

## 🔑 API Setup

### 🌦️ Weather API

Get your API key from:
```bash
https://openweathermap.org/
```
- Replace the API key inside:
```bash
FRIDAYWeather.java
```

### 📍 Location API
- Uses Ip-info API key from:
```bash
https://ipinfo.io/
```
- Replace the API key inside:
```bash
FRIDAYLocation.java
```

---

## 💡 Future Improvements

- 🎤 Voice input/output assistant
- 🧠 AI/ML-based intelligent responses
- 💾 Chat history storage system
- 🌐 Web version using Spring Boot
- 🌙 Dark/Light theme toggle

---

## 👨‍💻 Author

### Amit Kumar
Java Developer | AI & Desktop Application Enthusiast 🚀

---

## ⭐ Support

If you like this project:

- ⭐ Star the repository
- 🍴 Fork it
- 🔧 Improve it
- 📢 Share it
>>>>>>> 02a80bfb6de5d976af12bcbd825d03604e0d82ce
