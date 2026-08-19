package p245Jh;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Jh.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4348f {
    public static final C4347e Companion = new C4347e();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f14143e = {new C11158d(C4352j.f14154a, 0), new C11158d(C4355m.f14169a, 0), null, new C11158d(C4343a.f14136a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f14144a;

    /* JADX INFO: renamed from: b */
    public final List f14145b;

    /* JADX INFO: renamed from: c */
    public final String f14146c;

    /* JADX INFO: renamed from: d */
    public final List f14147d;

    public /* synthetic */ C4348f(int i10, List list, List list2, String str, List list3) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C4346d.f14142a.getDescriptor());
            throw null;
        }
        this.f14144a = list;
        this.f14145b = list2;
        this.f14146c = str;
        this.f14147d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4348f)) {
            return false;
        }
        C4348f c4348f = (C4348f) obj;
        return AbstractC16544l.m18089b(this.f14144a, c4348f.f14144a) && AbstractC16544l.m18089b(this.f14145b, c4348f.f14145b) && AbstractC16544l.m18089b(this.f14146c, c4348f.f14146c) && AbstractC16544l.m18089b(this.f14147d, c4348f.f14147d);
    }

    public final int hashCode() {
        return this.f14147d.hashCode() + AbstractC0168G.m527p(AbstractC14376f.m15858x(this.f14145b, this.f14144a.hashCode() * 31, 31), 31, this.f14146c);
    }

    public final String toString() {
        return "█";
    }
}
