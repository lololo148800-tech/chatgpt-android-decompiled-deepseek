package p1060v9;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.AbstractC15256t;
import p1009s9.C19501d;
import p1078w9.AbstractC20851a;
import p424R9.AbstractC6827a;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20487e extends AbstractC20851a {

    /* JADX INFO: renamed from: Y */
    public final int f65040Y;

    /* JADX INFO: renamed from: Z */
    public final int f65041Z;

    /* JADX INFO: renamed from: o0 */
    public final int f65042o0;

    /* JADX INFO: renamed from: p0 */
    public String f65043p0;

    /* JADX INFO: renamed from: q0 */
    public IBinder f65044q0;

    /* JADX INFO: renamed from: r0 */
    public Scope[] f65045r0;

    /* JADX INFO: renamed from: s0 */
    public Bundle f65046s0;

    /* JADX INFO: renamed from: t0 */
    public Account f65047t0;

    /* JADX INFO: renamed from: u0 */
    public C19501d[] f65048u0;

    /* JADX INFO: renamed from: v0 */
    public C19501d[] f65049v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f65050w0;

    /* JADX INFO: renamed from: x0 */
    public final int f65051x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f65052y0;

    /* JADX INFO: renamed from: z0 */
    public final String f65053z0;
    public static final Parcelable.Creator<C20487e> CREATOR = new C18658l(28);

    /* JADX INFO: renamed from: A0 */
    public static final Scope[] f65038A0 = new Scope[0];

    /* JADX INFO: renamed from: B0 */
    public static final C19501d[] f65039B0 = new C19501d[0];

    public C20487e(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C19501d[] c19501dArr, C19501d[] c19501dArr2, boolean z6, int i13, boolean z10, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f65038A0 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C19501d[] c19501dArr3 = f65039B0;
        C19501d[] c19501dArr4 = c19501dArr == null ? c19501dArr3 : c19501dArr;
        c19501dArr3 = c19501dArr2 != null ? c19501dArr2 : c19501dArr3;
        this.f65040Y = i10;
        this.f65041Z = i11;
        this.f65042o0 = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f65043p0 = "com.google.android.gms";
        } else {
            this.f65043p0 = str;
        }
        if (i10 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i14 = AbstractBinderC20483a.f65028b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface c20482e = iInterfaceQueryLocalInterface instanceof InterfaceC20488f ? (InterfaceC20488f) iInterfaceQueryLocalInterface : new C20482E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                if (c20482e != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            C20482E c20482e2 = (C20482E) c20482e;
                            Parcel parcelM6115l = c20482e2.m6115l(c20482e2.m6116m(), 2);
                            Account account3 = (Account) AbstractC6827a.m7268a(parcelM6115l, Account.CREATOR);
                            parcelM6115l.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            AbstractC15256t.m16482t("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th2) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th2;
                    }
                }
            }
        } else {
            this.f65044q0 = iBinder;
            account2 = account;
        }
        this.f65047t0 = account2;
        this.f65045r0 = scopeArr2;
        this.f65046s0 = bundle2;
        this.f65048u0 = c19501dArr4;
        this.f65049v0 = c19501dArr3;
        this.f65050w0 = z6;
        this.f65051x0 = i13;
        this.f65052y0 = z10;
        this.f65053z0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C18658l.m20035a(this, parcel, i10);
    }
}
