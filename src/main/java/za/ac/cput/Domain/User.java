package za.ac.cput.Domain;

public class User {

        private String userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        private User(){
        }//Default constructor

        //Constructor with builder.
        public User(Builder builder){
                this.userId = builder.userId;
                this.firstName = builder.firstName;
                this.lastName = builder.lastName;
                this.email = builder.email;
                this.password = builder.password;
        }
        //Getters with.
        public String getUserId() {
                return userId;
        }
        public String getFirstName() {
                return firstName;
        }
        public String getLastName() {
                return lastName;
        }
        public String getEmail() {
                return email;
        }
        public String getPassword() {
                return password;
        }

        @Override
        public String toString() {
                return "User{" +
                        "userId='" + userId + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", email='" + email + '\'' +
                        ", password='" + password + '\'' +
                        '}';
        }

        //Builder class
        public static class Builder{
                private String userId;
                private String firstName;
                private String lastName;
                private String email;
                private String password;

                //Setter using builder
                public Builder setUserId(String userId){
                        this.userId = userId;
                        return this;
                }
                public Builder setFirstName(String firstName){
                        this.firstName = firstName;
                        return this;
                }
                public Builder setLastName(String lastName){
                        this.lastName = lastName;
                        return this;
                }
                public Builder setEmail(String email){
                        this.email = email;
                        return this;
                }
                public Builder setPassword(String password){
                        this.password = password;
                        return this;
                }
                //Copy of builder for set and changing since it is immutable
                public Builder copy(User user){
                        this.userId = user.userId;
                        this.firstName = user.firstName;
                        this.lastName = user.lastName;
                        this.email = user.email;
                        this.password = user.password;
                        return this;
                }
                public User build(){
                        return new User(this);
                }
        }
}


