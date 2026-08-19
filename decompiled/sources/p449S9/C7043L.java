package p449S9;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: S9.L */
/* JADX INFO: loaded from: classes.dex */
public final class C7043L extends AbstractC7037F implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final MessageDigest f22497Y;

    /* JADX INFO: renamed from: Z */
    public final int f22498Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f22499o0;

    /* JADX INFO: renamed from: p0 */
    public final String f22500p0;

    public C7043L() {
        boolean z6;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f22497Y = messageDigest;
            this.f22498Z = messageDigest.getDigestLength();
            this.f22500p0 = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z6 = true;
            } catch (CloneNotSupportedException unused) {
                z6 = false;
            }
            this.f22499o0 = z6;
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        return this.f22500p0;
    }
}
