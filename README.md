# Daily Email Scheduler – Spring Boot + Quartz + JDBC

A Spring Boot project that sends **daily emails automatically** using **Quartz Scheduler** with **JDBC persistence**.  
Jobs are stored in the database, so they **survive application restarts** and are production-ready.

---

## Features
- Sends email automatically every day
- Quartz Scheduler for reliable scheduling
- JDBC JobStore → jobs persist even after restart
- Prevents overlapping job execution
- Production-ready configuration

---

## Tech Stack
- Spring Boot
- Quartz Scheduler
- JDBC
- MySQL (or any relational DB)
- Spring Mail

---

## Setup Instructions

### Create Database
```sql
CREATE DATABASE quartz_db;
