# implementation-of-programs-related-to-Process-and-thread

To implement a multi-thread application that has three threads. First thread generates random  integer every 1 second and if the value is even, second thread computes the square of the number  and prints. If the value is odd, the third thread will print the value of cube of the number. Thread: It is a lightweight sub process, a smallest unit of processing. It is a separate path of  execution. 
Multithreading: Executing several task simultaneously where each and every task is a separate  and independent part of a same program. 
The java run-time system depends on the threads for many things, and all the class libraries are  designed with multithreading in mind. In fact, java uses threads to enable the entire environment  to be asynchronous. This helps reduce inefficiency by preventing the waste of CPU cycles. The benefits of java’s multithreading are that the main loop/polling mechanism is eliminated.one  thread can pause without stopping other parts of your program. When a thread blocks in java  program, only the single thread that is blocked pauses. All other threads continue to run. util: It is a package which contains the collections framework, legacy collection classes, event  model, threading , date and time facilities, internationalization, and miscellaneous utility classes  (a string tokenizer, a random-number generator, and a bit array). 

Algorithm 
Step 1: Create a thread class by implementing the Runnable interface for generating a random  number. 
Step 2: Start the thread Even or Odd depending on the generated number in constructor. Step 3: Implement the respective run() method for the threads i.e. generating square of the number  if number is even or generating odd of the number if number is odd for every one second.

