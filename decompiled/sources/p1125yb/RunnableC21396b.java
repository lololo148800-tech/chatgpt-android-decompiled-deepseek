package p1125yb;

import java.io.IOException;
import p1148zb.C21830a;
import p832jb.C16187g;
import sk.C19662a;

/* JADX INFO: renamed from: yb.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21396b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67925Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21397c f67926Z;

    public /* synthetic */ RunnableC21396b(C21397c c21397c, int i10) {
        this.f67925Y = i10;
        this.f67926Z = c21397c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21830a c21830aM20636h;
        C21830a c21830aM21785i;
        switch (this.f67925Y) {
            case 0:
                this.f67926Z.m21778b();
                return;
            case 1:
                this.f67926Z.m21778b();
                return;
            default:
                C21397c c21397c = this.f67926Z;
                c21397c.getClass();
                synchronized (C21397c.f67927m) {
                    try {
                        C16187g c16187g = c21397c.f67928a;
                        c16187g.m17794a();
                        C19662a c19662aM20630b = C19662a.m20630b(c16187g.f50235a);
                        try {
                            c21830aM20636h = c21397c.f67930c.m20636h();
                            if (c19662aM20630b != null) {
                                c19662aM20630b.m20637i();
                            }
                        } catch (Throwable th2) {
                            if (c19662aM20630b != null) {
                                c19662aM20630b.m20637i();
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                try {
                    int i10 = c21830aM20636h.f69281b;
                    if (i10 == 5) {
                        c21830aM21785i = c21397c.m21785i(c21830aM20636h);
                    } else {
                        if (i10 == 3) {
                            c21830aM21785i = c21397c.m21785i(c21830aM20636h);
                        } else if (!c21397c.f67931d.m21793a(c21830aM20636h)) {
                            return;
                        } else {
                            c21830aM21785i = c21397c.m21779c(c21830aM20636h);
                        }
                    }
                    c21397c.m21782f(c21830aM21785i);
                    c21397c.m21789m(c21830aM20636h, c21830aM21785i);
                    if (c21830aM21785i.f69281b == 4) {
                        c21397c.m21788l(c21830aM21785i.f69280a);
                    }
                    int i11 = c21830aM21785i.f69281b;
                    if (i11 == 5) {
                        c21397c.m21786j(new C21399e());
                        return;
                    } else if (i11 == 2 || i11 == 1) {
                        c21397c.m21786j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c21397c.m21787k(c21830aM21785i);
                        return;
                    }
                } catch (C21399e e10) {
                    c21397c.m21786j(e10);
                    return;
                }
        }
    }
}
