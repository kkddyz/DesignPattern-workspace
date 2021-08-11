# Builder 

## Robot Plan

> 学习视频 
>
> [youtube  RobotPlan](https://www.youtube.com/watch?v=9XnsOpjclUg)

### What is the builder pattern 

<font color="red">Pattern used to create objects made from a bunch of other objects.</font>

- When you want to build an object made up from other objects

- When you want the creation of these parts to be independent of
    the main object

- Hide the creation of the parts from the client so both aren't
    dependent

- The builder knows the specifics(具体细节) and nobody else does



### Demo : Robot

![image-20210811221420828](https://kkddyz-oss-image-hosting-service.oss-cn-hangzhou.aliyuncs.com/image/20210811221421.png)
---
### 总结
每次commit都减少一些类,使得builder pattern看起来十分简单.
但是代码的弹性在减少.


