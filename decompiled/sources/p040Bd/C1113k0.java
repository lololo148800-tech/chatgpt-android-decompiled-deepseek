package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Bd.k0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1113k0 extends AbstractC0888A0 {
    public static final C1106j0 Companion = new C1106j0();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f3017e = {null, null, new C11158d(C0925G1.f2671a, 0), null};

    /* JADX INFO: renamed from: a */
    public final Integer f3018a;

    /* JADX INFO: renamed from: b */
    public final Integer f3019b;

    /* JADX INFO: renamed from: c */
    public final List f3020c;

    /* JADX INFO: renamed from: d */
    public final String f3021d;

    public C1113k0(int i10, Integer num, Integer num2, List list, String str) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1099i0.f2999a.getDescriptor());
            throw null;
        }
        this.f3018a = num;
        this.f3019b = num2;
        this.f3020c = list;
        if ((i10 & 8) == 0) {
            this.f3021d = "grouped_webpages";
        } else {
            this.f3021d = str;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f3019b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f3018a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3021d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1113k0)) {
            return false;
        }
        C1113k0 c1113k0 = (C1113k0) obj;
        return AbstractC16544l.m18089b(this.f3018a, c1113k0.f3018a) && AbstractC16544l.m18089b(this.f3019b, c1113k0.f3019b) && AbstractC16544l.m18089b(this.f3020c, c1113k0.f3020c) && AbstractC16544l.m18089b(this.f3021d, c1113k0.f3021d);
    }

    public final int hashCode() {
        Integer num = this.f3018a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3019b;
        return this.f3021d.hashCode() + AbstractC14376f.m15858x(this.f3020c, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }

    public C1113k0(Integer num, Integer num2, List list, String type) {
        AbstractC16544l.m18094g(type, "type");
        this.f3018a = num;
        this.f3019b = num2;
        this.f3020c = list;
        this.f3021d = type;
    }
}
