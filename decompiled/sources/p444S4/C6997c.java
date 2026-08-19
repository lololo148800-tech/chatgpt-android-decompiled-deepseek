package p444S4;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: S4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6997c {

    /* JADX INFO: renamed from: a */
    public final Uri f22389a;

    /* JADX INFO: renamed from: b */
    public final boolean f22390b;

    public C6997c(boolean z6, Uri uri) {
        this.f22389a = uri;
        this.f22390b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6997c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C6997c c6997c = (C6997c) obj;
        return AbstractC16544l.m18089b(this.f22389a, c6997c.f22389a) && this.f22390b == c6997c.f22390b;
    }

    public final int hashCode() {
        return (this.f22389a.hashCode() * 31) + (this.f22390b ? 1231 : 1237);
    }
}
