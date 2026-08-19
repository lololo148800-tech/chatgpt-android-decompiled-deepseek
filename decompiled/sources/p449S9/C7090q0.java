package p449S9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19501d;
import p188H9.AbstractC3266a;

/* JADX INFO: renamed from: S9.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7090q0 extends AbstractC11852a {
    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof C7092r0 ? (C7092r0) iInterfaceQueryLocalInterface : new C7092r0(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: o */
    public final C19501d[] mo1032o() {
        return new C19501d[]{AbstractC3266a.f9940b, AbstractC3266a.f9939a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: p */
    public final Bundle mo6126p() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: v */
    public final boolean mo5842v() {
        return true;
    }
}
