// MyArrays.cpp: Konsol uygulamasının giriş noktasını tanımlar.
//

#include "stdafx.h"

int FindTriplets(int arr[], int n);
int findTripletsSorting(int arr[], int n);
void printArray(int arr[], int n);
bool find3Numbers(int arr[], int n, int given_sum);
bool find3NumbersSorting(int arr[], int n, int given_sum);
int MaximumSumTriplet(int arr[], int n);
int MaximumTripletSumSorting(int arr[], int n);
int MaximumTripletFindingBiggests(int arr[], int n);
int subArraySum(int arr[], int n, int sum);
int FixedPointLinearlySearch(int arr[], int n);
int BinarySearch(int arr[], int low, int high);
void printRepeating(int arr[], int n);
void printRepeatingCountSort(int arr[], int n);
int FindPeakElement(int arr[], int n);
void isPairSum(int arr[], int n, int sum);
void isPairSumSorting(int arr[], int n, int sum);
int MajorityElement(int arr[], int n);
int MajorityElementSorting(int arr[], int n);
void printLeaders(int arr[], int n);
void printLeadersScanFromRight(int arr[], int n);
void LinearSearch(int arr[], int n, int key);
int insertSorted(int arr[], int n, int key, int capacity);
int deleteElement(int arr[], int n, int key_to_be_deleted);
void findCommonNumSortedArrs(int arr1[], int arr2[], int n1, int n2);
void PrintMoreThanOneRepeating(int arr[], int n);
int isPresent(int arr1[], int arr2[], int key, int m, int n);
void leftRotatebyOne(int arr[], int n);
void leftRotatebyD(int arr[], int d, int n);
void reverseArray(int arr[], int n);
void RightRotatebyOne(int arr[], int n);
int maxSumRotation(int arr[], int n);
bool pairInSortedRotated(int arr[], int n, int x);
void SmallestAndBiggestElementInArr(int arr[], int n);
void findSecoundBiggestAndSecoundSmallest(int arr[], int n);
int RotationCount(int arr[], int n);
void leftRotate(int arr[], int n, int k);
void leftRotateMultipleTimes(int arr[], int n, int k);
void FixArr(int arr[], int n);
void reverseArr(int arr[], int start, int end);
void AllNegativesAtTheEnd(int arr[], int n);
void pushZerosToEnd(int arr[], int n);
void movesZerosToEnd(int arr[], int n);

