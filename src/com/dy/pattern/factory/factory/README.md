# 工厂模式

---

### 类的实现

LeftHair等类实现了Hair接口的`draw`方法，可以实现不同的发型的描绘
--Hair
----LeftHair
----RightHair
----InHair

### 工厂的实现
`HairFactory.java`是发型工厂，输入不同的发型关键字可以产生不同的发型

- 