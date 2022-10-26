#include <iostream>
#include <string>

using namespace std;

enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal
{
public:
    Animal() : _name("unknown")
    {
        cout << "constructing Animal object " << _name << endl;
    }
    Animal(string n, COLOR c) : _name(n), _color(c)
    {
        cout << "constructing Animal object " << _name << _color << endl;
    }
    virtual ~Animal()
    {
        cout << "destructing Animal object " << _name << endl;
    }
    virtual void speak() const
    {
        cout << "Animal speaks " << endl;
    }
    virtual void move() = 0;

private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
public:
    Mammal(string n, COLOR c) : Animal(n, c) {}
    ~Mammal()
    {
        cout << "destructing Mammal object " << endl;
    }
    virtual void
    eat() const
    {
        cout << "Mammal eat " << endl;
    }
    virtual void move()
    {
        cout << "Mammal moves " << endl;
    }
};
