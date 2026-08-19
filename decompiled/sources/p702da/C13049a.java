package p702da;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1022t9.InterfaceC19818c;
import p1022t9.InterfaceC19822g;
import p1022t9.InterfaceC19823h;
import p999s.C19341c1;

/* JADX INFO: renamed from: da.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13049a extends AbstractC11852a implements InterfaceC19818c {

    /* JADX INFO: renamed from: A */
    public final Bundle f41471A;

    /* JADX INFO: renamed from: B */
    public final Integer f41472B;

    /* JADX INFO: renamed from: y */
    public final boolean f41473y;

    /* JADX INFO: renamed from: z */
    public final C19341c1 f41474z;

    public C13049a(Context context, Looper looper, C19341c1 c19341c1, Bundle bundle, InterfaceC19822g interfaceC19822g, InterfaceC19823h interfaceC19823h) {
        super(context, looper, 44, c19341c1, interfaceC19822g, interfaceC19823h);
        this.f41473y = true;
        this.f41474z = c19341c1;
        this.f41471A = bundle;
        this.f41472B = (Integer) c19341c1.f61260s0;
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a, p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: m */
    public final boolean mo13208m() {
        return this.f41473y;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C13052d ? (C13052d) iInterfaceQueryLocalInterface : new C13052d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: p */
    public final Bundle mo6126p() {
        C19341c1 c19341c1 = this.f41474z;
        boolean zEquals = this.f36070c.getPackageName().equals((String) c19341c1.f61257p0);
        Bundle bundle = this.f41471A;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c19341c1.f61257p0);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.gms.signin.service.START";
    }
}
