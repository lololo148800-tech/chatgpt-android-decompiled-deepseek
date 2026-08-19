package p333N9;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: renamed from: N9.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5686g {

    /* JADX INFO: renamed from: a */
    public static final SecureRandom f18458a = new SecureRandom();

    /* JADX INFO: renamed from: a */
    public static String m6127a() {
        byte[] bArr = new byte[16];
        f18458a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
