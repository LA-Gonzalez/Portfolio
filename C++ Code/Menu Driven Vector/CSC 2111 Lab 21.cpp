//============================================================================
// Name        : CSC.cpp
// Author      : Luis Gonzalez
// Version     :
// Copyright   : 2018
// Description : Menu driven Vector class
//============================================================================

#include <iostream>
using namespace std;
#include <vector>

/*function prototypes*/
void showMenu();
void add(vector<int> &num);
void remove(vector<int> &num);
void show(vector<int> &num);


int main() {
	vector<int> int_vec;
	int input;
	while (true) {
		showMenu();
		cin >> input;
		switch (input) {
		case 1: add(int_vec);
			break;
		case 2: remove(int_vec);
			break;
		case 3: show(int_vec);
			break;
		case 4: return 0;
			break;
		default:  cout << endl;
		}
		cout << endl << endl;
	}
	return 0;
}

void showMenu() {
	cout << "1. Add a number.\n";
	cout << "2. Remove a number.\n";
	cout << "3. Show the numbers.\n";
	cout << "4. Quit.\n";
	cout << "Please enter a choice: ";
}

/*complete the following functions: */

void add(vector<int> &num) {

	/*prompt the user to enter a number
	and add the number to the vector.*/
	int insert;
	cout<<"Please enter a number: ";
	cin>>insert;
	num.push_back(insert);

}

void remove(vector<int> &num) {
	int key;
	vector<int>::iterator i;
	cout << "Please enter the number: ";
	cin >> key;
	for (i = num.begin(); i != num.end(); i++) {
		if (*i == key) {
			num.erase(i);
			cout << "The number has been removed.\n";
			return;
		}
	}
	cout << "The number was not found.\n";

	/*prompt the user to enter a number
	to remove.  then remove that number
	from the vector.*/

	/*HINT: you need to use the iterator
	vector<int>::iterator i to iterate through
	your vector using a for loop.  if the item
	in your vector at that index is equal to the
	key, then erase the item and print a message
	stating that the item has been removed.*/

}

void show(vector<int> &num) {

	/*print the contents of the vector.
	remember to check if the vector is
	empty first.*/
	vector<int>::iterator i;
	if(num.empty())
	{
		cout<<"Vector is empty"<<endl;
	}
	else
	{
		for(i= num.begin(); i!= num.end(); ++i)
		{
			cout<<*i<<" ";
		}
	}



	/*HINT: you need to use the iterator
	vector<int>::iterator i to loop
	through your vector and print its
	contents*/

}
