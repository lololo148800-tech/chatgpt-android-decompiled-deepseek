package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C14112y implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44439a;

    public C14112y(String str) {
        this.f44439a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14112y) {
            return AbstractC16544l.m18089b(this.f44439a, ((C14112y) obj).f44439a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44439a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
