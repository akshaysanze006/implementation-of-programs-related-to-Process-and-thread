import java.util.Random; 
class even implements Runnable 
{ 
int n; 
even(int no) 
{ 
n=no; 
} 
public void run() 
{ 
System.out.println(&quot;The even number is &quot;+n+&quot; and its square is 
&quot;+(n*n)); 
} 
} 
class odd implements Runnable 
{ 
int n; 
odd(int no) 
{ 
n=no; 
} 
public void run() 
{ 
System.out.println(&quot;The odd number is &quot;+n+&quot; and its cube 
is&quot;+n*n*n); 
} 
} 
class number implements Runnable 
{ 
public void run() 
{ 
Random r=new Random(); 
try 
{ 
for(int i=0;i&lt;5;i++) 
{ 
int n=r.nextInt(100); 
System.out.println(&quot; &quot;+n); 
if(n%2==0) //even no
15 

{ 
Thread ev=new Thread(new even(n)); ev.start(); 
} 
else //odd no 
{ 
Thread od=new Thread(new odd(n)); od.start(); 
} 
Thread.sleep(1000); 
} 
} 
catch(InterruptedException e) 
{ 
System.out.println(&quot;error!!&quot;+e); }}} 
public class expt2threads 
{ 
public static void main(String args[]) { 
Thread thr=new Thread(new number()); thr.start(); 
}} 
