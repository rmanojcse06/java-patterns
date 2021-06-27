def bubble_sort(arr):
    if arr:
        for i in range(len(arr) - 1):
            for j in range(len(arr) - i - 1):
                if arr[j+1] < arr[j]:
                    arr[j+1],arr[j] = arr[j],arr[j+1];
    return arr;

def print_arr(arr):
    if arr:    
        for e in arr:
          print(e);
          
myarr=[2,12,4,15,11,13,5,1,6,8,14,7,3,10,9];
bubble_sort(myarr);
print_arr(myarr);
