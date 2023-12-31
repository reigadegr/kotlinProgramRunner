#include <filesystem>
#include <fstream>
#include <iostream>
#define log(x) std::cout << x << std::endl
bool readInputFile(const char *input) {
    if (!std::filesystem::exists(input)) {
        // log("文件不存在");
        return false;
    }
    std::ifstream file(input);
    std::string buf;
    while (std::getline(file, buf)) {
        if (buf.find("main ()V") != std::string::npos) {
            std::cout << "该文件存在主函数, 文件名: " << input << std::endl;
            return true;
        }
    }
    std::cout << "无主函数: " << input << std::endl;
    return false;
    file.close();
}
int main(int argc, char **argv) {
    const char *file = argv[1];

    if (readInputFile(file))
        return 0;
    else
        return 1;
}
