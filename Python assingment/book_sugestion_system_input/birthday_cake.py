dictionary_one = {"a": 1, "b": 2, "c": 3, "d": 4}
dictionary_two = {"c": 5, "e": 6, "a": 4, "d": 2}

def merge_dictionary():

    result = 0;
    result = dictionary_one.copy();

    for key, value in dictionary_two.items():
        if key in result:
            result[key] += value

    print(result)
merge_dictionary()

words =["Cat", "Dog", "Elephant", "Bat", "Tiger"]
def list_dictionary():
    count = 0
    dictionary = {}
    for word in words:
        count += 1
        dictionary[count] = word
    print(dictionary)

list_dictionary()














