package p642a8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p1007s7.InterfaceC19466e;
import p214Ib.C3678u;
import p523V9.AbstractC8111i5;
import p604Yk.C10077b;
import p662b8.C11261e;
import p676c7.C11682a;
import p676c7.C11683b;
import p765g7.InterfaceC13823a;
import p827j7.C16175c;
import p909nm.AbstractC17682p;
import p919o8.AbstractC17962d;
import p919o8.AbstractC17976h1;
import p919o8.C17903I;
import p919o8.C17912L;
import p919o8.C17918N;
import p919o8.C17921O;
import p919o8.C17932S;
import p919o8.C17934S1;
import p919o8.C17935T;
import p919o8.C17938U;
import p919o8.C17940U1;
import p919o8.C17941V;
import p919o8.C17946W1;
import p919o8.C17947X;
import p919o8.C17949Y;
import p919o8.C17951Z;
import p919o8.C17960c0;
import p919o8.C17975h0;
import p919o8.C17978i0;
import p919o8.C17984k0;
import p919o8.C18003q1;
import p919o8.C18009s1;
import p919o8.C18012t1;
import p919o8.C18021w1;
import p919o8.C18024x1;
import p919o8.C18030z1;
import p919o8.EnumC17905I1;
import p919o8.EnumC17954a0;

