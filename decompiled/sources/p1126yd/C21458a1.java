package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.a1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21458a1 implements InterfaceC21445U0 {
    public static final C21455Z0 Companion = new C21455Z0();

    /* JADX INFO: renamed from: a */
    public final String f68048a;

    public /* synthetic */ C21458a1(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f68048a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C21453Y0.f68044a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21458a1) && AbstractC16544l.m18089b(this.f68048a, ((C21458a1) obj).f68048a);
    }

    public final int hashCode() {
        return this.f68048a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C21458a1(String title) {
        AbstractC16544l.m18094g(title, "title");
        this.f68048a = title;
    }
}
