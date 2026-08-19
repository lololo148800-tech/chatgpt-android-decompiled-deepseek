package p808ic;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: ic.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14961e {

    /* JADX INFO: renamed from: a */
    public static final Charset f46599a = Charset.defaultCharset();

    /* JADX INFO: renamed from: b */
    public static final Charset f46600b = Charset.forName("SJIS");

    static {
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused) {
        }
        Charset charsetForName = Charset.forName("EUC_JP");
        Charset charset = f46600b;
        Charset charset2 = f46599a;
        if (charset.equals(charset2)) {
            return;
        }
        charsetForName.equals(charset2);
    }
}
