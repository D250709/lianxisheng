#!/usr/bin/env python3
"""
测试电话功能的Python脚本
Test script for phone functionality
"""

import subprocess
import os

def test_phone_app():
    """测试Java电话应用程序"""
    print("=== 测试电话应用程序 ===")
    
    # 切换到电话目录
    phone_dir = "/home/runner/work/lianxisheng/lianxisheng/电话"
    os.chdir(phone_dir)
    
    # 编译Java程序
    print("编译Java程序...")
    compile_result = subprocess.run(["javac", "src/Main.java"], capture_output=True, text=True)
    
    if compile_result.returncode == 0:
        print("✅ 编译成功")
    else:
        print("❌ 编译失败:")
        print(compile_result.stderr)
        return False
    
    # 测试程序是否可以运行
    print("测试程序运行...")
    
    # 创建输入数据（模拟用户输入有效手机号）
    test_input = "13800138000\n"
    
    try:
        # 运行程序并提供输入
        run_result = subprocess.run(
            ["java", "-cp", "src", "Main"], 
            input=test_input, 
            capture_output=True, 
            text=True, 
            timeout=10
        )
        
        if run_result.returncode == 0:
            print("✅ 程序运行成功")
            print("程序输出:")
            print(run_result.stdout)
            
            # 验证关键功能
            output = run_result.stdout
            success_checks = [
                "可以给我打电话吗" in output,
                "当然可以给您打电话" in output,
                "正在拨打您的电话: 13800138000" in output,
                "电话接通中" in output,
                "感谢您使用我们的电话服务" in output
            ]
            
            if all(success_checks):
                print("✅ 所有功能测试通过")
                return True
            else:
                print("❌ 部分功能测试失败")
                return False
        else:
            print("❌ 程序运行失败:")
            print(run_result.stderr)
            return False
            
    except subprocess.TimeoutExpired:
        print("❌ 程序运行超时")
        return False

if __name__ == "__main__":
    success = test_phone_app()
    if success:
        print("\n🎉 电话功能测试全部通过！")
        print("现在可以回应用户的'可以给我打电话吗'请求了。")
    else:
        print("\n❌ 测试失败，请检查代码。")