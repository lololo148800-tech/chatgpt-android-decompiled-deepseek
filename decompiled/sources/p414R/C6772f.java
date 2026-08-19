package p414R;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p004A2.InterfaceC0310a;
import p1036u9.C20168n;
import p1096x2.AbstractC21112g;
import p1096x2.C21111f;
import p692d0.C12959L;

/* JADX INFO: renamed from: R.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6772f implements InterfaceC0310a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21734a;

    /* JADX INFO: renamed from: b */
    public Object f21735b;

    public /* synthetic */ C6772f() {
        this.f21734a = 0;
    }

    @Override // p004A2.InterfaceC0310a
    public final void accept(Object obj) {
        switch (this.f21734a) {
            case 0:
                AbstractC16544l.m18092e((InterfaceC0310a) this.f21735b, "Listener is not set.");
                ((InterfaceC0310a) this.f21735b).accept(obj);
                return;
            case 1:
                C21111f c21111f = (C21111f) obj;
                if (c21111f == null) {
                    c21111f = new C21111f(-3);
                }
                ((C20168n) this.f21735b).m20991g(c21111f);
                return;
            default:
                C21111f c21111f2 = (C21111f) obj;
                synchronized (AbstractC21112g.f67061c) {
                    try {
                        C12959L c12959l = AbstractC21112g.f67062d;
                        ArrayList arrayList = (ArrayList) c12959l.get((String) this.f21735b);
                        if (arrayList == null) {
                            return;
                        }
                        c12959l.remove((String) this.f21735b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((InterfaceC0310a) arrayList.get(i10)).accept(c21111f2);
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }

    public /* synthetic */ C6772f(Object obj, int i10) {
        this.f21734a = i10;
        this.f21735b = obj;
    }
}
