def hello():
    print("Today, we focus on python.")

def say_hello(name):
    print(f"Hello {name}")

def square(number):
    print(number*number)

def hello_student(name, age):
    year = 2025 -age
    print(f'Hello, {name} born in year {year}.')


hello_student( age = 20, name ='Jane')

def country_name(name = 'Ethiopia'):
    print(f'Hi, my name is Arsema. I am from {name}')
    
def hello_everyone(*students):
    for student in students:
        print(f'Hello, {student}')


def welcome_student(**kwarys):
    name = kwarys.get('name', 'stranger')
    age = kwarys.get('age', 'undefined')
    country = kwarys.get('country', 'undefined')
    print(f'Hello{ name}, from {country}, your age is {age}')

def starts(*args, **kwargs):
    print(args)
    print(kwargs)