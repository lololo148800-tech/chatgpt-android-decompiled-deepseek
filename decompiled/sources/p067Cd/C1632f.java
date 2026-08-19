package p067Cd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Cd.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1632f {
    public static final C1631e Companion = new C1631e();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f4621e = {null, null, null, new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f4622a;

    /* JADX INFO: renamed from: b */
    public final boolean f4623b;

    /* JADX INFO: renamed from: c */
    public final boolean f4624c;

    /* JADX INFO: renamed from: d */
    public final List f4625d;

    public C1632f(String messageId, List disclaimers, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(disclaimers, "disclaimers");
        this.f4622a = messageId;
        this.f4623b = z6;
        this.f4624c = z10;
        this.f4625d = disclaimers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1632f)) {
            return false;
        }
        C1632f c1632f = (C1632f) obj;
        return AbstractC16544l.m18089b(this.f4622a, c1632f.f4622a) && this.f4623b == c1632f.f4623b && this.f4624c == c1632f.f4624c && AbstractC16544l.m18089b(this.f4625d, c1632f.f4625d);
    }

    public final int hashCode() {
        return this.f4625d.hashCode() + (((((this.f4622a.hashCode() * 31) + (this.f4623b ? 1231 : 1237)) * 31) + (this.f4624c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C1632f(int i10, String str, List list, boolean z6, boolean z10) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1630d.f4620a.getDescriptor());
            throw null;
        }
        this.f4622a = str;
        this.f4623b = z6;
        this.f4624c = z10;
        this.f4625d = list;
    }
}