int main()
{
	int holder;
	int arr[] = { 0,-1,2,-3,1 };
	int n = sizeof(arr) / sizeof(arr[0]);
	holder = FindTriplets(arr, n);
	printf("\n%d\n", holder);

	int holder2;
	int arr2[] = { 0,-1,2,-3,1 };
	int n2 = sizeof(arr2) / sizeof(arr2[0]);
	holder2 = findTripletsSorting(arr2, n2);
	printArray(arr2, n2);
	printf("\n%d\n", holder2);

	bool holder3;
	int arr3[] = { 1,4,45,6,10,8 };
	int sum = 22;
	int n3 = sizeof(arr3) / sizeof(arr[0]);
	holder3 = find3Numbers(arr3, n3, sum);
	printf("\n%d\n", holder3);

	bool holder4;
	int arr4[] = { 1,4,45,6,10,8 };
	int given_sum = 22;
	int n4 = sizeof(arr4) / sizeof(arr4[0]);
	find3NumbersSorting(arr4, n4, given_sum);

	int holder5;
	int arr5[] = { 1,0,8,6,4,2 };
	int n5 = sizeof(arr5) / sizeof(arr[0]);
	holder = MaximumSumTriplet(arr5, n5);
	printf("\n%d\n", holder);

	int holder6;
	int arr6[] = { 1,0,8,6,4,2 };
	int n6 = sizeof(arr6) / sizeof(arr6[0]);
	holder6 = MaximumTripletSumSorting(arr6, n6);
	printf("\n%d\n", holder6);

	int holder7;
	int arr7[] = { 1,0,8,6,4,2 };
	int n7 = sizeof(arr7) / sizeof(arr7[0]);
	holder7 = MaximumTripletFindingBiggests(arr7, n7);
	printf("\n%d\n", holder7);

	int holder8;
	int arr8[] = { 1,4,20,3,10,5 };
	int n8 = sizeof(arr8) / sizeof(arr8[0]);
	int sum2 = 33;
	holder8 = subArraySum(arr8, n8, sum2);
	printf("\n%d\n", holder8);

	int holder9;
	int arr9[] = { -10,-1,0,3,10,11,30,50,100 };
	int n9 = sizeof(arr) / sizeof(arr9[0]);
	holder9 = FixedPointLinearlySearch(arr9, n9);
	printf("%d\n", holder9);

	int holder10;
	int arr10[] = { -10,-1,0,3,10,11,30,50,100 };
	int n10 = sizeof(arr10) / sizeof(arr[0]);
	holder10 = BinarySearch(arr10, 0, n10 - 1);
	printf("%d\n", holder10);

	int arr11[] = { 4,2,4,5,2,3,1 };
	int n11 = sizeof(arr11) / sizeof(arr11[0]);
	printRepeatingCountSort(arr11, n11);

	int holder12;
	int arr12[] = { 1,3,20,4,1,0 };
	int n12 = sizeof(arr12) / sizeof(arr12[0]);
	holder12 = FindPeakElement(arr12, n12);
	printf("%d\n", holder12);

	int arr13[] = { 10,5,7,12,2,21 };
	int n13 = sizeof(arr13) / sizeof(arr13[0]);
	int sum3 = 17;
	isPairSum(arr13, n13, sum3);

	int arr14[] = { 10,5,7,12,2,21 };
	int n14 = sizeof(arr14) / sizeof(arr14[0]);
	int sum4 = 17;
	isPairSumSorting(arr14, n14, sum4);

	int holder15;
	int arr15[] = { 1,1,1,1,1,5 };
	int n15 = sizeof(arr15) / sizeof(arr15[0]);
	holder15 = MajorityElement(arr15, n15);
	printf("\n%d\n", holder15);

	int holder16;
	int arr16[] = { 1,1,1,2,2 };
	int n16 = sizeof(arr16) / sizeof(arr16[0]);
	holder16 = MajorityElementSorting(arr16, n16);
	printf("%d\n", holder16);

	int arr17[] = { 16,17,4,3,5,2 };
	int n17 = sizeof(arr17) / sizeof(arr17[0]);
	printLeaders(arr17, n17);
	printLeadersScanFromRight(arr17, n17);
	printf("\n");

	int arr18[] = { 10,5,4,-34 };
	int n18 = sizeof(arr18) / sizeof(arr18[0]);
	int key = -34;
	LinearSearch(arr18, n18, key);

	int arr19[] = { 12,16,20,40,50,70 };
	int n19 = sizeof(arr19) / sizeof(arr19[0]);
	int key2 = 30;
	int capacity = 7;
	insertSorted(arr19, n19, key2, capacity);
	int i;
	for (i = 0;i < capacity;i++)
	{
		printf("%d", arr19[i]);
	}
	printf("\n");

	int arr20[] = { 10,50,30,40,20 };
	int n20 = sizeof(arr20) / sizeof(arr20[0]);
	int key3 = 30;
	deleteElement(arr20, n20, key3);

	for (i = 0;i < n20;i++)
	{
		printf("%d", arr20[i]);
	}
	printf("\n");

	int arr21[] = { 1,5,10,20,40,80 };
	int arr22[] = { 6,7,20,80,100 };
	int n21 = sizeof(arr21) / sizeof(arr21[0]);
	int n22 = sizeof(arr22) / sizeof(arr22[0]);
	findCommonNumSortedArrs(arr21, arr22, n21, n22);

	printf("\n");

	int arr23[] = { 9,8,2,6,1,8,5,3,4,7 };
	int n23 = sizeof(arr23) / sizeof(arr23[0]);
	PrintMoreThanOneRepeating(arr23, n23);

	printf("\n");

	int holder24;
	int arr24[] = { 20,30,12,34 };
	int arr25[] = { 33,43,20 };
	int n24 = sizeof(arr24) / sizeof(arr24[0]);
	int n25 = sizeof(arr25) / sizeof(arr25[0]);
	int key4 = 20;
	holder24 = isPresent(arr24, arr25, key4, n24, n25);
	printf("%d\n", holder24);

	int arr26[] = { 1,2,3,4,5,6,7 };
	int n26 = sizeof(arr26) / sizeof(arr26[0]);
	int d = 2;
	leftRotatebyD(arr26, d, n26);
	printArray(arr26, n26);

	printf("\n");
	int arr27[] = { 1,2,3,4,5,6,7 };
	int n27 = sizeof(arr27) / sizeof(arr27[0]);
	reverseArray(arr27, n27);
	printArray(arr27, n27);

	printf("\n");
	int arr28[] = { 1,2,3,4,5 };
	int n28 = sizeof(arr28) / sizeof(arr28[0]);
	RightRotatebyOne(arr28, n28);
	printArray(arr28, n28);

	printf("\n");

	int holder29;
	int arr29[] = { 1,20,2,10 };
	int n29 = sizeof(arr29) / sizeof(arr29[0]);
	holder29 = maxSumRotation(arr29, n29);
	printf("%d\n", holder29);

	bool holder30;
	int arr30[] = { 11,15,6,8,9,10 };
	int n30 = sizeof(arr30) / sizeof(arr30[0]);
	int sum5 = 16;
	holder30 = pairInSortedRotated(arr30, n30, sum5);
	printf("%d\n", holder30);

	int arr31[] = { 50,1,2,44,51 };
	int n31 = sizeof(arr31) / sizeof(arr31[0]);
	SmallestAndBiggestElementInArr(arr31, n31);

	printf("\n");

	int arr32[] = { 54,23,1,45,66,33 };
	int n32 = sizeof(arr32) / sizeof(arr32[0]);
	findSecoundBiggestAndSecoundSmallest(arr32, n32);

	printf("\n");

	int holder33;
	int arr33[] = { 7,9,11,12,5 };
	int n33 = sizeof(arr33) / sizeof(arr33[0]);
	holder33 = RotationCount(arr33, n33);
	printf("%d\n", holder33);

	int arr34[] = { 1,3,5,7,9 };
	int n34 = sizeof(arr34) / sizeof(arr34[0]);
	int k = 3;
	leftRotate(arr34, n34, k);

	printf("\n");

	int arr35[] = { 1,3,5,7,9 };
	int n35 = sizeof(arr35) / sizeof(arr35[0]);
	int k2 = 2;
	leftRotateMultipleTimes(arr35, n35, k2);

	printf("\n");

	int arr36[] = { -1,1,6,1,9,3,2,-1,4,-1 };
	int n36 = sizeof(arr36) / sizeof(arr36[0]);
	FixArr(arr36, n36);
	int j;

	for (j = 0;j < n36;j++)
	{
		printf("%d", arr36[j]);
	}

	printf("\n");

	int arr37[] = { 1,2,3,4,5,6 };
	reverseArr(arr37, 0, 5);
	printArray(arr37, 6);

	printf("\n");

	int arr38[] = { -1,2,-3,4,5,6,-7,8,9 };
	int n38 = sizeof(arr38) / sizeof(arr38[0]);
	AllNegativesAtTheEnd(arr38, n38);
	printArray(arr38, n38);

	printf("\n");

	int arr39[] = { 0,9,8,4,0,0,2,7,1,6,0,9 };
	int n39 = sizeof(arr39) / sizeof(arr39[0]);
	pushZerosToEnd(arr39, n39);

	for (i = 0;i < n39;i++)
	{
		printf("%d", arr39[i]);
	}

	printf("\n");

	int arr40[] = { 0,1,9,8,4,0,0,2,7,0,6,0,9 };
	int n40 = sizeof(arr40) / sizeof(arr40[0]);
	movesZerosToEnd(arr40, n40);
	printArray(arr40, n40);
	getchar();
	return 0;
}

