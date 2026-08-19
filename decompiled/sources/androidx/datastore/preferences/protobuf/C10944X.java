package androidx.datastore.preferences.protobuf;

import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.X */
/* JADX INFO: loaded from: classes.dex */
public final class C10944X {

    /* JADX INFO: renamed from: c */
    public static final C10944X f33003c = new C10944X();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f33005b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C10930I f33004a = new C10930I();

    /* JADX INFO: renamed from: a */
    public final InterfaceC10948a0 m11515a(Class cls) {
        InterfaceC10948a0 interfaceC10948a0M11480x;
        C10939S c10939s;
        Class cls2;
        AbstractC10993x.m11723a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f33005b;
        InterfaceC10948a0 interfaceC10948a0 = (InterfaceC10948a0) concurrentHashMap.get(cls);
        if (interfaceC10948a0 != null) {
            return interfaceC10948a0;
        }
        C10930I c10930i = this.f33004a;
        c10930i.getClass();
        Class cls3 = AbstractC10950b0.f33014a;
        if (!AbstractC10987u.class.isAssignableFrom(cls) && (cls2 = AbstractC10950b0.f33014a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C10946Z c10946zMo11438a = ((C10929H) c10930i.f32971a).mo11438a(cls);
        if ((c10946zMo11438a.f33012d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC10987u.class.isAssignableFrom(cls);
            AbstractC10987u abstractC10987u = c10946zMo11438a.f33009a;
            if (zIsAssignableFrom) {
                c10939s = new C10939S(AbstractC10950b0.f33017d, AbstractC10973n.f33072a, abstractC10987u);
            } else {
                C10966j0 c10966j0 = AbstractC10950b0.f33015b;
                C10971m c10971m = AbstractC10973n.f33073b;
                if (c10971m == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c10939s = new C10939S(c10966j0, c10971m, abstractC10987u);
            }
            interfaceC10948a0M11480x = c10939s;
        } else if (AbstractC10987u.class.isAssignableFrom(cls)) {
            interfaceC10948a0M11480x = c10946zMo11438a.m11520d() == 1 ? C10938Q.m11480x(c10946zMo11438a, AbstractC10941U.f33002b, AbstractC10927F.f32968b, AbstractC10950b0.f33017d, AbstractC10973n.f33072a, AbstractC10935N.f32979b) : C10938Q.m11480x(c10946zMo11438a, AbstractC10941U.f33002b, AbstractC10927F.f32968b, AbstractC10950b0.f33017d, null, AbstractC10935N.f32979b);
        } else if (c10946zMo11438a.m11520d() == 1) {
            C10940T c10940t = AbstractC10941U.f33001a;
            C10925D c10925d = AbstractC10927F.f32967a;
            C10966j0 c10966j1 = AbstractC10950b0.f33015b;
            C10971m c10971m2 = AbstractC10973n.f33073b;
            if (c10971m2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC10948a0M11480x = C10938Q.m11480x(c10946zMo11438a, c10940t, c10925d, c10966j1, c10971m2, AbstractC10935N.f32978a);
        } else {
            interfaceC10948a0M11480x = C10938Q.m11480x(c10946zMo11438a, AbstractC10941U.f33001a, AbstractC10927F.f32967a, AbstractC10950b0.f33016c, null, AbstractC10935N.f32978a);
        }
        InterfaceC10948a0 interfaceC10948a1 = (InterfaceC10948a0) concurrentHashMap.putIfAbsent(cls, interfaceC10948a0M11480x);
        return interfaceC10948a1 != null ? interfaceC10948a1 : interfaceC10948a0M11480x;
    }
}
