package p1025te;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C19861L implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final List f62953a;

    public C19861L(List files) {
        AbstractC16544l.m18094g(files, "files");
        this.f62953a = files;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19861L) && AbstractC16544l.m18089b(this.f62953a, ((C19861L) obj).f62953a);
    }

    public final int hashCode() {
        return this.f62953a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
