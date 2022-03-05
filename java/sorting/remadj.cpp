#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }

        int max = arr[0];
        int i = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;

        if (n == 2)
        {
            if (arr[i] != arr[i + 1])
            {
                count = 1;
            }
            else
            {
                count = 0;
            }
        }
        if (n > 2)
        {
            int k = 0;
            while (k < n - 1)
            {
                if (arr[k] + arr[k + 1] == max)
                {
                    arr[k + 1] = max;
                    count++;
                    k++;
                }
                else if (arr[k] == max)
                {
                    k++;
                }
                else if (arr[k] == arr[k + 1])
                {
                    k++;
                }
                else if (arr[k] + arr[k + 1] > max)
                {
                    arr[k + 1] = arr[k] + arr[k + 1];
                    count++;
                    k++;
                }
            }
        }
        cout << count << endl;
    }
    return 0;
}