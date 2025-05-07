# android_notification_monitor
安卓消息栏监听


GitHub Actions（自动化CI/CD）
特点： 支持自动化构建，每次代码提交后自动打包APK。

登录 GitHub，打开你的项目仓库：

在仓库主页上点击 "Actions"。

选择 "New Workflow"。

选择“Set up a workflow yourself”：

我们将从头开始编写自动化脚本。

命名工作流文件：
将工作流文件保存为 .github/workflows/android.yml。


手动触发构建
打开你的 GitHub 仓库。

进入 "Actions" 页面。

点击 "Android APK Build"。

点击 "Run Workflow"，选择触发分支（main）。


构建结果查看和下载
构建成功后，可以在 Actions 页面 > 任务详情 > Artifacts 中下载生成的 app-release.apk。


可选：签名和对齐APK
如果你的 APK 需要发布到应用市场（如 Google Play），你需要为它进行 签名。




name: Android Build

on: [push, workflow_dispatch]

jobs:
  build:
    runs-on: ubuntu-latest
    timeout-minutes: 30

    steps:
      - uses: actions/checkout@v4

      # 使用JDK 11（兼容大多数Gradle版本）
      - name: Set up JDK 11
        uses: actions/setup-java@v3
        with:
          distribution: 'temurin'
          java-version: '11'

      - name: Grant execute permission
        run: chmod +x gradlew

      # 清理Gradle旧缓存
      - name: Clean Gradle cache
        run: |
          rm -rf ~/.gradle/caches/
          ./gradlew --stop

      - name: Build with retry
        run: |
          ./gradlew assembleDebug --stacktrace --no-daemon || \
          (sleep 5 && ./gradlew assembleDebug --stacktrace --no-daemon)




name: Android Build

on: [push, workflow_dispatch]

jobs:
  build:
    runs-on: ubuntu-latest
    timeout-minutes: 30

    steps:
      - uses: actions/checkout@v4

      # 使用JDK 11（兼容大多数Gradle版本）
      - name: Set up JDK 11
        uses: actions/setup-java@v3
        with:
          distribution: 'temurin'
          java-version: '11'

      - name: Grant execute permission
        run: chmod +x gradlew

      # 清理Gradle旧缓存
      - name: Clean Gradle cache
        run: |
          rm -rf ~/.gradle/caches/
          ./gradlew --stop

      - name: Build with retry
        run: |
          ./gradlew assembleDebug --stacktrace --no-daemon || \
          (sleep 5 && ./gradlew assembleDebug --stacktrace --no-daemon)
      
      # 添加APK文件验证步骤（调试用）
      - name: Verify APK exists
        run: |
          ls -la app/build/outputs/apk/debug/
          if [ ! -f "app/build/outputs/apk/debug/app-debug.apk" ]; then
            echo "APK文件未生成！"
            exit 1
          fi

      # 上传APK文件
      - name: Upload APK Artifact
        uses: actions/upload-artifact@v4
        with:
          name: app-debug
          path: app/build/outputs/apk/debug/app-debug.apk
          retention-days: 7  # 设置保留天数（可选）