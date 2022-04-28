while(True):
    n = int(input())
    
    if(n == 0):
        break
        
    list1 = []
    list2 = []
    
    for x in range(n):
        list1.append(int(input()))
    l1 = []
    
    for x in list1:
        l1.append(x)
        
    for y in range(n):
        list2.append(int(input()))
        
    list1.sort()
    list2.sort()
    
    for x in l1:
        print(list2[list1.index(x)])
        
    print()