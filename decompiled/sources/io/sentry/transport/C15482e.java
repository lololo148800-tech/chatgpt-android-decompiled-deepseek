package io.sentry.transport;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.sentry.C15510v1;
import io.sentry.C15524y1;
import io.sentry.EnumC15359h;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.util.AbstractC15503h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p544W9.AbstractC8447A3;
import p593Y8.C9683j;
import p658b5.C11232c;
import p658b5.C11241l;

/* JADX INFO: renamed from: io.sentry.transport.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15482e {

    /* JADX INFO: renamed from: e */
    public static final Charset f48368e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Proxy f48369a;

    /* JADX INFO: renamed from: b */
    public final C11232c f48370b;

    /* JADX INFO: renamed from: c */
    public final C15524y1 f48371c;

    /* JADX INFO: renamed from: d */
    public final C9683j f48372d;

    public C15482e(C15524y1 c15524y1, C11232c c11232c, C9683j c9683j) {
        Proxy proxy;
        String str;
        this.f48370b = c11232c;
        this.f48371c = c15524y1;
        this.f48372d = c9683j;
        C15510v1 proxy2 = c15524y1.getProxy();
        if (proxy2 == null || (str = proxy2.f48436b) == null) {
            proxy = null;
        } else {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.f48435a, Integer.parseInt(str)));
            } catch (NumberFormatException e10) {
                this.f48371c.getLogger().mo16296g(EnumC15375i1.ERROR, e10, AbstractC10763a.m11054l("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        }
        this.f48369a = proxy;
        if (proxy == null || c15524y1.getProxy() == null) {
            return;
        }
        String str2 = c15524y1.getProxy().f48437c;
        String str3 = c15524y1.getProxy().f48438d;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new C15487j(str2, str3));
    }

    /* JADX INFO: renamed from: a */
    public static void m16676a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m16677b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f48368e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z6 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z6) {
                            sb2.append(Separators.RETURN);
                        }
                        sb2.append(line);
                        z6 = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                    String string = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th5;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC8447A3 m16678c(HttpURLConnection httpURLConnection) {
        C15524y1 c15524y1 = this.f48371c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            m16680e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Envelope sent successfully.", new Object[0]);
                return C15492o.f48384d;
            }
            InterfaceC15127H logger = c15524y1.getLogger();
            EnumC15375i1 enumC15375i1 = EnumC15375i1.ERROR;
            logger.mo16298o(enumC15375i1, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (c15524y1.isDebug()) {
                c15524y1.getLogger().mo16298o(enumC15375i1, "%s", m16677b(httpURLConnection));
            }
            return new C15491n(responseCode);
        } catch (IOException e10) {
            c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
            return new C15491n(-1);
        } finally {
            m16676a(httpURLConnection);
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC8447A3 m16679d(C11241l c11241l) {
        C11232c c11232c = this.f48370b;
        URL url = (URL) c11232c.f33996Y;
        Proxy proxy = this.f48369a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) c11232c.f33997Z).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        C15524y1 c15524y1 = this.f48371c;
        httpURLConnection.setConnectTimeout(c15524y1.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(c15524y1.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = c15524y1.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c15524y1.getSerializer().mo16322b(c11241l, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th6, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } catch (Throwable th7) {
                m16678c(httpURLConnection);
                throw th7;
            }
        }
        return m16678c(httpURLConnection);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0139 A[LOOP:2: B:68:0x012b->B:72:0x0139, LOOP_END] */
    /* JADX INFO: renamed from: e */
    public final void m16680e(HttpURLConnection httpURLConnection, int i10) {
        long j10;
        String[] strArr;
        C15524y1 c15524y1;
        int i11;
        long j11;
        String[] strArr2;
        int i12;
        String[] strArr3;
        int i13;
        EnumC15359h enumC15359h;
        String[] strArrSplit;
        int length;
        int i14;
        String string;
        int i15 = 0;
        int i16 = 1;
        String headerField = httpURLConnection.getHeaderField(SIPHeaderNames.RETRY_AFTER);
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        C9683j c9683j = this.f48372d;
        C15524y1 c15524y2 = (C15524y1) c9683j.f29193o0;
        double d10 = 1000.0d;
        C15481d c15481d = (C15481d) c9683j.f29192Z;
        if (headerField2 == null) {
            if (i10 == 429) {
                if (headerField != null) {
                    try {
                        j10 = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j10 = StatsigLoggerKt.FLUSH_TIMER_MS;
                    }
                } else {
                    j10 = StatsigLoggerKt.FLUSH_TIMER_MS;
                }
                c15481d.getClass();
                c9683j.m10276a(EnumC15359h.All, new Date(System.currentTimeMillis() + j10));
                return;
            }
            return;
        }
        int i17 = -1;
        String[] strArrSplit2 = headerField2.split(Separators.COMMA, -1);
        int length2 = strArrSplit2.length;
        int i18 = 0;
        while (i18 < length2) {
            String[] strArrSplit3 = strArrSplit2[i18].replace(Separators.f31991SP, "").split(":", i17);
            String str = strArrSplit3.length > 4 ? strArrSplit3[4] : null;
            if (strArrSplit3.length > 0) {
                String str2 = strArrSplit3[i15];
                if (str2 != null) {
                    try {
                        j11 = (long) (Double.parseDouble(str2) * d10);
                    } catch (NumberFormatException unused2) {
                        j11 = StatsigLoggerKt.FLUSH_TIMER_MS;
                    }
                } else {
                    j11 = StatsigLoggerKt.FLUSH_TIMER_MS;
                }
                if (strArrSplit3.length > i16) {
                    String str3 = strArrSplit3[i16];
                    c15481d.getClass();
                    Date date = new Date(System.currentTimeMillis() + j11);
                    if (str3 == null || str3.isEmpty()) {
                        i11 = i15;
                        strArr = strArrSplit2;
                        c15524y1 = c15524y2;
                        c9683j.m10276a(EnumC15359h.All, date);
                    } else {
                        String[] strArrSplit4 = str3.split(Separators.SEMICOLON, -1);
                        int length3 = strArrSplit4.length;
                        while (i15 < length3) {
                            String str4 = strArrSplit4[i15];
                            EnumC15359h enumC15359hValueOf = EnumC15359h.Unknown;
                            try {
                                Charset charset = AbstractC15503h.f48425a;
                                if (str4 != null) {
                                    try {
                                        if (str4.isEmpty()) {
                                            strArr2 = strArrSplit2;
                                            i12 = length3;
                                            string = str4;
                                        } else {
                                            strArr2 = strArrSplit2;
                                            try {
                                                String[] strArrSplit5 = AbstractC15503h.f48426b.split(str4, -1);
                                                StringBuilder sb2 = new StringBuilder();
                                                int length4 = strArrSplit5.length;
                                                i12 = length3;
                                                int i19 = 0;
                                                while (i19 < length4) {
                                                    try {
                                                        sb2.append(AbstractC15503h.m16687a(strArrSplit5[i19]));
                                                        i19++;
                                                        strArrSplit5 = strArrSplit5;
                                                    } catch (IllegalArgumentException e10) {
                                                        e = e10;
                                                        strArr3 = strArrSplit4;
                                                        i13 = 0;
                                                        c15524y2.getLogger().mo16296g(EnumC15375i1.INFO, e, "Unknown category: %s", str4);
                                                        enumC15359h = enumC15359hValueOf;
                                                        if (EnumC15359h.Unknown.equals(enumC15359h)) {
                                                            i16 = 1;
                                                        } else {
                                                            if (EnumC15359h.MetricBucket.equals(enumC15359h)) {
                                                                strArrSplit = str.split(Separators.SEMICOLON, -1);
                                                                if (strArrSplit.length > 0) {
                                                                    length = strArrSplit.length;
                                                                    i14 = i13;
                                                                    while (true) {
                                                                        if (i14 >= length) {
                                                                            i16 = 1;
                                                                        } else if (!"custom".equals(strArrSplit[i14])) {
                                                                            i14++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i16 = 1;
                                                            c9683j.m10276a(enumC15359h, date);
                                                        }
                                                        i15 += i16;
                                                        strArrSplit2 = strArr2;
                                                        length3 = i12;
                                                        strArrSplit4 = strArr3;
                                                        c15524y2 = c15524y2;
                                                    }
                                                }
                                                string = sb2.toString();
                                            } catch (IllegalArgumentException e11) {
                                                e = e11;
                                                i12 = length3;
                                                strArr3 = strArrSplit4;
                                                i13 = 0;
                                                c15524y2.getLogger().mo16296g(EnumC15375i1.INFO, e, "Unknown category: %s", str4);
                                                enumC15359h = enumC15359hValueOf;
                                                if (EnumC15359h.Unknown.equals(enumC15359h)) {
                                                    if (EnumC15359h.MetricBucket.equals(enumC15359h)) {
                                                        strArrSplit = str.split(Separators.SEMICOLON, -1);
                                                        if (strArrSplit.length > 0) {
                                                            length = strArrSplit.length;
                                                            i14 = i13;
                                                            while (true) {
                                                                if (i14 >= length) {
                                                                    i16 = 1;
                                                                } else if (!"custom".equals(strArrSplit[i14])) {
                                                                    i14++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i16 = 1;
                                                    c9683j.m10276a(enumC15359h, date);
                                                } else {
                                                    i16 = 1;
                                                }
                                                i15 += i16;
                                                strArrSplit2 = strArr2;
                                                length3 = i12;
                                                strArrSplit4 = strArr3;
                                                c15524y2 = c15524y2;
                                            }
                                        }
                                    } catch (IllegalArgumentException e12) {
                                        e = e12;
                                        strArr2 = strArrSplit2;
                                    }
                                } else {
                                    strArr2 = strArrSplit2;
                                    i12 = length3;
                                    string = str4;
                                }
                                if (string != null) {
                                    enumC15359hValueOf = EnumC15359h.valueOf(string);
                                    strArr3 = strArrSplit4;
                                } else {
                                    strArr3 = strArrSplit4;
                                    try {
                                        c15524y2.getLogger().mo16298o(EnumC15375i1.ERROR, "Couldn't capitalize: %s", str4);
                                    } catch (IllegalArgumentException e13) {
                                        e = e13;
                                        i13 = 0;
                                        c15524y2.getLogger().mo16296g(EnumC15375i1.INFO, e, "Unknown category: %s", str4);
                                        enumC15359h = enumC15359hValueOf;
                                    }
                                }
                                enumC15359h = enumC15359hValueOf;
                                i13 = 0;
                            } catch (IllegalArgumentException e14) {
                                e = e14;
                                strArr2 = strArrSplit2;
                            }
                            if (EnumC15359h.Unknown.equals(enumC15359h)) {
                                if (EnumC15359h.MetricBucket.equals(enumC15359h) && str != null && !str.equals("")) {
                                    strArrSplit = str.split(Separators.SEMICOLON, -1);
                                    if (strArrSplit.length > 0) {
                                        length = strArrSplit.length;
                                        i14 = i13;
                                        while (true) {
                                            if (i14 >= length) {
                                                i16 = 1;
                                            } else if (!"custom".equals(strArrSplit[i14])) {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                                i16 = 1;
                                c9683j.m10276a(enumC15359h, date);
                            } else {
                                i16 = 1;
                            }
                            i15 += i16;
                            strArrSplit2 = strArr2;
                            length3 = i12;
                            strArrSplit4 = strArr3;
                            c15524y2 = c15524y2;
                        }
                        strArr = strArrSplit2;
                        c15524y1 = c15524y2;
                        i11 = 0;
                    }
                } else {
                    i11 = i15;
                    strArr = strArrSplit2;
                    c15524y1 = c15524y2;
                }
            } else {
                strArr = strArrSplit2;
                c15524y1 = c15524y2;
                length2 = length2;
                i11 = i15;
            }
            i18 += i16;
            strArrSplit2 = strArr;
            i15 = i11;
            length2 = length2;
            c15524y2 = c15524y1;
            d10 = 1000.0d;
            i17 = -1;
        }
    }
}
