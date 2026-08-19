package p1039ud;

import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.C6636i;

/* JADX INFO: renamed from: ud.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20185b implements InterfaceC20190g {

    /* JADX INFO: renamed from: a */
    public final C6636i f63931a;

    public C20185b(C6636i c6636i) {
        this.f63931a = c6636i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20185b) && AbstractC16544l.m18089b(this.f63931a, ((C20185b) obj).f63931a);
    }

    public final int hashCode() {
        return this.f63931a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
