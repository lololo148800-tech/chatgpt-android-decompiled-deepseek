package p550We;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: We.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C8823d {
    public static final C8822c Companion = new C8822c();

    /* JADX INFO: renamed from: a */
    public final String f27008a;

    /* JADX INFO: renamed from: b */
    public final boolean f27009b;

    public /* synthetic */ C8823d(String str, int i10, boolean z6) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C8821b.f27007a.getDescriptor());
            throw null;
        }
        this.f27008a = str;
        this.f27009b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8823d)) {
            return false;
        }
        C8823d c8823d = (C8823d) obj;
        return AbstractC16544l.m18089b(this.f27008a, c8823d.f27008a) && this.f27009b == c8823d.f27009b;
    }

    public final int hashCode() {
        return (this.f27008a.hashCode() * 31) + (this.f27009b ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
