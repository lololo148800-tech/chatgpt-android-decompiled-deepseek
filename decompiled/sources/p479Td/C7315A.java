package p479Td;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C21940M0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7315A extends AbstractC7343b0 {
    public static final C7375z Companion = new C7375z();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f23211d = {null, new C11158d(C21940M0.f69493a, 0)};

    /* JADX INFO: renamed from: c */
    public final List f23212c;

    public C7315A(List content) {
        AbstractC16544l.m18094g(content, "content");
        this.f23212c = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7315A) && AbstractC16544l.m18089b(this.f23212c, ((C7315A) obj).f23212c);
    }

    public final int hashCode() {
        return this.f23212c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7315A(int i10, boolean z6, List list) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7374y.f23374a.getDescriptor());
            throw null;
        }
        this.f23212c = list;
    }
}
