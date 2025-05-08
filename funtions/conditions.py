def check_if_even(num):
    if num% 2 == 0:
        print(f'The number {num} is even.')

    else:
        print(f'The number {num} is odd.')

def check_divisibility(n):
    for num in range(1, n+1):
        if num % 2 == 0:
            print(f'The number {num} is divisible by 2.')
        elif num %3 == 0:
            print(f'The number {num} is divisible by 3')
        elif num %5 == 0:
            print(f'The number {num} is divisible by 5')
        else:
            print(f'The number{num} is not divisible by 2, 3 and 5.')
        
def count_down(start):
    while start>0:
        
        