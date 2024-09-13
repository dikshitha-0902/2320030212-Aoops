package week9;
	public class DivisiblePrinter {
	    private int currentNumber = 1;
	    private static final int MAX_NUMBER = 15;

	    // synchronized method for printing divisible by 2
	    public synchronized void printTwo() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 2 == 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
	                System.out.println("Divisible by 2: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

	    // synchronized method for printing divisible by 3
	    public synchronized void printThree() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 3 == 0 && currentNumber % 2 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
	                System.out.println("Divisible by 3: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

	    // synchronized method for printing divisible by 4
	    public synchronized void printFour() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 4 == 0 && currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 5 != 0) {
	                System.out.println("Divisible by 4: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

	    // synchronized method for printing divisible by 5
	    public synchronized void printFive() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 5 == 0 && currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0) {
	                System.out.println("Divisible by 5: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

	    // synchronized method for printing the number when no condition is met
	    public synchronized void printNumber() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
	                System.out.println("Number: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        DivisiblePrinter printer = new DivisiblePrinter();

	        Thread t1 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                printer.printTwo();
	            }
	        });

	        Thread t2 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                printer.printThree();
	            }
	        });

	        Thread t3 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                printer.printFour();
	            }
	        });

	        Thread t4 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                printer.printFive();
	            }
	        });

	        Thread t5 = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                printer.printNumber();
	            }
	        });

	        // Start all threads
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();
	        t5.start();

	        // Wait for all threads to complete
	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	            t5.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

