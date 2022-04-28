n, m = map(int, input().split())
if n > m:
  x = n - m
  if x == 1:
    print("Dr. Chaz needs 1 more piece of chicken!")
  else:
    print("Dr. Chaz needs", x, "more pieces of chicken!")
else:
  x = m - n
  if x == 1:
    print("Dr. Chaz will have 1 piece of chicken left over!")
  else:
    print("Dr. Chaz will have", x, "pieces of chicken left over!")