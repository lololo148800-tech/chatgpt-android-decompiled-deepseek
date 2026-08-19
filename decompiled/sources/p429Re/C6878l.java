package p429Re;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.EnumC21896B0;

/* JADX INFO: renamed from: Re.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6878l implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final EnumC21896B0 f22061a;

    /* JADX INFO: renamed from: b */
    public final C6877k f22062b;

    public C6878l(EnumC21896B0 enumC21896B0, C6877k c6877k) {
        this.f22061a = enumC21896B0;
        this.f22062b = c6877k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6878l)) {
            return false;
        }
        C6878l c6878l = (C6878l) obj;
        return this.f22061a == c6878l.f22061a && AbstractC16544l.m18089b(this.f22062b, c6878l.f22062b);
    }

    public final int hashCode() {
        return this.f22062b.hashCode() + (this.f22061a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