int FindTriplets(int arr[], int n)
{
	int i, j, k;
	int count = 0;
	bool HasItAny = false;
	for (i = 0;i < n - 2;i++)
	{
		for (j = i + 1;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (arr[i] + arr[j] + arr[k] == 0)
				{
					HasItAny = true;
					count++;
					printf("%d %d %d", arr[i], arr[j], arr[k]);
				}
			}
		}
	}
	if (HasItAny == false)
	{
		printf("No such as triplet\n");
	}
	return count;
}

int findTripletsSorting(int arr[], int n)
{
	int i, j;
	for (i = 0;i < n - 1;i++)
	{
		for (j = 0;j < n - i - 1;j++)
		{
			if (arr[j] > arr[j + 1])
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	int count = 0;
	for (i = 0;i < n - 1;i++)
	{
		int left = i + 1;
		int right = n - 1;
		int current_index = i;
		while (left < right)
		{
			if (arr[current_index] + arr[left] + arr[right] == 0)
			{
				count++;
				printf("%d %d %d", arr[current_index], arr[left++], arr[right--]);
			}
			else if (arr[current_index] + arr[left] + arr[right] < 0)
			{
				left++;
			}
			else
			{
				right--;
			}
		}
	}
	return count;
}

void printArray(int arr[], int n)
{
	int i;
	for (i = 0;i < n;i++)
	{
		printf("%d", arr[i]);
	}
}

bool find3Numbers(int arr[], int n, int given_sum)
{
	int i, j, k;
	for (i = 0;i < n - 2;i++)
	{
		for (j = i + 1;j < n - 1;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (arr[i] + arr[j] + arr[k] == given_sum)
				{
					printf("%d %d %d", arr[i], arr[j], arr[k]);
					return true;
				}
			}
		}
	}
	return false;
}

bool find3NumbersSorting(int arr[], int n, int given_sum)
{
	int i, j;
	for (i = 0;i < n - 1;i++)
	{
		for (j = 0;j < n - i - 1;j++)
		{
			if (arr[j] > arr[j + 1])
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	int left = 0, right = n - 1;
	for (i = 1;i < n - 1;i++)
	{
		int current_index = i;
		while (left < right)
		{
			if (arr[i] + arr[left] + arr[right] == given_sum)
			{
				printf("%d %d %d", arr[i], arr[left++], arr[right--]);
				return true;
			}
			else if (arr[i] + arr[left] + arr[right] < given_sum)
			{
				left++;
			}
			else
			{
				right--;
			}
		}
	}
	return false;
}

int MaximumSumTriplet(int arr[], int n)
{
	int i, j, k;
	int max_sum = INT_MIN;

	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				if (arr[i] + arr[j] + arr[k] > max_sum)
				{
					max_sum = arr[i] + arr[j] + arr[k];
				}
			}
		}
	}
	return max_sum;
}

