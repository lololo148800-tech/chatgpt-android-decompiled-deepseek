package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.C1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0901C1 extends AbstractC1142p {
    public static final C0895B1 Companion = new C0895B1();

    /* JADX INFO: renamed from: h */
    public static final KSerializer[] f2627h = {null, null, null, null, new C11158d(C11181o0.f33827a, 0), null, null};

    /* JADX INFO: renamed from: a */
    public final Integer f2628a;

    /* JADX INFO: renamed from: b */
    public final Integer f2629b;

    /* JADX INFO: renamed from: c */
    public final String f2630c;

    /* JADX INFO: renamed from: d */
    public final String f2631d;

    /* JADX INFO: renamed from: e */
    public final List f2632e;

    /* JADX INFO: renamed from: f */
    public final Boolean f2633f;

    /* JADX INFO: renamed from: g */
    public final String f2634g;

    public C0901C1(int i10, Integer num, Integer num2, String str, String str2, List list, Boolean bool, String str3) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0889A1.f2613a.getDescriptor());
            throw null;
        }
        this.f2628a = num;
        this.f2629b = num2;
        this.f2630c = str;
        if ((i10 & 8) == 0) {
            this.f2631d = null;
        } else {
            this.f2631d = str2;
        }
        if ((i10 & 16) == 0) {
            this.f2632e = C17689w.f56480Y;
        } else {
            this.f2632e = list;
        }
        if ((i10 & 32) == 0) {
            this.f2633f = null;
        } else {
            this.f2633f = bool;
        }
        if ((i10 & 64) == 0) {
            this.f2634g = "tldr";
        } else {
            this.f2634g = str3;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2629b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2628a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2634g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0901C1)) {
            return false;
        }
        C0901C1 c0901c1 = (C0901C1) obj;
        return AbstractC16544l.m18089b(this.f2628a, c0901c1.f2628a) && AbstractC16544l.m18089b(this.f2629b, c0901c1.f2629b) && AbstractC16544l.m18089b(this.f2630c, c0901c1.f2630c) && AbstractC16544l.m18089b(this.f2631d, c0901c1.f2631d) && AbstractC16544l.m18089b(this.f2632e, c0901c1.f2632e) && AbstractC16544l.m18089b(this.f2633f, c0901c1.f2633f) && AbstractC16544l.m18089b(this.f2634g, c0901c1.f2634g);
    }

    public final int hashCode() {
        Integer num = this.f2628a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2629b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f2630c);
        String str = this.f2631d;
        int iM15858x = AbstractC14376f.m15858x(this.f2632e, (iM527p + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.f2633f;
        return this.f2634g.hashCode() + ((iM15858x + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
