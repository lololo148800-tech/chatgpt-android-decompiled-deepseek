package p551Wf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Wf.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C8836c {
    public static final C8835b Companion = new C8835b();

    /* JADX INFO: renamed from: a */
    public final String f27025a;

    public /* synthetic */ C8836c(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f27025a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C8834a.f27024a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8836c) && AbstractC16544l.m18089b(this.f27025a, ((C8836c) obj).f27025a);
    }

    public final int hashCode() {
        String str = this.f27025a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
