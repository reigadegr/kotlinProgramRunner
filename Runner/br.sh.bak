#!/system/bin/sh
#kotlinc a.kt -include-runtime -d a.jar
for i in $(pwd)/*.kt; do
	echo "开始格式化$(basename $i)"
	/data/data/com.termux/files/usr/bin/clang-format -i $i
done

echo "当前时间：$(date +%Y) 年 $(date +%m) 月 $(date +%d) 日 $(date +%H) 时 $(date +%M) 分 $(date +%S) 秒"
mf(){
    jar=$(pwd)/a.jar
    kotlinc *.kt -d $jar
    java -jar $jar
}
kotlinc *.kt
for i in $(pwd)/*.class; do
    $(pwd)/MainFunctionVerify $i
    if [ "$?" = "0" ]; then
        java $(echo $(basename $i) | sed 's/.class//g')
        break
    fi
done
nohup rm -rf $(dirname "$0")/META-INF $(dirname "$0")/*.bak  $(dirname "$0")/*.class >/dev/null 2>&1 &
exit 0
