# Institute of Technology of Cambodia  
## Department of Information and Communication Engineering  

**Name:** HONG Dyhengmesa  
**ID:** e20220997  

---

## 1. Introduction

Inter-Process Communication (IPC) is a mechanism that allows processes to exchange data and synchronize their actions.  
One common IPC mechanism in Unix/Linux systems is the **Message Queue**.

A message queue allows processes to send and receive messages in a structured and safe manner without sharing memory directly.

This activity demonstrates communication between two processes using a **System V Message Queue**.

---

## 2. Objective

The objectives of this activity are:

- To understand Inter-Process Communication (IPC)
- To use Message Queue for data communication
- To implement sender and receiver processes
- To observe message passing between processes

---

## 3. IPC Mechanism Used

### Message Queue

A message queue allows messages to be sent and received asynchronously.  
Each message has:
- A message type
- Message data

Processes do not need to run at the same time to communicate.

---

## 4. Files Description

The activity consists of the following files:

- `common.h` – Contains shared definitions and message structure
- `sender.c` – Sends a message to the message queue
- `receiver.c` – Receives a message from the message queue

---

## 5. Program Description

### 5.1 Sender Program (`sender.c`)

The sender program performs the following steps:

1. Creates or accesses a message queue
2. Prepares a message
3. Sends the message to the queue
4. Terminates after sending

### 5.2 Receiver Program (`receiver.c`)

The receiver program performs the following steps:

1. Connects to the same message queue
2. Waits for a message
3. Receives and displays the message
4. Terminates after receiving

---

## 6. Compilation and Execution

### 6.1 Compile the Programs

```bash
gcc sender.c -o sender
gcc receiver.c -o receiver
