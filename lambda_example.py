# Take a list of numbers.  
my_list = [12, 65, 54, 39, 102, 339, 221, 50, 70, ] 
  
# use anonymous function to filter and comparing  
# if divisible or not 
result = list(filter(lambda x: (x % 13 == 0), my_list))  
  
# printing the result 
print(result)  
