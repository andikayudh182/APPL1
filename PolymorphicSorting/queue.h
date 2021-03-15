/* Program	:ADT queue statis
	Compiler	:Turbo C++*/

#ifndef queue_H
#define queue_H

#include <stdio.h>
#include <conio.h>
#define MAX 5
#include "time.h"

typedef struct Car{
	int jenisMobil;
	TIME arrival;
	TIME services;
	TIME finish;
	char garage;
}CarWash;

typedef struct queue{
	CarWash data[MAX];
	int front;
	int rear;
	TIME cuciA;
	TIME cuciB;
}queue;




int IsFull(int counter);
int IsEmpty(int counter);
void SetFront(queue *Q,int idx);
void SetRear(queue *Q,int idx);
void Delete(queue *Q, int *counter);
void Initial(queue *Q, int *counter);
void Insert(queue *Q,TIME vdata,int jenis, int *counter);
void Tampil(queue Q);


#endif