package kotlin.jvm.internal;

import java.util.Collections;
import p225Im.C3743B;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p298Lm.C5139F0;

/* JADX INFO: renamed from: kotlin.jvm.internal.C */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16526C {

    /* JADX INFO: renamed from: a */
    public static final C16527D f51263a;

    static {
        C16527D c16527d = null;
        try {
            c16527d = (C16527D) C5139F0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c16527d == null) {
            c16527d = new C16527D();
        }
        f51263a = c16527d;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC3756d m18073a(Class cls) {
        return f51263a.mo5693b(cls);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC3777y m18074b(Class cls) {
        C16527D c16527d = f51263a;
        return c16527d.mo5704m(c16527d.mo5693b(cls), Collections.emptyList(), true);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC3777y m18075c(Class cls) {
        C16527D c16527d = f51263a;
        return c16527d.mo5704m(c16527d.mo5693b(cls), Collections.emptyList(), false);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC3777y m18076d(Class cls, C3743B c3743b) {
        C16527D c16527d = f51263a;
        return c16527d.mo5704m(c16527d.mo5693b(cls), Collections.singletonList(c3743b), false);
    }
}
