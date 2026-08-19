package p871lf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: lf.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16919c {
    public static final C16918b Companion = new C16918b();

    /* JADX INFO: renamed from: a */
    public final String f54359a;

    public C16919c(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f54359a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C16917a.f54358a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16919c) {
            return AbstractC16544l.m18089b(this.f54359a, ((C16919c) obj).f54359a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54359a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
