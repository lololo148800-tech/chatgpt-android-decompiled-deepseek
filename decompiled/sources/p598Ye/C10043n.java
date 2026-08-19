package p598Ye;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ye.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10043n {
    public static final C10042m Companion = new C10042m();

    /* JADX INFO: renamed from: a */
    public final String f29747a;

    public /* synthetic */ C10043n(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f29747a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C10041l.f29746a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10043n) && AbstractC16544l.m18089b(this.f29747a, ((C10043n) obj).f29747a);
    }

    public final int hashCode() {
        String str = this.f29747a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
