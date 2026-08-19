package p496U5;

import android.os.SystemClock;
import p397Q5.C6572a;
import p397Q5.C6579h;
import p397Q5.InterfaceC6574c;

/* JADX INFO: renamed from: U5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7564f implements InterfaceC7561c {
    @Override // p496U5.InterfaceC7561c
    /* JADX INFO: renamed from: a */
    public final boolean mo1008a() {
        boolean z6;
        synchronized (C7560b.f23957a) {
            try {
                int i10 = C7560b.f23959c;
                C7560b.f23959c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > C7560b.f23960d + ((long) 30000)) {
                    C7560b.f23959c = 0;
                    C7560b.f23960d = SystemClock.uptimeMillis();
                    String[] list = C7560b.f23958b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C7560b.f23961e = list.length < 800;
                }
                z6 = C7560b.f23961e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z6;
    }

    @Override // p496U5.InterfaceC7561c
    /* JADX INFO: renamed from: c */
    public final boolean mo1011c(C6579h c6579h) {
        InterfaceC6574c interfaceC6574c = c6579h.f21265a;
        if ((interfaceC6574c instanceof C6572a ? ((C6572a) interfaceC6574c).f21256a : Integer.MAX_VALUE) > 100) {
            InterfaceC6574c interfaceC6574c2 = c6579h.f21266b;
            if ((interfaceC6574c2 instanceof C6572a ? ((C6572a) interfaceC6574c2).f21256a : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }
}
