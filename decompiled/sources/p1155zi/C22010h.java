package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22010h extends AbstractC22014i {
    public static final C22006g Companion = new C22006g();

    /* JADX INFO: renamed from: c */
    public final boolean f69650c;

    /* JADX INFO: renamed from: d */
    public final String f69651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22010h(int i10, String str, boolean z6, boolean z10) {
        super(z6);
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C22002f.f69640a.getDescriptor());
            throw null;
        }
        this.f69650c = z10;
        this.f69651d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22010h)) {
            return false;
        }
        C22010h c22010h = (C22010h) obj;
        return this.f69650c == c22010h.f69650c && AbstractC16544l.m18089b(this.f69651d, c22010h.f69651d);
    }

    public final int hashCode() {
        return this.f69651d.hashCode() + ((this.f69650c ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22010h(String ssoConnectionName, boolean z6) {
        super(z6, 0);
        AbstractC16544l.m18094g(ssoConnectionName, "ssoConnectionName");
        this.f69650c = z6;
        this.f69651d = ssoConnectionName;
    }
}
