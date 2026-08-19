package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Bd.Y0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1031Y0 extends AbstractC1142p {
    public static final C1025X0 Companion = new C1025X0();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f2842g = {null, null, new C11158d(C0999S4.f2792a, 0), null, null, null};

    /* JADX INFO: renamed from: a */
    public final Integer f2843a;

    /* JADX INFO: renamed from: b */
    public final Integer f2844b;

    /* JADX INFO: renamed from: c */
    public final List f2845c;

    /* JADX INFO: renamed from: d */
    public final C0993R4 f2846d;

    /* JADX INFO: renamed from: e */
    public final String f2847e;

    /* JADX INFO: renamed from: f */
    public final String f2848f;

    public C1031Y0(int i10, Integer num, Integer num2, List list, C0993R4 c0993r4, String str, String str2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1019W0.f2827a.getDescriptor());
            throw null;
        }
        this.f2843a = num;
        this.f2844b = num2;
        this.f2845c = list;
        if ((i10 & 8) == 0) {
            this.f2846d = null;
        } else {
            this.f2846d = c0993r4;
        }
        if ((i10 & 16) == 0) {
            this.f2847e = "sports_standings";
        } else {
            this.f2847e = str;
        }
        if ((i10 & 32) == 0) {
            this.f2848f = null;
        } else {
            this.f2848f = str2;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: a */
    public final String mo1963a() {
        return this.f2848f;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2844b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2843a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2847e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1031Y0)) {
            return false;
        }
        C1031Y0 c1031y0 = (C1031Y0) obj;
        return AbstractC16544l.m18089b(this.f2843a, c1031y0.f2843a) && AbstractC16544l.m18089b(this.f2844b, c1031y0.f2844b) && AbstractC16544l.m18089b(this.f2845c, c1031y0.f2845c) && AbstractC16544l.m18089b(this.f2846d, c1031y0.f2846d) && AbstractC16544l.m18089b(this.f2847e, c1031y0.f2847e) && AbstractC16544l.m18089b(this.f2848f, c1031y0.f2848f);
    }

    public final int hashCode() {
        Integer num = this.f2843a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2844b;
        int iM15858x = AbstractC14376f.m15858x(this.f2845c, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        C0993R4 c0993r4 = this.f2846d;
        int iM527p = AbstractC0168G.m527p((iM15858x + (c0993r4 == null ? 0 : c0993r4.f2778a.hashCode())) * 31, 31, this.f2847e);
        String str = this.f2848f;
        return iM527p + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
