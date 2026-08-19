package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.G0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0924G0 extends AbstractC1142p {
    public static final C0900C0 Companion = new C0900C0();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f2665f = {null, null, null, new C11158d(C0906D0.f2639a, 0), null};

    /* JADX INFO: renamed from: a */
    public final Integer f2666a;

    /* JADX INFO: renamed from: b */
    public final Integer f2667b;

    /* JADX INFO: renamed from: c */
    public final String f2668c;

    /* JADX INFO: renamed from: d */
    public final List f2669d;

    /* JADX INFO: renamed from: e */
    public final String f2670e;

    public C0924G0(int i10, Integer num, Integer num2, String str, String str2, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0894B0.f2624a.getDescriptor());
            throw null;
        }
        this.f2666a = num;
        this.f2667b = num2;
        if ((i10 & 4) == 0) {
            this.f2668c = null;
        } else {
            this.f2668c = str;
        }
        if ((i10 & 8) == 0) {
            this.f2669d = C17689w.f56480Y;
        } else {
            this.f2669d = list;
        }
        if ((i10 & 16) == 0) {
            this.f2670e = "nav_list";
        } else {
            this.f2670e = str2;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2667b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2666a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2670e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0924G0)) {
            return false;
        }
        C0924G0 c0924g0 = (C0924G0) obj;
        return AbstractC16544l.m18089b(this.f2666a, c0924g0.f2666a) && AbstractC16544l.m18089b(this.f2667b, c0924g0.f2667b) && AbstractC16544l.m18089b(this.f2668c, c0924g0.f2668c) && AbstractC16544l.m18089b(this.f2669d, c0924g0.f2669d) && AbstractC16544l.m18089b(this.f2670e, c0924g0.f2670e);
    }

    public final int hashCode() {
        Integer num = this.f2666a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2667b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f2668c;
        return this.f2670e.hashCode() + AbstractC14376f.m15858x(this.f2669d, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }
}
