'''
Written by Manoj Ravikumar
email: rmanojcse06@gmail.com
'''
def quick_sort(arr, s, e):
    if arr:
        if s >= e:
            return arr;
        print_arr(arr);
        p = partition(arr, s, e);
        quick_sort(arr, s, p-1);
        quick_sort(arr, p+1, e);

def partition(arr, s, e):
    pp=s-1;
    cp=s;
    pivot=arr[e];

    print("\npartition - s=%s; e=%s; pivot=%s " %(str(s),str(e),str(pivot)))
    while cp <= e:
        if arr[cp] < pivot:
            pp=pp+1;
            arr[pp],arr[cp] = arr[cp],arr[pp];
        cp=cp+1;
    pp=pp+1;
    arr[pp],arr[e] = arr[e],arr[pp];
    return pp;

def print_arr(arr):
    if arr:    
        for e in arr:
          print(e, end=" ");
          
myarr=[2,12,4,15,11,13,5,1,6,8,14,7,3,10,9];
myarr=[1,2,4,5];
quick_sort(myarr, 0, len(myarr)-1);
print_arr(myarr);
