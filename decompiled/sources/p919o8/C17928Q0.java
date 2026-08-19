package p919o8;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: o8.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17928Q0 {

    /* JADX INFO: renamed from: a */
    public final String f57142a;

    public C17928Q0(String str) {
        this.f57142a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17928Q0) && AbstractC16544l.m18089b(this.f57142a, ((C17928Q0) obj).f57142a);
    }

    public final int hashCode() {
        return this.f57142a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57142a, bQBnquXS.etePzlrghXT, new StringBuilder("ContainerView(id="));
    }
}
