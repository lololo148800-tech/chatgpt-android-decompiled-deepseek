package p821j1;

import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p759g1.C13803e;
import p774h1.InterfaceC14362r;

/* JADX INFO: renamed from: j1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16036a {

    /* JADX INFO: renamed from: a */
    public InterfaceC7537b f49474a;

    /* JADX INFO: renamed from: b */
    public EnumC7546k f49475b;

    /* JADX INFO: renamed from: c */
    public InterfaceC14362r f49476c;

    /* JADX INFO: renamed from: d */
    public long f49477d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16036a)) {
            return false;
        }
        C16036a c16036a = (C16036a) obj;
        return AbstractC16544l.m18089b(this.f49474a, c16036a.f49474a) && this.f49475b == c16036a.f49475b && AbstractC16544l.m18089b(this.f49476c, c16036a.f49476c) && C13803e.m15330b(this.f49477d, c16036a.f49477d);
    }

    public final int hashCode() {
        int iHashCode = (this.f49476c.hashCode() + ((this.f49475b.hashCode() + (this.f49474a.hashCode() * 31)) * 31)) * 31;
        long j10 = this.f49477d;
        return ((int) (j10 ^ (j10 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f49474a + ", layoutDirection=" + this.f49475b + ", canvas=" + this.f49476c + ", size=" + ((Object) C13803e.m15335g(this.f49477d)) + ')';
    }
}
