# docker安装

```
sudo yum remove docker \
                  docker-client \
                  docker-client-latest \
                  docker-common \
                  docker-latest \
                  docker-latest-logrotate \
                  docker-logrotate \
                  docker-engine
```

登录服务器，执行卸载命令



安装：

1、在安装Docker之前先安装docker的依赖包

```
sudo yum install -y yum-utils
```

2、告诉linux,安装docker要从哪里安装

```
sudo yum-config-manager \
    --add-repo \
    https://download.docker.com/linux/centos/docker-ce.repo
```


3、安装docker（docker的引擎、操作docker的客户端、docker容器）

```
sudo yum install docker-ce docker-ce-cli containerd.io
```

4、启动docker服务

```
sudo systemctl start docker
```

5、启动后，输入命令：

```
docker -v
```

  客户查看docker的版本，也确保一下安装是否成功

6、查看docker里有没有下载的应用镜像

```
sudo docker images
```

因为是新安装的docker,所以是空列表

7、给docker设置开机自动启动，省得以后每次启动输入启动命令

```
sudo systemctl enable docker
```

这样只要linux系统启动，docker也就自动启动

8、给docker配置应用镜像下载加速（国外网站，下载应用镜像慢）

1）创建文件目录

```
sudo mkdir -p /etc/docker

```

2）配置镜像加速器地址

```
sudo tee /etc/docker/daemon.json <<-'EOF'
{
  "registry-mirrors": ["https://kru7klna.mirror.aliyuncs.com"]
}
EOF
```

3）重启docker的后台线程

```
sudo systemctl daemon-reload
```

4）重启docker服务

```
sudo systemctl restart docker
```

docker-compose 下载安装

```
curl -L https://get.daocloud.io/docker/compose/releases/download/1.27.4/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
```

售予执行权限

```
sudo chmod +x /usr/local/bin/docker-compose
```

