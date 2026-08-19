package p333N9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1036u9.C20171q;
import p1139z0.C21585H;
import p138F8.vJO.anhfj;
import p889m9.C17200b;
import p999s.C19341c1;

/* JADX INFO: renamed from: N9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5689j extends AbstractC11852a {

    /* JADX INFO: renamed from: y */
    public final C17200b f18461y;

    public C5689j(Context context, Looper looper, C19341c1 c19341c1, C17200b c17200b, C20171q c20171q, C20171q c20171q2) {
        super(context, looper, 68, c19341c1, c20171q, c20171q2);
        c17200b = c17200b == null ? C17200b.f54908o0 : c17200b;
        C21585H c21585h = new C21585H(16, (byte) 0);
        c21585h.f68344Z = Boolean.FALSE;
        C17200b c17200b2 = C17200b.f54908o0;
        c17200b.getClass();
        c21585h.f68344Z = Boolean.valueOf(c17200b.f54909Y);
        c21585h.f68345o0 = c17200b.f54910Z;
        c21585h.f68345o0 = AbstractC5686g.m6127a();
        this.f18461y = new C17200b(c21585h);
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof C5690k ? (C5690k) iInterfaceQueryLocalInterface : new C5690k(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: p */
    public final Bundle mo6126p() {
        C17200b c17200b = this.f18461y;
        c17200b.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c17200b.f54909Y);
        bundle.putString("log_session_id", c17200b.f54910Z);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return anhfj.KmzfodDDfmmszo;
    }
}
