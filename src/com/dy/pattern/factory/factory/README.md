# 工厂模式

---

### 类的实现

LeftHair等类实现了Hair接口的`draw`方法，可以实现不同的发型的描绘

--Hair

----LeftHair

----RightHair

----InHair

### 工厂的实现
- `type.properties`
是个键值对文件，存放了发型关键字和对应的类的对应关系

- `PropertyReader.java`
是读取`type.properties`文件的方法，从而获取所有的对应关系

- `HairFactory.java`
是发型工厂，通过获取输入不同的发型关键字可以产生不同的发型
先调用`PropertyReader.java`获取所有发型，
然后产生输入发型的实例
```
Hair hair = (Hair) Class.forName(className).newInstance();
```