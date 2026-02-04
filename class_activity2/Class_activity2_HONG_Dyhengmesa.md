# Institute of Technology of Cambodia  
## Department of Information and Communication Engineering  

**Name:** HONG Dyhengmesa  
**ID:** e20220997  

---

## 1. Introduction

In operating systems, **process creation** is a fundamental concept.  
The `fork()` system call is used in Unix/Linux systems to create a **new process**, called the **child process**, from an existing process called the **parent process**.

This activity demonstrates how a parent process creates a child process and waits for it to finish execution.

---

## 2. Objective

The objectives of this activity are:

- To understand the use of the `fork()` system call
- To distinguish between parent and child processes
- To observe process execution order
- To use `wait()` for parent–child synchronization

---

## 3. System Calls Used

The following system calls are used in this program:

- `fork()` – Create a new process
- `wait()` – Make the parent wait for the child to finish
- `getpid()` – Get process ID
- `getppid()` – Get parent process ID

---

## 4. Program Description

The program `forkchild.c` performs the following steps:

1. The parent process calls `fork()`
2. A child process is created
3. The child process executes its code and terminates
4. The parent process waits for the child using `wait()`
5. After the child finishes, the parent continues execution

The program prints messages to clearly show parent and child behavior.

---

## 5. Compilation and Execution

### 5.1 Compile the Program

```bash
gcc -o forkchild forkchild.c
