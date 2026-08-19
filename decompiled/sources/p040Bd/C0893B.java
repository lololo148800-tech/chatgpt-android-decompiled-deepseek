package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Bd.B */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0893B extends AbstractC1142p {
    public static final C1190x Companion = new C1190x();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f2617g = {null, null, new C11158d(C1154r.f3076a, 0), null, new C11158d(C1172u.f3121a, 0), null};

    /* JADX INFO: renamed from: a */
    public final Integer f2618a;

    /* JADX INFO: renamed from: b */
    public final Integer f2619b;

    /* JADX INFO: renamed from: c */
    public final List f2620c;

    /* JADX INFO: renamed from: d */
    public final Boolean f2621d;

    /* JADX INFO: renamed from: e */
    public final List f2622e;

    /* JADX INFO: renamed from: f */
    public final String f2623f;

    public C0893B(int i10, Integer num, Integer num2, List list, Boolean bool, List list2, String str) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1148q.f3070a.getDescriptor());
            throw null;
        }
        this.f2618a = num;
        this.f2619b = num2;
        this.f2620c = list;
        if ((i10 & 8) == 0) {
            this.f2621d = null;
        } else {
            this.f2621d = bool;
        }
        if ((i10 & 16) == 0) {
            this.f2622e = null;
        } else {
            this.f2622e = list2;
        }
        if ((i10 & 32) == 0) {
            this.f2623f = "businesses_map";
        } else {
            this.f2623f = str;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2619b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2618a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2623f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0893B)) {
            return false;
        }
        C0893B c0893b = (C0893B) obj;
        return AbstractC16544l.m18089b(this.f2618a, c0893b.f2618a) && AbstractC16544l.m18089b(this.f2619b, c0893b.f2619b) && AbstractC16544l.m18089b(this.f2620c, c0893b.f2620c) && AbstractC16544l.m18089b(this.f2621d, c0893b.f2621d) && AbstractC16544l.m18089b(this.f2622e, c0893b.f2622e) && AbstractC16544l.m18089b(this.f2623f, c0893b.f2623f);
    }

    public final int hashCode() {
        Integer num = this.f2618a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2619b;
        int iM15858x = AbstractC14376f.m15858x(this.f2620c, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Boolean bool = this.f2621d;
        int iHashCode2 = (iM15858x + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f2622e;
        return this.f2623f.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
