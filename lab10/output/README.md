# CMPE 202 - LAB #10 - AspectJ & Feature IDE

## Feature Model Configs and Output
### GumballMachineV1
- **Model Tree**
![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v1_model.png)
- **Configurations & Output**
![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v1_config1.png)

![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v1_config2.png)
  
![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v1_config3.png)

### GumballMachineV2
- **Model Tree**
![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v2_model.png)
- **Configurations & Output**
![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v2_config1.png)

![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v2_config2.png)
  
![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v2_config3.png)

![image](https://github.com/zhangyijun0518/cmpe202/raw/master/lab10/output/GM_v2_config4.png)

## Compare with the original solution(Lab 1)
```
The AOP solution is better organized. 
In the original OOP solution, it is hard to clearly introducte the different responses returned by inserting different coins into different kind of machines. And there are some similar codes in several different classes when using state pattern.
By using AOP solution, code about action and coins are well organized, similar codes are abstracted togather. And when the situation changes,there is no need to change code to get correct results. We can simply select different options to check the configuration and get output.
Thus, the AOP solution is more flexible and better for project maintenance。
```
    