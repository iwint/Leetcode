def length_of_last_word(s: str) -> int:
    stripped_string = s.strip()
    count = 0

    for char in reversed(stripped_string):
        if char == ' ':
            return count
        count += 1

    return count

print(length_of_last_word("Hello World"))