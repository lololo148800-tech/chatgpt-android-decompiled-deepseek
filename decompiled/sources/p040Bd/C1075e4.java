package p040Bd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.e4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1075e4 {
    public static final C1068d4 Companion = new C1068d4();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f2926c = {null, new C11158d(C1040Z3.f2867a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f2927a;

    /* JADX INFO: renamed from: b */
    public final List f2928b;

    public /* synthetic */ C1075e4(String str, int i10, List list) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C1061c4.f2897a.getDescriptor());
            throw null;
        }
        this.f2927a = str;
        if ((i10 & 2) == 0) {
            this.f2928b = C17689w.f56480Y;
        } else {
            this.f2928b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075e4)) {
            return false;
        }
        C1075e4 c1075e4 = (C1075e4) obj;
        return AbstractC16544l.m18089b(this.f2927a, c1075e4.f2927a) && AbstractC16544l.m18089b(this.f2928b, c1075e4.f2928b);
    }

    public final int hashCode() {
        return this.f2928b.hashCode() + (this.f2927a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
