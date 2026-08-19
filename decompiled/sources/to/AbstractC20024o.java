package to;

import java.io.IOException;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: to.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20024o {
    /* JADX INFO: renamed from: a */
    public static int m20824a(int i10, int i11, int i12) throws IOException {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(AbstractC17792x.m19534q("PROTOCOL_ERROR padding ", i12, i10, " > remaining length "));
    }
}
