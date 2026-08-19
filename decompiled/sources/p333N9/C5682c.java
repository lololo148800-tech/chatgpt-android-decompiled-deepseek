package p333N9;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.Status;
import p011A9.C0415f;
import p1022t9.AbstractC19821f;
import p1022t9.C19819d;
import p1022t9.C19820e;
import p523V9.AbstractC8207u5;
import p658b5.C11232c;
import p885m4.C17155e;
import p903n9.C17536j;
import p903n9.C17538l;
import p903n9.C17539m;

/* JADX INFO: renamed from: N9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5682c extends AbstractC19821f {

    /* JADX INFO: renamed from: l */
    public static final C11232c f18449l = new C11232c("Auth.Api.Identity.CredentialSaving.API", new C0415f(2), new C17155e());

    /* JADX INFO: renamed from: m */
    public static final C11232c f18450m = new C11232c("Auth.Api.Identity.SignIn.API", new C0415f(3), new C17155e());

    /* JADX INFO: renamed from: k */
    public final String f18451k;

    public C5682c(HiddenActivity hiddenActivity, C17538l c17538l) {
        super(hiddenActivity, hiddenActivity, f18449l, c17538l, C19820e.f62871c);
        this.f18451k = AbstractC5686g.m6127a();
    }

    /* JADX INFO: renamed from: c */
    public C17536j m6124c(Intent intent) throws C19819d {
        Status status = Status.f36049s0;
        if (intent == null) {
            throw new C19819d(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC8207u5.m8830a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new C19819d(Status.f36051u0);
        }
        if (!status2.m13182b()) {
            throw new C19819d(status2);
        }
        Parcelable.Creator<C17536j> creator2 = C17536j.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        C17536j c17536j = (C17536j) (byteArrayExtra2 != null ? AbstractC8207u5.m8830a(byteArrayExtra2, creator2) : null);
        if (c17536j != null) {
            return c17536j;
        }
        throw new C19819d(status);
    }

    public C5682c(HiddenActivity hiddenActivity, C17539m c17539m) {
        super(hiddenActivity, hiddenActivity, f18450m, c17539m, C19820e.f62871c);
        this.f18451k = AbstractC5686g.m6127a();
    }

    public C5682c(Context context, C17539m c17539m) {
        super(context, null, f18450m, c17539m, C19820e.f62871c);
        this.f18451k = AbstractC5686g.m6127a();
    }
}
