package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21947O;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7344c extends AbstractC7343b0 {
    public static final C7342b Companion = new C7342b();

    /* JADX INFO: renamed from: c */
    public final C21947O f23254c;

    /* JADX INFO: renamed from: d */
    public final boolean f23255d;

    public C7344c(C21947O c21947o, boolean z6) {
        this.f23254c = c21947o;
        this.f23255d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7344c)) {
            return false;
        }
        C7344c c7344c = (C7344c) obj;
        return AbstractC16544l.m18089b(this.f23254c, c7344c.f23254c) && this.f23255d == c7344c.f23255d;
    }

    public final int hashCode() {
        C21947O c21947o = this.f23254c;
        return ((c21947o == null ? 0 : c21947o.hashCode()) * 31) + (this.f23255d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7344c(int i10, boolean z6, C21947O c21947o, boolean z10) {
        super(i10, z6);
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C7340a.f23249a.getDescriptor());
            throw null;
        }
        this.f23254c = c21947o;
        if ((i10 & 4) == 0) {
            this.f23255d = false;
        } else {
            this.f23255d = z10;
        }
    }
}
