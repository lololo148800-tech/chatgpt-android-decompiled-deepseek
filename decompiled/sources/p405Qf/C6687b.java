package p405Qf;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2133G0;
import p103Dn.C2137I0;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1149zc.AbstractC21864z;
import p195Hh.C3430e;
import p220Ih.C3720b;
import p220Ih.InterfaceC3721c;
import p269Kh.C4673B;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p430Rf.C6881c;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8547R2;
import p708dh.C13166t;
import p909nm.AbstractC17680n;
import p948pi.C18418a;

/* JADX INFO: renamed from: Qf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6687b implements InterfaceC3721c {

    /* JADX INFO: renamed from: b */
    public final C6689d f21502b;

    /* JADX INFO: renamed from: c */
    public final C18418a f21503c;

    /* JADX INFO: renamed from: d */
    public final C3430e f21504d = AbstractC8168p6.m8749b("ModelsRepository", null);

    /* JADX INFO: renamed from: e */
    public final C2153Q0 f21505e;

    /* JADX INFO: renamed from: f */
    public final C2153Q0 f21506f;

    /* JADX INFO: renamed from: g */
    public final C2217y0 f21507g;

    public C6687b(AbstractC21864z abstractC21864z, C13166t c13166t, C6881c c6881c, C17627a c17627a, C6689d c6689d, C18418a c18418a) {
        this.f21502b = c6689d;
        this.f21503c = c18418a;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(null);
        this.f21505e = c2153q0M3204c;
        this.f21506f = c2153q0M3204c;
        C2137I0 c2137i0 = C2133G0.f6537b;
        boolean zM22325d = c18418a.f58774b.m22325d();
        InterfaceC3721c.f11274a.getClass();
        this.f21507g = AbstractC2124C.m3198B(c6689d.f64176f, c17627a, c2137i0, C3720b.m4419a(zM22325d));
        AbstractC2124C.m3226y(new C1970n(c13166t.f41802f, 5, new C6686a(abstractC21864z, c6881c, this, null)), c17627a);
    }

    /* JADX INFO: renamed from: a */
    public static C4688o m7182a(C4673B c4673b, C4684k c4684k, boolean z6) {
        Object obj;
        Object next;
        Iterator it = c4673b.f15219b.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((C4688o) next).f15253b, c4684k.f15241f));
        C4688o c4688o = (C4688o) next;
        if (c4688o != null) {
            return c4688o;
        }
        List list = c4673b.f15219b;
        for (Object obj2 : list) {
            if (AbstractC16544l.m18089b(((C4688o) obj2).f15252a, c4684k.f15236a)) {
                obj = obj2;
                break;
            }
        }
        C4688o c4688o2 = (C4688o) obj;
        if (c4688o2 != null) {
            return c4688o2;
        }
        C4688o c4688o3 = (C4688o) AbstractC17680n.m19343S(list);
        return c4688o3 == null ? AbstractC8547R2.m9207a(z6) : c4688o3;
    }
}
