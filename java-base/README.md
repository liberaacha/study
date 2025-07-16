# 平常工作开发笔记

## Stream 流

### list to map

```java
    public List<User> buildUsers() {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 2; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("carl" + i);
            user.setAge(18);
            users.add(user);
        }
        return users;
    }

    @Test
    public void listToMap() {
        List<User> users = buildUsers();
        Map<Long, User> map = users.stream().collect(Collectors.toMap(User::getId, Function.identity()));
        map.entrySet().forEach(System.out::println);
    }
```