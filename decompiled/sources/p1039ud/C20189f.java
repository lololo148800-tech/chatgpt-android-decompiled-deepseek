package p1039ud;

import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.C6636i;

/* JADX INFO: renamed from: ud.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20189f implements InterfaceC20190g {

    /* JADX INFO: renamed from: a */
    public final C6636i f63935a;

    public C20189f(C6636i c6636i) {
        this.f63935a = c6636i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20189f) && AbstractC16544l.m18089b(this.f63935a, ((C20189f) obj).f63935a);
    }

    public final int hashCode() {
        return this.f63935a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
