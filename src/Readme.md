# CPU Scheduling Algorithms in Java

This project implements **CPU Scheduling Algorithms** in Java. It includes the following scheduling algorithms:

1. **First Come First Serve (FCFS)**
2. **Round Robin (RR)**
3. **Shortest Remaining Time First (SRTF)**
4. **Highest Response Ratio Next (HRRN)**

---

## 🚀 Features

- Simulates different CPU scheduling algorithms.
- Provides metrics for each process:
  - Completion Time (CT)
  - Waiting Time (WT)
  - Turnaround Time (TAT)
- Includes a command-line interface (CLI) for user interaction.

---

## 🛠️ How to Run

### Prerequisites
1. **Java**: Ensure JDK 11 or higher is installed.
2. **Git**: To clone the repository.

### Steps
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/cpu-scheduling-algorithms.git
   cd cpu-scheduling-algorithms

# 📋 Example Output
INPUT
Enter the number of processes: 3
Process 1 Name: P1
Arrival Time: 0
Burst Time: 5
Priority: 1
Process 2 Name: P2
Arrival Time: 1
Burst Time: 3
Priority: 2
Process 3 Name: P3
Arrival Time: 2
Burst Time: 8
Priority: 3

Select a Scheduling Algorithm:
1. First Come First Serve (FCFS)
2. Round Robin (RR)
3. Shortest Remaining Time First (SRTF)
4. Highest Response Ratio Next (HRRN)
Enter your choice: 1

Output (FCFS):
Process    AT    BT    CT    TAT    WT
P1         0     5     5     5     0
P2         1     3     8     7     4
P3         2     8     16    14    6

# PROJECT STRUCTURE
cpu-scheduling-algorithms/
├── src/                     # Source code files
│   ├── Process.java         # Represents a process
│   ├── FCFS.java            # First Come First Serve scheduling
│   ├── RoundRobin.java      # Round Robin scheduling
│   ├── SRTF.java            # Shortest Remaining Time First scheduling
│   ├── HRRN.java            # Highest Response Ratio Next scheduling
│   ├── Utils.java           # Helper methods for calculations
│   └── CPU_Scheduler.java   # Main application to run scheduling algorithms
├── README.md                # Documentation
├── LICENSE.md               # License information
└── .gitignore               # Files to ignore in Git

# 📜 License

---

### **Step 3: Add a License**

Add a **LICENSE.md** file (e.g., MIT License):

```markdown
MIT License

Copyright (c) 2025 Your Name

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
