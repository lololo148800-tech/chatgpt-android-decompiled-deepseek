package p449S9;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: S9.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7092r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f22578a;

    /* JADX INFO: renamed from: b */
    public final String f22579b;

    public C7092r0(IBinder iBinder, String str) {
        this.f22578a = iBinder;
        this.f22579b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22578a;
    }
}
