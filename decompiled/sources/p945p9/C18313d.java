package p945p9;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p523V9.AbstractC8191s5;
import p960q9.C18647a;

/* JADX INFO: renamed from: p9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18313d implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58452a;

    public /* synthetic */ C18313d(int i10) {
        this.f58452a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f58452a) {
            case 0:
                int iM8789q = AbstractC8191s5.m8789q(parcel);
                String strM8776d = null;
                String strM8776d2 = null;
                String strM8776d3 = null;
                String strM8776d4 = null;
                Uri uri = null;
                String strM8776d5 = null;
                String strM8776d6 = null;
                ArrayList arrayListM8779g = null;
                String strM8776d7 = null;
                String strM8776d8 = null;
                long jM8786n = 0;
                int iM8785m = 0;
                while (parcel.dataPosition() < iM8789q) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iM8785m = AbstractC8191s5.m8785m(parcel, i10);
                            break;
                        case 2:
                            strM8776d = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        case 3:
                            strM8776d2 = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        case 4:
                            strM8776d3 = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        case 5:
                            strM8776d4 = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        case 6:
                            uri = (Uri) AbstractC8191s5.m8775c(parcel, i10, Uri.CREATOR);
                            break;
                        case 7:
                            strM8776d5 = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        case '\b':
                            jM8786n = AbstractC8191s5.m8786n(parcel, i10);
                            break;
                        case '\t':
                            strM8776d6 = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        case '\n':
                            arrayListM8779g = AbstractC8191s5.m8779g(parcel, i10, Scope.CREATOR);
                            break;
                        case 11:
                            strM8776d7 = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        case '\f':
                            strM8776d8 = AbstractC8191s5.m8776d(parcel, i10);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i10);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q);
                return new GoogleSignInAccount(iM8785m, strM8776d, strM8776d2, strM8776d3, strM8776d4, uri, strM8776d5, jM8786n, strM8776d6, arrayListM8779g, strM8776d7, strM8776d8);
            case 1:
                int iM8789q2 = AbstractC8191s5.m8789q(parcel);
                ArrayList arrayListM8779g2 = null;
                ArrayList arrayListM8779g3 = null;
                Account account = null;
                String strM8776d9 = null;
                String strM8776d10 = null;
                String strM8776d11 = null;
                int iM8785m2 = 0;
                boolean zM8782j = false;
                boolean zM8782j2 = false;
                boolean zM8782j3 = false;
                while (parcel.dataPosition() < iM8789q2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iM8785m2 = AbstractC8191s5.m8785m(parcel, i11);
                            break;
                        case 2:
                            arrayListM8779g3 = AbstractC8191s5.m8779g(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) AbstractC8191s5.m8775c(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zM8782j = AbstractC8191s5.m8782j(parcel, i11);
                            break;
                        case 5:
                            zM8782j2 = AbstractC8191s5.m8782j(parcel, i11);
                            break;
                        case 6:
                            zM8782j3 = AbstractC8191s5.m8782j(parcel, i11);
                            break;
                        case 7:
                            strM8776d9 = AbstractC8191s5.m8776d(parcel, i11);
                            break;
                        case '\b':
                            strM8776d10 = AbstractC8191s5.m8776d(parcel, i11);
                            break;
                        case '\t':
                            arrayListM8779g2 = AbstractC8191s5.m8779g(parcel, i11, C18647a.CREATOR);
                            break;
                        case '\n':
                            strM8776d11 = AbstractC8191s5.m8776d(parcel, i11);
                            break;
                        default:
                            AbstractC8191s5.m8788p(parcel, i11);
                            break;
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q2);
                return new GoogleSignInOptions(iM8785m2, arrayListM8779g3, account, zM8782j, zM8782j2, zM8782j3, strM8776d9, strM8776d10, GoogleSignInOptions.m13180c(arrayListM8779g2), strM8776d11);
            default:
                int iM8789q3 = AbstractC8191s5.m8789q(parcel);
                String strM8776d12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strM8776d13 = "";
                while (parcel.dataPosition() < iM8789q3) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 4) {
                        strM8776d12 = AbstractC8191s5.m8776d(parcel, i12);
                    } else if (c9 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC8191s5.m8775c(parcel, i12, GoogleSignInAccount.CREATOR);
                    } else if (c9 != '\b') {
                        AbstractC8191s5.m8788p(parcel, i12);
                    } else {
                        strM8776d13 = AbstractC8191s5.m8776d(parcel, i12);
                    }
                }
                AbstractC8191s5.m8781i(parcel, iM8789q3);
                return new SignInAccount(strM8776d12, googleSignInAccount, strM8776d13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f58452a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
