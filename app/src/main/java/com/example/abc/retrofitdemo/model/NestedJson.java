package com.example.abc.retrofitdemo.model;

import java.io.Serializable;

/**
 * Created by "Nilesh Senta" on 12/11/2015.
 */
public class NestedJson implements Serializable {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String gender;

    private ExtraEntity Extra;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setExtra(ExtraEntity Extra) {
        this.Extra = Extra;
    }

    public String getUserName() {
        return userName;
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

    public String getMobile() {
        return mobile;
    }

    public String getGender() {
        return gender;
    }

    public ExtraEntity getExtra() {
        return Extra;
    }

    public static class ExtraEntity {
        private String firstName;
        private String lastName;
        private String middleName;

        private SubEntity Sub;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public void setSub(SubEntity Sub) {
            this.Sub = Sub;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public SubEntity getSub() {
            return Sub;
        }

        public static class SubEntity {
            private String S1;
            private String S2;
            private String S3;
            private String S4;
            private String S5;
            private String S6;
            private String S7;

            public void setS1(String S1) {
                this.S1 = S1;
            }

            public void setS2(String S2) {
                this.S2 = S2;
            }

            public void setS3(String S3) {
                this.S3 = S3;
            }

            public void setS4(String S4) {
                this.S4 = S4;
            }

            public void setS5(String S5) {
                this.S5 = S5;
            }

            public void setS6(String S6) {
                this.S6 = S6;
            }

            public void setS7(String S7) {
                this.S7 = S7;
            }

            public String getS1() {
                return S1;
            }

            public String getS2() {
                return S2;
            }

            public String getS3() {
                return S3;
            }

            public String getS4() {
                return S4;
            }

            public String getS5() {
                return S5;
            }

            public String getS6() {
                return S6;
            }

            public String getS7() {
                return S7;
            }
        }
    }
}
