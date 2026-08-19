package p566X4;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p444S4.C7011q;
import p658b5.C11245p;
import p720e6.C13288c;

/* JADX INFO: renamed from: X4.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9050h {

    /* JADX INFO: renamed from: a */
    public static final String f27626a;

    static {
        String strM7409f = C7011q.m7409f("WorkConstraintsTracker");
        AbstractC16544l.m18093f(strM7409f, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f27626a = strM7409f;
    }

    /* JADX INFO: renamed from: a */
    public static final C0631p0 m9609a(C13288c c13288c, C11245p c11245p, AbstractC0563B dispatcher, InterfaceC9047e listener) {
        AbstractC16544l.m18094g(c13288c, "<this>");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(listener, "listener");
        C0631p0 c0631p0M1175d = AbstractC0575H.m1175d();
        AbstractC0575H.m1156D(AbstractC0575H.m1174c(dispatcher.plus(c0631p0M1175d)), null, null, new C9049g(c13288c, c11245p, listener, null), 3);
        return c0631p0M1175d;
    }
}