int MaximumTripletSumSorting(int arr[], int n)
{
	int i, j;
	for (i = 0;i < n - 1;i++)
	{
		for (j = 0;j < n - i - 1;j++)
		{
			if (arr[j] > arr[j + 1])
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	return arr[n - 1] + arr[n - 2] + arr[n - 3];
}

int MaximumTripletFindingBiggests(int arr[], int n)
{
	int i;
	int max_A = INT_MIN, max_B = INT_MIN, max_C = INT_MIN;
	for (i = 0;i < n;i++)
	{
		if (arr[i] > max_A)
		{
			max_C = max_B;
			max_B = max_A;
			max_A = arr[i];
		}
		else if (arr[i] > max_B)
		{
			max_C = max_B;
			max_B = arr[i];
		}
		else if (arr[i] > max_C)
		{
			max_C = arr[i];
		}
	}
	return (max_A + max_B + max_C);
}

int subArraySum(int arr[], int n, int sum)
{
	int total_sum = 0;
	int i;
	srand(time(NULL));

	for (i = 0;i < n;i++)
	{
		total_sum += arr[i];
	}
	while (total_sum == sum)
	{
		total_sum = total_sum - arr[rand() % i];
		if (total_sum != sum)
		{
			break;
		}
	}
	return total_sum;
}

int FixedPointLinearlySearch(int arr[], int n)
{
	int i;
	for (i = 0;i < n;i++)
	{
		if (i == arr[i])
		{
			return i;
		}
	}
	return -1;
}
