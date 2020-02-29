//============================================================================
// Name        : CSC 2111 Lab17
// Author      : Luis Gonzalez
// Version     :
// Copyright   : 2018
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;

int main() {
	char ID[9];
	bool loop=true;
	while(loop)
	{
	cout << "Please enter your 9 digit WSU student ID: "; //asks user for input
	for(int i=0; i<9; i++)
		cin>>ID[i];
	cout<<endl<<"ID: ";
	for(int i=0; i<9; i++){
		cout<<ID[i];
	}
	cout<<endl;

	try
	{


		for(int i = 0; i<2; i++)
		{
			if(ID[0]!='0'){
				loop=false;
				logic_error err("The first digit is a non-zero. \nOf Type: class::std::exception");
				throw err;
			}
			else if(ID[1]!='0')
			{
				loop = false;
				logic_error err("the second digit is a non-zero. \nOf Type: class::std::exception");
				throw err;

			}
		}
	}
	catch(const exception&e)
	{
		cout<<"Caught an exception: ";
		cout<<e.what()<<endl;
	}

	}
	return 0;

}
