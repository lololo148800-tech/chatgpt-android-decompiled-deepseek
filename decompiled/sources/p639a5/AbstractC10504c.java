package p639a5;

import android.app.Notification;
import android.app.Service;

/* JADX INFO: renamed from: a5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10504c {
    /* JADX INFO: renamed from: a */
    public static void m10963a(Service service, int i10, Notification notification, int i11) {
        service.startForeground(i10, notification, i11);
    }
}
