# ZipCodeFilter
BACKGROUND

Sometimes items cannot be shipped to certain zip codes, and the rules for these restrictions are stored as a series of ranges of 5 digit codes. For example if the ranges are:

 

[94133,94133] [94200,94299] [94600,94699]

 

Then the item can be shipped to zip code 94199, 94300, and 65532, but cannot be shipped to 94133, 94650, 94230, 94600, or 94299.

 

Any item might be restricted based on multiple sets of these ranges obtained from multiple sources.

 

PROBLEM

Given a collection of 5-digit ZIP code ranges (each range includes both their upper and lower bounds), provide an algorithm that produces the minimum number of ranges required to represent the same restrictions as the input.

 

NOTES

- The ranges above are just examples, your implementation should work for any set of arbitrary ranges

- Ranges may be provided in arbitrary order

- Ranges may or may not overlap

- Your solution will be evaluated on the correctness and the approach taken, and adherence to coding standards and best practices

 

EXAMPLES:

If the input = [94133,94133] [94200,94299] [94600,94699]

Then the output should be = [94133,94133] [94200,94299] [94600,94699]

 

If the input = [94133,94133] [94200,94299] [94226,94399]

Then the output should be = [94133,94133] [94200,94399]

 

Thank you for taking the time to show us your best work. We look forward to receiving your submission. 

 

ASSUMPTIONS:

Input is sent with hardcoded values however, any type of input file with a comma separator would work for this code.
Zip Codes can be in any range format (First one smaller and second one bigger or vice versa).
Zip Codes can be in any order. Duplicate ranges are a possibility.
Zip Code 99999 is considered as the biggest possible input and 00000 is considered as the smallest possible input. Any zipcode bigger than this zip code are not considered in input for processing as well as any smaller number then the smallest possible input will be discarded too.


Execution Process
In ZipCodeIntervals.java file Stack is used to validate ZipCodes, Stack is best option as it automatically cleans up objects as it controls how memory is allocated and deallocated.
Execute the "ZipCodeIntervalsTest.java" as a JUnit test case.
