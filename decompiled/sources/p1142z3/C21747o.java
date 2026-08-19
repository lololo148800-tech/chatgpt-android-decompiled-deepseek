package p1142z3;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.net.Uri;
import android.text.TextUtils;
import bb.C11299Y;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p571X9.AbstractC9306j0;
import p678cb.AbstractC11695b;
import sk.C19665d;

/* JADX INFO: renamed from: z3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C21747o extends AbstractC21735c {

    /* JADX INFO: renamed from: q0 */
    public final int f68996q0;

    /* JADX INFO: renamed from: r0 */
    public final int f68997r0;

    /* JADX INFO: renamed from: s0 */
    public final C19665d f68998s0;

    /* JADX INFO: renamed from: t0 */
    public final C19665d f68999t0;

    /* JADX INFO: renamed from: u0 */
    public HttpURLConnection f69000u0;

    /* JADX INFO: renamed from: v0 */
    public InputStream f69001v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f69002w0;

    /* JADX INFO: renamed from: x0 */
    public int f69003x0;

    /* JADX INFO: renamed from: y0 */
    public long f69004y0;

    /* JADX INFO: renamed from: z0 */
    public long f69005z0;

    public C21747o(int i10, int i11, C19665d c19665d) {
        super(true);
        this.f68996q0 = i10;
        this.f68997r0 = i11;
        this.f68998s0 = c19665d;
        this.f68999t0 = new C19665d(7);
    }

    /* JADX INFO: renamed from: q */
    public static void m22243q(HttpURLConnection httpURLConnection, long j10) {
        if (httpURLConnection == null || AbstractC20817s.f66106a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x012d  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C21752t {
        HttpURLConnection httpURLConnection;
        long j10;
        HttpURLConnection httpURLConnection2;
        long j11;
        long j12;
        long j13;
        long jMax;
        this.f69005z0 = 0L;
        this.f69004y0 = 0L;
        m22237m();
        try {
            HttpURLConnection httpURLConnectionM22245p = m22245p(new URL(c21743k.f68974a.toString()), c21743k.f68976c, c21743k.f68977d, c21743k.f68979f, c21743k.f68980g, (c21743k.f68982i & 1) == 1, true, c21743k.f68978e);
            this.f69000u0 = httpURLConnectionM22245p;
            this.f69003x0 = httpURLConnectionM22245p.getResponseCode();
            httpURLConnectionM22245p.getResponseMessage();
            int i10 = this.f69003x0;
            long j14 = c21743k.f68979f;
            long j15 = c21743k.f68980g;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM22245p.getHeaderFields();
                if (this.f69003x0 == 416) {
                    String headerField = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = AbstractC21755w.f69013a;
                    if (TextUtils.isEmpty(headerField)) {
                        httpURLConnection = httpURLConnectionM22245p;
                        httpURLConnection = httpURLConnectionM22245p;
                        j10 = -1;
                    } else {
                        Matcher matcher = AbstractC21755w.f69014b.matcher(headerField);
                        if (matcher.matches()) {
                            httpURLConnection = httpURLConnectionM22245p;
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j10 = Long.parseLong(strGroup);
                        } else {
                            httpURLConnection = httpURLConnectionM22245p;
                            httpURLConnection = httpURLConnectionM22245p;
                            j10 = -1;
                        }
                    }
                    if (j14 == j10) {
                        this.f69002w0 = true;
                        m22238n(c21743k);
                        if (j15 != -1) {
                            return j15;
                        }
                        return 0L;
                    }
                } else {
                    httpURLConnection = httpURLConnectionM22245p;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        AbstractC11695b.m13028b(errorStream);
                    } else {
                        int i11 = AbstractC20817s.f66106a;
                    }
                } catch (IOException unused) {
                    int i12 = AbstractC20817s.f66106a;
                }
                m22244o();
                throw new C21754v(this.f69003x0, this.f69003x0 == 416 ? new C21741i(2008) : null, headerFields);
            }
            httpURLConnectionM22245p.getContentType();
            if (this.f69003x0 != 200 || j14 == 0) {
                j14 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM22245p.getHeaderField(SIPHeaderNames.CONTENT_ENCODING));
            if (zEqualsIgnoreCase) {
                httpURLConnection2 = httpURLConnectionM22245p;
                j11 = j14;
                this.f69004y0 = j15;
            } else if (j15 != -1) {
                this.f69004y0 = j15;
                httpURLConnection2 = httpURLConnectionM22245p;
                j11 = j14;
            } else {
                String headerField2 = httpURLConnectionM22245p.getHeaderField(SIPHeaderNames.CONTENT_LENGTH);
                String headerField3 = httpURLConnectionM22245p.getHeaderField("Content-Range");
                Pattern pattern2 = AbstractC21755w.f69013a;
                if (TextUtils.isEmpty(headerField2)) {
                    j12 = -1;
                } else {
                    try {
                        j12 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC20800b.m21324l("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        j12 = -1;
                    }
                }
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection2 = httpURLConnectionM22245p;
                    j11 = j14;
                    j13 = j12;
                    jMax = j13;
                } else {
                    Matcher matcher2 = AbstractC21755w.f69013a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j16 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            long j17 = (j16 - Long.parseLong(strGroup3)) + 1;
                            httpURLConnection2 = httpURLConnectionM22245p;
                            j11 = j14;
                            j13 = j12;
                            if (j13 < 0) {
                                jMax = j17;
                            } else if (j13 != j17) {
                                try {
                                    AbstractC20800b.m21332t("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    jMax = Math.max(j13, j17);
                                } catch (NumberFormatException unused3) {
                                    AbstractC20800b.m21324l("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                    jMax = j13;
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            httpURLConnection2 = httpURLConnectionM22245p;
                            j11 = j14;
                            j13 = j12;
                        }
                    } else {
                        httpURLConnection2 = httpURLConnectionM22245p;
                        j11 = j14;
                        j13 = j12;
                    }
                    jMax = j13;
                }
                this.f69004y0 = jMax != -1 ? jMax - j11 : -1L;
            }
            try {
                this.f69001v0 = httpURLConnection2.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f69001v0 = new GZIPInputStream(this.f69001v0);
                }
                this.f69002w0 = true;
                m22238n(c21743k);
                try {
                    m22246r(j11);
                    return this.f69004y0;
                } catch (IOException e10) {
                    m22244o();
                    if (e10 instanceof C21752t) {
                        throw ((C21752t) e10);
                    }
                    throw new C21752t(2000, 1, e10);
                }
            } catch (IOException e11) {
                m22244o();
                throw new C21752t(2000, 1, e11);
            }
        } catch (IOException e12) {
            m22244o();
            throw C21752t.m22250b(1, e12);
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        try {
            InputStream inputStream = this.f69001v0;
            if (inputStream != null) {
                long j10 = this.f69004y0;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f69005z0;
                }
                m22243q(this.f69000u0, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = AbstractC20817s.f66106a;
                    throw new C21752t(2000, 3, e10);
                }
            }
            this.f69001v0 = null;
            m22244o();
            if (this.f69002w0) {
                this.f69002w0 = false;
                m22236l();
            }
        } catch (Throwable th2) {
            this.f69001v0 = null;
            m22244o();
            if (this.f69002w0) {
                this.f69002w0 = false;
                m22236l();
            }
            throw th2;
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f69000u0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p1142z3.AbstractC21735c, p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        HttpURLConnection httpURLConnection = this.f69000u0;
        return httpURLConnection == null ? C11299Y.f34197s0 : new C21746n(httpURLConnection.getHeaderFields());
    }

    /* JADX INFO: renamed from: o */
    public final void m22244o() {
        HttpURLConnection httpURLConnection = this.f69000u0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                AbstractC20800b.m21325m("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f69000u0 = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final HttpURLConnection m22245p(URL url, int i10, byte[] bArr, long j10, long j11, boolean z6, boolean z10, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f68996q0);
        httpURLConnection.setReadTimeout(this.f68997r0);
        HashMap map2 = new HashMap();
        C19665d c19665d = this.f68998s0;
        if (c19665d != null) {
            map2.putAll(c19665d.m20642f());
        }
        map2.putAll(this.f68999t0.m20642f());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC21755w.f69013a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sbM9894m = AbstractC9306j0.m9894m("bytes=", j10, "-");
            if (j11 != -1) {
                sbM9894m.append((j10 + j11) - 1);
            }
            string = sbM9894m.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, z6 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = C21743k.f68973j;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: r */
    public final void m22246r(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f69001v0;
            int i10 = AbstractC20817s.f66106a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C21752t(2000, 1, new InterruptedIOException());
            }
            if (i11 == -1) {
                throw new C21752t();
            }
            j10 -= (long) i11;
            m22235g(i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws C21752t {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f69004y0;
            if (j10 != -1) {
                long j11 = j10 - this.f69005z0;
                if (j11 != 0) {
                    i11 = (int) Math.min(i11, j11);
                    InputStream inputStream = this.f69001v0;
                    int i13 = AbstractC20817s.f66106a;
                    i12 = inputStream.read(bArr, i10, i11);
                    if (i12 == -1) {
                        this.f69005z0 += (long) i12;
                        m22235g(i12);
                        return i12;
                    }
                }
            } else {
                InputStream inputStream2 = this.f69001v0;
                int i14 = AbstractC20817s.f66106a;
                i12 = inputStream2.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.f69005z0 += (long) i12;
                    m22235g(i12);
                    return i12;
                }
            }
            return -1;
        } catch (IOException e10) {
            int i15 = AbstractC20817s.f66106a;
            throw C21752t.m22250b(2, e10);
        }
    }
}
