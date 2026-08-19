package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Bd.M0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0960M0 extends AbstractC1142p {
    public static final C0936I0 Companion = new C0936I0();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f2725e = {null, null, new C11158d(C0942J0.f2706a, 0), null};

    /* JADX INFO: renamed from: a */
    public final Integer f2726a;

    /* JADX INFO: renamed from: b */
    public final Integer f2727b;

    /* JADX INFO: renamed from: c */
    public final List f2728c;

    /* JADX INFO: renamed from: d */
    public final String f2729d;

    public C0960M0(int i10, Integer num, Integer num2, List list, String str) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C0930H0.f2679a.getDescriptor());
            throw null;
        }
        this.f2726a = num;
        this.f2727b = num2;
        this.f2728c = list;
        if ((i10 & 8) == 0) {
            this.f2729d = "navigation";
        } else {
            this.f2729d = str;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2727b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2726a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2729d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0960M0)) {
            return false;
        }
        C0960M0 c0960m0 = (C0960M0) obj;
        return AbstractC16544l.m18089b(this.f2726a, c0960m0.f2726a) && AbstractC16544l.m18089b(this.f2727b, c0960m0.f2727b) && AbstractC16544l.m18089b(this.f2728c, c0960m0.f2728c) && AbstractC16544l.m18089b(this.f2729d, c0960m0.f2729d);
    }

    public final int hashCode() {
        Integer num = this.f2726a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2727b;
        return this.f2729d.hashCode() + AbstractC14376f.m15858x(this.f2728c, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }
}
