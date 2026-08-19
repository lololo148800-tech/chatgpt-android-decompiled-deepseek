package p1060v9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C20497o extends AbstractC20851a {
    public static final Parcelable.Creator<C20497o> CREATOR = new C18658l(23);

    /* JADX INFO: renamed from: Y */
    public final int f65083Y;

    /* JADX INFO: renamed from: Z */
    public final Account f65084Z;

    /* JADX INFO: renamed from: o0 */
    public final int f65085o0;

    /* JADX INFO: renamed from: p0 */
    public final GoogleSignInAccount f65086p0;

    public C20497o(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f65083Y = i10;
        this.f65084Z = account;
        this.f65085o0 = i11;
        this.f65086p0 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f65083Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f65084Z, i10);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f65085o0);
        AbstractC8199t5.m8806e(parcel, 4, this.f65086p0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
