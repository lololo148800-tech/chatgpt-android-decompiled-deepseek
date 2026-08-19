package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11871F1 {

    /* JADX INFO: renamed from: c */
    public static final C11871F1 f36125c = new C11871F1();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f36127b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C12021w1 f36126a = new C12021w1();

    /* JADX INFO: renamed from: a */
    public final InterfaceC11880I1 m13262a(Class cls) {
        Charset charset = AbstractC11989o1.f36309a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f36127b;
        InterfaceC11880I1 interfaceC11880I1M13229u = (InterfaceC11880I1) concurrentHashMap.get(cls);
        if (interfaceC11880I1M13229u == null) {
            C12021w1 c12021w1 = this.f36126a;
            c12021w1.getClass();
            C11961h1 c11961h1 = AbstractC11883J1.f36151a;
            AbstractC11969j1.class.isAssignableFrom(cls);
            C11877H1 c11877h1Mo13468a = ((C12021w1) c12021w1.f36344a).mo13468a(cls);
            if ((c11877h1Mo13468a.f36140d & 2) == 2) {
                C11961h1 c11961h2 = AbstractC11883J1.f36151a;
                C11961h1 c11961h3 = AbstractC11945d1.f36251a;
                interfaceC11880I1M13229u = new C11862C1(c11961h2, c11877h1Mo13468a.f36137a);
            } else {
                int i10 = AbstractC11865D1.f36119a;
                int i11 = AbstractC12013u1.f36337a;
                C11961h1 c11961h4 = AbstractC11883J1.f36151a;
                C11961h1 c11961h5 = c11877h1Mo13468a.m13270b() + (-1) != 1 ? AbstractC11945d1.f36251a : null;
                int i12 = AbstractC12029y1.f36364a;
                interfaceC11880I1M13229u = C11859B1.m13229u(c11877h1Mo13468a, c11961h4, c11961h5);
            }
            InterfaceC11880I1 interfaceC11880I1 = (InterfaceC11880I1) concurrentHashMap.putIfAbsent(cls, interfaceC11880I1M13229u);
            if (interfaceC11880I1 != null) {
                return interfaceC11880I1;
            }
        }
        return interfaceC11880I1M13229u;
    }
}
