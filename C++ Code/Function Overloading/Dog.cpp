//============================================================================
// Name        : CSC2111 Lab14 Q1
// Author      : Luis Gonzalez
// Version     :
// Copyright   : 2018
// Description : Hello World in C++, Ansi-style
//============================================================================

#ifndef Dog_CPP
#define Dog_CPP
#include "Dog.h"

Dog::Dog()
{
	weight = 0;
	height = 0;
}

Dog::Dog(double w, double h)
{
	weight = w;
	height = h;
}

void Dog::setWeight(double w)
{
	weight = w;
}

void Dog::setHeight(double h)
{
	height = h;
}

// TODO: Implement the addition operator overload here.
//
//
//
Dog Dog::operator +(Dog& other)const
{
	Dog temp;
	temp.height= height + other.height;
	temp.weight= weight + other.weight;
	return temp;

}

// TODO: Implement the subtraction operator overload here.
// Remember that boxes cannot have negative dimensions.
//
//
Dog Dog::operator -(Dog& other)const
{
	Dog temp;
	temp.height= height - other.height;
	temp.weight= weight - other.weight;
	if(temp.weight < 0 || temp.height< 0)
	{
		temp.setHeight(0);
		temp.setWeight(0);
	}
	return temp;
}

// TODO: Implement the multiplication operator overload here.
//
//
//
Dog Dog::operator *(Dog& other)const
{
	Dog temp;
	temp.height= height * other.height;
	temp.weight= weight * other.weight;
	return temp;
}

// TODO: Implement the division operator overload here.
// Remember that division by zero is undefined.
//
//
Dog Dog::operator /(Dog&other)const
{
	Dog temp;
	temp.height= height / other.height;
	temp.weight= weight / other.weight;
	return temp;

}

// TODO: Implement the greater than operator overload here.
//
//
//
bool Dog::operator >(const Dog& other)const
{
	return(height > other.height && weight > other.weight);
}

// TODO: Implement the less than operator overload here.
//
//
//
bool Dog::operator <(const Dog& other)const
{
	return(height < other.height && weight < other.weight);
}

// TODO: Implement the equality operator overload here.
//
//
//
bool Dog::operator ==(const Dog& other)const
{
	return(height == other.height && weight == other.weight);
}

// TODO: Implement the not-equal-to operator overload here.
//
//
//
bool Dog::operator !=(const Dog& other)const
{
	return(height != other.height && weight != other.weight);
}

// TODO: Implement the post-increment operator overload here.
//
//
//
Dog Dog::operator ++()
{
	height++;
	weight++;
	return *this;
}

// TODO: Implement the pre-increment operator overload here.
//
//
//
Dog Dog::operator ++(int x)
{
	Dog temp= *this;
	height++;
	height++;
	return temp;
}

// TODO: Implement the post-decrement operator overload here.
//
//
//
Dog Dog::operator--()
{
	height--;
	weight--;
	if(weight<0 || height < 0)
	{
		setWeight(0);
		setHeight(0);
	}
	return *this;
}

// TODO: Implement the pre-decrement operator overload here.
//
//
//
Dog Dog::operator --(int x)
{
	Dog temp = *this;
	height--;
	weight--;
	return temp;
}


// TODO: Implement the stream insertion operator overload here.
//
//
//
istream& operator >>(istream& isObject, Dog& dog)
{
	cin>>dog.weight;
	cin>>dog.height;

	return isObject;
}
// TODO: Implement the stream extraction operator overload here.
//
//
//
ostream& operator <<(ostream& osObject, const Dog& dog)
{
	osObject<<"Look at my pupper!!!   He weighs "<<dog.weight<<" pounds and is "<<dog.height
			<<"inches tall!!!   He's such a good boy."<<endl;

	return osObject;
}
#endif // !Dog_CPP
