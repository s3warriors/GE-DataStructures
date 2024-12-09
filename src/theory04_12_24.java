
/*
---

### **Collections in Java**
**What are Collections and Why are They Used?**
- **Collection Framework**: A function suite providing pre-built methods and algorithms designed as industry standards to solve specific use cases efficiently.
- Java was originally not fully object-oriented, and many functionalities didn’t come built-in.
- To use advanced data structures (DS), developers had to write repetitive code for each individual DS, which was inefficient.
- **Solution**: The **Collection Framework** was introduced to provide generalized data structures with common features like traversal and storage of similar data.

---

### **Iterator in Collections**
- **Iterator**: A feature in the collection framework that allows traversal of all elements of a collection without knowing the underlying data structure.
  - **In ArrayList**: The iterator will continue until it reaches the last element.
  - **In Stack**: The iterator will continue until the stack is empty (top = -1).

- **Note**:
  - The **Iterator** interface must be implemented by all collections that can be iterated.
  - **All collections** must have an iterator function to support traversal.

---

### **Types of Collection Interfaces**
1. **List**:
   - A **List** maintains ordered elements, meaning elements are stored in a specific sequence.
   - Example: `ArrayList`, `LinkedList`.

2. **Set**:
   - A **Set** is an unordered collection that does not allow duplicate values.
   - Elements are stored based on their hash values.
   - Example: `HashSet`, `TreeSet`.
   - **Hashing in Set**:
     - `find(100)` calls the hashing function, and stores/retrieves data based on hash values.
     - **Example**:
       - `100 -> 9 -> arr[9]`
       - `find(100)` returns the value at index 9 (calculated using the hash value of 100).
     - If two objects have identical data but are different references, they will be treated as distinct unless `hashCode()` and `equals()` methods are overridden in the object.

3. **Queue**:
   - A **Queue** follows a **FIFO (First In First Out)** order for processing elements.
   - Example: `LinkedList`, `PriorityQueue`.

4. **Map** (Why is it not part of the Collection interface?):
   - A **Map** is based on two generics: **Key** and **Value**.
   - Since maps involve combined data types (key and value), they cannot be considered homogenous (like the other collections), and thus, are part of the **Map utility** rather than the collection interface.

---

### **Stream API in Java (Java 8 Feature)**
- **Stream**: A feature introduced in Java 8 to handle the fetching and manipulation of data without directly modifying the original data source.
  - It allows creating a temporary pipeline of data where you can manipulate data without affecting the original collection.
  - **Example**:
    - You have an array or set of customer data (50k customers), and you need to sort it based on the number of purchases a customer has made.
    - Instead of modifying the original data, you can create a stream of data, manipulate it (sort/filter), and then use the result without impacting the original dataset.
  - **Advantages**:
    - Stream operations are efficient and help avoid performance issues like data loss, conflicts, or overlapping when manipulating large datasets.
    - Stream pipelines do not modify the original data source; they work on a copy or stream of data.

---

### **Lambda Expressions and Functional Programming**
- **Lambdas**: Introduced in Java 8 to support functional programming paradigms, where functions are treated as first-class objects. This allows functions to be stored in variables or passed as parameters.
- **Functional Interface**: An interface with exactly one abstract method, enabling the use of lambda expressions.

---

### **Practical Example: Sales Application (Problem Scenario)**

- **Problem**: You have 50k customers, and you want a list of customers who have bought products 1, 2, 3, and 4.
  - You don’t need the keys (IDs) of customers, only the data to count the number of different customers.
  - **Solution**:
    - Use a **HashSet** for customer IDs to ensure uniqueness (removes duplicates automatically).
    - Create individual lists for each product purchase.
    - Combine these lists to create a final list of customers who bought any of the products.
    - This avoids using a `HashMap` (which is unnecessary in this case) and simplifies the operation.

- **Approach in an eCommerce Application**:
  - For each product (like products 1, 2, 3, and 4), maintain a list of customers who bought it.
  - Then, combine these lists to get the full set of customers who purchased any of the specified products.

---

### **General Advice for Applications**:
- **ArrayList** is suitable for maintaining individual lists of customers or sales.
- Use **Stream API** for data manipulation tasks to avoid unnecessary changes to the original data and enhance performance with large datasets.













/*
-collections: what it is and why it is used?
-framework: it's a function suite which provide pre built methods and algorithms whch are designed as industry standard and the whole pack generally solve a major usecase
-collections was developed to solve ds issues; since java was created . it was not completely object oriented and many functionalities did not ship with it
   - to use any advance ds we have to write repeatative code for each ds individually which was not ideal.
   - sol: make something which have a generalised meaning - common and required by every ds - selecting each elemeent individually and able to traverse the whole ds
         - Iterator:  it will continue iterating until the condition is false:
           Iterator in arrayList - until we reach the last element
           ........ in stack - until we have top =-1;
-Note:  Interface called iterator and all the collection must have an iterator function



Collection: which can be iterated for traversal, and it must have an ability to store similar data-Implement iterator and
 - collection interface -  and all the  collection which can iterate and can store data-
 - there are three types of collection interface:
    - List: Lists are the type of collection used for maintain an ordered elements - means one after another - generally goes for list interface
    - Set: It is an unordered List which stores element as in the hash value of the element, no duplicate values
         - 100 -> 9-> arr[9]
         - find(100) calls the hashing func -> 9 -> arr[9]-----> hash value of 100
         - now let's say 500 -> 9-> arr[9] - hash value of 100 -> hash value of 500
         - When another object is created using the new keyword, it creates a separate reference. So, when we store complex objects in a HashSet, it compares the hashCode() and equals() methods to check for uniqueness. If these methods are not overridden, the default behavior will compare object references, and objects with identical data but different references will be treated as distinct.
    - Queue: Queue is the priority based data algo which focuses on the fifo order
    - why map is not there: since map based on 2 generics i.e. key and values- it can't be considered homogenous
        - combined data set so it not a part of collection but map util
 Stream : it's a java 8 feature which was introduced to have fetching the data  without touching the source itself
         - we original data set
         - we have an array Customer data of 50k users - you want to sort the arrays / set on the basis of how many purchases every customer have:
           - why can't we use inbuilt methods: because it will take a lot of time and original data will be chnged now when we push the new order data set to the db -> it will take some amout of time to again set 50k data -> our services will be slow and sometimes conflict data loss and overlaps
         sol: instead of directly fetching data from object we create a stream pool of data where we can store the values of a ds temporarily and manipulate with the data and it wont affect the original ds
 Stream is a concept of pipelining data to create single use stream objects of the ds which can be manipulated on - since it occurs in stream , it doesn't affects the original ds
 Lambdas:  lets us go for a new paradigm- functional programming :- as  a programming approach im which fnc are treated as first class obejcts- function can be stored as variable
 Functional INTERFACE: it is an interface which only give 1 abstract method\






problem1 :
let say we have 50k customers and i want the list of the customer who bought product 1 2 3 4
  - we only need customer data not their key so that we can count no of diff customer
  - we can have out object hashing usig cust id and we dont have to use the hashmap
if we are making a product sale application - we must use array list for each and individual list then we combine multiple list to make a single list



Here’s a structured and refined version of your notes:


























 */
