#include "Dog.h"

int main()
{
	Dog dog1;
	Dog dog2;

	cout << "Space separated, enter the weight (lb) and height (in) of dog1: ";
	cin >> dog1;
	cout << "cout << dog1;\n";
	cout << dog1;

	cout << "Space separated, enter the weight (lb) and height (in) of dog2: ";
	cin >> dog2;
	cout << "cout << dog2;\n";
	cout << dog2;

	cout << "dog1 + dog2;\n";
	cout << dog1 + dog2;
	cout << "cout << dog1 - dog2;\n";
	cout << dog1 - dog2;
	cout << "cout << dog1 * dog2;\n";
	cout << dog1 * dog2;
	cout << "cout << dog1 / dog2;\n";
	cout << dog1 / dog2;

	if (dog1 > dog2)
		cout << "dog1 > dog2" << endl;
	if (dog1 < dog2)
		cout << "dog1 < dog2" << endl;
	if (dog1 == dog2)
		cout << "dog1 == dog2" << endl;
	if (dog1 != dog2)
		cout << "dog1 != dog2" << endl;

	cout << "cout << ++dog1;\n";
	cout << ++dog1;
	cout << "cout << --dog2;\n";
	cout << --dog2;

	Dog dog3 = dog2++;
	cout << "Dog dog3 = dog2++;" << endl;
	cout << "cout << dog3;\n";
	cout << dog3;
	cout << "cout << dog2;\n";
	cout << dog2;

	system("pause");
	return 0;
}