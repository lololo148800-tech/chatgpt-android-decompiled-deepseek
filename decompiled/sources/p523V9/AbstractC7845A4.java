package p523V9;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.javax.sip.C10808o;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cl.C11776c;
import com.google.firebase.messaging.FirebaseMessaging;
import io.ktor.utils.p815io.InterfaceC15088n;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC16544l;
import p033B5.C0819c;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p1125yb.C21397c;
import p1125yb.InterfaceC21398d;
import p117Eb.C2385o;
import p141Fb.C2705d;
import p141Fb.C2706e;
import p141Fb.EnumC2703b;
import p409Qk.C6752c;
import p434Rk.C6911c;
import p522V8.C7834a;
import p522V8.C7835b;
import p522V8.C7836c;
import p522V8.EnumC7837d;
import p522V8.InterfaceC7839f;
import p593Y8.C9689p;
import p832jb.C16187g;
import p832jb.C16189i;
import p852kb.InterfaceC16365a;
import p857kl.InterfaceC16476x;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: V9.A4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7845A4 {
    /* JADX WARN: Code duplicated, block: B:105:0x019e  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:131:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1 A[PHI: r7
      0x00e1: PHI (r7v23 java.lang.String) = (r7v22 java.lang.String), (r7v35 java.lang.String) binds: [B:43:0x00c9, B:47:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:73:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0135  */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x016b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m8094b(Intent intent) {
        int iIntValue;
        int i10;
        String string;
        EnumC2703b enumC2703b;
        String string2;
        Object[] objArr;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j10;
        C16187g c16187gM17791b;
        C16189i c16189i;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        int i11 = 1;
        if (m8096d(intent)) {
            m8095c("_nr", intent.getExtras());
        }
        int i12 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : m8093a()) {
            InterfaceC7839f interfaceC7839f = (InterfaceC7839f) FirebaseMessaging.f36850l.get();
            if (interfaceC7839f == null) {
                AbstractC15256t.m16465c("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            C2705d c2705d = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            AbstractC15256t.m16482t("FirebaseMessaging", "Invalid TTL: " + obj);
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            C16187g c16187gM17791b2 = C16187g.m17791b();
                            Object obj2 = C21397c.f67927m;
                            c16187gM17791b2.m17794a();
                            string = (String) AbstractC7854B5.m8113a(((C21397c) c16187gM17791b2.f50238d.mo12555a(InterfaceC21398d.class)).m21780d());
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    String str10 = string;
                    C16187g c16187gM17791b3 = C16187g.m17791b();
                    c16187gM17791b3.m17794a();
                    String packageName = c16187gM17791b3.f50235a.getPackageName();
                    if (C10808o.m11072o(extras)) {
                        enumC2703b = EnumC2703b.DISPLAY_NOTIFICATION;
                    } else {
                        enumC2703b = EnumC2703b.DATA_MESSAGE;
                    }
                    EnumC2703b enumC2703b2 = enumC2703b;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        objArr = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    }
                    if (objArr == 2) {
                        i12 = 5;
                    } else if (objArr == 1) {
                        i12 = 10;
                    }
                    int i13 = i12;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j10 = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e11) {
                            AbstractC15256t.m16483u("FirebaseMessaging", "error parsing project number", e11);
                            c16187gM17791b = C16187g.m17791b();
                            c16187gM17791b.m17794a();
                            c16189i = c16187gM17791b.f50237c;
                            str6 = c16189i.f50253e;
                            if (str6 != null) {
                                try {
                                    j10 = Long.parseLong(str6);
                                } catch (NumberFormatException e12) {
                                    AbstractC15256t.m16483u("FirebaseMessaging", "error parsing sender ID", e12);
                                    c16187gM17791b.m17794a();
                                    str7 = c16189i.f50250b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j10 = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j10 = 0;
                                            } else {
                                                try {
                                                    j10 = Long.parseLong(str8);
                                                } catch (NumberFormatException e13) {
                                                    AbstractC15256t.m16483u("FirebaseMessaging", "error parsing app ID", e13);
                                                    j10 = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j10 = Long.parseLong(str7);
                                        } catch (NumberFormatException e14) {
                                            AbstractC15256t.m16483u("FirebaseMessaging", "error parsing app ID", e14);
                                            j10 = 0;
                                        }
                                    }
                                }
                            } else {
                                c16187gM17791b.m17794a();
                                str7 = c16189i.f50250b;
                                if (str7.startsWith("1:")) {
                                    j10 = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j10 = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j10 = 0;
                                        } else {
                                            j10 = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c16187gM17791b = C16187g.m17791b();
                        c16187gM17791b.m17794a();
                        c16189i = c16187gM17791b.f50237c;
                        str6 = c16189i.f50253e;
                        if (str6 != null) {
                            j10 = Long.parseLong(str6);
                        } else {
                            c16187gM17791b.m17794a();
                            str7 = c16189i.f50250b;
                            if (str7.startsWith("1:")) {
                                j10 = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j10 = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j10 = 0;
                                    } else {
                                        j10 = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    c2705d = new C2705d(j10 > 0 ? j10 : 0L, str, str10, enumC2703b2, packageName, str3, i13, i10, str2, str4, str5);
                }
                i10 = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    C16187g c16187gM17791b4 = C16187g.m17791b();
                    Object obj3 = C21397c.f67927m;
                    c16187gM17791b4.m17794a();
                    string = (String) AbstractC7854B5.m8113a(((C21397c) c16187gM17791b4.f50238d.mo12555a(InterfaceC21398d.class)).m21780d());
                }
                String str11 = string;
                C16187g c16187gM17791b5 = C16187g.m17791b();
                c16187gM17791b5.m17794a();
                String packageName2 = c16187gM17791b5.f50235a.getPackageName();
                if (C10808o.m11072o(extras)) {
                    enumC2703b = EnumC2703b.DISPLAY_NOTIFICATION;
                } else {
                    enumC2703b = EnumC2703b.DATA_MESSAGE;
                }
                EnumC2703b enumC2703b3 = enumC2703b;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i12 = 5;
                } else if (objArr == 1) {
                    i12 = 10;
                }
                int i14 = i12;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j10 = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    c16187gM17791b = C16187g.m17791b();
                    c16187gM17791b.m17794a();
                    c16189i = c16187gM17791b.f50237c;
                    str6 = c16189i.f50253e;
                    if (str6 != null) {
                        j10 = Long.parseLong(str6);
                    } else {
                        c16187gM17791b.m17794a();
                        str7 = c16189i.f50250b;
                        if (str7.startsWith("1:")) {
                            j10 = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j10 = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j10 = 0;
                                } else {
                                    j10 = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                c2705d = new C2705d(j10 > 0 ? j10 : 0L, str, str11, enumC2703b3, packageName2, str3, i14, i10, str2, str4, str5);
            }
            if (c2705d == null) {
                return;
            }
            try {
                ((C9689p) interfaceC7839f).m10280a("FCM_CLIENT_EVENT_LOGGING", new C7836c("proto"), new C2385o(i11)).m10281a(new C7834a(new C2706e(c2705d), EnumC7837d.f24731Y, new C7835b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
            } catch (RuntimeException e15) {
                AbstractC15256t.m16483u("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8095c(String str, Bundle bundle) {
        try {
            C16187g.m17791b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    AbstractC15256t.m16483u("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    AbstractC15256t.m16483u("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = C10808o.m11072o(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            C16187g c16187gM17791b = C16187g.m17791b();
            c16187gM17791b.m17794a();
            if (c16187gM17791b.f50238d.mo12555a(InterfaceC16365a.class) != null) {
                throw new ClassCastException();
            }
            AbstractC15256t.m16482t("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            AbstractC15256t.m16465c("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8096d(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8093a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C16187g.m17791b();
            C16187g c16187gM17791b = C16187g.m17791b();
            c16187gM17791b.m17794a();
            Context context = c16187gM17791b.f50235a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", sVDIzpC.EPMuAjUmupsC);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C11776c m8097e(C6911c c6911c, InterfaceC15088n content) {
        AbstractC16544l.m18094g(c6911c, QzvfuIgrngtl.ruOTHTzoSegUH);
        AbstractC16544l.m18094g(content, "content");
        InterfaceC16476x responseHeaders = c6911c.m7297d().mo7301a();
        C6752c client = c6911c.f22164Y;
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(responseHeaders, "responseHeaders");
        return new C11776c(client, new C0819c(content, 14), c6911c, responseHeaders);
    }
}
