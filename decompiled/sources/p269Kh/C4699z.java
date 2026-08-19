package p269Kh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Kh.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4699z {
    public static final C4698y Companion = new C4698y();

    /* JADX INFO: renamed from: a */
    public final C4697x f15278a;

    public /* synthetic */ C4699z(int i10, C4697x c4697x) {
        if ((i10 & 1) == 0) {
            this.f15278a = null;
        } else {
            this.f15278a = c4697x;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5398a() {
        List list;
        C4697x c4697x = this.f15278a;
        if (c4697x != null && c4697x.f15277c) {
            return true;
        }
        if (c4697x != null && (list = c4697x.f15276b) != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!AbstractC21329w.m21734u((String) it.next(), "image/", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5399b() {
        List list;
        C4697x c4697x = this.f15278a;
        if (c4697x == null || (list = c4697x.f15276b) == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (AbstractC21329w.m21734u((String) it.next(), "image/", false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4699z) && AbstractC16544l.m18089b(this.f15278a, ((C4699z) obj).f15278a);
    }

    public final int hashCode() {
        C4697x c4697x = this.f15278a;
        if (c4697x == null) {
            return 0;
        }
        return c4697x.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C4699z(C4697x c4697x) {
        this.f15278a = c4697x;
    }
}
