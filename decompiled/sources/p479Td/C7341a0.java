package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p437Rn.C6949g;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Td.a0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7341a0 extends AbstractC7343b0 {
    public static final C7333T Companion = new C7333T();

    /* JADX INFO: renamed from: c */
    public final String f23250c;

    /* JADX INFO: renamed from: d */
    public final C17314q f23251d;

    public C7341a0(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f23250c = text;
        this.f23251d = AbstractC9227W.m9800c(new C6949g(this, 9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7341a0) && AbstractC16544l.m18089b(this.f23250c, ((C7341a0) obj).f23250c);
    }

    public final int hashCode() {
        return this.f23250c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7341a0(String str, int i10, boolean z6) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7332S.f23239a.getDescriptor());
            throw null;
        }
        this.f23250c = str;
        this.f23251d = AbstractC9227W.m9800c(new C6949g(this, 9));
    }
}
