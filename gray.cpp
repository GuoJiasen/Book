#include<stdio.h>
#include<math.h>
#include<iostream>
using namespace std;
int a[100],b[100],c[100],d[100];
void print(int N)
{
	for(int i=0;i<N;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
		for(int i=0;i<N;i++)
	{
		printf("%d ",b[i]);
	}
	printf("\n");
		for(int i=0;i<N;i++)
	{
		printf("%d ",c[i]);
	}
	printf("\n");
		for(int i=0;i<N;i++)
	{
		printf("%d ",d[i]);
	}
	printf("\n");
	
}
void gray(int n,int N)//N为总长度 
{
	if(n==2)
	{
		a[N-2]=0;
			a[N-1]=0;
			b[N-2]=0;
			b[N-1]=1;
			c[N-2]=1;
			c[N-1]=1;
			d[N-2]=1;
			d[N-1]=0;
			print(N);
	}
	else
	{
			a[N-n]=1;
			b[N-n]=1;
			c[N-n]=1;
			d[N-n]=1;
			for(int i=1;i<=n-2;i++)
			{
				gray(n-i,N);
				for(int z=N-n+1;z<N;z++)
		{
			a[z]=0;
			b[z]=0;
			c[z]=0;
			d[z]=0;
		}
			}
	}
}
int main()
{
	int sum;
	cin>>sum;
	while(sum--)
	{
		int N;
		cin>>N;
	for(int i=2;i<=N;i++)
	{
			for(int z=0;z<N;z++)
		{
			a[z]=0;
			b[z]=0;
			c[z]=0;
			d[z]=0;
		}
			gray(i,N);
	}
	}

}
