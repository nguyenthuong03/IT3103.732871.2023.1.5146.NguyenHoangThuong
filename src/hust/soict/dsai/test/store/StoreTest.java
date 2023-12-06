package hust.soict.dsai.test.store;

//Nguyen Hoang Thuong 20215146
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

//Nguyen Hoang Thuong 20215146
public class StoreTest {
        public static void main(String[] args) {
                Store Store = new Store();
                DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                                "Animation", "Roger Allers", 87, 19.95f);
                DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                                "Science Fiction", "Geogre Lucas", 87, 24.95f);
                DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                                "Animation", 18.99f);

                // To-do: Test the add & remove method here
                Store.addDVD(dvd1, dvd2, dvd3);
                Store.print();

                Store.removeMedia(dvd2);
                Store.print();
        }
}
