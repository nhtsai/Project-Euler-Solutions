#!/usr/bin/env python
"""Project Euler Problem 33 - Digit Cancelling Fractions

The fraction 49/98 is a curious fraction, 
as an inexperienced mathematician in attempting to 
simplify it may incorrectly believe that 49/98 = 4/8, which is correct, 
is obtained by cancelling the 9s.
We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
There are exactly four non-trivial examples of this type of fraction, 
less than one in value, and containing two digits in the numerator and denominator.
If the product of these four fractions is given in its lowest common terms, 
find the value of the denominator.
"""

__author__ = "Nathan Tsai"
__since__ = "12 Jun 2020"

from datetime import datetime # calculate runtime

def problem33():
    """ Iterative solution to Project Euler Problem 33
    """
    answers = list()
    for num in range(10, 100):
        for den in range(num + 1,100):
            num_ten, den_ten = num // 10, den // 10
            num_unit, den_unit = num % 10, den % 10
            # trivial case: num_unit == den_unit
            # impossible case: num_ten == den_ten?
            if num_unit == den_ten:
                if num * den_unit == den * num_ten and num_ten < den_unit:
                    answers.append(str(num) + "/" + str(den))
            elif num_ten == den_unit:
                if num * den_ten == den * num_unit and num_unit < den_ten:
                    answers.append(str(num) + "/" + str(den))
    return answers

def main():
    start = datetime.now()
    # ans = problem33()

    # one liner solution using list comprehension
    ans = [str(num) + "/" + str(den) for num in range(10,100) for den in range(num+1, 100) if (num%10 == den//10 and num*(den%10) == den * (num//10) and num//10 < den%10) or (num//10 == den%10 and num * (den//10) == den * (num%10) and num%10 < den//10)]
    runtime = datetime.now() - start
    print(ans)
    print("Runtime:", runtime)

if __name__ == "__main__":
    main()