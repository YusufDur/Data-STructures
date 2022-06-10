package Queue1;

/**
 *
 * @author fsmblm0
 */
public class Main {
    
    public static void main(String[] args) {
        Queue<Personel>  yemekKuyrugu = new Queue();
        Personel p1 = new Personel("A");
        Personel p2 = new Personel("B");
        Personel p3 = new Personel("C");
        Personel p4 = new Personel("D");
        Personel p5 = new Personel("E");
        
        yemekKuyrugu.enqueue(p2);
        yemekKuyrugu.enqueue(p5);
        yemekKuyrugu.enqueue(p1);
        yemekKuyrugu.enqueue(p3);

        
        yemekKuyrugu.print();
        
        
        
//        //  QueueArray  a = new QueueArray<>(5);
//        a.enqueue(3);
//        a.enqueue(2);
//        
//        a.print();
        
    }
}