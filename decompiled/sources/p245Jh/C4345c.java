package p245Jh;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Jh.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4345c {
    public static final C4344b Companion = new C4344b();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f14137e = {null, null, null, new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f14138a;

    /* JADX INFO: renamed from: b */
    public final String f14139b;

    /* JADX INFO: renamed from: c */
    public final String f14140c;

    /* JADX INFO: renamed from: d */
    public final List f14141d;

    public /* synthetic */ C4345c(int i10, String str, String str2, String str3, List list) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C4343a.f14136a.getDescriptor());
            throw null;
        }
        this.f14138a = str;
        this.f14139b = str2;
        this.f14140c = str3;
        this.f14141d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4345c)) {
            return false;
        }
        C4345c c4345c = (C4345c) obj;
        return AbstractC16544l.m18089b(this.f14138a, c4345c.f14138a) && AbstractC16544l.m18089b(this.f14139b, c4345c.f14139b) && AbstractC16544l.m18089b(this.f14140c, c4345c.f14140c) && AbstractC16544l.m18089b(this.f14141d, c4345c.f14141d);
    }

    public final int hashCode() {
        return this.f14141d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f14138a.hashCode() * 31, 31, this.f14139b), 31, this.f14140c);
    }

    public final String toString() {
        return "█";
    }
}
