package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p437Rn.C6949g;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Td.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7362m extends AbstractC7343b0 {
    public static final C7361l Companion = new C7361l();

    /* JADX INFO: renamed from: c */
    public final String f23356c;

    public C7362m(String text) {
        AbstractC16544l.m18094g(text, "text");
        this.f23356c = text;
        AbstractC9227W.m9800c(new C6949g(this, 6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7362m) && AbstractC16544l.m18089b(this.f23356c, ((C7362m) obj).f23356c);
    }

    public final int hashCode() {
        return this.f23356c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7362m(String str, int i10, boolean z6) {
        super(i10, z6);
        if (2 == (i10 & 2)) {
            this.f23356c = str;
            AbstractC9227W.m9800c(new C6949g(this, 6));
            return;
        }
        AbstractC11153a0.m12389l(i10, 2, C7358j.f23335a.getDescriptor());
        throw null;
    }
}
