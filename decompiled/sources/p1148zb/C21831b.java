package p1148zb;

import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.util.Base64;
import io.sentry.android.core.AbstractC15256t;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p832jb.C16187g;
import p832jb.C16189i;

/* JADX INFO: renamed from: zb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21831b {

    /* JADX INFO: renamed from: c */
    public static final String[] f69287c = {Separators.STAR, "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f69288a;

    /* JADX INFO: renamed from: b */
    public final String f69289b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public C21831b(C16187g c16187g) {
        c16187g.m17794a();
        this.f69288a = c16187g.f50235a.getSharedPreferences("com.google.android.gms.appid", 0);
        c16187g.m17794a();
        C16189i c16189i = c16187g.f50237c;
        String str = c16189i.f50253e;
        if (str == null) {
            c16187g.m17794a();
            str = c16189i.f50250b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f69289b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m22315a() {
        String string;
        synchronized (this.f69288a) {
            string = this.f69288a.getString("|S|id", null);
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final String m22316b() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f69288a) {
            String strEncodeToString = null;
            String string = this.f69288a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                AbstractC15256t.m16482t("ContentValues", "Invalid key stored " + e10);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                AbstractC15256t.m16482t("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
