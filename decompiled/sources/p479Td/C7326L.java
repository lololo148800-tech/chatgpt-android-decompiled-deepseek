package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.L */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7326L extends AbstractC7343b0 {
    public static final C7325K Companion = new C7325K();

    /* JADX INFO: renamed from: c */
    public final String f23233c;

    /* JADX INFO: renamed from: d */
    public final boolean f23234d;

    public C7326L(String content) {
        AbstractC16544l.m18094g(content, "content");
        this.f23233c = content;
        this.f23234d = AbstractC21322p.m21681O(content);
    }

    @Override // p479Td.AbstractC7343b0
    /* JADX INFO: renamed from: a */
    public final boolean mo7777a() {
        return this.f23234d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7326L) && AbstractC16544l.m18089b(this.f23233c, ((C7326L) obj).f23233c);
    }

    public final int hashCode() {
        return this.f23233c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7326L(String str, int i10, boolean z6) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7324J.f23232a.getDescriptor());
            throw null;
        }
        this.f23233c = str;
        this.f23234d = AbstractC21322p.m21681O(str);
    }
}
