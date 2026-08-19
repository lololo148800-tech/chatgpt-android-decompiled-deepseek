package p1060v9;

import android.gov.nist.core.Separators;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import p813ij.C15026j;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: v9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C20489g {

    /* JADX INFO: renamed from: b */
    public static final C15026j f65054b = new C15026j("LibraryVersion", "");

    /* JADX INFO: renamed from: c */
    public static final C20489g f65055c = new C20489g();

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f65056a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final String m21137a(String str) throws Throwable {
        IOException e10;
        String str2;
        InputStream resourceAsStream;
        C15026j c15026j = f65054b;
        AbstractC20502t.m21154e(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f65056a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        InputStream inputStream2 = null;
        try {
            try {
                resourceAsStream = C20489g.class.getResourceAsStream(Separators.SLASH + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        String strConcat = str + " version is " + property;
                        if (Log.isLoggable((String) c15026j.f46724Y, 2)) {
                            String str3 = (String) c15026j.f46725Z;
                            if (str3 != null) {
                                strConcat = str3.concat(strConcat);
                            }
                            Log.v("LibraryVersion", strConcat);
                        }
                    } else {
                        String strConcat2 = "Failed to get app version for libraryName: " + str;
                        if (Log.isLoggable((String) c15026j.f46724Y, 5)) {
                            String str4 = (String) c15026j.f46725Z;
                            if (str4 != null) {
                                strConcat2 = str4.concat(strConcat2);
                            }
                            AbstractC15256t.m16482t("LibraryVersion", strConcat2);
                        }
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    inputStream = resourceAsStream;
                    str2 = null;
                    String strConcat3 = "Failed to get app version for libraryName: " + str;
                    if (Log.isLoggable((String) c15026j.f46724Y, 6)) {
                        String str5 = (String) c15026j.f46725Z;
                        if (str5 != null) {
                            strConcat3 = str5.concat(strConcat3);
                        }
                        AbstractC15256t.m16466d("LibraryVersion", strConcat3, e10);
                    }
                    InputStream inputStream3 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream3;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = resourceAsStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e10 = e12;
            str2 = null;
        }
        if (resourceAsStream != null) {
            try {
                resourceAsStream.close();
            } catch (IOException unused2) {
            }
        }
        if (property == null) {
            if (Log.isLoggable((String) c15026j.f46724Y, 3)) {
                String str6 = (String) c15026j.f46725Z;
                Log.d("LibraryVersion", str6 != null ? str6.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            property = "UNKNOWN";
        }
        concurrentHashMap.put(str, property);
        return property;
    }
}
