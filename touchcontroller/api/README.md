# TouchController API

TouchController 提供一个 API，允许第三方模组：

- 提供自己的预置控件
- 提供自己的顶栏按键
- 提供自己的游戏操作 / 玩家操作
- 提供自己的按钮贴图

## 接入方式

TouchController API 发布在 `https://maven.fifthlight.top/releases` 上，坐标为 `top.fifthlight.touchcontroller:api:<API 版本>`。

API 特地设计为版本无关，且体积非常小，因此你可以选择把这个 API 作为 JIJ 模组打包在你的项目中，或者不想做 JIJ 的话也可以通过反射获取实例，作为 compileOnly 依赖。

加入后，你可以通过 `TouchControllerApi.getInstance()` 获取 API 的实例。注意这个方法在 TouchController 模组不存在时会返回 null。
