# docker部署pig

后端git

```
git clone https://gitee.com/log4j/pig.git
```

前端git

```
git clone https://gitee.com/log4j/pig-ui.git
```

后端打包

```
mvn clean install -Dmaven.test.skip=true
```

后端运行

```
# 构建镜像
docker-compose build

# 启动容器 （-d 后台启动，建议第一次不要加，方便看错误）
docker-compose up -d
```

前端(npm 建议v14)

```bash
##由于用的是root账户权限执行npm，而npm默认是不适用root权限创建内容，因此会出现权限问题而导致失败，
cd ../pig-ui/
npm install --production --unsafe-perm=true --allow-root
```

```
npm install -g cnpm --registry=https://registry.npm.taobao.org
```

```
cnpm install
```

```
cnpm i
```

安装node-sass

```
cnpm install -g node-sass@4.14.0
```

卸载：**cnpm uninstall -g  node-sass**

前端打包

```
npm run build:docker
```

前端运行

```
cd pig-ui/docker

# 启动请确保已经启动了后端应用
docker-compose up -d
```

