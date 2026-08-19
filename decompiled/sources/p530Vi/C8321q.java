package p530Vi;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21307a;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p594Y9.AbstractC9852a3;

/* JADX INFO: renamed from: Vi.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8321q implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final HttpURLConnection f25942Y;

    /* JADX INFO: renamed from: Z */
    public final InputStream f25943Z;

    /* JADX INFO: renamed from: o0 */
    public final OutputStream f25944o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f25945p0;

    public C8321q(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream, int i10) {
        this.f25945p0 = i10;
        this.f25942Y = httpURLConnection;
        this.f25943Z = inputStream;
        this.f25944o0 = outputStream;
    }

    /* JADX INFO: renamed from: a */
    public final void m8935a() {
        this.f25942Y.disconnect();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044 A[Catch: all -> 0x0048, PHI: r4 r5
      0x0044: PHI (r4v8 java.lang.String) = (r4v6 java.lang.String), (r4v12 java.lang.String) binds: [B:36:0x0061, B:26:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r5v6 java.io.InputStream) = (r5v4 java.io.InputStream), (r5v7 java.io.InputStream) binds: [B:36:0x0061, B:26:0x0042] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0048, blocks: (B:5:0x000b, B:27:0x0044, B:38:0x0064, B:39:0x007b, B:41:0x007e, B:42:0x0081), top: B:59:0x000b }] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0037: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:56), block:B:18:0x0037 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream;
        InputStream errorStream;
        IOException e10;
        switch (this.f25945p0) {
            case 0:
                m8935a();
                InputStream inputStream2 = this.f25943Z;
                if (inputStream2 != null) {
                    inputStream2.close();
                    return;
                }
                return;
            default:
                OutputStream outputStream = this.f25944o0;
                HttpURLConnection httpURLConnection = this.f25942Y;
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 300) {
                        m8935a();
                        if (outputStream != null) {
                            outputStream.close();
                            return;
                        }
                        return;
                    }
                    InputStream inputStream3 = null;
                    String str = null;
                    try {
                        try {
                            try {
                                try {
                                    errorStream = httpURLConnection.getInputStream();
                                } catch (IOException unused) {
                                    errorStream = httpURLConnection.getErrorStream();
                                }
                                if (errorStream != null) {
                                    try {
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, C21307a.f67720a), 8192);
                                        try {
                                            String strM8249b = AbstractC7958O5.m8249b(bufferedReader);
                                            AbstractC7942M5.m8232a(bufferedReader, null);
                                            str = strM8249b;
                                        } catch (Throwable th2) {
                                            try {
                                                throw th2;
                                            } catch (Throwable th3) {
                                                AbstractC7942M5.m8232a(bufferedReader, th2);
                                                throw th3;
                                            }
                                        }
                                    } catch (IOException e11) {
                                        e10 = e11;
                                        AbstractC9852a3.m10502c(C8312h.Companion, e10);
                                        str = "Could not read response body for rejected message: " + e10;
                                        if (errorStream != null) {
                                        }
                                        String responseMessage = httpURLConnection.getResponseMessage();
                                        AbstractC16544l.m18093f(responseMessage, "connection.responseMessage");
                                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                        AbstractC16544l.m18093f(headerFields, "connection.headerFields");
                                        throw new C8322r(responseCode, responseMessage, str, headerFields);
                                    }
                                }
                                if (errorStream != null) {
                                    errorStream.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream3 != null) {
                                    inputStream3.close();
                                }
                                throw th;
                            }
                            break;
                        } catch (IOException e12) {
                            errorStream = null;
                            e10 = e12;
                            AbstractC9852a3.m10502c(C8312h.Companion, e10);
                            str = "Could not read response body for rejected message: " + e10;
                            if (errorStream != null) {
                                errorStream.close();
                            }
                            String responseMessage2 = httpURLConnection.getResponseMessage();
                            AbstractC16544l.m18093f(responseMessage2, "connection.responseMessage");
                            Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                            AbstractC16544l.m18093f(headerFields2, "connection.headerFields");
                            throw new C8322r(responseCode, responseMessage2, str, headerFields2);
                        }
                        String responseMessage3 = httpURLConnection.getResponseMessage();
                        AbstractC16544l.m18093f(responseMessage3, "connection.responseMessage");
                        Map<String, List<String>> headerFields3 = httpURLConnection.getHeaderFields();
                        AbstractC16544l.m18093f(headerFields3, "connection.headerFields");
                        throw new C8322r(responseCode, responseMessage3, str, headerFields3);
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream3 = inputStream;
                    }
                } catch (Throwable th6) {
                    m8935a();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th6;
                }
                break;
        }
    }
}
