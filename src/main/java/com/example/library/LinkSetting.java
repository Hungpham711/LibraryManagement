package com.example.library;

public enum LinkSetting {

    API_URL("AIzaSyCZ9Ee9DuenXY5gvW6IcKh_NhTMnB5U4qM"),

    DATABASE_USER_URL("jdbc:mysql://localhost:3307/useraccount"),
    DATABASE_USER_NAME("root"),
    DATABASE_USER_PASSWORD("bongbibo9"),

    DATABASE_MANAGER_URL("jdbc:mysql://localhost:3307/manageraccount"),
    DATABASE_MANAGER_NAME("root"),
    DATABASE_MANAGER_PASSWORD("bongbibo9"),

    MANAGER_LIST_FILE_PATH("C:\\YEAR 2\\OOP\\JavaFX\\Bai tap lon _ Thu VIen\\data\\ListOfManagers.txt"),

    IMAGE_NULL("/com/example/library/assets/Picture_is_not_available.png"),

    SOUND_CLICK_MOUSE("/com/example/library/assets/mouse-click-153941.mp3"),
    MAIN_SOUND_1("/com/example/library/assets/mainSound1.mp3"),
    MAIN_SOUND_2("/com/example/library/assets/mainSound2.mp3"),
    MAIN_SOUND_3("/com/example/library/assets/mainSound3.mp3"),
    MAIN_SOUND_4("/com/example/library/assets/mainSound4.mp3"),
    MAIN_SOUND_5("/com/example/library/assets/mainSound5.mp3"),

    AVATAR_1("/com/example/library/assets/ava1.gif"),
    AVATAR_2("/com/example/library/assets/ava2.gif"),
    AVATAR_3("/com/example/library/assets/ava3.gif"),
    AVATAR_4("/com/example/library/assets/ava4.gif"),
    AVATAR_5("/com/example/library/assets/ava5.gif"),
    AVATAR_6("/com/example/library/assets/ava6.gif"),
    AVATAR_7("/com/example/library/assets/ava7.gif"),
    AVATAR_8("/com/example/library/assets/ava8.gif"),
    AVATAR_9("/com/example/library/assets/ava9.gif"),
    AVATAR_0("/com/example/library/assets/ava0.gif");

    private final String str;

    LinkSetting(String str) {
        this.str = str;
    }

    public String getLink() {
        return str;
    }
}
