package ge;

import kotlin.jvm.internal.AbstractC16544l;
import p269Kh.C4688o;

/* JADX INFO: renamed from: ge.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C14110x implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final C4688o f44369a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14110x) && AbstractC16544l.m18089b(this.f44369a, ((C14110x) obj).f44369a);
    }

    public final int hashCode() {
        C4688o c4688o = this.f44369a;
        if (c4688o == null) {
            return 0;
        }
        return c4688o.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
