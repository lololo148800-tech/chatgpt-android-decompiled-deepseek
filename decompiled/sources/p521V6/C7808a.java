package p521V6;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: V6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7808a {

    /* JADX INFO: renamed from: a */
    public final List f24701a = Collections.singletonList("RS256");

    /* JADX INFO: renamed from: b */
    public final Signature f24702b;

    public C7808a(PublicKey publicKey) throws InvalidKeyException {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            this.f24702b = signature;
            signature.initVerify(publicKey);
        } catch (NoSuchAlgorithmException unused) {
        }
    }
}
