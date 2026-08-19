package to;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.C0678l;
import p1113xn.AbstractC21329w;
import p279L1.VOxZ.sVoFrD;
import p571X9.AbstractC9306j0;
import p959q8.C18639a;

/* JADX INFO: renamed from: to.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20014e {

    /* JADX INFO: renamed from: a */
    public static final C0678l f63350a;

    /* JADX INFO: renamed from: b */
    public static final String[] f63351b;

    /* JADX INFO: renamed from: c */
    public static final String[] f63352c;

    /* JADX INFO: renamed from: d */
    public static final String[] f63353d;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f63350a = C18639a.m19996n("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f63351b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f63352c = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC16544l.m18093f(binaryString, "toBinaryString(it)");
            strArr[i10] = AbstractC21329w.m21730q(AbstractC17708b.m19418j("%8s", binaryString), ' ', '0');
        }
        f63353d = strArr;
        String[] strArr2 = f63352c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = AbstractC9306j0.m9891j(strArr2[i11], "|PADDED", new StringBuilder());
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f63352c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = AbstractC9306j0.m9891j(strArr3[i13], "|PADDED", sb2);
        }
        int length = f63352c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f63352c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f63353d[i16];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX INFO: renamed from: a */
    public static String m20813a(boolean z6, int i10, int i11, int i12, int i13) {
        String strM21731r;
        String str;
        String[] strArr = f63351b;
        String strM19418j = i12 < strArr.length ? strArr[i12] : AbstractC17708b.m19418j("0x%02x", Integer.valueOf(i12));
        if (i13 == 0) {
            strM21731r = "";
        } else {
            String[] strArr2 = f63353d;
            if (i12 == 2 || i12 == 3) {
                strM21731r = strArr2[i13];
            } else if (i12 == 4 || i12 == 6) {
                strM21731r = i13 == 1 ? TokenNames.ACK : strArr2[i13];
            } else if (i12 == 7 || i12 == 8) {
                strM21731r = strArr2[i13];
            } else {
                String[] strArr3 = f63352c;
                if (i13 < strArr3.length) {
                    str = strArr3[i13];
                    AbstractC16544l.m18091d(str);
                } else {
                    str = strArr2[i13];
                }
                if (i12 != 5 || (i13 & 4) == 0) {
                    strM21731r = (i12 != 0 || (i13 & 32) == 0) ? str : AbstractC21329w.m21731r(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM21731r = AbstractC21329w.m21731r(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return AbstractC17708b.m19418j("%s 0x%08x %5d %-13s %s", z6 ? "<<" : sVoFrD.iIjxGAjYmmDY, Integer.valueOf(i10), Integer.valueOf(i11), strM19418j, strM21731r);
    }
}
