# Todo 

## 安卓应用程序 与 cpu架构

- 不同的手机有不同的cpu架构，不同的cpu架构意味着使用的指令集不同、涉及到内存对齐问题、以及可用的系统函数调用等；
- 安卓应用程序为cpu架构定义了ABI(Application Binary Interface)即应用程序二进制接口，定义了二进制文件如何运行在cpu架构上；
- 共有7种ABI:
  * armeabi
  * armeabi-v7a
  * arm64-v8a
  * x86
  * x86_64
  * mips
  * mips64
- 所以在开发应用程序时，将.so文件存放至不同的文件夹（以ABI命名），目的是保证应用程序对不同设备（cpu架构）进行兼容.
