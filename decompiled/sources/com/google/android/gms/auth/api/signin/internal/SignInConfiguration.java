package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC20851a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C18658l(0);

    /* JADX INFO: renamed from: Y */
    public final String f36035Y;

    /* JADX INFO: renamed from: Z */
    public final GoogleSignInOptions f36036Z;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        AbstractC20502t.m21153d(str);
        this.f36035Y = str;
        this.f36036Z = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f36035Y.equals(signInConfiguration.f36035Y)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f36036Z;
            GoogleSignInOptions googleSignInOptions2 = this.f36036Z;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1 * 31;
        String str = this.f36035Y;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f36036Z;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f36035Y);
        AbstractC8199t5.m8806e(parcel, 5, this.f36036Z, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
