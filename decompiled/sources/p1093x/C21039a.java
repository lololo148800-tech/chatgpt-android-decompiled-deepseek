package p1093x;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.util.ArrayList;
import p523V9.AbstractC7862C5;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21039a implements InterfaceC21040b {
    @Override // p1093x.InterfaceC21040b
    /* JADX INFO: renamed from: b */
    public final ArrayList mo18907b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(AbstractC7862C5.m8136a(signature));
            }
        } else {
            arrayList.add(AbstractC7862C5.m8136a(signingInfo.getSigningCertificateHistory()[0]));
        }
        return arrayList;
    }
}
