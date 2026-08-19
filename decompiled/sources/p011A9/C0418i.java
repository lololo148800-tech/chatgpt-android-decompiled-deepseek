package p011A9;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19501d;
import p377P9.AbstractC6376b;

/* JADX INFO: renamed from: A9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0418i extends AbstractC11852a {
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof C0414e ? (C0414e) iInterfaceQueryLocalInterface : new C0414e(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 1);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: o */
    public final C19501d[] mo1032o() {
        return AbstractC6376b.f20772d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: t */
    public final boolean mo1035t() {
        return true;
    }
}