/* JADX INFO: renamed from: a8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10519b implements InterfaceC10520c {

    /* JADX INFO: renamed from: d */
    public static final long f31181d = TimeUnit.HOURS.toMillis(4);

    /* JADX INFO: renamed from: a */
    public final InterfaceC13823a f31182a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC19466e f31183b;

    /* JADX INFO: renamed from: c */
    public final C11261e f31184c;

    public C10519b(InterfaceC13823a sdkCore) {
        C10077b c10077b = new C10077b(sdkCore.mo15463s());
        C11261e c11261e = new C11261e(sdkCore.mo15463s());
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        this.f31182a = sdkCore;
        this.f31183b = c10077b;
        this.f31184c = c11261e;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX INFO: renamed from: a */
    public static final C17984k0 m10973a(C10519b c10519b, C11682a c11682a, int i10, int i11, String str, long j10, Long l4, String str2, String str3, List list, C17946W1 c17946w1) {
        C17921O c17921o;
        boolean z6;
        C17978i0 c17978i0;
        C17949Y c17949y;
        ArrayList arrayList;
        String strMo4384r;
        String str4;
        ArrayList arrayList2;
        C18012t1 c18012t1 = c17946w1.f57244k;
        if (c18012t1 != null) {
            int i12 = c18012t1.f57500a;
            if (i12 == 1) {
                str4 = "CONNECTED";
            } else if (i12 == 2) {
                str4 = "NOT_CONNECTED";
            } else {
                if (i12 != 3) {
                    throw null;
                }
                str4 = "MAYBE";
            }
            int iM19641c0 = AbstractC17962d.m19641c0(str4);
            List list2 = c18012t1.f57501b;
            if (list2 != null) {
                List list3 = list2;
                arrayList2 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(EnumC17954a0.valueOf(((EnumC17905I1) it.next()).name()));
                }
            } else {
                arrayList2 = null;
            }
            C18003q1 c18003q1 = c18012t1.f57503d;
            c17921o = new C17921O(iM19641c0, arrayList2, 0, new C17912L(c18003q1 != null ? c18003q1.f57482a : null, c18003q1 != null ? c18003q1.f57483b : null));
        } else {
            c17921o = null;
        }
        C18021w1 c18021w1 = c17946w1.f57251r;
        LinkedHashMap linkedHashMap = c18021w1 != null ? c18021w1.f57528a : new LinkedHashMap();
        C17934S1 c17934s1 = c17946w1.f57243j;
        Map linkedHashMap2 = c17934s1 != null ? c17934s1.f57163d : new LinkedHashMap();
        if ((c17934s1 != null ? c17934s1.f57160a : null) != null) {
            z6 = true;
        } else {
            if ((c17934s1 != null ? c17934s1.f57161b : null) != null) {
                z6 = true;
            } else {
                if ((c17934s1 != null ? c17934s1.f57162c : null) == null && linkedHashMap2.isEmpty()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            }
        }
        C11683b c11683b = c11682a.f35420l;
        long j11 = j10 + c11682a.f35417i.f35450d;
        C17903I c17903i = new C17903I(c17946w1.f57235b.f57474a);
        C17949Y c17949y2 = new C17949Y(1, null, c17946w1.f57240g.f57169a);
        int i13 = c17946w1.f57241h;
        int iM8601l = (i13 == 0 || (strMo4384r = new C3678u(AbstractC17976h1.m19671f(i13)).mo4384r()) == null) ? 0 : AbstractC8111i5.m8601l(strMo4384r, c10519b.f31182a.mo15463s());
        C17940U1 c17940u1 = c17946w1.f57242i;
        C17951Z c17951z = new C17951Z(16, c17940u1.f57197a, c17940u1.f57198b, c17940u1.f57199c, c17940u1.f57200d);
        if (z6) {
            c17978i0 = new C17978i0(c17934s1 != null ? c17934s1.f57160a : null, c17934s1 != null ? c17934s1.f57161b : null, c17934s1 != null ? c17934s1.f57162c : null, linkedHashMap2);
        } else {
            c17978i0 = null;
        }
        C17960c0 c17960c0 = new C17960c0(c11683b.f35430f, c11683b.f35432h, null, c11683b.f35431g);
        C17941V c17941v = new C17941V(AbstractC8111i5.m8598i(c11683b.f35428d), c11683b.f35425a, c11683b.f35427c, c11683b.f35426b, c11683b.f35433i);
        C17938U c17938u = new C17938U(0, 3);
        C18009s1 c18009s1 = c17946w1.f57250q.f57551b;
        C17935T c17935t = new C17935T(c17938u, new C17918N(Float.valueOf(c18009s1 != null ? c18009s1.f57495a.floatValue() : 0.0f)), null);
        C17932S c17932s = new C17932S(linkedHashMap);
        if (list != null) {
            List list4 = list;
            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                C16175c c16175c = (C16175c) it2.next();
                arrayList3.add(new C17975h0(c16175c.f50212a, c16175c.f50214c, c16175c.f50215d, c16175c.f50213b));
                it2 = it2;
                c17949y2 = c17949y2;
            }
            c17949y = c17949y2;
            arrayList = arrayList3;
        } else {
            c17949y = c17949y2;
            arrayList = null;
        }
        return new C17984k0(j11, c17903i, c17946w1.f57236c, c17946w1.f57237d, c11682a.f35423o, c17949y, iM8601l, c17951z, c17978i0, c17921o, null, c17960c0, c17941v, c17935t, c17932s, null, new C17947X(str, 2, str2, Boolean.TRUE, null, str3, i11, i10, null, arrayList, l4, 120401), null, 2897936);
    }

    /* JADX INFO: renamed from: b */
    public static final C17946W1 m10974b(C10519b c10519b, C17946W1 c17946w1) {
        C17940U1 c17940u1 = c17946w1.f57242i;
        C18024x1 c18024x1 = c17940u1.f57181A;
        C17940U1 c17940u1M19608a = C17940U1.m19608a(c17940u1, null, Boolean.FALSE, c18024x1 != null ? new C18024x1(c18024x1.f57531a + 1) : new C18024x1(1L), -142606337);
        C18030z1 c18030z1 = c17946w1.f57250q;
        return C17946W1.m19609a(c17946w1, c17940u1M19608a, null, new C18030z1(c18030z1.f57550a, c18030z1.f57551b, c18030z1.f57552c, c18030z1.f57553d + 1, c18030z1.f57554e, c18030z1.f57555f), null, 2031359);
    }
}
