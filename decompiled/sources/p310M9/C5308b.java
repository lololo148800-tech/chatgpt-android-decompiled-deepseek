package p310M9;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19501d;
import p868l9.AbstractC16835c;

/* JADX INFO: renamed from: M9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5308b extends AbstractC11852a {
    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof C5309c ? (C5309c) iInterfaceQueryLocalInterface : new C5309c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: o */
    public final C19501d[] mo1032o() {
        return AbstractC16835c.f54009b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.gms.appset.service.START";
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
