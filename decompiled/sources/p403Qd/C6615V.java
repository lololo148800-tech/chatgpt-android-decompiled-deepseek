package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p168Gd.C3034b;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.V */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6615V extends AbstractC6653q0 {
    public static final C6614U Companion = new C6614U();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f21341d = {C3034b.Companion.serializer(), null};

    /* JADX INFO: renamed from: b */
    public final C3034b f21342b;

    /* JADX INFO: renamed from: c */
    public final boolean f21343c;

    public /* synthetic */ C6615V(int i10, C3034b c3034b, boolean z6) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C6613T.f21340a.getDescriptor());
            throw null;
        }
        this.f21342b = c3034b;
        this.f21343c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6615V)) {
            return false;
        }
        C6615V c6615v = (C6615V) obj;
        return AbstractC16544l.m18089b(this.f21342b, c6615v.f21342b) && this.f21343c == c6615v.f21343c;
    }

    public final int hashCode() {
        C3034b c3034b = this.f21342b;
        return ((c3034b == null ? 0 : c3034b.hashCode()) * 31) + (this.f21343c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C6615V(C3034b c3034b, boolean z6) {
        this.f21342b = c3034b;
        this.f21343c = z6;
    }
}
