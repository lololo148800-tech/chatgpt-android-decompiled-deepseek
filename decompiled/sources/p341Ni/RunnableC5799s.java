package p341Ni;

import android.media.AudioAttributes;
import p075Cl.C1719b;
import p855kj.C16429h;
import p855kj.C16431j;
import p855kj.C16432k;

/* JADX INFO: renamed from: Ni.s */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5799s implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18933Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5801u f18934Z;

    public /* synthetic */ RunnableC5799s(C5801u c5801u, int i10) {
        this.f18933Y = i10;
        this.f18934Z = c5801u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18933Y) {
            case 0:
                C5801u c5801u = this.f18934Z;
                if (c5801u.f18942g == null) {
                    C16432k c16432k = new C16432k(c5801u.f18936a, false, C16431j.f50970a, c5801u.f18938c);
                    c16432k.f50979h = c5801u.f18939d;
                    C1719b c1719b = c5801u.f18937b;
                    C16429h c16429h = c16432k.f50982k;
                    c16429h.f50961e = c1719b.f4933a;
                    c16429h.f50962f = c5801u.f18940e;
                    c16429h.f50963g = c1719b.f4935c;
                    AudioAttributes audioAttributes = c1719b.f4934b;
                    c16429h.f50964h = audioAttributes.getUsage();
                    c16429h.f50965i = audioAttributes.getContentType();
                    c16432k.f50980i = c5801u.f18941f;
                    c5801u.f18942g = c16432k;
                }
                C16432k c16432k2 = c5801u.f18942g;
                if (c16432k2 != null) {
                    c16432k2.m18017f(c5801u.f18944i);
                    c16432k2.m18013a();
                }
                break;
            default:
                C16432k c16432k3 = this.f18934Z.f18942g;
                if (c16432k3 != null) {
                    c16432k3.m18018g();
                }
                break;
        }
    }
}
