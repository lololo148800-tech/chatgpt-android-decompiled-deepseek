package p007A5;

import android.os.SystemClock;
import p1098x5.C21122a;
import p1098x5.C21129h;
import p523V9.AbstractC7870D5;
import p916o5.C17832j;

/* JADX INFO: renamed from: A5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0377l implements InterfaceC0374i {

    /* JADX INFO: renamed from: Y */
    public static final C0377l f1279Y = new C0377l();

    /* JADX INFO: renamed from: Z */
    public static C17832j f1280Z;

    @Override // p007A5.InterfaceC0374i, p496U5.InterfaceC7561c
    /* JADX INFO: renamed from: a */
    public boolean mo1008a() {
        boolean z6;
        synchronized (C0373h.f1267a) {
            try {
                int i10 = C0373h.f1269c;
                C0373h.f1269c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > C0373h.f1270d + ((long) 30000)) {
                    C0373h.f1269c = 0;
                    C0373h.f1270d = SystemClock.uptimeMillis();
                    String[] list = C0373h.f1268b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C0373h.f1271e = list.length < 800;
                }
                z6 = C0373h.f1271e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    @Override // p007A5.InterfaceC0374i
    /* JADX INFO: renamed from: b */
    public boolean mo1009b(C21129h c21129h) {
        AbstractC7870D5 abstractC7870D5 = c21129h.f67132a;
        if ((abstractC7870D5 instanceof C21122a ? ((C21122a) abstractC7870D5).f67118b : Integer.MAX_VALUE) > 100) {
            AbstractC7870D5 abstractC7870D6 = c21129h.f67133b;
            if ((abstractC7870D6 instanceof C21122a ? ((C21122a) abstractC7870D6).f67118b : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }
}
