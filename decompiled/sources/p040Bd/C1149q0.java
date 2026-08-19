package p040Bd;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.q0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1149q0 extends AbstractC0985Q1 {
    public static final C1143p0 Companion = new C1143p0();

    /* JADX INFO: renamed from: a */
    public final Integer f3071a;

    /* JADX INFO: renamed from: b */
    public final Integer f3072b;

    /* JADX INFO: renamed from: c */
    public final String f3073c;

    /* JADX INFO: renamed from: d */
    public final String f3074d;

    public C1149q0(int i10, Integer num, Integer num2, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1137o0.f3052a.getDescriptor());
            throw null;
        }
        this.f3071a = num;
        this.f3072b = num2;
        if ((i10 & 4) == 0) {
            this.f3073c = ParameterNames.HIDDEN;
        } else {
            this.f3073c = str;
        }
        if ((i10 & 8) == 0) {
            this.f3074d = null;
        } else {
            this.f3074d = str2;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: a */
    public final String mo1963a() {
        return this.f3074d;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f3072b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f3071a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3073c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1149q0)) {
            return false;
        }
        C1149q0 c1149q0 = (C1149q0) obj;
        return AbstractC16544l.m18089b(this.f3071a, c1149q0.f3071a) && AbstractC16544l.m18089b(this.f3072b, c1149q0.f3072b) && AbstractC16544l.m18089b(this.f3073c, c1149q0.f3073c) && AbstractC16544l.m18089b(this.f3074d, c1149q0.f3074d);
    }

    public final int hashCode() {
        Integer num = this.f3071a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3072b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f3073c);
        String str = this.f3074d;
        return iM527p + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
