#include<iostream>
#include<string>
#include <vector>

using namespace std;

void mark(int x, int y, vector<string>& map, bool mean = false) {
    if (!mean && (x < 0 || y < 0 || x >= map.size() || y >= map[x].length()))
        return;
    if (!mean && (map[x][y] == '0' || map[x][y] == '2'))
        return;
    map[x][y] = '2';
    mark(x - 1, y, map);
    mark(x + 1, y, map);
    mark(x, y - 1, map);
    mark(x, y + 1, map);
}

int dfs(vector<string>& map, int ans) {
    for (int x = 0; x < map.size(); ++x)
        for (int y = 0; y < map[x].length(); ++y) {
            if (map[x][y] == '0' || map[x][y] == '2')
                continue;
            ++ans;
            mark(x, y, map, true);
        }
    return ans;
}

int main(void) {
    ios::sync_with_stdio(false);
    vector<string> map = *new vector<string>();
    string str = *new string();
    int ans = 0;
    while (getline(cin, str)) {
        if (str.size() == 0)
            break;
        map.push_back(str);
    }
    cout << dfs(map, ans);
    return 0;
}