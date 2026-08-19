package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Bd.a5 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1048a5 {
    public static final C1041Z4 Companion = new C1041Z4();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f2870d = {null, new C11158d(C1076e5.f2929a, 0), new C11158d(C1055b5.f2888a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f2871a;

    /* JADX INFO: renamed from: b */
    public final List f2872b;

    /* JADX INFO: renamed from: c */
    public final List f2873c;

    public /* synthetic */ C1048a5(int i10, String str, List list, List list2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1035Y4.f2862a.getDescriptor());
            throw null;
        }
        this.f2871a = str;
        this.f2872b = list;
        this.f2873c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1048a5)) {
            return false;
        }
        C1048a5 c1048a5 = (C1048a5) obj;
        return AbstractC16544l.m18089b(this.f2871a, c1048a5.f2871a) && AbstractC16544l.m18089b(this.f2872b, c1048a5.f2872b) && AbstractC16544l.m18089b(this.f2873c, c1048a5.f2873c);
    }

    public final int hashCode() {
        String str = this.f2871a;
        return this.f2873c.hashCode() + AbstractC14376f.m15858x(this.f2872b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "█";
    }
}
