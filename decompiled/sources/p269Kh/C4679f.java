package p269Kh;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Kh.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4679f {
    public static final C4678e Companion = new C4678e();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f15227d = {null, new C11158d(C4686m.f15250a, 0), null};

    /* JADX INFO: renamed from: a */
    public final C4684k f15228a;

    /* JADX INFO: renamed from: b */
    public final List f15229b;

    /* JADX INFO: renamed from: c */
    public final C4688o f15230c;

    public /* synthetic */ C4679f(int i10, C4684k c4684k, List list, C4688o c4688o) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C4677d.f15226a.getDescriptor());
            throw null;
        }
        this.f15228a = c4684k;
        this.f15229b = list;
        this.f15230c = c4688o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4679f)) {
            return false;
        }
        C4679f c4679f = (C4679f) obj;
        return AbstractC16544l.m18089b(this.f15228a, c4679f.f15228a) && AbstractC16544l.m18089b(this.f15229b, c4679f.f15229b) && AbstractC16544l.m18089b(this.f15230c, c4679f.f15230c);
    }

    public final int hashCode() {
        return this.f15230c.hashCode() + AbstractC14376f.m15858x(this.f15229b, this.f15228a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "█";
    }

    public C4679f(C4684k category, List list, C4688o defaultModel) {
        AbstractC16544l.m18094g(category, "category");
        AbstractC16544l.m18094g(defaultModel, "defaultModel");
        this.f15228a = category;
        this.f15229b = list;
        this.f15230c = defaultModel;
    }
}
