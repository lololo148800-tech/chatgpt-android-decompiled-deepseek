package p288Lb;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p214Ib.AbstractC3656B;
import p214Ib.C3679v;
import p335Nb.AbstractC5704c;
import p379Pb.C6381b;
import p379Pb.C6382c;
import p544W9.AbstractC8633f4;

/* JADX INFO: renamed from: Lb.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4980m extends AbstractC3656B {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f16238a;

    public AbstractC4980m(LinkedHashMap linkedHashMap) {
        this.f16238a = linkedHashMap;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        if (c6381b.mo5616N0() == 9) {
            c6381b.mo5627e0();
            return null;
        }
        Object objMo5637c = mo5637c();
        try {
            c6381b.mo5626e();
            while (c6381b.hasNext()) {
                C4979l c4979l = (C4979l) this.f16238a.get(c6381b.mo5622a0());
                if (c4979l == null || !c4979l.f16229e) {
                    c6381b.mo5613D();
                } else {
                    mo5639e(objMo5637c, c6381b, c4979l);
                }
            }
            c6381b.mo5618P();
            return mo5638d(objMo5637c);
        } catch (IllegalAccessException e10) {
            AbstractC8633f4 abstractC8633f4 = AbstractC5704c.f18489a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new C3679v(e11);
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        if (obj == null) {
            c6382c.m7016W();
            return;
        }
        c6382c.m7020k();
        try {
            Iterator it = this.f16238a.values().iterator();
            while (it.hasNext()) {
                ((C4979l) it.next()).m5636a(c6382c, obj);
            }
            c6382c.m7012P();
        } catch (IllegalAccessException e10) {
            AbstractC8633f4 abstractC8633f4 = AbstractC5704c.f18489a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo5637c();

    /* JADX INFO: renamed from: d */
    public abstract Object mo5638d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract void mo5639e(Object obj, C6381b c6381b, C4979l c4979l);
}
