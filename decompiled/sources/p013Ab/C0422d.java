package p013Ab;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.text.TextUtils;
import android.util.JsonReader;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.android.core.AbstractC15256t;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p001A.AbstractC0010F;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p1061vb.C20512c;
import p1061vb.InterfaceC20514e;
import p1104xb.InterfaceC21170a;
import p1125yb.C21399e;
import p115E9.C2361c;
import p523V9.AbstractC7854B5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ab.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0422d {

    /* JADX INFO: renamed from: d */
    public static final Pattern f1387d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e */
    public static final Charset f1388e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f1389a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21170a f1390b;

    /* JADX INFO: renamed from: c */
    public final C0423e f1391c = new C0423e();

    public C0422d(Context context, InterfaceC21170a interfaceC21170a) {
        this.f1389a = context;
        this.f1390b = interfaceC21170a;
    }

    /* JADX INFO: renamed from: a */
    public static URL m1071a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e10) {
            throw new C21399e(e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1072b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f1388e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        AbstractC15256t.m16482t("Firebase-Installations", str4);
        AbstractC15256t.m16482t("Firebase-Installations", AbstractC0010F.m20d("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : AbstractC9306j0.m9889h(", ", str)));
    }

    /* JADX INFO: renamed from: d */
    public static long m1073d(String str) {
        AbstractC20502t.m21150a("Invalid Expiration Timestamp.", f1387d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: e */
    public static C0419a m1074e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f1388e));
        C0420b c0420bM1070a = C0421c.m1070a();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        C0421c c0421c = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(DiagnosticsEntry.NAME_KEY)) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        c0420bM1070a.f1382o0 = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        c0420bM1070a.f1383p0 = Long.valueOf(m1073d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                C0421c c0421cM1051f = c0420bM1070a.m1051f();
                jsonReader.endObject();
                c0421c = c0421cM1051f;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C0419a(strNextString, strNextString2, strNextString3, c0421c, 1);
    }

    /* JADX INFO: renamed from: f */
    public static C0421c m1075f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f1388e));
        C0420b c0420bM1070a = C0421c.m1070a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                c0420bM1070a.f1382o0 = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                c0420bM1070a.f1383p0 = Long.valueOf(m1073d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        c0420bM1070a.f1381Z = 1;
        return c0420bM1070a.m1051f();
    }

    /* JADX INFO: renamed from: g */
    public static void m1076g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            m1078i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1077h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m1078i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1078i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX INFO: renamed from: c */
    public final HttpURLConnection m1079c(URL url, String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(ErrorBoundaryKt.SAMPLING_RATE);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(ErrorBoundaryKt.SAMPLING_RATE);
            httpURLConnection.addRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
            httpURLConnection.addRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f1389a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            InterfaceC20514e interfaceC20514e = (InterfaceC20514e) this.f1390b.get();
            if (interfaceC20514e != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) AbstractC7854B5.m8113a(((C20512c) interfaceC20514e).m21165b()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    AbstractC15256t.m16483u("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    AbstractC15256t.m16483u("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            String string = null;
            try {
                PackageInfo packageInfo = C2361c.m3449a(context).f7317Y.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    bArrDigest = null;
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                            if (messageDigest != null) {
                                break;
                            }
                            i10++;
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                    if (messageDigest == null) {
                        bArrDigest = null;
                    } else {
                        bArrDigest = messageDigest.digest(packageInfo.signatures[0].toByteArray());
                    }
                }
                if (bArrDigest == null) {
                    AbstractC15256t.m16465c("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb2 = new StringBuilder(length + length);
                    for (int i11 = 0; i11 < length; i11++) {
                        char[] cArr = AbstractC1616b.f4569a;
                        sb2.append(cArr[(bArrDigest[i11] & 240) >>> 4]);
                        sb2.append(cArr[bArrDigest[i11] & 15]);
                    }
                    string = sb2.toString();
                }
            } catch (PackageManager.NameNotFoundException e12) {
                AbstractC15256t.m16466d("ContentValues", "No such package: " + context.getPackageName(), e12);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new C21399e("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
