package com.google.protobuf;

import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12128W0 {

    /* JADX INFO: renamed from: c */
    public static final C12128W0 f36987c = new C12128W0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f36989b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C12211z0 f36988a = new C12211z0();

    /* JADX INFO: renamed from: a */
    public final InterfaceC12134Z0 m13868a(Class cls) {
        InterfaceC12134Z0 interfaceC12134Z0M13753E;
        C12103K0 c12103k0;
        Class cls2;
        AbstractC12175n0.m14013a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f36989b;
        InterfaceC12134Z0 interfaceC12134Z0 = (InterfaceC12134Z0) concurrentHashMap.get(cls);
        if (interfaceC12134Z0 != null) {
            return interfaceC12134Z0;
        }
        C12211z0 c12211z0 = this.f36988a;
        c12211z0.getClass();
        Class cls3 = AbstractC12137a1.f37010a;
        if (!AbstractC12133Z.class.isAssignableFrom(cls) && (cls2 = AbstractC12137a1.f37010a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C12132Y0 c12132y0Mo13735a = ((C12208y0) c12211z0.f37131a).mo13735a(cls);
        if ((c12132y0Mo13735a.f37008d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC12133Z.class.isAssignableFrom(cls);
            InterfaceC12091G0 interfaceC12091G0 = c12132y0Mo13735a.f37005a;
            if (zIsAssignableFrom) {
                c12103k0 = new C12103K0(AbstractC12137a1.f37013d, AbstractC12093H.f36887a, interfaceC12091G0);
            } else {
                C12185q1 c12185q1 = AbstractC12137a1.f37011b;
                C12090G c12090g = AbstractC12093H.f36888b;
                if (c12090g == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c12103k0 = new C12103K0(c12185q1, c12090g, interfaceC12091G0);
            }
            interfaceC12134Z0M13753E = c12103k0;
        } else if (AbstractC12133Z.class.isAssignableFrom(cls)) {
            interfaceC12134Z0M13753E = c12132y0Mo13735a.m13876d() == 1 ? C12100J0.m13753E(c12132y0Mo13735a, AbstractC12117Q0.f36973b, AbstractC12199v0.f37115b, AbstractC12137a1.f37013d, AbstractC12093H.f36887a, AbstractC12082D0.f36873b) : C12100J0.m13753E(c12132y0Mo13735a, AbstractC12117Q0.f36973b, AbstractC12199v0.f37115b, AbstractC12137a1.f37013d, null, AbstractC12082D0.f36873b);
        } else if (c12132y0Mo13735a.m13876d() == 1) {
            C12115P0 c12115p0 = AbstractC12117Q0.f36972a;
            C12193t0 c12193t0 = AbstractC12199v0.f37114a;
            C12185q1 c12185q2 = AbstractC12137a1.f37011b;
            C12090G c12090g2 = AbstractC12093H.f36888b;
            if (c12090g2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC12134Z0M13753E = C12100J0.m13753E(c12132y0Mo13735a, c12115p0, c12193t0, c12185q2, c12090g2, AbstractC12082D0.f36872a);
        } else {
            interfaceC12134Z0M13753E = C12100J0.m13753E(c12132y0Mo13735a, AbstractC12117Q0.f36972a, AbstractC12199v0.f37114a, AbstractC12137a1.f37012c, null, AbstractC12082D0.f36872a);
        }
        InterfaceC12134Z0 interfaceC12134Z1 = (InterfaceC12134Z0) concurrentHashMap.putIfAbsent(cls, interfaceC12134Z0M13753E);
        return interfaceC12134Z1 != null ? interfaceC12134Z1 : interfaceC12134Z0M13753E;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12134Z0 m13869b(Object obj) {
        return m13868a(obj.getClass());
    }
}
