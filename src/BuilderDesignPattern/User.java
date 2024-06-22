package BuilderDesignPattern;

public class User {

	private final String userId;
	private final String userName;
	private final String userEmailId;

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.userEmailId = builder.userEmailId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmailId=" + userEmailId + "]";
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	// inner builder class

	static class UserBuilder {

		public String userId;
		public String userName;
		public String userEmailId;

		public UserBuilder() {

		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setUserEmailId(String userEmailId) {
			this.userEmailId = userEmailId;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}
