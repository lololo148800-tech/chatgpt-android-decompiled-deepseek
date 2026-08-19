package p357Oa;

import p315Me.Myis.CxcULo;

/* JADX INFO: renamed from: Oa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6149b implements InterfaceC6150c {

    /* JADX INFO: renamed from: o0 */
    public static final Object f20033o0 = new Object();

    /* JADX INFO: renamed from: Y */
    public volatile InterfaceC6150c f20034Y;

    /* JADX INFO: renamed from: Z */
    public volatile Object f20035Z;

    /* JADX INFO: renamed from: b */
    public static InterfaceC6150c m6712b(InterfaceC6150c interfaceC6150c) {
        if (interfaceC6150c instanceof C6149b) {
            return interfaceC6150c;
        }
        C6149b c6149b = new C6149b();
        c6149b.f20035Z = f20033o0;
        c6149b.f20034Y = interfaceC6150c;
        return c6149b;
    }

    @Override // p357Oa.InterfaceC6150c
    /* JADX INFO: renamed from: a */
    public final Object mo3914a() {
        String str = CxcULo.kGiuLnEzV;
        Object objMo3914a = this.f20035Z;
        Object obj = f20033o0;
        if (objMo3914a == obj) {
            synchronized (this) {
                try {
                    objMo3914a = this.f20035Z;
                    if (objMo3914a == obj) {
                        objMo3914a = this.f20034Y.mo3914a();
                        Object obj2 = this.f20035Z;
                        if (obj2 != obj && obj2 != objMo3914a) {
                            throw new IllegalStateException(str + obj2 + " & " + objMo3914a + ". This is likely due to a circular dependency.");
                        }
                        this.f20035Z = objMo3914a;
                        this.f20034Y = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return objMo3914a;
    }
}
