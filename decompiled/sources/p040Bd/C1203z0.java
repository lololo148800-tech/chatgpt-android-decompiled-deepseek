package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.z0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1203z0 extends AbstractC1142p {
    public static final C1161s0 Companion = new C1161s0();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f3162e = {null, null, new C11158d(C1167t0.f3111a, 0), null};

    /* JADX INFO: renamed from: a */
    public final Integer f3163a;

    /* JADX INFO: renamed from: b */
    public final Integer f3164b;

    /* JADX INFO: renamed from: c */
    public final List f3165c;

    /* JADX INFO: renamed from: d */
    public final String f3166d;

    public C1203z0(int i10, Integer num, Integer num2, List list, String str) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C1155r0.f3077a.getDescriptor());
            throw null;
        }
        this.f3163a = num;
        this.f3164b = num2;
        if ((i10 & 4) == 0) {
            this.f3165c = C17689w.f56480Y;
        } else {
            this.f3165c = list;
        }
        if ((i10 & 8) == 0) {
            this.f3166d = "image_v2";
        } else {
            this.f3166d = str;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f3164b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f3163a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f3166d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1203z0)) {
            return false;
        }
        C1203z0 c1203z0 = (C1203z0) obj;
        return AbstractC16544l.m18089b(this.f3163a, c1203z0.f3163a) && AbstractC16544l.m18089b(this.f3164b, c1203z0.f3164b) && AbstractC16544l.m18089b(this.f3165c, c1203z0.f3165c) && AbstractC16544l.m18089b(this.f3166d, c1203z0.f3166d);
    }

    public final int hashCode() {
        Integer num = this.f3163a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f3164b;
        return this.f3166d.hashCode() + AbstractC14376f.m15858x(this.f3165c, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }

    public C1203z0(List list) {
        this.f3163a = null;
        this.f3164b = null;
        this.f3165c = list;
        this.f3166d = "image_v2";
    }
}
