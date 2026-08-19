package p928oh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: oh.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18199f {
    public static final C18198e Companion = new C18198e();

    /* JADX INFO: renamed from: a */
    public final String f58027a;

    public /* synthetic */ C18199f(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f58027a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C18197d.f58026a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18199f) && AbstractC16544l.m18089b(this.f58027a, ((C18199f) obj).f58027a);
    }

    public final int hashCode() {
        return this.f58027a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
