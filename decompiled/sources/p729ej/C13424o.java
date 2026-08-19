package p729ej;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: ej.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C13424o implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final long f42507b;

    /* JADX INFO: renamed from: c */
    public final String f42508c;

    public C13424o(long j10, String str) {
        this.f42507b = j10;
        this.f42508c = str;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return (otherWorker instanceof C13424o) && AbstractC16544l.m18089b(((C13424o) otherWorker).f42508c, this.f42508c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13424o)) {
            return false;
        }
        C13424o c13424o = (C13424o) obj;
        return this.f42507b == c13424o.f42507b && AbstractC16544l.m18089b(this.f42508c, c13424o.f42508c);
    }

    public final int hashCode() {
        long j10 = this.f42507b;
        return this.f42508c.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C13423n(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimerWorker(delayMs=");
        sb2.append(this.f42507b);
        sb2.append(", key=");
        return AbstractC9306j0.m9892k(sb2, this.f42508c, ')');
    }
}
