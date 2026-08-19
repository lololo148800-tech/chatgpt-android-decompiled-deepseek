package p384Ph;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ph.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6416f {
    public static final C6415e Companion = new C6415e();

    /* JADX INFO: renamed from: a */
    public final String f20863a;

    public /* synthetic */ C6416f(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f20863a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C6414d.f20862a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6416f) && AbstractC16544l.m18089b(this.f20863a, ((C6416f) obj).f20863a);
    }

    public final int hashCode() {
        return this.f20863a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
