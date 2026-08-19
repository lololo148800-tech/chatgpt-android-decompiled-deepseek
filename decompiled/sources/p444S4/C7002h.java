package p444S4;

import android.app.Notification;

/* JADX INFO: renamed from: S4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7002h {

    /* JADX INFO: renamed from: a */
    public final int f22409a;

    /* JADX INFO: renamed from: b */
    public final int f22410b;

    /* JADX INFO: renamed from: c */
    public final Notification f22411c;

    public C7002h(int i10, Notification notification, int i11) {
        this.f22409a = i10;
        this.f22411c = notification;
        this.f22410b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7002h.class != obj.getClass()) {
            return false;
        }
        C7002h c7002h = (C7002h) obj;
        if (this.f22409a == c7002h.f22409a && this.f22410b == c7002h.f22410b) {
            return this.f22411c.equals(c7002h.f22411c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22411c.hashCode() + (((this.f22409a * 31) + this.f22410b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f22409a + ", mForegroundServiceType=" + this.f22410b + ", mNotification=" + this.f22411c + '}';
    }
}
