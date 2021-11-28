public class Main {
    public static void main(String[] args) {

        //Thread Thema 1 ----- Die Basics
        //In der Klasse Thread1.java siehst du eine Klasse, die von der Klasse Thread erbt.
        //Durch die Methode Runnable können wir sagen, was der Thread machen soll.
        //In diesem Beispiel lassen wir von 0 bis 9 zählen.
        Thread1 thread1 = new Thread1();
        thread1.start();

        //Thread Thema 2 ----- Interrupt

        //Thread Thema 3 ----- Lock und Unlock

        //Thread Thema 4 ----- Threadpool

        //Thread Thema 5 ----- Signal and await


    }
}
