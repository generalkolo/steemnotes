package com.semanientreprise.steemnotes.Model;

import io.realm.RealmObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class notificationDetails extends RealmObject {
    String message;
    String title;
    String userImage;
    String date;
}
