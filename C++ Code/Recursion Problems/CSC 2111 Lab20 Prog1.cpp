//============================================================================
// Name        : LAB20 Prog1
// Author      : Luis Gonzalez
// Version     :
// Copyright   : 2018
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
using namespace std;

bool isPalindromeRecursive(const string&, int, int);

int main()
{
	string wrd;

	cout << "Enter a string: ";

	getline(cin, wrd);

	cout << wrd << " is\n";

	if (!isPalindromeRecursive(wrd, 0, wrd.length() - 1))
		cout << "NOT";
	cout << " a palindrome.\n";

	return 0;
}

bool isPalindromeRecursive(const string& s, int first, int last)
{
	if(first >= last)
		return true;
	if(s[first]!= s[last])
		return false;
	return isPalindromeRecursive(s, ++first, --last);
}
