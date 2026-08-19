package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p437Rn.C6949g;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Td.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7370u extends AbstractC7343b0 {
    public static final C7366q Companion = new C7366q();

    /* JADX INFO: renamed from: c */
    public final String f23370c;

    /* JADX INFO: renamed from: d */
    public final C17314q f23371d;

    public C7370u(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f23370c = text;
        this.f23371d = AbstractC9227W.m9800c(new C6949g(this, 7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7370u) && AbstractC16544l.m18089b(this.f23370c, ((C7370u) obj).f23370c);
    }

    public final int hashCode() {
        return this.f23370c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7370u(String str, int i10, boolean z6) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7365p.f23364a.getDescriptor());
            throw null;
        }
        this.f23370c = str;
        this.f23371d = AbstractC9227W.m9800c(new C6949g(this, 7));
    }
}
