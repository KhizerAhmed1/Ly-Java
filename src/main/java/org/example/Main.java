package org.example;
public class Main {
        public static void main(String[] args) {
            try {
                printSmooth("");
                Thread.sleep(3000); // waits 2 seconds

                printSmooth("");
                Thread.sleep(3000); // waits 3 seconds

                printSmooth("");
                Thread.sleep(1000);

                printSmooth("");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private static void printSmooth(String text) throws InterruptedException {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(100); // delay between alphabets (adjust speed here)
            }
            System.out.println(); // new line after full message
        }
    }






