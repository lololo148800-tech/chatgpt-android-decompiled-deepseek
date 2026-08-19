package p890mb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p083D3.C1864b;
import p331N6.C5676a;
import p571X9.AbstractC9162L;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: mb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17204a {

    /* JADX INFO: renamed from: a */
    public final String f54920a;

    /* JADX INFO: renamed from: b */
    public final Set f54921b;

    /* JADX INFO: renamed from: c */
    public final Set f54922c;

    /* JADX INFO: renamed from: d */
    public final int f54923d;

    /* JADX INFO: renamed from: e */
    public final int f54924e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17207d f54925f;

    /* JADX INFO: renamed from: g */
    public final Set f54926g;

    public C17204a(String str, Set set, Set set2, int i10, int i11, InterfaceC17207d interfaceC17207d, Set set3) {
        this.f54920a = str;
        this.f54921b = DesugarCollections.unmodifiableSet(set);
        this.f54922c = DesugarCollections.unmodifiableSet(set2);
        this.f54923d = i10;
        this.f54924e = i11;
        this.f54925f = interfaceC17207d;
        this.f54926g = DesugarCollections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static C5676a m18942a(Class cls) {
        return new C5676a(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: b */
    public static C5676a m18943b(C17220q c17220q) {
        return new C5676a(c17220q, new C17220q[0]);
    }

    /* JADX INFO: renamed from: c */
    public static C17204a m18944c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C17220q.m18953a(cls));
        for (Class cls2 : clsArr) {
            AbstractC9162L.m9711a(cls2, "Null interface");
            hashSet.add(C17220q.m18953a(cls2));
        }
        return new C17204a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C1864b(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f54921b.toArray()) + ">{" + this.f54923d + ", type=" + this.f54924e + ", deps=" + Arrays.toString(this.f54922c.toArray()) + "}";
    }
}
