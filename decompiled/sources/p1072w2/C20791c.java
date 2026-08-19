package p1072w2;

/* JADX INFO: renamed from: w2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20791c {

    /* JADX INFO: renamed from: a */
    public boolean f66051a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20790b f66052b;

    /* JADX INFO: renamed from: c */
    public boolean f66053c;

    /* JADX INFO: renamed from: a */
    public final void m21308a(InterfaceC20790b interfaceC20790b) {
        synchronized (this) {
            while (this.f66053c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f66052b == interfaceC20790b) {
                return;
            }
            this.f66052b = interfaceC20790b;
            if (this.f66051a) {
                interfaceC20790b.onCancel();
            }
        }
    }
}
