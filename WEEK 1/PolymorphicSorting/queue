/*
Name: Studi Kasus Cuci Mobil 6
Author: Sanjaya Wisnu Ramadhan
Date: Versi 4 /31 Maret 2020 
Description:-Tempat	cuci mobil 2
			-Jeda antar mobil berbeda
	        -Waktu tiap mobil berbeda
	        -Include Time.h
*/

#include "queueStatis.h"
#include "time.h"

int IsFull(int counter){
	if(counter==MAX){
		return 1;
	}else return 0;
}

int IsEmpty(int counter){
	if(counter==0){
		return 1;
	}else return 0;

}

void SetFront(queue *Q,int idx){
	if(idx>=5 || idx<0){
		printf("Invalid");
	}else {
		Q->front=idx;
	}
	
}

void SetRear(queue *Q,int idx){
	if(idx>=5 || idx<-1){
		printf("Invalid");
	}else {
		Q->rear=idx;
	}	
}

void Delete(queue *Q, int *counter){
	if(Q->rear==-1){
		printf("UNDERFLOW\n");
	}else if(Q->rear==Q->front){ 
		Initial(&(*Q),0);
	}
	else {
		Q->front++;
	}
}

void Initial(queue *Q, int *counter){
	SetFront(&(*Q),0); 
	SetRear(&(*Q),-1);
}

void Insert(queue *Q,TIME vdata,int jenis, int *counter){
	TIME durasi;
	TIME mulai;
	CreateTIME(&mulai,7,0,0);
	TIME duration[8]; 
	TIME temp1,temp2; 
	TIME istirahat;
	
	CreateTIME (&duration[0], 0, 20, 0);
	CreateTIME (&duration[1], 0, 30, 0);
	CreateTIME (&duration[2], 0, 45, 0);
	CreateTIME (&duration[3], 1, 0, 0);
	CreateTIME (&duration[4], 1, 20, 0);
	CreateTIME (&duration[5], 1, 40, 0);
	CreateTIME (&duration[6], 2, 0, 0);
	CreateTIME (&duration[7], 2, 5, 0);
	
	TIME jeda[8];
	CreateTIME (&jeda[0], 0, 1, 0);
	CreateTIME (&jeda[1], 0, 2, 0);
	CreateTIME (&jeda[2], 0, 4, 0);
	CreateTIME (&jeda[3], 0, 5, 0);
	CreateTIME (&jeda[4], 0, 6, 0);
	CreateTIME (&jeda[5], 0, 8, 0);
	CreateTIME (&jeda[6], 0, 9, 0);
	CreateTIME (&jeda[7], 0, 10, 0);
	
	
	if(Q->rear==MAX-1){ 
		printf("OVERFLOW\n");
	}else{
		Q->data[(*counter)].arrival = vdata;
		Q->data[(*counter)].jenisMobil = jenis;
		istirahat = jeda[jenis-1];
		durasi=duration[jenis-1];
	
		if(*counter==0){
			Q->data[(*counter)].services = mulai;
			Q->data[(*counter)].garage = 'A';
			Q->data[(*counter)].finish =JPlus(mulai,durasi);
			Q->cuciA=JPlus(Q->data[(*counter)].finish ,istirahat);
		}else if(*counter!=0){
			temp1 = JPlus(Q->cuciA,durasi);
			temp2 = JPlus(Q->cuciB,durasi);
			if(JLT(temp1,temp2)){
				Q->data[(*counter)].garage = 'A';
				Q->data[(*counter)].services = Q->cuciA;
				Q->data[(*counter)].finish =  JPlus(Q->data[(*counter)].services,durasi);
				Q->cuciA=JPlus(Q->data[(*counter)].finish ,istirahat);
			}else {
				Q->data[(*counter)].garage = 'B';
				Q->data[(*counter)].services = Q->cuciB;
				Q->data[(*counter)].finish =  JPlus(Q->data[(*counter)].services,durasi);
				Q->cuciB=JPlus(Q->data[(*counter)].finish ,istirahat);
			}
			
		} 
		SetRear(&(*Q),(*counter)); 
	}
}

void Tampil(queue Q){
	int i;
	char jenis[8][20]={"City Car", "MPV", "SUV", "VAN", "ANGKEL","TRONTON","TRAILER","BUS"};
	TIME durasi;
	TIME duration[8];
	CreateTIME (&duration[0], 0, 20, 0);
	CreateTIME (&duration[1], 0, 30, 0);
	CreateTIME (&duration[2], 0, 45, 0);
	CreateTIME (&duration[3], 1, 0, 0);
	CreateTIME (&duration[4], 1, 20, 0);
	CreateTIME (&duration[5], 1, 40, 0);
	CreateTIME (&duration[6], 2, 0, 0);
	CreateTIME (&duration[7], 2, 5, 0);
	printf("Kasus Cuci Mobil 6\n\n\n");
		for(i=Q.front;i<Q.rear+1;i++){
			durasi=duration[Q.data[i].jenisMobil-1];
			printf("Struk Mobil ke-%d\n", i+1);
			printf("Jenis Mobil 	: %s\n", jenis[Q.data[i].jenisMobil-1]);
			printf("Jam Kedatangan : ");PrintTIME(Q.data[i].arrival);printf("\n");
			printf("Durasi         : "); PrintTIME(durasi);printf("\n");
			printf("Tempat Cuci    : %c\n",Q.data[i].garage );
			printf("Jam Services   : ");PrintTIME(Q.data[i].services);printf("\n");
			printf("Jam Finish     : ");PrintTIME(Q.data[i].finish);printf("\n");
			printf("==========================\n");
		
	}	
}