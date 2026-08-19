package p193Hf;

import ao.AbstractC11153a0;
import bo.C11527o;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p929oi.AbstractC18201b;
import sl.AbstractC19667b;

/* JADX INFO: renamed from: Hf.I */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3311I {
    public static final C3309H Companion = new C3309H();

    /* JADX INFO: renamed from: a */
    public final String f10088a;

    /* JADX INFO: renamed from: b */
    public final String f10089b;

    public C3311I(InterfaceC3305F msg) {
        AbstractC16544l.m18094g(msg, "msg");
        C11527o c11527o = AbstractC18201b.f58034a;
        c11527o.getClass();
        this.f10088a = AbstractC19667b.m20646b(c11527o.m12905d(InterfaceC3305F.Companion.serializer(), msg));
        this.f10089b = "canmore_native";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3311I)) {
            return false;
        }
        C3311I c3311i = (C3311I) obj;
        return AbstractC16544l.m18089b(this.f10088a, c3311i.f10088a) && AbstractC16544l.m18089b(this.f10089b, c3311i.f10089b);
    }

    public final int hashCode() {
        return this.f10089b.hashCode() + (this.f10088a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C3311I(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C3307G.f10071a.getDescriptor());
            throw null;
        }
        this.f10088a = str;
        if ((i10 & 2) == 0) {
            this.f10089b = "canmore_native";
        } else {
            this.f10089b = str2;
        }
    }
}
