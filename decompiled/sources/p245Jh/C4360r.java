package p245Jh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p269Kh.C4697x;
import p269Kh.C4699z;
import p269Kh.EnumC4694u;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: Jh.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4360r {
    public static final C4359q Companion = new C4359q();

    /* JADX INFO: renamed from: a */
    public final C4351i f14180a;

    public /* synthetic */ C4360r(int i10, C4351i c4351i) {
        if ((i10 & 1) == 0) {
            this.f14180a = null;
        } else {
            this.f14180a = c4351i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX INFO: renamed from: a */
    public final C4699z m5167a() {
        C4697x c4697x;
        EnumC4694u enumC4694u;
        C4351i c4351i = this.f14180a;
        if (c4351i != null) {
            String str = c4351i.f14150a;
            int iHashCode = str.hashCode();
            if (iHashCode != -1021130956) {
                if (iHashCode != -383989976) {
                    if (iHashCode == 1262387476 && str.equals("multimodal")) {
                        enumC4694u = EnumC4694u.f15270o0;
                    } else {
                        enumC4694u = EnumC4694u.f15271p0;
                    }
                } else if (str.equals("code_interpreter")) {
                    enumC4694u = EnumC4694u.f15269Z;
                } else {
                    enumC4694u = EnumC4694u.f15271p0;
                }
            } else if (str.equals("retrieval")) {
                enumC4694u = EnumC4694u.f15268Y;
            } else {
                enumC4694u = EnumC4694u.f15271p0;
            }
            List list = C17689w.f56480Y;
            List list2 = c4351i.f14151b;
            if (list2 == null) {
                list2 = list;
            }
            List list3 = list2;
            List list4 = c4351i.f14152c;
            if (list4 != null) {
                list = list4;
            }
            c4697x = new C4697x(enumC4694u, AbstractC17680n.m19361k0(list, list3), false);
        } else {
            c4697x = null;
        }
        return new C4699z(c4697x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4360r) && AbstractC16544l.m18089b(this.f14180a, ((C4360r) obj).f14180a);
    }

    public final int hashCode() {
        C4351i c4351i = this.f14180a;
        if (c4351i == null) {
            return 0;
        }
        return c4351i.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
