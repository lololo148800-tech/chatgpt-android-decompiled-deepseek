package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.E */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0911E extends AbstractC0888A0 {
    public static final C0905D Companion = new C0905D();

    /* JADX INFO: renamed from: a */
    public final Integer f2644a;

    /* JADX INFO: renamed from: b */
    public final Integer f2645b;

    /* JADX INFO: renamed from: c */
    public final String f2646c;

    /* JADX INFO: renamed from: d */
    public final String f2647d;

    /* JADX INFO: renamed from: e */
    public final String f2648e;

    public C0911E(int i10, Integer num, Integer num2, String str, String str2, String str3) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C0899C.f2626a.getDescriptor());
            throw null;
        }
        this.f2644a = num;
        this.f2645b = num2;
        this.f2646c = str;
        this.f2647d = str2;
        if ((i10 & 16) == 0) {
            this.f2648e = "calculator";
        } else {
            this.f2648e = str3;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2645b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2644a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2648e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0911E)) {
            return false;
        }
        C0911E c0911e = (C0911E) obj;
        return AbstractC16544l.m18089b(this.f2644a, c0911e.f2644a) && AbstractC16544l.m18089b(this.f2645b, c0911e.f2645b) && AbstractC16544l.m18089b(this.f2646c, c0911e.f2646c) && AbstractC16544l.m18089b(this.f2647d, c0911e.f2647d) && AbstractC16544l.m18089b(this.f2648e, c0911e.f2648e);
    }

    public final int hashCode() {
        Integer num = this.f2644a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2645b;
        return this.f2648e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f2646c), 31, this.f2647d);
    }

    public final String toString() {
        return "█";
    }
}
