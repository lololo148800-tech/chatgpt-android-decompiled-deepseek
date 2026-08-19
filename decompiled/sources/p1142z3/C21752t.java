package p1142z3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p479Td.AbstractC7360k;

/* JADX INFO: renamed from: z3.t */
/* JADX INFO: loaded from: classes.dex */
public class C21752t extends C21741i {

    /* JADX INFO: renamed from: o0 */
    public final int f69010o0;

    public C21752t() {
        super(2008);
        this.f69010o0 = 1;
    }

    /* JADX INFO: renamed from: a */
    public static int m22249a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public static C21752t m22250b(int i10, IOException iOException) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !AbstractC7360k.m7787d(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new C21751s("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new C21752t(i11, i10, iOException);
    }

    public C21752t(int i10, int i11, IOException iOException) {
        super(m22249a(i10, i11), iOException);
        this.f69010o0 = i11;
    }

    public C21752t(String str, IOException iOException, int i10) {
        super(m22249a(i10, 1), iOException, str);
        this.f69010o0 = 1;
    }
}
