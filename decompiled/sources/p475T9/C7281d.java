package p475T9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ba.AbstractC11275g;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19501d;
import p1036u9.C20171q;
import p692d0.C12959L;
import p999s.C19341c1;

/* JADX INFO: renamed from: T9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7281d extends AbstractC11852a {

    /* JADX INFO: renamed from: A */
    public final C12959L f23074A;

    /* JADX INFO: renamed from: y */
    public final C12959L f23075y;

    /* JADX INFO: renamed from: z */
    public final C12959L f23076z;

    public C7281d(Context context, Looper looper, C19341c1 c19341c1, C20171q c20171q, C20171q c20171q2) {
        super(context, looper, 23, c19341c1, c20171q, c20171q2);
        this.f23075y = new C12959L(0);
        this.f23076z = new C12959L(0);
        this.f23074A = new C12959L(0);
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof C7290m ? (C7290m) iInterfaceQueryLocalInterface : new C7290m(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: o */
    public final C19501d[] mo1032o() {
        return AbstractC11275g.f34155a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: u */
    public final void mo7733u() {
        System.currentTimeMillis();
        synchronized (this.f23075y) {
            this.f23075y.clear();
        }
        synchronized (this.f23076z) {
            this.f23076z.clear();
        }
        synchronized (this.f23074A) {
            this.f23074A.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: v */
    public final boolean mo5842v() {
        return true;
    }
}
