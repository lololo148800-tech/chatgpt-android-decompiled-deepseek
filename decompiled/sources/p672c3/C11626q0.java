package p672c3;

import android.widget.RemoteViews;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: c3.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11626q0 {

    /* JADX INFO: renamed from: a */
    public final RemoteViews f35231a;

    /* JADX INFO: renamed from: b */
    public final C11600d0 f35232b;

    public C11626q0(RemoteViews remoteViews, C11600d0 c11600d0) {
        this.f35231a = remoteViews;
        this.f35232b = c11600d0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11626q0)) {
            return false;
        }
        C11626q0 c11626q0 = (C11626q0) obj;
        return AbstractC16544l.m18089b(this.f35231a, c11626q0.f35231a) && AbstractC16544l.m18089b(this.f35232b, c11626q0.f35232b);
    }

    public final int hashCode() {
        return this.f35232b.hashCode() + (this.f35231a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f35231a + ", view=" + this.f35232b + ')';
    }
}
