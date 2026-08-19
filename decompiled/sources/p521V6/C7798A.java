package p521V6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: V6.A */
/* JADX INFO: loaded from: classes.dex */
public final class C7798A extends AbstractC7801D {
    public C7798A(String str) {
        super(AbstractC10763a.m11047e('\"', "Could not find a public key for kid \"", str));
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return C7798A.class.getSuperclass().getName() + ": " + getMessage();
    }
}
