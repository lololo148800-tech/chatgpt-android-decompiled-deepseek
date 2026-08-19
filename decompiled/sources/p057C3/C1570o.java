package p057C3;

import android.content.Context;
import bb.C11294T;
import java.util.HashMap;
import p1073w3.C20813o;
import p182H3.C3202c;
import p232J3.C4241m;
import p281L3.C4928o;
import p305M3.C5287g;
import p372P3.C6331m;
import p644ab.InterfaceC10536i;

/* JADX INFO: renamed from: C3.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1570o implements InterfaceC10536i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4394Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f4395Z;

    public /* synthetic */ C1570o(Context context, int i10) {
        this.f4394Y = i10;
        this.f4395Z = context;
    }

    @Override // p644ab.InterfaceC10536i
    public final Object get() {
        C5287g c5287g;
        switch (this.f4394Y) {
            case 0:
                return new C4241m(this.f4395Z, new C6331m());
            case 1:
                return new C4928o(this.f4395Z);
            default:
                Context context = this.f4395Z;
                C11294T c11294t = C5287g.f17410n;
                synchronized (C5287g.class) {
                    try {
                        if (C5287g.f17416t == null) {
                            C3202c c3202c = new C3202c(context);
                            C5287g.f17416t = new C5287g((Context) c3202c.f9661o0, (HashMap) c3202c.f9662p0, c3202c.f9659Y, (C20813o) c3202c.f9663q0, c3202c.f9660Z);
                        }
                        c5287g = C5287g.f17416t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return c5287g;
        }
    }
}
