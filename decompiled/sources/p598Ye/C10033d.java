package p598Ye;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10033d {
    public static final C10032c Companion = new C10032c();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f29728d = {null, null, new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f29729a;

    /* JADX INFO: renamed from: b */
    public final String f29730b;

    /* JADX INFO: renamed from: c */
    public final List f29731c;

    public /* synthetic */ C10033d(int i10, String str, String str2, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C10031b.f29727a.getDescriptor());
            throw null;
        }
        this.f29729a = str;
        this.f29730b = str2;
        if ((i10 & 4) == 0) {
            this.f29731c = C17689w.f56480Y;
        } else {
            this.f29731c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10033d)) {
            return false;
        }
        C10033d c10033d = (C10033d) obj;
        return AbstractC16544l.m18089b(this.f29729a, c10033d.f29729a) && AbstractC16544l.m18089b(this.f29730b, c10033d.f29730b) && AbstractC16544l.m18089b(this.f29731c, c10033d.f29731c);
    }

    public final int hashCode() {
        int iHashCode = this.f29729a.hashCode() * 31;
        String str = this.f29730b;
        return this.f29731c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
