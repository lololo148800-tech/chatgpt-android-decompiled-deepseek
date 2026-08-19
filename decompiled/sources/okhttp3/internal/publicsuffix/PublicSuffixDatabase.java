package okhttp3.internal.publicsuffix;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p026Ao.AbstractC0668b;
import p026Ao.C0657F;
import p026Ao.C0688v;
import p1048uo.C20407n;
import p1091wn.AbstractC21031l;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9393x3;
import p885m4.C17152b;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18067d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "m4/b", "okhttp"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public static final byte[] f58090e = {42};

    /* JADX INFO: renamed from: f */
    public static final List f58091f = AbstractC9393x3.m9974d(Separators.STAR);

    /* JADX INFO: renamed from: g */
    public static final PublicSuffixDatabase f58092g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f58093a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f58094b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public byte[] f58095c;

    /* JADX INFO: renamed from: d */
    public byte[] f58096d;

    /* JADX INFO: renamed from: c */
    public static List m19734c(String str) {
        List listM21696d0 = AbstractC21322p.m21696d0(str, new char[]{'.'}, 6);
        return AbstractC16544l.m18089b(AbstractC17680n.m19351a0(listM21696d0), "") ? AbstractC17680n.m19337M(1, listM21696d0) : listM21696d0;
    }

    /* JADX INFO: renamed from: a */
    public final String m19735a(String str) {
        String strM18909e;
        String strM18909e2;
        String strM18909e3;
        List listM21696d0;
        String unicodeDomain = IDN.toUnicode(str);
        AbstractC16544l.m18093f(unicodeDomain, "unicodeDomain");
        List listM19734c = m19734c(unicodeDomain);
        if (this.f58093a.get() || !this.f58093a.compareAndSet(false, true)) {
            try {
                this.f58094b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z6 = false;
            while (true) {
                try {
                    try {
                        m19736b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z6 = true;
                    } catch (IOException e10) {
                        C20407n c20407n = C20407n.f64525a;
                        C20407n.f64525a.getClass();
                        C20407n.m21074i("Failed to read public suffix list", 5, e10);
                        if (z6) {
                        }
                    }
                } catch (Throwable th2) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f58095c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = listM19734c.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = (String) listM19734c.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC16544l.m18093f(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                strM18909e = null;
                break;
            }
            byte[] bArr2 = this.f58095c;
            if (bArr2 == null) {
                AbstractC16544l.m18103p("publicSuffixListBytes");
                throw null;
            }
            strM18909e = C17152b.m18909e(bArr2, bArr, i11);
            if (strM18909e != null) {
                break;
            }
            i11++;
        }
        if (size <= 1) {
            strM18909e2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                strM18909e2 = null;
                break;
            }
            bArr3[i12] = f58090e;
            byte[] bArr4 = this.f58095c;
            if (bArr4 == null) {
                AbstractC16544l.m18103p("publicSuffixListBytes");
                throw null;
            }
            strM18909e2 = C17152b.m18909e(bArr4, bArr3, i12);
            if (strM18909e2 != null) {
                break;
            }
            i12++;
        }
        if (strM18909e2 == null) {
            strM18909e3 = null;
            break;
        }
        int i13 = size - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                strM18909e3 = null;
                break;
            }
            byte[] bArr5 = this.f58096d;
            if (bArr5 == null) {
                AbstractC16544l.m18103p("publicSuffixExceptionListBytes");
                throw null;
            }
            strM18909e3 = C17152b.m18909e(bArr5, bArr, i14);
            if (strM18909e3 != null) {
                break;
            }
            i14++;
        }
        if (strM18909e3 != null) {
            listM21696d0 = AbstractC21322p.m21696d0("!".concat(strM18909e3), new char[]{'.'}, 6);
        } else if (strM18909e == null && strM18909e2 == null) {
            listM21696d0 = f58091f;
        } else {
            List listM21696d1 = C17689w.f56480Y;
            List listM21696d2 = strM18909e != null ? AbstractC21322p.m21696d0(strM18909e, new char[]{'.'}, 6) : listM21696d1;
            if (strM18909e2 != null) {
                listM21696d1 = AbstractC21322p.m21696d0(strM18909e2, new char[]{'.'}, 6);
            }
            listM21696d0 = listM21696d2.size() > listM21696d1.size() ? listM21696d2 : listM21696d1;
        }
        if (listM19734c.size() != listM21696d0.size() || ((String) listM21696d0.get(0)).charAt(0) == '!') {
            return AbstractC21031l.m21493q(AbstractC21031l.m21486j(AbstractC17680n.m19329H(m19734c(str)), ((String) listM21696d0.get(0)).charAt(0) == '!' ? listM19734c.size() - listM21696d0.size() : listM19734c.size() - (listM21696d0.size() + 1)), Separators.DOT, null, 62);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m19736b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                this.f58094b.countDown();
                return;
            }
            C0657F c0657fM1403c = AbstractC0668b.m1403c(new C0688v(AbstractC0668b.m1410j(resourceAsStream)));
            try {
                long jM1358k = c0657fM1403c.m1358k();
                c0657fM1403c.mo1362s(jM1358k);
                byte[] bArrM1447v0 = c0657fM1403c.f1922Z.m1447v0(jM1358k);
                long jM1358k2 = c0657fM1403c.m1358k();
                c0657fM1403c.mo1362s(jM1358k2);
                byte[] bArrM1447v1 = c0657fM1403c.f1922Z.m1447v0(jM1358k2);
                AbstractC7942M5.m8232a(c0657fM1403c, null);
                synchronized (this) {
                    this.f58095c = bArrM1447v0;
                    this.f58096d = bArrM1447v1;
                }
                this.f58094b.countDown();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC7942M5.m8232a(c0657fM1403c, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.f58094b.countDown();
            throw th4;
        }
    }
}
