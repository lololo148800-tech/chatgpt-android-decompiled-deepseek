package p524Va;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: Va.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8250b implements InterfaceC8252d, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f25734a;

    public C8250b(IBinder iBinder) {
        this.f25734a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25734a;
    }
}
