
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import redis.clients.jedis.*;
public class redis_connect {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("10.10.62.111",6381);
		
		Scanner sc = new Scanner(System.in);
		
		jedis.select(11);	

		String str = sc.next();
		
        Set<String> keys = jedis.keys(str);
           
        Iterator t1=keys.iterator() ;   
        while(t1.hasNext()){   
            String obj1=t1.next().toString();   
            System.out.println(obj1);   
            //jedis.del(obj1);
        }   
//		System.out.println(jedis.get("name"));
	}
	
}
	
