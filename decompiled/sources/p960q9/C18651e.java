package p960q9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC11852a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p1036u9.C20171q;
import p333N9.AbstractC5686g;
import p945p9.C18311b;
import p999s.C19341c1;

/* JADX INFO: renamed from: q9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18651e extends AbstractC11852a {

    /* JADX INFO: renamed from: y */
    public final GoogleSignInOptions f59407y;

    public C18651e(Context context, Looper looper, C19341c1 c19341c1, GoogleSignInOptions googleSignInOptions, C20171q c20171q, C20171q c20171q2) {
        C18311b c18311b;
        super(context, looper, 91, c19341c1, c20171q, c20171q2);
        if (googleSignInOptions != null) {
            c18311b = new C18311b();
            c18311b.f58441a = new HashSet();
            c18311b.f58448h = new HashMap();
            c18311b.f58441a = new HashSet(googleSignInOptions.f36023Z);
            c18311b.f58442b = googleSignInOptions.f36026q0;
            c18311b.f58443c = googleSignInOptions.f36027r0;
            c18311b.f58444d = googleSignInOptions.f36025p0;
            c18311b.f58445e = googleSignInOptions.f36028s0;
            c18311b.f58446f = googleSignInOptions.f36024o0;
            c18311b.f58447g = googleSignInOptions.f36029t0;
            c18311b.f58448h = GoogleSignInOptions.m13180c(googleSignInOptions.f36030u0);
            c18311b.f58449i = googleSignInOptions.f36031v0;
        } else {
            c18311b = new C18311b();
            c18311b.f58441a = new HashSet();
            c18311b.f58448h = new HashMap();
        }
        c18311b.f58449i = AbstractC5686g.m6127a();
        Set<Scope> set = (Set) c19341c1.f61255Z;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = c18311b.f58441a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f36021z0;
        HashSet hashSet2 = c18311b.f58441a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f36020y0;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (c18311b.f58444d && (c18311b.f58446f == null || !hashSet2.isEmpty())) {
            c18311b.f58441a.add(GoogleSignInOptions.f36019x0);
        }
        this.f59407y = new GoogleSignInOptions(3, new ArrayList(hashSet2), c18311b.f58446f, c18311b.f58444d, c18311b.f58442b, c18311b.f58443c, c18311b.f58445e, c18311b.f58447g, c18311b.f58448h, c18311b.f58449i);
    }

    @Override // p1022t9.InterfaceC19818c
    /* JADX INFO: renamed from: j */
    public final int mo1030j() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: n */
    public final IInterface mo1031n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C18657k ? (C18657k) iInterfaceQueryLocalInterface : new C18657k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: r */
    public final String mo1033r() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC11852a
    /* JADX INFO: renamed from: s */
    public final String mo1034s() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
