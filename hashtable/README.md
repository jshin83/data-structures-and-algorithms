# Hash Table

## Challenge
Using linear probing, hash table that stores by key and value.
If the hashed index is taken, the next open space is where an element is added.
Duplicate keys will update the value.
Attempting to add null key or value will throw error.

When storage capacity reaches or exceeds 75%, the table resizes and rehashes existing elements.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used linear probing -vs- linked list buckets.
I sacrificed more resizes for possibly longer search time. With buckets, worst time is O(N) for get / search,
and it could be true for linear if the only space was near the end.
While there may be more resizes, as the array doubles in capacity and resizes at 75%, I felt it would minimize
clustering over time. With either, we would looking at O(1) average find time.
Space is O(N) since when the array resizes, it always doubles in previous capacity.
I suppose one advantage of chaining would be to insert, if you had a pointer, you could always add to the end of the list,
resulting in O(1) add time vs iterating to find a null index.

## API
  + public void add(K key, V value)
  + public V get(K key)
  + public boolean contains(K key)
  + public void delete(K key)
  + public int getSize()
  + public void print()
