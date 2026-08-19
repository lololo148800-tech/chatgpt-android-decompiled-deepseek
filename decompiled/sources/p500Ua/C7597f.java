package p500Ua;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import p265Kb.C4613f;
import p524Va.AbstractC8257i;
import p524Va.C8256h;

/* JADX INFO: renamed from: Ua.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7597f {

    /* JADX INFO: renamed from: c */
    public static final C4613f f24025c = new C4613f("ReviewService", 1);

    /* JADX INFO: renamed from: a */
    public final C8256h f24026a;

    /* JADX INFO: renamed from: b */
    public final String f24027b;

    public C7597f(Context context) {
        String strEncodeToString;
        this.f24027b = context.getPackageName();
        C4613f c4613f = AbstractC8257i.f25756a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                c4613f.m5361d("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    c4613f.m5361d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    arrayList.add(strEncodeToString);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    this.f24026a = new C8256h(context, f24025c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ", ");
                        }
                    }
                }
                c4613f.m5361d(AbstractC10763a.m11054l("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                c4613f.m5361d("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            c4613f.m5361d("Play Store package is not found.", new Object[0]);
        }
    }
}
