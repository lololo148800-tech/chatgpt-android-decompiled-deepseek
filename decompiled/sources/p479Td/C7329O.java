package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.O */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7329O extends AbstractC7343b0 {
    public static final C7328N Companion = new C7328N();

    /* JADX INFO: renamed from: c */
    public final String f23236c;

    public C7329O(String fileId) {
        AbstractC16544l.m18094g(fileId, "fileId");
        this.f23236c = fileId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7329O) {
            return AbstractC16544l.m18089b(this.f23236c, ((C7329O) obj).f23236c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23236c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7329O(String str, int i10, boolean z6) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7327M.f23235a.getDescriptor());
            throw null;
        }
        this.f23236c = str;
    }
}
