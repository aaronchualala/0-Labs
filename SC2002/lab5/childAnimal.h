#include <iostream>
#include <string>
#include "animal.h"

class Dog : public Mammal
{
public:
    string _owner;
    Dog(string n, COLOR c, string o) : Mammal(n, c) {}
    ~Dog()
    {
        cout << "destructing Dog object " << endl;
    }
    void speak() const
    {
        cout << "Dog Woofs " << endl;
    }
    void move()
    {
        cout << "Dog moves " << endl;
    }
};

class Cat : public Mammal
{
public:
    Cat(string n, COLOR c) : Mammal(n, c) {}
    ~Cat()
    {
        cout << "destructing Cat object " << endl;
    }
    void speak() const
    {
        cout << "Cat meow " << endl;
    }
    void move()
    {
        cout << "Cat moves " << endl;
    }
};

class Lion : public Mammal
{
public:
    Lion(string n, COLOR c) : Mammal(n, c) {}
    ~Lion()
    {
        cout << "destructing Lion object " << endl;
    }
    void speak() const
    {
        cout << "Lion Roar " << endl;
    }
    void move()
    {
        cout << "Lion moves " << endl;
    }
};
