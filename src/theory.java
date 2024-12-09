/*
### HashMap: A Data Structure for Storing Key-Value Pairs

A **HashMap** is a data structure that stores data in key-value pairs, offering efficient retrieval, insertion, and deletion operations. It is built on three core concepts:

        1. **Hashing Function**
        2. **Bucket Function**
        3. **Resize Mechanism (Load Factor)**

        ### 1. Hashing Function
The **hashing function** is responsible for converting the key into an index that determines where the value will be stored in the underlying array. The hashing function calculates a hash code for the key, and the result is used to identify an index in the array (which is referred to as a "bucket").

        ### 2. Bucket Function
In a HashMap, the array of buckets is used to store key-value pairs. Each element in the array corresponds to a "bucket" that stores one or more key-value pairs. The **bucket index** is determined by the hash value calculated for the key. If multiple keys hash to the same index (a **collision**), the key-value pairs are stored in a linked list at that bucket.

For example:
        - **Key-Value Pair:** `1 -> "hello"`
        - The hashing function computes the hash of key `1`, which results in an index, say `5`.
        - The value `"hello"` is stored in the bucket at index `5`.

        - **Collision Scenario:** `8 -> "hyllo"`
        - The hashing function computes the hash of key `8`, which also results in index `5`.
        - The new key-value pair is stored in the same bucket (index `5`), but it is added to a linked list at that index.

So, HashMaps store multiple key-value pairs in the same index if collisions occur, using a linked list or another collision resolution technique.

        ### 3. Resize Mechanism and Load Factor

A HashMap uses a **load factor** to determine when to resize its underlying array. The load factor represents the ratio of the number of elements to the number of available buckets. By default, the load factor is **0.75**. This means that when the number of elements in the HashMap exceeds 75% of the total number of buckets, the HashMap will resize itself by doubling the size of its underlying array.

        #### Example of ArrayList’s Resize Mechanism:
        - By default, an `ArrayList` in Java starts with an array size of **10**.
        - The **load factor** is **0.75** by default, so when the number of elements exceeds \( 0.75 \times 10 = 7 \), the `ArrayList` will resize to a new array of size **20** (double the original size).
        - This resizing process ensures that the data structure can accommodate new elements without running into performance issues due to constant reallocation.

In the case of a **HashMap**, when the load factor is exceeded:
        - A new array with double the original size is created.
        - All existing key-value pairs are rehashed and migrated to the new array.
- The old array is discarded.

### Conclusion: Key-Value Pairs and Hashing

In a HashMap, **keys** play a crucial role in the hashing process. The hash value of the key is used to determine the index in the underlying array, where the corresponding value is stored. Because the HashMap does not allow duplicate keys, each key must map to a unique index in the array, although collisions can occur, in which case the key-value pairs are stored in a linked list at that index.

For example:
        - For a key-value pair such as `HashMap<1, "hello"}`, the key `1` is hashed to an index (e.g., 5), and `"hello"` is stored at that index.
- If another key-value pair, say `HashMap<8, "hyllo"}`, hashes to the same index (5), then both `"hello"` and `"hyllo"` will be stored in the same bucket, but they will be linked in a chain (linked list) at that index.

This is how HashMaps efficiently store and manage key-value pairs, leveraging hashing and resizing mechanisms to maintain performance even with large datasets.



Class Notes

HashMaps:  data structure to store in key value pairs
HashMaps are weirdly structure linked list: where it have 3 core fundamentals:
    1 hashing func
    2 bucket func
    3 resize :
            Load factor : all the memory data structure uses something:
               -load factor- it triggers when we reach a certain amount of
               data in a given scenario ...
               -when it triggers it resizes the ds by creating a ds doubke
               the size of the original- migrate all the data to that ds and then
               self destroy the old ds.

            Load factor of ArrayList? by default arraysize is 10
            -we have created an arraylist: so we generally dont give any memory limit to the ds
            --How does it creates dynamically?
                -Load factor = 0.75, by default 0.75*10= 7, after this new array of size 20 will be created
                -so what happens when the array gets filled 75% it triggers the new array creation itself.
                -so a new array of size double of the old array will be created

    • hashMap also has a load factor of 0.75
       - but it is quite diff than the arrays
    Bucket and hashing:
    Hashing: it is a mathematical function which works a value to create index- of array of linked list - each element of the array used in hashmap is called a bucket - and each bucket have an index value which is based upon the calculations of the hashing of keys- if there is a conflict of keys pointing to same index it is stored as a linked list

    key-value: which one do you think have the hasing :
        -it works in the key that is the reason we cannot have same/duplicate key
        - hashmaps creates an array and it uses the keys hash value as the index for the
          next variable
          HashMap<1,hello>, 1-> hashing func and created a index = 5-> hello will be stored
               1 -> 5-> hello
        - what if <8,hyllo> - after hashing it creates the same index value
               8-> 5 -> hello


 */