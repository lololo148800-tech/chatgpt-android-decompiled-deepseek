package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p945p9.C18313d;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractC20851a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C18313d(2);

    /* JADX INFO: renamed from: Y */
    public final String f36032Y;

    /* JADX INFO: renamed from: Z */
    public final GoogleSignInAccount f36033Z;

    /* JADX INFO: renamed from: o0 */
    public final String f36034o0;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f36033Z = googleSignInAccount;
        AbstractC20502t.m21154e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f36032Y = str;
        AbstractC20502t.m21154e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f36034o0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 4, this.f36032Y);
        AbstractC8199t5.m8806e(parcel, 7, this.f36033Z, i10);
        AbstractC8199t5.m8807f(parcel, 8, this.f36034o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
