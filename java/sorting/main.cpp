#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n,k;
        cin>>n>>k;
	    string s;
	    cin>>s;
	    
	    int count = 0;
	    for(int i = 0; i < n; i++ ){
	           if(s[i] != s[n-i-1]){
	                count++;
	            }
	    }
	    
	    if(count <= k){
	        if(n%2 == 1){
	            cout<<"yes"<<endl;
	        }
	        else if((k-count)%2 == 0){
	            cout<<"yes"<<endl;
	        } 
	        else{
	            cout<<"no"<<endl;
	        }
	    }
	    else{
	        cout<<"no"<<endl;
	    }
	}
	return 0;
}
