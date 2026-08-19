package p519V4;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: renamed from: V4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7753a {
    /* JADX INFO: renamed from: a */
    public static void m8013a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j10, pendingIntent);
    }
}
