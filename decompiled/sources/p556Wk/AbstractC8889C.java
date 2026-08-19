package p556Wk;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p409Qk.C6752c;
import sl.C19666a;
import sl.C19675j;

/* JADX INFO: renamed from: Wk.C */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8889C {

    /* JADX INFO: renamed from: a */
    public static final C19666a f27207a;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C19675j.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C19675j.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f27207a = new C19666a("ApplicationPluginRegistry", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
    }

    /* JADX INFO: renamed from: a */
    public static final Object m9559a(C6752c c6752c, InterfaceC8888B interfaceC8888B) {
        AbstractC16544l.m18094g(c6752c, "<this>");
        C19675j c19675j = (C19675j) c6752c.f21675v0.m20651e(f27207a);
        if (c19675j != null) {
            return c19675j.m20651e(interfaceC8888B.getKey());
        }
        return null;
    }
}
