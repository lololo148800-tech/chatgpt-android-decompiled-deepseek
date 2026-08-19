package p960q9;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p013Ab.C0420b;
import p1036u9.C20166l;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: q9.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC18649c implements Runnable {

    /* JADX INFO: renamed from: o0 */
    public static final C0420b f59394o0 = new C0420b("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: Y */
    public final String f59395Y;

    /* JADX INFO: renamed from: Z */
    public final C20166l f59396Z;

    public RunnableC18649c(String str) {
        AbstractC20502t.m21153d(str);
        this.f59395Y = str;
        this.f59396Z = new C20166l(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0420b c0420b = f59394o0;
        Status status = Status.f36049s0;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f59395Y).openConnection();
            httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f36047q0;
            } else {
                c0420b.getClass();
                AbstractC15256t.m16465c((String) c0420b.f1382o0, ((String) c0420b.f1383p0).concat("Unable to revoke access!"));
            }
            String str = "Response Code: " + responseCode;
            if (c0420b.f1381Z <= 3) {
                Log.d((String) c0420b.f1382o0, ((String) c0420b.f1383p0).concat(str));
            }
        } catch (IOException e10) {
            String strConcat = "IOException when revoking access: ".concat(String.valueOf(e10.toString()));
            c0420b.getClass();
            AbstractC15256t.m16465c((String) c0420b.f1382o0, ((String) c0420b.f1383p0).concat(strConcat));
        } catch (Exception e11) {
            String strConcat2 = "Exception when revoking access: ".concat(String.valueOf(e11.toString()));
            c0420b.getClass();
            AbstractC15256t.m16465c((String) c0420b.f1382o0, ((String) c0420b.f1383p0).concat(strConcat2));
        }
        this.f59396Z.m13187g(status);
    }
}
