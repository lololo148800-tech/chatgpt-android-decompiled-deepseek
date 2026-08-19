package p953q0;

import ge.C14103t0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p537W0.C8410b;
import p562X0.InterfaceC9009d;
import ph.C18416d;

/* JADX INFO: renamed from: q0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C18553K {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9009d f59117a;

    /* JADX INFO: renamed from: b */
    public final C14103t0 f59118b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f59119c = new LinkedHashMap();

    public C18553K(InterfaceC9009d interfaceC9009d, C14103t0 c14103t0) {
        this.f59117a = interfaceC9009d;
        this.f59118b = c14103t0;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1439n m19933a(Object obj, int i10, Object obj2) {
        C8410b c8410b;
        LinkedHashMap linkedHashMap = this.f59119c;
        C18552J c18552j = (C18552J) linkedHashMap.get(obj);
        if (c18552j != null && c18552j.f59114c == i10 && AbstractC16544l.m18089b(c18552j.f59113b, obj2)) {
            C8410b c8410b2 = c18552j.f59115d;
            if (c8410b2 != null) {
                return c8410b2;
            }
            c8410b = new C8410b(new C18416d(c18552j.f59116e, 1, c18552j), true, 1403994769);
            c18552j.f59115d = c8410b;
        } else {
            C18552J c18552j2 = new C18552J(this, i10, obj, obj2);
            linkedHashMap.put(obj, c18552j2);
            C8410b c8410b3 = c18552j2.f59115d;
            if (c8410b3 != null) {
                return c8410b3;
            }
            c8410b = new C8410b(new C18416d(this, 1, c18552j2), true, 1403994769);
            c18552j2.f59115d = c8410b;
        }
        return c8410b;
    }

    /* JADX INFO: renamed from: b */
    public final Object m19934b(Object obj) {
        if (obj == null) {
            return null;
        }
        C18552J c18552j = (C18552J) this.f59119c.get(obj);
        if (c18552j != null) {
            return c18552j.f59113b;
        }
        InterfaceC18554L interfaceC18554L = (InterfaceC18554L) this.f59118b.invoke();
        int iMo5910a = interfaceC18554L.mo5910a(obj);
        if (iMo5910a != -1) {
            return interfaceC18554L.mo5913d(iMo5910a);
        }
        return null;
    }
}
