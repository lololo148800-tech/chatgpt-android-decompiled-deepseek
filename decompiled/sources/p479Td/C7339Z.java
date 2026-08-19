package p479Td;

import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.Z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7339Z {
    public static final C7338Y Companion = new C7338Y();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f23247b = {new C11158d(C7334U.f23240a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f23248a;

    public /* synthetic */ C7339Z(int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f23248a = null;
        } else {
            this.f23248a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7339Z) && AbstractC16544l.m18089b(this.f23248a, ((C7339Z) obj).f23248a);
    }

    public final int hashCode() {
        List list = this.f23248a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
