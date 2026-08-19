package p1025te;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C19887r implements InterfaceC19888s {

    /* JADX INFO: renamed from: a */
    public final Uri f63033a;

    public C19887r(Uri file) {
        AbstractC16544l.m18094g(file, "file");
        this.f63033a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19887r) && AbstractC16544l.m18089b(this.f63033a, ((C19887r) obj).f63033a);
    }

    public final int hashCode() {
        return this.f63033a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
