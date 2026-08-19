package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C15394j extends TimerTask {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47985Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15397k f47986Z;

    public /* synthetic */ C15394j(C15397k c15397k, int i10) {
        this.f47985Y = i10;
        this.f47986Z = c15397k;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f47985Y) {
            case 0:
                Iterator it = this.f47986Z.f47999p0.iterator();
                while (it.hasNext()) {
                    ((InterfaceC15142M) it.next()).mo16319c();
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C15397k c15397k = this.f47986Z;
                if (jCurrentTimeMillis - c15397k.f48004u0 >= 10) {
                    c15397k.f48004u0 = jCurrentTimeMillis;
                    C15107A0 c15107a0 = new C15107A0();
                    c15107a0.f47004a = null;
                    c15107a0.f47005b = null;
                    Iterator it2 = c15397k.f47999p0.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC15142M) it2.next()).mo16318a(c15107a0);
                    }
                    Iterator it3 = c15397k.f47998o0.values().iterator();
                    while (it3.hasNext()) {
                        ((List) it3.next()).add(c15107a0);
                    }
                    break;
                }
                break;
        }
    }
}
