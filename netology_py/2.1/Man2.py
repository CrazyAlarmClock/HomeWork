from collections import defaultdict
from pprint import pprint
import re

temp = str(open("recipes.txt", "r").read());
temp1_receptions = temp.split("\n\n");
_all_ = {};
for line in temp1_receptions:

    now_points = line.split("\n")
    line = line.strip()
    line = line.split("|")
    _all_[now_points[0]] = now_points[2:];
pprint(_all_);



