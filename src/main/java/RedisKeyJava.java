import redis.clients.jedis.Jedis;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class RedisKeyJava {
    public static void main(String[] args) {

        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");

        //store data in set
        Set<String> set = jedis.keys("*");

        // Get the stored data and print it
        AtomicInteger i= new AtomicInteger();
        set.forEach(s -> System.out.println("Key " + (i.incrementAndGet()) + ": " + s));
    }
}