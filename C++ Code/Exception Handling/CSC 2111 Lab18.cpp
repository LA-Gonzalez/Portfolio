//============================================================================
// Name        : Lab18
// Author      : Luis Gonzalez
// Version     :
// Copyright   : 2018
// Description :
//============================================================================

#include <iostream>
#include <string>
using namespace std;

	//Exception class
	class OverSpeed
	{
	public:
		//Constructor to create OverSpeed s;
		OverSpeed(string s)
		{
			message= s;
		}
		// A method to display message
		string what()
		{
			return message;
		}

	private:
		string message;
	};


	// Base class
	class vehicle
	{
		public:
			void setType(string t);
		private:
			string type;
	};
	//implement setType(string type);
	void vehicle::setType(string t)
	{
		type=t;
	}

	//Derived class1

	class car: public vehicle
	{
		public:
			void setName(string n);
			void setSpeed(int s);
		private:
			string name;
			int speed;
	};
	//implement setName(string name);
	void car::setName(string n)
	{
		name=n;
	}
	//implement setSpeed(int speed);
	void car::setSpeed(int s)
	{
		if (s >= 70){
			throw OverSpeed("Car speed exceeded!");

		}
		else
			speed = s;
	}
	// OverSpeed exception class
	//Derived class2
	class truck: public vehicle
	{
		public:
			void setName(string n);
			void setSpeed(int s);
		private:
			string name;
			int speed;
	};
	//implement setName(string name);
	void truck::setName(string n)
	{
		name=n;
	}
	//implement setSpeed(int speed);  // OverSpeed exception class
	void truck::setSpeed(int s)
	{
		if (s >= 50) {
			throw OverSpeed ("Truck speed exceeded!");

		}
		else
			speed = s;
	}

//main function
int main()
{
	car c;
	truck t;
	int input1;
	int input2;

	try
	{

	cout<<"Enter the speed of car : ";
	cin>>input1;
	cout<<"\nEnter the speed of truck : ";
	cin>>input2;
	c.setSpeed(input1);
	t.setSpeed(input2);

	}

	catch(OverSpeed os)
	{
		cout<<endl<<os.what();
	}
	return 0;


}

