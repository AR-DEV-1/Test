#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

// Monster class
class Monster {
public:
    string name;
    int health;

    // Constructor
    Monster(string n, int h) {
        name = n;
        health = h;
    }

    // Attack method
    void attack() {
        cout << name << " attacks and deals 10 damage!" << endl;
    }
};

int main() {
    srand(time(NULL));

    // Create some monsters
    Monster monster1("Goblin", 50);
    Monster monster2("Orc", 100);

    // Monster attack randomly
    int random = rand() % 2;
    if (random == 0) {
        monster1.attack();
    } else {
        monster2.attack();
    }

    return 0;
}
