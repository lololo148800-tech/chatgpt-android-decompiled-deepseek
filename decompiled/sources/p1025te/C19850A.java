package p1025te;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C19850A implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final Uri f62941a;

    public C19850A(Uri uri) {
        this.f62941a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19850A) && AbstractC16544l.m18089b(this.f62941a, ((C19850A) obj).f62941a);
    }

    public final int hashCode() {
        Uri uri = this.f62941a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
