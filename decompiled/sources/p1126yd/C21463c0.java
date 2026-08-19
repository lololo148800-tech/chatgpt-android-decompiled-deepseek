package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.c0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21463c0 implements InterfaceC21409C {
    public static final C21460b0 Companion = new C21460b0();

    /* JADX INFO: renamed from: a */
    public final String f68062a;

    /* JADX INFO: renamed from: b */
    public final String f68063b;

    public C21463c0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21457a0.f68047a.getDescriptor());
            throw null;
        }
        this.f68062a = str;
        this.f68063b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21463c0)) {
            return false;
        }
        C21463c0 c21463c0 = (C21463c0) obj;
        return AbstractC16544l.m18089b(this.f68062a, c21463c0.f68062a) && AbstractC16544l.m18089b(this.f68063b, c21463c0.f68063b);
    }

    public final int hashCode() {
        return this.f68063b.hashCode() + (this.f68062a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
