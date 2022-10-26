#include <iostream>
#include <string>

#include "childAnimal.h"

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