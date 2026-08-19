package p1025te;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC7845A4;

/* JADX INFO: renamed from: te.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C19867S extends AbstractC7845A4 {

    /* JADX INFO: renamed from: a */
    public final Uri f62996a;

    /* JADX INFO: renamed from: b */
    public final C19874e f62997b;

    public C19867S(Uri uri, C19874e c19874e) {
        this.f62996a = uri;
        this.f62997b = c19874e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19867S)) {
            return false;
        }
        C19867S c19867s = (C19867S) obj;
        return AbstractC16544l.m18089b(this.f62996a, c19867s.f62996a) && AbstractC16544l.m18089b(this.f62997b, c19867s.f62997b);
    }

    public final int hashCode() {
        return this.f62997b.hashCode() + (this.f62996a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
