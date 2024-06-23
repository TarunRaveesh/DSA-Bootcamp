# Arrays

## Sorting and Searching

- `Arrays.sort(array)`: Sorts the array in ascending order.
- `Arrays.binarySearch(array, key)`: Searches the array for the specified key using the binary search algorithm.

## Filling and Copying

- `Arrays.fill(array, value)`: Assigns the specified value to each element in the array.
- `Arrays.copyOf(array, length)`: Copies the specified array, truncating or padding with zeros (if necessary) to obtain the specified length.

## Equality and Comparison

- `Arrays.equals(array1, array2)`: Returns true if the two specified arrays of objects are equal to one another.
- `Arrays.mismatch(array1, array2)`: Returns the index of the first mismatch between two arrays, or -1 if there is no mismatch.

## Conversion and Operations

- `Arrays.asList(array)`: Converts an array to a List.
- `Arrays.stream(array)`: Returns a sequential IntStream with the specified array as its source.

## Parallel Operations

- `Arrays.parallelSort(array)`: Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.
- `Arrays.parallelPrefix(array, op)`: Cumulates, in parallel, each element of the given array in place, using the supplied function.

## Miscellaneous

- `Arrays.deepToString(array)`: Returns a string representation of the "deep contents" of the specified array.
- `Arrays.setAll(array, generator)`: Sets all elements of the specified array using the provided generator function.

# Strings

## Basic Operations

- `str.length()`: Returns the length of the string.
- `str.charAt(index)`: Returns the character at the specified index.
- `str.substring(beginIndex, endIndex)`: Returns a new string that is a substring of this string.

## Search and Manipulation

- `str.indexOf(str2)`: Returns the index within this string of the first occurrence of the specified substring.
- `str.replace(oldChar, newChar)`: Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.

## Case Conversion and Checking

- `str.toLowerCase() / str.toUpperCase()`: Returns a string that is all lowercase or all uppercase, respectively.
- `str.startsWith(prefix) / str.endsWith(suffix)`: Checks if the string starts or ends with the specified prefix or suffix.

## Whitespace Handling

- `str.trim()`: Returns a copy of the string, with leading and trailing whitespace omitted.
- `str.strip()`: Returns a string whose value is this string, with all leading and trailing whitespace removed.
- `str.isBlank()`: Returns true if the string is empty or contains only whitespace characters.

## Splitting and Joining

- `str.split(regex)`: Splits the string around matches of the given regular expression.
- `str.join(delimiter, elements)`: Returns a new string that is a concatenation of the elements in the specified iterable, with the specified delimiter between each element.

## Miscellaneous

- `str.contains(str2)`: Returns true if and only if this string contains the specified sequence of char values.
- `str.lines()`: Returns a stream of lines extracted from this string, separated by line terminators.
