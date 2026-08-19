package p040Bd;

import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.b3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1053b3 {
    public static final C1046a3 Companion = new C1046a3();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f2880c = {null, new C11158d(C1060c3.f2896a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f2881a;

    /* JADX INFO: renamed from: b */
    public final List f2882b;

    public /* synthetic */ C1053b3(String str, int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f2881a = null;
        } else {
            this.f2881a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2882b = null;
        } else {
            this.f2882b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1053b3)) {
            return false;
        }
        C1053b3 c1053b3 = (C1053b3) obj;
        return AbstractC16544l.m18089b(this.f2881a, c1053b3.f2881a) && AbstractC16544l.m18089b(this.f2882b, c1053b3.f2882b);
    }

    public final int hashCode() {
        String str = this.f2881a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f2882b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
