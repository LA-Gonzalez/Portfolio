//============================================================================
// Name        : CSC.cpp
// Author      : Luis Gonzalez
// Version     :
// Copyright   : 2018
// Description : Hello World in C++, Ansi-style
//============================================================================
#include <iostream>
#include <string>
using namespace std;

int countChar(const string &s, char key, int n);

int main()
{
	string wrd;
	char key;

	cout << "Enter a string: ";
	getline(cin, wrd);

	cout << "Enter a character to search: ";
	cin >> key;

	cout << "The character '" << key << "' occurs ";
	cout << countChar(wrd, key, wrd.length() - 1) << " times.\n";

	return 0;
}

int countChar(const string &s, char key, int n)
{
	if(n >= s.length())
	{
		return 0;
	}
	else if
	(s[n] == key)
		return 1+ countChar(s, key, --n);
	else
		return countChar(s, key, --n);
}
