# 🌟 GitHub Activity Tracker

A **Java-based** application that fetches and summarizes GitHub user activity from the **GitHub Events API**.  
It helps visualize user actions like pull requests, issues, releases, and comments — all in a (near) human-readable format.

---

## 🚀 Features

- 📦 Fetch events via GitHub API or from a local JSON file  
- 🧠 Parses multiple event types (PRs, Issues, Comments, Releases, etc.)  
- 🧩 Modular, extensible architecture using the Strategy pattern  
- 🧾 Generates clear, readable summaries for each event  

---

## 🧮 Example Output

octocat opened pull request #42 at 2025-10-17T08:30:00Z

commenter created a comment on issue #12: "I'll fix this!"

developer published release "v2.3" at 2025-10-17T09:10:00Z

---

## ⚙️ How It Works

1. The user enters a GitHub username or runs the program in **local mode** with an example JSON file.  
2. The app fetches or reads event data using the **GitHub Events API**.  
3. Each event is deserialized based on its type and passed into a strategy that generates a **readable summary**.  
4. The output is printed in the console with relevant details such as action, time, and affected repository.

---

## 🧰 Setup & Run

### Prerequisites
- Java 8+  
- Internet access (for API mode)

### Run the App
Clone the repository
git clone https://github.com/hackhud/Github-Activity.git

Navigate to project directory
cd github-activity-tracker

Compile & run
javac -d out src/ua/hackhud/githubactivity/*.java
java -cp out ua.hackhud.githubactivity.Main

Optionally, open the project in IntelliJ IDEA or VS Code and run `Main.java` directly.

---

## ⚡ Configuration

Switch between API and local example mode by editing the constant:
private static final boolean USE_LOCAL_EXAMPLE_JSON = true;

When true, the app will read from `example_api_input.json`.

---

## 🧩 Technologies Used

- **Java**
- **Gson** for clean JSON deserialization  
- **Strategy Pattern** for modularity  
- **GitHub REST API**

---

## 🔗 Project Info
This project is part of the [Backend Developer Roadmap](https://roadmap.sh/projects/github-user-activity).
