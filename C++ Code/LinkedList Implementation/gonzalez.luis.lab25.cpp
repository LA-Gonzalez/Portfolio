//============================================================================
// Name        : lab25.cpp
// Author      : Luis Gonzalez
// Version     :
// Copyright   : 2018
// Description : Use linked list structure, read input.txt into linked list
//============================================================================

#include<iostream>
#include<fstream>
using namespace std;

typedef struct node
{
	int data;
	node *next;
};

node *insertEnd(node *head, int val);
void search(node *head);
void printList(node *head);
void showMenu();
void search(node *head);
int main()
{
	node *head = NULL;
	int input, val;

	ifstream fin;
	fin.open("src/input.txt");
	while (fin >> val)
		head = insertEnd(head, val);


	while (true) {
		showMenu();
		cin >> input;
		switch (input){
		case 1: search(head);
			break;
		case 2: printList(head);
			break;
		case 3: return 0;
			break;
		default:  cout << endl;
		}
		cout << endl;
	}
	return 0;
}


node *insertEnd(node *current_head, int val)
{
	node *temp;
	temp = current_head;

	if (temp == NULL){
		node* newnode = new node;
		newnode->data = val;
		newnode->next = current_head;
		return newnode;
	}

	while (temp->next != NULL)
		temp = temp->next;

	node* newnode = new node;
	newnode->data = val;
	newnode->next = NULL;
	temp->next = newnode;
	return current_head;
}

void showMenu() {
	cout << "1. Search item from list.\n";
	cout << "2. Print list.\n";
	cout << "3. Quit\n";
	cout << "Please enter a choice: ";
}

void printList(node *current_head)
{
	node *temp;
	temp = current_head;
	if (temp == NULL)
	{
		cout << endl << "The linked list is empty." << endl;
		return;
	}
	else
	{
		cout << "Linked list: ";
		while (temp != NULL)
		{
			cout << temp->data << " ";
			temp = temp->next;
		}
		cout << endl;
	}
}

void search(node *head)
{
	int key;
	bool flag = false;

	cout<<"Please enter the number you want to count: ";
	cin>>key;
	while(head != NULL)
	{
		if(key == head->data)
		{
			flag=true;
			cout<<"Key found"<<endl;
			return;
		}
		head = head->next;

	}
	if(flag==false)
	{
		cout<<"Key not found"<<endl;
	}

}
