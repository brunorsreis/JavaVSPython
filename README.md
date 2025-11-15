# Java vs Python: Performance Benchmark

This repository contains a simple but effective performance comparison between **Java** and **Python**, inspired by a real job interview question:  
**“Which programming language is faster, Java or Python?”**

To answer this, two equivalent programs were written in Java and Python.  
Both perform the same computational task:

> Sum all integers from 0 to 50,000,000

Each program reports:
- Total execution time  
- CPU and memory information  
- System details such as OS, architecture, and core count  

---

## Results Summary

| Language | Execution Time | Relative Speed |
|----------|----------------|----------------|
| **Python (CPython 3.11)** | ~2.48 seconds | 1× |
| **Java (OpenJDK 25)**     | ~0.034 seconds | ~73× faster |

These results confirm long-standing academic findings:  
- **Java**, with its JIT-compiled JVM, delivers significantly higher raw execution speed.  
- **Python**, being interpreted and dynamically typed, is slower in compute-heavy loops.

---

## Files in This Repository

