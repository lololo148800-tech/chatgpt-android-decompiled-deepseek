package androidx.glance.appwidget.protobuf;

import p001A.AbstractC0010F;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.T */
/* JADX INFO: loaded from: classes.dex */
public final class C11023T {

    /* JADX INFO: renamed from: c */
    public static final C11023T f33266c = new C11023T();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f33268b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C11012H f33267a = new C11012H();

    /* JADX INFO: renamed from: a */
    public final InterfaceC11026W m11919a(Class cls) {
        C11052n c11052n;
        InterfaceC11026W interfaceC11026WM11883x;
        C11019O c11019o;
        Class cls2;
        AbstractC11063y.m12106a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f33268b;
        InterfaceC11026W interfaceC11026W = (InterfaceC11026W) concurrentHashMap.get(cls);
        if (interfaceC11026W != null) {
            return interfaceC11026W;
        }
        C11012H c11012h = this.f33267a;
        c11012h.getClass();
        Class cls3 = AbstractC11027X.f33276a;
        if (!AbstractC11059u.class.isAssignableFrom(cls) && (cls2 = AbstractC11027X.f33276a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C11025V c11025vMo11851a = ((C11011G) c11012h.f33240a).mo11851a(cls);
        if ((c11025vMo11851a.f33275d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC11059u.class.isAssignableFrom(cls);
            AbstractC11059u abstractC11059u = c11025vMo11851a.f33272a;
            if (zIsAssignableFrom) {
                c11019o = new C11019O(AbstractC11027X.f33278c, AbstractC11053o.f33332a, abstractC11059u);
            } else {
                C11031a0 c11031a0 = AbstractC11027X.f33277b;
                C11052n c11052n2 = AbstractC11053o.f33333b;
                if (c11052n2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c11019o = new C11019O(c11031a0, c11052n2, abstractC11059u);
            }
            interfaceC11026WM11883x = c11019o;
        } else if (AbstractC11059u.class.isAssignableFrom(cls)) {
            C11020P c11020p = AbstractC11021Q.f33265b;
            C11008D c11008d = AbstractC11009E.f33237b;
            C11031a0 c11031a1 = AbstractC11027X.f33278c;
            C11052n c11052n3 = AbstractC0010F.m24h(c11025vMo11851a.m11925d()) != 1 ? AbstractC11053o.f33332a : null;
            C11014J c11014j = AbstractC11015K.f33244b;
            int[] iArr = C11018N.f33246n;
            if (!(c11025vMo11851a instanceof C11025V)) {
                c11025vMo11851a.getClass();
                throw new ClassCastException();
            }
            interfaceC11026WM11883x = C11018N.m11883x(c11025vMo11851a, c11020p, c11008d, c11031a1, c11052n3, c11014j);
        } else {
            C11020P c11020p2 = AbstractC11021Q.f33264a;
            C11008D c11008d2 = AbstractC11009E.f33236a;
            C11031a0 c11031a2 = AbstractC11027X.f33277b;
            if (AbstractC0010F.m24h(c11025vMo11851a.m11925d()) != 1) {
                c11052n = AbstractC11053o.f33333b;
                if (c11052n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c11052n = null;
            }
            C11014J c11014j2 = AbstractC11015K.f33243a;
            int[] iArr2 = C11018N.f33246n;
            if (!(c11025vMo11851a instanceof C11025V)) {
                c11025vMo11851a.getClass();
                throw new ClassCastException();
            }
            interfaceC11026WM11883x = C11018N.m11883x(c11025vMo11851a, c11020p2, c11008d2, c11031a2, c11052n, c11014j2);
        }
        InterfaceC11026W interfaceC11026W2 = (InterfaceC11026W) concurrentHashMap.putIfAbsent(cls, interfaceC11026WM11883x);
        return interfaceC11026W2 != null ? interfaceC11026W2 : interfaceC11026WM11883x;
    }
}
