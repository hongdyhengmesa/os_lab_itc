# Institute of Technology of Cambodia  
## Department of Information and Communication Engineering  

**Name:** HONG Dyhengmesa  
**ID:** e20220997  

---

## 1. Introduction

In operating systems, **system calls** provide an interface between user programs and the operating system kernel.  
They allow programs to request services such as file handling, process control, and memory management.

This activity focuses on using **Linux system calls** to copy the contents of one file to another without using high-level library functions.

---

## 2. Objective

The objectives of this activity are:

- To understand basic Linux system calls
- To implement file copying using system calls
- To practice low-level file operations in C
- To observe the result of system call execution

---

## 3. System Calls Used

The following system calls were used in this activity:

- `open()` – Open a file
- `read()` – Read data from a file
- `write()` – Write data to a file
- `close()` – Close a file

These system calls allow direct interaction with the operating system kernel.

---

## 4. Program Description

The program `copyfilesyscall.c` performs the following steps:

1. Open the source file (`result.txt`) in read mode
2. Create or open the destination file (`copyresult.txt`) in write mode
3. Read data from the source file using `read()`
4. Write data to the destination file using `write()`
5. Close both files after copying is complete

---

## 5. Compilation and Execution

### 5.1 Compile the Program

```bash
gcc copyfilesyscall.c -o copyfilesyscall
