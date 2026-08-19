package p1025te;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C19856G implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final Uri f62948a;

    public C19856G(Uri file) {
        AbstractC16544l.m18094g(file, "file");
        this.f62948a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19856G) && AbstractC16544l.m18089b(this.f62948a, ((C19856G) obj).f62948a);
    }

    public final int hashCode() {
        return this.f62948a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
