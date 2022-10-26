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

int main()
{
    // Animal a("AnimalName", White);
    // a.speak();

    // Mammal b("MammalName", Green);
    // b.speak();
    // Dog c("DoggyName", Blue, "OwnerName");
    // c.speak();
    // c.move();

    // Animal *animalPtr = new Dog("Lassie", White, "Andy");
    // animalPtr->speak();
    // animalPtr->move();
    // delete animalPtr;

    // Dog dogi("Lassie", White, "Andy");
    // Mammal *aniPtr = &dogi;
    // Mammal &aniRef = dogi;
    // Mammal aniVal = dogi;
    // aniPtr->speak();
    // aniRef.speak();
    // aniVal.speak();

    bool cycle = true;
    Mammal **aniArray = new Mammal *[10];
    int selection;
    int count = 0;

    while (cycle && count < 10)
    {
        cout << "Select the animal to send to Zoo : \n";
        cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit \n";
        cin >> selection;
        switch (selection)
        {
        case 1:
            aniArray[count++] = new Dog("Dog", White, "Owner");
            // count++;
            break;
        case 2:
            aniArray[count++] = new Cat("Cat", White);
            // count++;
            break;
        case 3:
            aniArray[count++] = new Lion("Lion", White);
            // count++;
            break;
        case 4:
            for (int i = 0; i < count; i++)
            {
                (aniArray[i])->move();
                (aniArray[i])->speak();
                (aniArray[i])->eat();
            }
            break;
        case 5:
            cycle = false;
            break;
        }
    }

    for (int i = 0; i < count; i++)
    {
        delete aniArray[i];
    }

    cout
        << "Program exiting .... " << endl;
    return 0;
}