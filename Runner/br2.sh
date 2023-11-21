#!/system/bin/sh
for i in $(pwd)/*.kt; do
	#echo "开始格式化$(basename $i)"
	/data/data/com.termux/files/usr/bin/clang-format -i $i
done
build_filure(){
    echo "编译失败"
    exit 0
}
#echo "当前时间：$(date +%Y) 年 $(date +%m) 月 $(date +%d) 日 $(date +%H) 时 $(date +%M) 分 $(date +%S) 秒"
    jar=$(pwd)/a.jar
    /data/data/com.termux/files/usr/bin/kotlinc *.kt
    
for i in $(pwd)/*.class; do
    $(pwd)/MainFunctionVerify $i >/dev/null 2>&1 
    [ "$?" != 0 ] && continue
    /data/data/com.termux/files/usr/bin/java $(echo $(basename $i) | sed 's/.class//g')
done
#
nohup rm -rf $(dirname "$0")/META-INF $(dirname "$0")/*.bak  $(dirname "$0")/*.class >/dev/null 2>&1 &
exit 0
