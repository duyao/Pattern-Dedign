# 抽象工厂模式

---

### 类的实现

`HNBoy`和`MCBoy`实现了Boy接口，实现了`drawBoy`的方法

--Boy

----HNBoy

----MCBoy

`HNGirl`和`MCGirl`实现了Girl接口，实现了`drawGirl`的方法

--Girl

----HNGirl

----MCGirl

### 工厂的实现
- `PersonFactory.java`
一个可以产生`Boy`或者`Girl`的接口

- `HNFactory.java`
实现了`PersonFactory`方法，产生`HNBoy`或者`HNGirl`

- `MCFactory.java`
实现了`PersonFactory`方法，产生`MCBoy`或者`MCGirl`
