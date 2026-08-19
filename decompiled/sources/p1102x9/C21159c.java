package p1102x9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19501d;
import p1036u9.C20171q;
import p1060v9.C20494l;
import p377P9.AbstractC6376b;
import p999s.C19341c1;

/* JADX INFO: renamed from: x9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21159c extends AbstractC11852a {

    /* JADX INFO: renamed from: y */
    public final C20494l f67234y;

    public C21159c(Context context, Looper looper, C19341c1 c19341c1, C20494l c20494l, C20171q c20171q, C20171q c20171q2) {
        super(context, looper, 270, c19341c1, c20171q, c20171q2);
        this.f67234y = c20494l;
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C21157a ? (C21157a) iInterfaceQueryLocalInterface : new C21157a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: o */
    public final C19501d[] mo1032o() {
        return AbstractC6376b.f20770b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: p */
    public final Bundle mo6126p() {
        C20494l c20494l = this.f67234y;
        c20494l.getClass();
        Bundle bundle = new Bundle();
        String str = c20494l.f65077Y;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: t */
    public final boolean mo1035t() {
        return true;
    }
}
