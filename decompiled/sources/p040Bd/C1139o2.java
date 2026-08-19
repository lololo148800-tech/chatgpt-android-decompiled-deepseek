package p040Bd;

import ao.C11158d;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;
import ve.EnumC20582f;

/* JADX INFO: renamed from: Bd.o2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1139o2 {
    public static final C1133n2 Companion = new C1133n2();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f3053d = {null, null, new C11158d(EnumC20582f.Companion.serializer(), 2)};

    /* JADX INFO: renamed from: a */
    public final String f3054a;

    /* JADX INFO: renamed from: b */
    public final String f3055b;

    /* JADX INFO: renamed from: c */
    public final Set f3056c;

    public /* synthetic */ C1139o2(int i10, String str, String str2, Set set) {
        if ((i10 & 1) == 0) {
            this.f3054a = null;
        } else {
            this.f3054a = str;
        }
        if ((i10 & 2) == 0) {
            this.f3055b = null;
        } else {
            this.f3055b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f3056c = C17691y.f56482Y;
        } else {
            this.f3056c = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1139o2)) {
            return false;
        }
        C1139o2 c1139o2 = (C1139o2) obj;
        return AbstractC16544l.m18089b(this.f3054a, c1139o2.f3054a) && AbstractC16544l.m18089b(this.f3055b, c1139o2.f3055b) && AbstractC16544l.m18089b(this.f3056c, c1139o2.f3056c);
    }

    public final int hashCode() {
        String str = this.f3054a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3055b;
        return this.f3056c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
