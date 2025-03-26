README - Dictionary Data Structure
Overview
This project implements a dictionary data structure that efficiently stores words from list.txt and allows optimized word searches. It also provides suggested words for misspellings using TreeSet, which maintains a sorted order of words and allows fast lookup.

Data Structure Choice - TreeSet vs. HashSet
TreeSet is chosen because:

Automatic sorting: Enables efficient prefix-based searches and suggestions.

Logarithmic time complexity (O(log N)) for insertions and lookups.

Ceiling & Floor functions help in misspelled word suggestions.

HashSet was avoided because:

It offers O(1) lookup, but unordered storage makes word suggestions inefficient.

No built-in support for finding nearest words.

Implementation Details
Dictionary Construction

Reads words from list.txt and stores them in a TreeSet.

Optimized Search

Direct lookup for exact words (O(log N)).

If no match, suggests words using TreeSet ceiling/floor methods (O(log N)).

Edge Cases Handled
✔ Case sensitivity (Hello vs. hello).
✔ Special characters (co-op, word!).
✔ Non-existent words (xyzabc).

Time & Space Complexity
Insertion & Search: O(log N), better for sorted searches.

Space Complexity: O(N), as only distinct words are stored.

How to Run?
Ensure Java 8+ is installed.

Compile and run the program:

bash
Copy
Edit
javac DictionarySearch.java
java DictionarySearch
Enter a word to search. The program returns:

The exact word if found.

Suggested words if a typo is detected.