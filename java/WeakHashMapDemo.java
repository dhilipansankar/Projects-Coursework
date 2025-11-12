import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<MyKey, String> map = new WeakHashMap<>();

        MyKey key1 = new MyKey("Key1");
        map.put(key1, "Value1");

        System.out.println("Map before GC: " + map); // {Key1=Value1}

        key1 = null; // Remove the strong reference to key1

        System.gc(); // Request garbage collection (not guaranteed to run immediately)
        Thread.sleep(100); // Give GC a moment to potentially run

        System.out.println("Map after GC: " + map); // {} (or potentially still {Key1=Value1} if GC hasn't run yet)
    }

    static class MyKey {
        String name;

        MyKey(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            MyKey myKey = (MyKey) obj;
            return name.equals(myKey.name);
        }
    }
}