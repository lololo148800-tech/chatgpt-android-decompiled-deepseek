package p896n2;

import android.app.Notification;
import p228J.AbstractC3812N;
import p658b5.C11238i;

/* JADX INFO: renamed from: n2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C17463p extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public CharSequence f55822o0;

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: A */
    public final String mo4512A() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: i */
    public final void mo4531i(C11238i c11238i) {
        new Notification.BigTextStyle((Notification.Builder) c11238i.f34009Z).setBigContentTitle(null).bigText(this.f55822o0);
    }
}
