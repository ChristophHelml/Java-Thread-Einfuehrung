public class Thread1 extends Thread {

    public void exampleMethod() {
        System.out.println("I am an example method!");
    }

    @Override
    public void run() {

        //Hier siehst du was man alles mit einer Klasse, die von Thread erbt, machen kann.
        //Hier lassen wir eine for Schleife durchrennen.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //Man kann aber auch Methoden aufrufen.
        exampleMethod();
    }
}