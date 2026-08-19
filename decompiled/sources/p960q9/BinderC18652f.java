package p960q9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p333N9.AbstractBinderC5687h;
import p333N9.AbstractC5688i;

/* JADX INFO: renamed from: q9.f */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC18652f extends AbstractBinderC5687h implements InterfaceC18656j {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f59408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C18653g f59409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC18652f(C18653g c18653g, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f59408b = i10;
        this.f59409c = c18653g;
    }

    @Override // p960q9.InterfaceC18656j
    /* JADX INFO: renamed from: e */
    public void mo20016e(Status status) {
        switch (this.f59408b) {
            case 1:
                this.f59409c.m13187g(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p960q9.InterfaceC18656j
    /* JADX INFO: renamed from: g */
    public void mo20017g(Status status) {
        switch (this.f59408b) {
            case 0:
                this.f59409c.m13187g(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: l */
    public final boolean mo6122l(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                AbstractC5688i.m6132b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) AbstractC5688i.m6131a(parcel, Status.CREATOR);
                AbstractC5688i.m6132b(parcel);
                mo20017g(status);
                break;
            case 103:
                Status status2 = (Status) AbstractC5688i.m6131a(parcel, Status.CREATOR);
                AbstractC5688i.m6132b(parcel);
                mo20016e(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
