package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p160G5.p161rK.TVCuK;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.S0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0995S0 extends AbstractC1142p {
    public static final C0972O0 Companion = new C0972O0();

    /* JADX INFO: renamed from: h */
    public static final KSerializer[] f2780h = {null, null, null, new C11158d(C0978P0.f2758a, 0), new C11158d(C1061c4.f2897a, 0), new C11158d(C0898B4.f2625a, 0), null};

    /* JADX INFO: renamed from: a */
    public final Integer f2781a;

    /* JADX INFO: renamed from: b */
    public final Integer f2782b;

    /* JADX INFO: renamed from: c */
    public final boolean f2783c;

    /* JADX INFO: renamed from: d */
    public final List f2784d;

    /* JADX INFO: renamed from: e */
    public final List f2785e;

    /* JADX INFO: renamed from: f */
    public final List f2786f;

    /* JADX INFO: renamed from: g */
    public final String f2787g;

    public C0995S0(int i10, Integer num, Integer num2, boolean z6, List list, List list2, List list3, String str) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0966N0.f2742a.getDescriptor());
            throw null;
        }
        this.f2781a = num;
        this.f2782b = num2;
        this.f2783c = z6;
        int i11 = i10 & 8;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            this.f2784d = c17689w;
        } else {
            this.f2784d = list;
        }
        if ((i10 & 16) == 0) {
            this.f2785e = c17689w;
        } else {
            this.f2785e = list2;
        }
        if ((i10 & 32) == 0) {
            this.f2786f = c17689w;
        } else {
            this.f2786f = list3;
        }
        if ((i10 & 64) == 0) {
            this.f2787g = "sources_footnote";
        } else {
            this.f2787g = str;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2782b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2781a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2787g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0995S0)) {
            return false;
        }
        C0995S0 c0995s0 = (C0995S0) obj;
        return AbstractC16544l.m18089b(this.f2781a, c0995s0.f2781a) && AbstractC16544l.m18089b(this.f2782b, c0995s0.f2782b) && this.f2783c == c0995s0.f2783c && AbstractC16544l.m18089b(this.f2784d, c0995s0.f2784d) && AbstractC16544l.m18089b(this.f2785e, c0995s0.f2785e) && AbstractC16544l.m18089b(this.f2786f, c0995s0.f2786f) && AbstractC16544l.m18089b(this.f2787g, c0995s0.f2787g);
    }

    public final int hashCode() {
        Integer num = this.f2781a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2782b;
        return this.f2787g.hashCode() + AbstractC14376f.m15858x(this.f2786f, AbstractC14376f.m15858x(this.f2785e, AbstractC14376f.m15858x(this.f2784d, (((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.f2783c ? 1231 : 1237)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "█";
    }

    public C0995S0(Integer num, Integer num2, boolean z6, List sources, List list, List imageResults, String type) {
        AbstractC16544l.m18094g(sources, "sources");
        AbstractC16544l.m18094g(list, TVCuK.WLNtycONNCNyYD);
        AbstractC16544l.m18094g(imageResults, "imageResults");
        AbstractC16544l.m18094g(type, "type");
        this.f2781a = num;
        this.f2782b = num2;
        this.f2783c = z6;
        this.f2784d = sources;
        this.f2785e = list;
        this.f2786f = imageResults;
        this.f2787g = type;
    }
}
