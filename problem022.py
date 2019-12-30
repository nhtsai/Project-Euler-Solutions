"""
Project Euler Problem 22 - Names Scores:

Using problem022_names.txt, a 46K text file containing over
five-thousand first names, begin by sorting it into alphabetical order.
Then working out the alphabetical value for each name,
multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN,
which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
So, COLIN would obtain a score of 938 × 53 = 49714.
What is the total of all the name scores in the file?

Author: Nathan H Tsai
Since: 29 Dec 2019
"""

ASCII_OFFSET = 64
FILENAME = 'problem022_names.txt'

def calculate_score(name, name_list):
    """ Calculates the score of a name in a list of names.

    Returns the product of the index of the name in name_list and
    the sum of all the letters in name. Assumes name is all capitalized.

    Args:
        name: A name of which to find the score.
        name_list: A list of names.

    Returns:
        An integer score of the name calculated by multiplying the
        sum of the
    """
    score = 0
    letters = list(name)
    for letter in letters:
        score = score + (ord(letter) - ASCII_OFFSET)
    idx = name_list.index(name) + 1
    score = score * idx
    return score

def main():
    """ Reads the list of names specified by the filename and
        prints the total sum of the scores of all names in the list.

    Reads all names of file FILENAME and calculates the total of scores of
    all names by using calculate_score(), then prints total score.
    """

    file = open(FILENAME, 'r')                # open file
    name_list = file.read()                   # read file contents
    file.close()                              # close file
    name_list = name_list.replace('\"', '')   # replace all double quotes
    name_list = name_list.split(',')          # split into list
    name_list = sorted(name_list)             # sort list alphabetically

    total = 0
    for name in name_list:
        total = total + calculate_score(name, name_list)
    print('The total of all name scores in the file is:', str(total) + ".")

if __name__ == '__main__':
    main()
