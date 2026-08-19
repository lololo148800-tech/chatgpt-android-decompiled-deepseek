package mo;

import java.io.Closeable;
import java.nio.charset.Charset;
import no.AbstractC17708b;
import p026Ao.InterfaceC0677k;
import p1113xn.C21307a;
import p523V9.AbstractC7942M5;

/* JADX INFO: renamed from: mo.F */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC17329F implements Closeable {
    /* JADX INFO: renamed from: O0 */
    public abstract InterfaceC0677k mo18988O0();

    /* JADX INFO: renamed from: a */
    public abstract long mo18989a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC17708b.m19412d(mo18988O0());
    }

    /* JADX INFO: renamed from: e */
    public abstract C17352s mo18990e();

    /* JADX INFO: renamed from: k */
    public final String m18991k() {
        Charset charsetM19029a;
        InterfaceC0677k interfaceC0677kMo18988O0 = mo18988O0();
        try {
            C17352s c17352sMo18990e = mo18990e();
            if (c17352sMo18990e == null || (charsetM19029a = c17352sMo18990e.m19029a(C21307a.f67720a)) == null) {
                charsetM19029a = C21307a.f67720a;
            }
            String strMo1355f0 = interfaceC0677kMo18988O0.mo1355f0(AbstractC17708b.m19428t(interfaceC0677kMo18988O0, charsetM19029a));
            AbstractC7942M5.m8232a(interfaceC0677kMo18988O0, null);
            return strMo1355f0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(interfaceC0677kMo18988O0, th2);
                throw th3;
            }
        }
    }
}
