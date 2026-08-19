package p1025te;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C19894y implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final Uri f63040a;

    public C19894y(Uri file) {
        AbstractC16544l.m18094g(file, "file");
        this.f63040a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19894y) && AbstractC16544l.m18089b(this.f63040a, ((C19894y) obj).f63040a);
    }

    public final int hashCode() {
        return this.f63040a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
