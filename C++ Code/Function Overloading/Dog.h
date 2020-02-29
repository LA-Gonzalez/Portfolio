#ifndef Dog_H
#define Dog_H

#include <iostream>

using namespace std;

class Dog
{
	// TODO: Provide the prototype to overload the stream insertion operator here.
	friend istream& operator >>(istream&, Dog&);
	// TODO: Provide the prototype to overload the stream extraction operator here.
	friend ostream& operator <<(ostream&,const Dog&);

public:
	Dog();
	Dog(double, double);
	void setWeight(double);
	void setHeight(double);

	// TODO: Provide the prototype to overload the addition operator here.
	Dog operator +(Dog&)const;
	// TODO: Provide the prototype to overload the subtraction operator here.
	Dog operator -(Dog&)const;
	// TODO: Provide the prototype to overload the multiplication operator here.
	Dog operator *(Dog&)const;
	// TODO: Provide the prototype to overload the division operator here.
	Dog operator /(Dog&)const;
	
	// TODO: Provide the prototype to overload the greater than operator here.
	bool operator >(const Dog&)const;

	// TODO: Provide the prototype to overload the less than operator here.
	bool operator <(const Dog&)const;
	// TODO: Provide the prototype to overload the equality operator here.
	bool operator ==(const Dog&)const;
	// TODO: Provide the prototype to overload the not-equal-to operator here.
	// NOTE: For the sake of this lab, we are comparing dogs by multiplying their height and weight.
	//       However, in reality, all dogs are good dogs.
	bool operator !=(const Dog&)const;
	
	// TODO: Provide the prototype to overload the pre-increment operator here.
	Dog operator ++();
	// TODO: Provide the prototype to overload the post-increment operator here.
	Dog operator ++(int);
	// TODO: Provide the prototype to overload the pre-decrement operator here.
	Dog operator --();
	// TODO: Provide the prototype to overload the post-decrement operator here.
	Dog operator --(int);

private:
	double weight;
	double height;
}; 

#endif // Dog_H
