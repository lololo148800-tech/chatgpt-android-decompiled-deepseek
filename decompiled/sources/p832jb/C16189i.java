package p832jb;

import android.content.Context;
import android.text.TextUtils;
import io.sentry.C15358g1;
import java.util.Arrays;
import p063C9.AbstractC1617c;
import p1060v9.AbstractC20502t;
import sk.C19665d;

/* JADX INFO: renamed from: jb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16189i {

    /* JADX INFO: renamed from: a */
    public final String f50249a;

    /* JADX INFO: renamed from: b */
    public final String f50250b;

    /* JADX INFO: renamed from: c */
    public final String f50251c;

    /* JADX INFO: renamed from: d */
    public final String f50252d;

    /* JADX INFO: renamed from: e */
    public final String f50253e;

    /* JADX INFO: renamed from: f */
    public final String f50254f;

    /* JADX INFO: renamed from: g */
    public final String f50255g;

    public C16189i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = AbstractC1617c.f4576a;
        AbstractC20502t.m21159j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f50250b = str;
        this.f50249a = str2;
        this.f50251c = str3;
        this.f50252d = str4;
        this.f50253e = str5;
        this.f50254f = str6;
        this.f50255g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static C16189i m17798a(Context context) {
        C15358g1 c15358g1 = new C15358g1(context, 20);
        String strM16586o = c15358g1.m16586o("google_app_id");
        if (TextUtils.isEmpty(strM16586o)) {
            return null;
        }
        return new C16189i(strM16586o, c15358g1.m16586o("google_api_key"), c15358g1.m16586o("firebase_database_url"), c15358g1.m16586o("ga_trackingId"), c15358g1.m16586o("gcm_defaultSenderId"), c15358g1.m16586o("google_storage_bucket"), c15358g1.m16586o("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16189i)) {
            return false;
        }
        C16189i c16189i = (C16189i) obj;
        return AbstractC20502t.m21161l(this.f50250b, c16189i.f50250b) && AbstractC20502t.m21161l(this.f50249a, c16189i.f50249a) && AbstractC20502t.m21161l(this.f50251c, c16189i.f50251c) && AbstractC20502t.m21161l(this.f50252d, c16189i.f50252d) && AbstractC20502t.m21161l(this.f50253e, c16189i.f50253e) && AbstractC20502t.m21161l(this.f50254f, c16189i.f50254f) && AbstractC20502t.m21161l(this.f50255g, c16189i.f50255g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50250b, this.f50249a, this.f50251c, this.f50252d, this.f50253e, this.f50254f, this.f50255g});
    }

    public final String toString() {
        C19665d c19665d = new C19665d(this);
        c19665d.m20639a(this.f50250b, "applicationId");
        c19665d.m20639a(this.f50249a, "apiKey");
        c19665d.m20639a(this.f50251c, "databaseUrl");
        c19665d.m20639a(this.f50253e, "gcmSenderId");
        c19665d.m20639a(this.f50254f, "storageBucket");
        c19665d.m20639a(this.f50255g, "projectId");
        return c19665d.toString();
    }
}
