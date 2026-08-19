package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21965U0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7373x extends AbstractC7343b0 {
    public static final C7372w Companion = new C7372w();

    /* JADX INFO: renamed from: c */
    public final C21965U0 f23373c;

    public C7373x(C21965U0 content) {
        AbstractC16544l.m18094g(content, "content");
        this.f23373c = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7373x) && AbstractC16544l.m18089b(this.f23373c, ((C7373x) obj).f23373c);
    }

    public final int hashCode() {
        return this.f23373c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7373x(int i10, boolean z6, C21965U0 c21965u0) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7371v.f23372a.getDescriptor());
            throw null;
        }
        this.f23373c = c21965u0;
    }
}
