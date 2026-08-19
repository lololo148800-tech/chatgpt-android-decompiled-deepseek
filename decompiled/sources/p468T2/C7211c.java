package p468T2;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p959q8.C18639a;

/* JADX INFO: renamed from: T2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7211c extends C18639a {
    @Override // p959q8.C18639a
    /* JADX INFO: renamed from: r */
    public final Signature[] mo7602r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
