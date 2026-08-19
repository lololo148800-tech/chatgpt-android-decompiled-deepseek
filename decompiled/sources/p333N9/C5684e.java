package p333N9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19501d;
import p1036u9.C20171q;
import p999s.C19341c1;

/* JADX INFO: renamed from: N9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5684e extends AbstractC11852a {

    /* JADX INFO: renamed from: y */
    public final Bundle f18453y;

    public C5684e(Context context, Looper looper, C19341c1 c19341c1, C20171q c20171q, C20171q c20171q2) {
        super(context, looper, 212, c19341c1, c20171q, c20171q2);
        this.f18453y = new Bundle();
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C5693n ? (C5693n) iInterfaceQueryLocalInterface : new C5693n(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: o */
    public final C19501d[] mo1032o() {
        return AbstractC5685f.f18457d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: p */
    public final Bundle mo6126p() {
        return this.f18453y;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: t */
    public final boolean mo1035t() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: v */
    public final boolean mo5842v() {
        return true;
    }
}
