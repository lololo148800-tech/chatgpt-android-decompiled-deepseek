package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.V0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1013V0 extends AbstractC1142p {
    public static final C1007U0 Companion = new C1007U0();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f2813f = {null, null, new C11158d(C0946J4.f2710a, 0), null, null};

    /* JADX INFO: renamed from: a */
    public final Integer f2814a;

    /* JADX INFO: renamed from: b */
    public final Integer f2815b;

    /* JADX INFO: renamed from: c */
    public final List f2816c;

    /* JADX INFO: renamed from: d */
    public final String f2817d;

    /* JADX INFO: renamed from: e */
    public final String f2818e;

    public C1013V0(int i10, Integer num, Integer num2, String str, String str2, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1001T0.f2793a.getDescriptor());
            throw null;
        }
        this.f2814a = num;
        this.f2815b = num2;
        if ((i10 & 4) == 0) {
            this.f2816c = C17689w.f56480Y;
        } else {
            this.f2816c = list;
        }
        if ((i10 & 8) == 0) {
            this.f2817d = "sports";
        } else {
            this.f2817d = str;
        }
        if ((i10 & 16) == 0) {
            this.f2818e = null;
        } else {
            this.f2818e = str2;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: a */
    public final String mo1963a() {
        return this.f2818e;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2815b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2814a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2817d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1013V0)) {
            return false;
        }
        C1013V0 c1013v0 = (C1013V0) obj;
        return AbstractC16544l.m18089b(this.f2814a, c1013v0.f2814a) && AbstractC16544l.m18089b(this.f2815b, c1013v0.f2815b) && AbstractC16544l.m18089b(this.f2816c, c1013v0.f2816c) && AbstractC16544l.m18089b(this.f2817d, c1013v0.f2817d) && AbstractC16544l.m18089b(this.f2818e, c1013v0.f2818e);
    }

    public final int hashCode() {
        Integer num = this.f2814a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2815b;
        int iM527p = AbstractC0168G.m527p(AbstractC14376f.m15858x(this.f2816c, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31, this.f2817d);
        String str = this.f2818e;
        return iM527p + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
