package com.nowcoder.model;

// 叶神 知乎项目高级课 02 代码：

public class User {
  private int id;

  private String name;

  private String password;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getHeadUrl() {
    return headUrl;
  }

  public void setHeadUrl(String headUrl) {
    this.headUrl = headUrl;
  }

  // 使用salt字段的目的是为了提高密码的破解难度（将salt和密码连接后再对密码进行md5加密）；
  private String salt;

  private String headUrl;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User() {}

  public User(String name) {
    this.name = name;
    this.salt = "";
    this.headUrl = "";
    this.password = "";
  }

  public String getDescription() {
    return "This is " + name;
  }
}
