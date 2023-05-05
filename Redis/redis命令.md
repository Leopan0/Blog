# Redis 命令

## 管理命令

#### 获取默认密码

```shell
config get requirepass
```

#### 设置密码

```shell
config set requirepass "你的密码"
```



## 基础命令

redis 登录命令

```powershell
redis-cli.exe -h <host> -p <password>
```

列出所有key

```powershell
keys *
```

切换数据库实例

```powershell
select <库编号>
```

删除key

```powershell
del <key>
```

获取key

```powershell
get <key>
```

清空当前库

```powershell
flushdb
```

清空所有库

```powershell
flushall
```

## 值设置

### String 类型

设置key-value

```powershell
set <key> <value>
```

获取value

```powershell
get <key>
```

### Hash 类型

设置值

``` powershell
hmset <key> [<hashKey> <value>]
```

获取值

```powershell
# 获取所有值
hgetall <key>
# 获取hash值
hget <key> <hashKey>
```

### List 类型

插入值

```powershell
# 左插入
lpush key [<value>] 
# 右插入
rpush key [<value>]
```

获取值

```powershell
#列出值
lrange key <开始下标> <结束下标>
```

