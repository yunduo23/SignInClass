# 本仓库用于桂林电子科技大学安卓课程签到项目的提交

## 使用的接口、功能及其方法如下

### 分页获取全部课程列表

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/all | HTTP | GET |JSON|

### 获取单个课程详情

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/detail | HTTP | GET |JSON|

### 学生用户获取自己所加入的课程

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/student | HTTP | GET |JSON|

### 学生退课

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/student/drop | HTTP | DELETE |JSON|

### 学生选课

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/student/select | HTTP | POST |JSON|

### 学生签到

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/student/sign | HTTP | POST |JSON|

### 学生用户获取所选课程中的签到列表

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/student/signList | HTTP | GET |JSON|

### 教师添加课程

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/teacher | HTTP | POST |JSON|

### 教师删除课程

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/teacher | HTTP | DELETE |JSON|

### 查看当前教师用户的已经结课的课程列表

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/teacher/finished | HTTP | GET |JSON|

### 教师端发起签到

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/teacher/initiate | HTTP | POST |JSON|

### 教师获取签到界面数据信息

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/teacher/page | HTTP | GET |JSON|

### 查看当前教师用户的未结课的课程列表

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/course/teacher/unfinished | HTTP | GET |JSON|

### 上传图片

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/image/upload | HTTP | POST |JSON|

### 用户登录

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/user/login | HTTP | POST |JSON|

### 创建用户

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/user/register | HTTP | POST |JSON|

### 修改用户信息

| 接口地址 | 支持协议 | 请求方式 | 返回格式 |
| :----:| :---: | :----: |:---:|
| http://47.107.52.7:88/member/sign/user/update | HTTP | POST |JSON|
