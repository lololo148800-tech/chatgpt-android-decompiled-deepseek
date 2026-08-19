package p288Lb;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p001A.AbstractC0010F;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p214Ib.EnumC3655A;
import p228J.AbstractC3794B0;
import p265Kb.C4622o;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Lb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4978k extends AbstractC3656B {

    /* JADX INFO: renamed from: c */
    public static final C4977j f16222c = new C4977j(EnumC3655A.f11138Y, 1);

    /* JADX INFO: renamed from: a */
    public final C3669l f16223a;

    /* JADX INFO: renamed from: b */
    public final EnumC3655A f16224b;

    public C4978k(C3669l c3669l, EnumC3655A enumC3655A) {
        this.f16223a = c3669l;
        this.f16224b = enumC3655A;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iMo5616N0 = c6381b.mo5616N0();
        int iM24h = AbstractC0010F.m24h(iMo5616N0);
        if (iM24h == 0) {
            c6381b.mo5621a();
            arrayList = new ArrayList();
        } else if (iM24h != 2) {
            arrayList = null;
        } else {
            c6381b.mo5626e();
            arrayList = new C4622o(true);
        }
        if (arrayList == null) {
            return m5635c(c6381b, iMo5616N0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c6381b.hasNext()) {
                String strMo5622a0 = arrayList instanceof Map ? c6381b.mo5622a0() : null;
                int iMo5616N1 = c6381b.mo5616N0();
                int iM24h2 = AbstractC0010F.m24h(iMo5616N1);
                if (iM24h2 == 0) {
                    c6381b.mo5621a();
                    arrayList2 = new ArrayList();
                } else if (iM24h2 != 2) {
                    arrayList2 = null;
                } else {
                    c6381b.mo5626e();
                    arrayList2 = new C4622o(true);
                }
                boolean z6 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m5635c(c6381b, iMo5616N1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strMo5622a0, arrayList2);
                }
                if (z6) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c6381b.mo5614E();
                } else {
                    c6381b.mo5618P();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        if (obj == null) {
            c6382c.m7016W();
            return;
        }
        Class<?> cls = obj.getClass();
        C3669l c3669l = this.f16223a;
        c3669l.getClass();
        AbstractC3656B abstractC3656BM4372f = c3669l.m4372f(TypeToken.get((Class) cls));
        if (!(abstractC3656BM4372f instanceof C4978k)) {
            abstractC3656BM4372f.mo4359b(c6382c, obj);
        } else {
            c6382c.m7020k();
            c6382c.m7012P();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Serializable m5635c(C6381b c6381b, int i10) throws IOException {
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 5) {
            return c6381b.mo5634x();
        }
        if (iM24h == 6) {
            return this.f16224b.mo4357a(c6381b);
        }
        if (iM24h == 7) {
            return Boolean.valueOf(c6381b.mo5619S0());
        }
        if (iM24h != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC3794B0.m4474I(i10)));
        }
        c6381b.mo5627e0();
        return null;
    }
}
