package p319Mi;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.EnumC21946N2;

/* JADX INFO: renamed from: Mi.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5447i implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final EnumC21946N2 f17794a;

    /* JADX INFO: renamed from: b */
    public final boolean f17795b;

    /* JADX INFO: renamed from: c */
    public final boolean f17796c;

    public C5447i(EnumC21946N2 trainingType, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(trainingType, "trainingType");
        this.f17794a = trainingType;
        this.f17795b = z6;
        this.f17796c = z10;
    }

    /* JADX INFO: renamed from: e */
    public static C5447i m5905e(C5447i c5447i, boolean z6, boolean z10, int i10) {
        EnumC21946N2 trainingType = c5447i.f17794a;
        if ((i10 & 2) != 0) {
            z6 = c5447i.f17795b;
        }
        if ((i10 & 4) != 0) {
            z10 = c5447i.f17796c;
        }
        c5447i.getClass();
        AbstractC16544l.m18094g(trainingType, "trainingType");
        return new C5447i(trainingType, z6, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5447i)) {
            return false;
        }
        C5447i c5447i = (C5447i) obj;
        return this.f17794a == c5447i.f17794a && this.f17795b == c5447i.f17795b && this.f17796c == c5447i.f17796c;
    }

    public final int hashCode() {
        return (((this.f17794a.hashCode() * 31) + (this.f17795b ? 1231 : 1237)) * 31) + (this.f17796c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
