package p245Jh;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Jh.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4351i {
    public static final C4350h Companion = new C4350h();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f14149e;

    /* JADX INFO: renamed from: a */
    public final String f14150a;

    /* JADX INFO: renamed from: b */
    public final List f14151b;

    /* JADX INFO: renamed from: c */
    public final List f14152c;

    /* JADX INFO: renamed from: d */
    public final boolean f14153d;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        f14149e = new KSerializer[]{null, new C11158d(c11181o0, 0), new C11158d(c11181o0, 0), null};
    }

    public /* synthetic */ C4351i(int i10, String str, List list, List list2, boolean z6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C4349g.f14148a.getDescriptor());
            throw null;
        }
        this.f14150a = str;
        if ((i10 & 2) == 0) {
            this.f14151b = null;
        } else {
            this.f14151b = list;
        }
        if ((i10 & 4) == 0) {
            this.f14152c = null;
        } else {
            this.f14152c = list2;
        }
        if ((i10 & 8) == 0) {
            this.f14153d = false;
        } else {
            this.f14153d = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4351i)) {
            return false;
        }
        C4351i c4351i = (C4351i) obj;
        return AbstractC16544l.m18089b(this.f14150a, c4351i.f14150a) && AbstractC16544l.m18089b(this.f14151b, c4351i.f14151b) && AbstractC16544l.m18089b(this.f14152c, c4351i.f14152c) && this.f14153d == c4351i.f14153d;
    }

    public final int hashCode() {
        int iHashCode = this.f14150a.hashCode() * 31;
        List list = this.f14151b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f14152c;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + (this.f14153d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
