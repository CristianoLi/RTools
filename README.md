# RTools&nbsp;&nbsp;&nbsp;<开发中常用工具类>

* [FileUtils](https://github.com/CristianoLi/RTools/blob/master/RTools/FileUtils.java)  

  文件工具类，包含判断文件是否存在，删除文件夹以及文件夹中的文件等方法

* [Logger](https://github.com/CristianoLi/RTools/blob/master/RTools/Logger.java)   

  日志打印工具类，日志打印的同时可以定位到具体的类

* [OSUtils](https://github.com/CristianoLi/RTools/blob/master/RTools/OSUtils.java)

  系统工具类，由于国内定制系统的泛滥, 不同定制系统的一些功能或实现方法会有所不同, 如果需要做到足够好的适配工作, 需要对不同的定制系统做一些专门的适配

* [ParseJsonFile](https://github.com/CristianoLi/RTools/blob/master/RTools/ParseJsonFile.java)   

  解析Json文件工具类，如   
  ```
      String fontJsonPath = "type/info.json";
      String fontJsonText = ParseJsonFile.readAssetJsonFile(this, fontJsonPath);
      if (TextUtils.isEmpty(fontJsonText)) {
          return;
      }
      List<ThemeEntity> allFileList = ParseJsonFile.fromJson(fontJsonText, new TypeToken<List<ThemeEntity>>() {
      }.getType());
      mThemeEntityList.addAll(allFileList);
  ```

* [SPUtils](https://github.com/CristianoLi/RTools/blob/master/RTools/SPUtils.java)     

  SharedPreferences工具类，提交保存以及获取

* [ScreenUtils](https://github.com/CristianoLi/RTools/blob/master/RTools/ScreenUtils.java)    

  屏幕工具类，包含获取屏幕宽高，各像素单位之间的转换等

* [StatusBarUtils](https://github.com/CristianoLi/RTools/blob/master/RTools/StatusBarUtils.java) &nbsp;&nbsp;
&nbsp; &nbsp;[StatusBarUtils_](https://github.com/CristianoLi/RTools/blob/master/RTools/StatusBarUtils_.java)

  状态栏工具类，两者对比取用
