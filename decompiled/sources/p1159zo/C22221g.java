package p1159zo;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17348o;
import mo.C17358y;
import mo.EnumC17357x;
import mo.InterfaceC17333J;
import no.AbstractC17708b;
import p005A3.C0326m;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.C0689w;
import p571X9.AbstractC9147I2;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p950po.C18529c;
import p950po.C18530d;
import p959q8.C18639a;
import p974qo.C18792h;
import p974qo.C18794j;

/* JADX INFO: renamed from: zo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C22221g implements InterfaceC17333J {

    /* JADX INFO: renamed from: w */
    public static final List f70416w = AbstractC9393x3.m9974d(EnumC17357x.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final AbstractC9147I2 f70417a;

    /* JADX INFO: renamed from: b */
    public final Random f70418b;

    /* JADX INFO: renamed from: c */
    public final long f70419c;

    /* JADX INFO: renamed from: d */
    public C22222h f70420d;

    /* JADX INFO: renamed from: e */
    public final long f70421e;

    /* JADX INFO: renamed from: f */
    public final String f70422f;

    /* JADX INFO: renamed from: g */
    public C18792h f70423g;

    /* JADX INFO: renamed from: h */
    public C22219e f70424h;

    /* JADX INFO: renamed from: i */
    public C22223i f70425i;

    /* JADX INFO: renamed from: j */
    public C22224j f70426j;

    /* JADX INFO: renamed from: k */
    public final C18529c f70427k;

    /* JADX INFO: renamed from: l */
    public String f70428l;

    /* JADX INFO: renamed from: m */
    public C18794j f70429m;

    /* JADX INFO: renamed from: n */
    public final ArrayDeque f70430n;

    /* JADX INFO: renamed from: o */
    public final ArrayDeque f70431o;

    /* JADX INFO: renamed from: p */
    public long f70432p;

    /* JADX INFO: renamed from: q */
    public boolean f70433q;

    /* JADX INFO: renamed from: r */
    public int f70434r;

    /* JADX INFO: renamed from: s */
    public String f70435s;

    /* JADX INFO: renamed from: t */
    public boolean f70436t;

    /* JADX INFO: renamed from: u */
    public int f70437u;

    /* JADX INFO: renamed from: v */
    public boolean f70438v;

    public C22221g(C18530d taskRunner, C17358y originalRequest, AbstractC9147I2 listener, Random random, long j10, long j11) {
        AbstractC16544l.m18094g(taskRunner, "taskRunner");
        AbstractC16544l.m18094g(originalRequest, "originalRequest");
        AbstractC16544l.m18094g(listener, "listener");
        this.f70417a = listener;
        this.f70418b = random;
        this.f70419c = j10;
        this.f70420d = null;
        this.f70421e = j11;
        this.f70427k = taskRunner.m19897e();
        this.f70430n = new ArrayDeque();
        this.f70431o = new ArrayDeque();
        this.f70434r = -1;
        String str = originalRequest.f55380b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("Request must be GET: ", str).toString());
        }
        C0678l c0678l = C0678l.f1971p0;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f70422f = C18639a.m19998t(bArr, 0, -1234567890).mo1370a();
    }

    /* JADX INFO: renamed from: a */
    public final void m22405a(C17327D c17327d, C0326m c0326m) {
        int i10 = c17327d.f55176p0;
        if (i10 != 101) {
            StringBuilder sb2 = new StringBuilder("Expected HTTP 101 response but was '");
            sb2.append(i10);
            sb2.append(' ');
            throw new ProtocolException(AbstractC9306j0.m9892k(sb2, c17327d.f55175o0, '\''));
        }
        C17348o c17348o = c17327d.f55178r0;
        String strM19012f = c17348o.m19012f("Connection");
        if (strM19012f == null) {
            strM19012f = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strM19012f)) {
            throw new ProtocolException(AbstractC10763a.m11047e('\'', "Expected 'Connection' header value 'Upgrade' but was '", strM19012f));
        }
        String strM19012f2 = c17348o.m19012f("Upgrade");
        if (strM19012f2 == null) {
            strM19012f2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strM19012f2)) {
            throw new ProtocolException(AbstractC10763a.m11047e('\'', "Expected 'Upgrade' header value 'websocket' but was '", strM19012f2));
        }
        String strM19012f3 = c17348o.m19012f("Sec-WebSocket-Accept");
        String str = strM19012f3 != null ? strM19012f3 : null;
        C0678l c0678l = C0678l.f1971p0;
        String strMo1370a = C18639a.m19996n(this.f70422f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").mo1371c("SHA-1").mo1370a();
        if (AbstractC16544l.m18089b(strMo1370a, str)) {
            if (c0326m == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo1370a + "' but was '" + str + '\'');
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22406b(int i10, String str) {
        String str2;
        synchronized (this) {
            C0678l c0678lM19996n = null;
            try {
                if (i10 < 1000 || i10 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i10;
                } else if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i10 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    C0678l c0678l = C0678l.f1971p0;
                    c0678lM19996n = C18639a.m19996n(str);
                    if (c0678lM19996n.f1972Y.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f70436t && !this.f70433q) {
                    this.f70433q = true;
                    this.f70431o.add(new C22217c(i10, c0678lM19996n));
                    m22412h();
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22407c(Exception exc, C17327D c17327d) {
        synchronized (this) {
            if (this.f70436t) {
                return;
            }
            this.f70436t = true;
            C18794j c18794j = this.f70429m;
            this.f70429m = null;
            C22223i c22223i = this.f70425i;
            this.f70425i = null;
            C22224j c22224j = this.f70426j;
            this.f70426j = null;
            this.f70427k.m19892e();
            try {
                this.f70417a.mo4339g(this, exc, c17327d);
            } finally {
                if (c18794j != null) {
                    AbstractC17708b.m19412d(c18794j);
                }
                if (c22223i != null) {
                    AbstractC17708b.m19412d(c22223i);
                }
                if (c22224j != null) {
                    AbstractC17708b.m19412d(c22224j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m22408d(String name, C18794j c18794j) {
        AbstractC16544l.m18094g(name, "name");
        C22222h c22222h = this.f70420d;
        AbstractC16544l.m18091d(c22222h);
        synchronized (this) {
            try {
                this.f70428l = name;
                this.f70429m = c18794j;
                this.f70426j = new C22224j(c18794j.f59737Z, this.f70418b, c22222h.f70439a, c22222h.f70441c, this.f70421e);
                this.f70424h = new C22219e(this);
                long j10 = this.f70419c;
                if (j10 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    this.f70427k.m19890c(new C22220f(name.concat(" ping"), this, nanos), nanos);
                }
                if (!this.f70431o.isEmpty()) {
                    m22412h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f70425i = new C22223i(c18794j.f59736Y, this, c22222h.f70439a, c22222h.f70443e);
    }

    /* JADX INFO: renamed from: e */
    public final void m22409e() {
        while (this.f70434r == -1) {
            C22223i c22223i = this.f70425i;
            AbstractC16544l.m18091d(c22223i);
            c22223i.m22416e();
            if (c22223i.f70453u0) {
                c22223i.m22415a();
            } else {
                int i10 = c22223i.f70450r0;
                if (i10 != 1 && i10 != 2) {
                    byte[] bArr = AbstractC17708b.f56536a;
                    String hexString = Integer.toHexString(i10);
                    AbstractC16544l.m18093f(hexString, "toHexString(this)");
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (true) {
                    if (!c22223i.f70449q0) {
                        long j10 = c22223i.f70451s0;
                        C0675i c0675i = c22223i.f70456x0;
                        if (j10 > 0) {
                            c22223i.f70445Y.m1354e(c0675i, j10);
                        }
                        if (c22223i.f70452t0) {
                            if (c22223i.f70454v0) {
                                C22215a c22215a = c22223i.f70457y0;
                                if (c22215a == null) {
                                    c22215a = new C22215a(c22223i.f70448p0, 1);
                                    c22223i.f70457y0 = c22215a;
                                }
                                C0675i c0675i2 = c22215a.f70404o0;
                                if (c0675i2.f1970Z != 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                Inflater inflater = (Inflater) c22215a.f70405p0;
                                if (c22215a.f70403Z) {
                                    inflater.reset();
                                }
                                c0675i2.mo1339u(c0675i);
                                c0675i2.m1439i1(65535);
                                long bytesRead = inflater.getBytesRead() + c0675i2.f1970Z;
                                do {
                                    ((C0689w) c22215a.f70406q0).m1469a(c0675i, Long.MAX_VALUE);
                                } while (inflater.getBytesRead() < bytesRead);
                            }
                            C22221g c22221g = c22223i.f70446Z;
                            AbstractC9147I2 abstractC9147I2 = c22221g.f70417a;
                            if (i10 != 1) {
                                C0678l bytes = c0675i.m1417C0(c0675i.f1970Z);
                                AbstractC16544l.m18094g(bytes, "bytes");
                                abstractC9147I2.mo4341i(c22221g, bytes);
                                break;
                            }
                            abstractC9147I2.mo4340h(c0675i.m1428Z0(), c22221g);
                            break;
                        }
                        while (!c22223i.f70449q0) {
                            c22223i.m22416e();
                            if (!c22223i.f70453u0) {
                                break;
                            } else {
                                c22223i.m22415a();
                            }
                        }
                        if (c22223i.f70450r0 != 0) {
                            int i11 = c22223i.f70450r0;
                            byte[] bArr2 = AbstractC17708b.f56536a;
                            String hexString2 = Integer.toHexString(i11);
                            AbstractC16544l.m18093f(hexString2, "toHexString(this)");
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m22410f(int i10, String str) {
        C18794j c18794j;
        C22223i c22223i;
        C22224j c22224j;
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.f70434r != -1) {
                throw new IllegalStateException("already closed");
            }
            this.f70434r = i10;
            this.f70435s = str;
            c18794j = null;
            if (this.f70433q && this.f70431o.isEmpty()) {
                C18794j c18794j2 = this.f70429m;
                this.f70429m = null;
                c22223i = this.f70425i;
                this.f70425i = null;
                c22224j = this.f70426j;
                this.f70426j = null;
                this.f70427k.m19892e();
                c18794j = c18794j2;
            } else {
                c22223i = null;
                c22224j = null;
            }
        }
        try {
            this.f70417a.mo4338f(this, i10, str);
            if (c18794j != null) {
                this.f70417a.mo4337e(this, i10, str);
            }
        } finally {
            if (c18794j != null) {
                AbstractC17708b.m19412d(c18794j);
            }
            if (c22223i != null) {
                AbstractC17708b.m19412d(c22223i);
            }
            if (c22224j != null) {
                AbstractC17708b.m19412d(c22224j);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m22411g(C0678l payload) {
        try {
            AbstractC16544l.m18094g(payload, "payload");
            if (!this.f70436t && (!this.f70433q || !this.f70431o.isEmpty())) {
                this.f70430n.add(payload);
                m22412h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22412h() {
        byte[] bArr = AbstractC17708b.f56536a;
        C22219e c22219e = this.f70424h;
        if (c22219e != null) {
            this.f70427k.m19890c(c22219e, 0L);
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m22413i(int i10, C0678l c0678l) {
        if (!this.f70436t && !this.f70433q) {
            if (this.f70432p + ((long) c0678l.mo1372d()) > 16777216) {
                m22406b(1001, null);
                return false;
            }
            this.f70432p += (long) c0678l.mo1372d();
            this.f70431o.add(new C22218d(i10, c0678l));
            m22412h();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0126 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0130  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0142 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:28:0x007a, B:31:0x0089, B:33:0x008d, B:34:0x0099, B:36:0x00a6, B:39:0x00aa, B:40:0x00ab, B:41:0x00ac, B:43:0x00b0, B:73:0x0122, B:75:0x0126, B:84:0x013f, B:85:0x0141, B:61:0x00db, B:65:0x0100, B:66:0x0109, B:62:0x00ef, B:67:0x010a, B:69:0x0114, B:70:0x0117, B:86:0x0142, B:87:0x0147, B:35:0x009a, B:72:0x011f), top: B:97:0x0078, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00ef, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: j */
    public final boolean m22414j() {
        Object objPoll;
        String str;
        int i10;
        ?? r6;
        ?? r10;
        ?? r11;
        int i11;
        C0678l c0678l;
        C0678l c0678lM1417C0;
        C0675i c0675i;
        C22218d c22218d;
        synchronized (this) {
            try {
                if (this.f70436t) {
                    return false;
                }
                C22224j c22224j = this.f70426j;
                Object objPoll2 = this.f70430n.poll();
                String str2 = null;
                try {
                    if (objPoll2 == null) {
                        objPoll = this.f70431o.poll();
                        if (objPoll instanceof C22217c) {
                            i10 = this.f70434r;
                            str = this.f70435s;
                            if (i10 != -1) {
                                C18794j c18794j = this.f70429m;
                                this.f70429m = null;
                                C22223i c22223i = this.f70425i;
                                this.f70425i = null;
                                C22224j c22224j2 = this.f70426j;
                                this.f70426j = null;
                                this.f70427k.m19892e();
                                r6 = c18794j;
                                r11 = c22223i;
                                r10 = c22224j2;
                            } else {
                                ((C22217c) objPoll).getClass();
                                this.f70427k.m19890c(new C22219e(this.f70428l + " cancel", this), TimeUnit.MILLISECONDS.toNanos(StatsigLoggerKt.FLUSH_TIMER_MS));
                                r6 = 0;
                                r11 = 0;
                                r10 = 0;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            str = null;
                        }
                        if (objPoll2 != null) {
                            AbstractC16544l.m18091d(c22224j);
                            c22224j.m22417a(10, (C0678l) objPoll2);
                        } else if (objPoll instanceof C22218d) {
                            c22218d = (C22218d) objPoll;
                            AbstractC16544l.m18091d(c22224j);
                            c22224j.m22418e(c22218d.f70410a, c22218d.f70411b);
                            synchronized (this) {
                                this.f70432p -= (long) c22218d.f70411b.mo1372d();
                            }
                        } else {
                            if (objPoll instanceof C22217c) {
                                throw new AssertionError();
                            }
                            C22217c c22217c = (C22217c) objPoll;
                            AbstractC16544l.m18091d(c22224j);
                            i11 = c22217c.f70408a;
                            c0678l = c22217c.f70409b;
                            c0678lM1417C0 = C0678l.f1971p0;
                            if (i11 == 0 || c0678l != null) {
                                if (i11 != 0) {
                                    if (i11 >= 1000 || i11 >= 5000) {
                                        str2 = "Code must be in range [1000,5000): " + i11;
                                    } else if ((1004 <= i11 && i11 < 1007) || (1015 <= i11 && i11 < 3000)) {
                                        str2 = "Code " + i11 + " is reserved and may not be used.";
                                    }
                                    if (str2 != null) {
                                        throw new IllegalArgumentException(str2.toString());
                                    }
                                }
                                c0675i = new C0675i();
                                c0675i.m1441j1(i11);
                                if (c0678l != null) {
                                    c0675i.m1432c1(c0678l);
                                }
                                c0678lM1417C0 = c0675i.m1417C0(c0675i.f1970Z);
                            }
                            try {
                                c22224j.m22417a(8, c0678lM1417C0);
                                c22224j.f70466t0 = true;
                                if (r6 != 0) {
                                    AbstractC9147I2 abstractC9147I2 = this.f70417a;
                                    AbstractC16544l.m18091d(str);
                                    abstractC9147I2.mo4337e(this, i10, str);
                                }
                            } catch (Throwable th2) {
                                c22224j.f70466t0 = true;
                                throw th2;
                            }
                        }
                        if (r6 != 0) {
                            AbstractC17708b.m19412d(r6);
                        }
                        if (r11 != 0) {
                            AbstractC17708b.m19412d(r11);
                        }
                        if (r10 != 0) {
                            AbstractC17708b.m19412d(r10);
                        }
                        return true;
                    }
                    objPoll = null;
                    str = null;
                    if (objPoll2 != null) {
                        AbstractC16544l.m18091d(c22224j);
                        c22224j.m22417a(10, (C0678l) objPoll2);
                    } else if (objPoll instanceof C22218d) {
                        c22218d = (C22218d) objPoll;
                        AbstractC16544l.m18091d(c22224j);
                        c22224j.m22418e(c22218d.f70410a, c22218d.f70411b);
                        synchronized (this) {
                            this.f70432p -= (long) c22218d.f70411b.mo1372d();
                        }
                    } else {
                        if (objPoll instanceof C22217c) {
                            throw new AssertionError();
                        }
                        C22217c c22217c2 = (C22217c) objPoll;
                        AbstractC16544l.m18091d(c22224j);
                        i11 = c22217c2.f70408a;
                        c0678l = c22217c2.f70409b;
                        c0678lM1417C0 = C0678l.f1971p0;
                        if (i11 == 0) {
                            if (i11 != 0) {
                                if (i11 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            c0675i = new C0675i();
                            c0675i.m1441j1(i11);
                            if (c0678l != null) {
                                c0675i.m1432c1(c0678l);
                            }
                            c0678lM1417C0 = c0675i.m1417C0(c0675i.f1970Z);
                        } else {
                            if (i11 != 0) {
                                if (i11 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            c0675i = new C0675i();
                            c0675i.m1441j1(i11);
                            if (c0678l != null) {
                                c0675i.m1432c1(c0678l);
                            }
                            c0678lM1417C0 = c0675i.m1417C0(c0675i.f1970Z);
                        }
                        c22224j.m22417a(8, c0678lM1417C0);
                        c22224j.f70466t0 = true;
                        if (r6 != 0) {
                            AbstractC9147I2 abstractC9147I3 = this.f70417a;
                            AbstractC16544l.m18091d(str);
                            abstractC9147I3.mo4337e(this, i10, str);
                        }
                    }
                    if (r6 != 0) {
                        AbstractC17708b.m19412d(r6);
                    }
                    if (r11 != 0) {
                        AbstractC17708b.m19412d(r11);
                    }
                    if (r10 != 0) {
                        AbstractC17708b.m19412d(r10);
                    }
                    return true;
                } catch (Throwable th3) {
                    if (r6 != 0) {
                        AbstractC17708b.m19412d(r6);
                    }
                    if (r11 != 0) {
                        AbstractC17708b.m19412d(r11);
                    }
                    if (r10 != 0) {
                        AbstractC17708b.m19412d(r10);
                    }
                    throw th3;
                }
                String str3 = str;
                String str4 = str3;
                i10 = -1;
                r6 = str4;
                r11 = str3;
                r10 = str4;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
