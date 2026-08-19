package p1009s9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.atomic.AtomicBoolean;
import p003A1.AbstractC0168G;
import p063C9.AbstractC1616b;
import p1060v9.AbstractC20502t;
import p115E9.C2360b;
import p115E9.C2361c;

/* JADX INFO: renamed from: s9.f */
/* JADX INFO: loaded from: classes.dex */
public class C19503f {

    /* JADX INFO: renamed from: a */
    public static final int f61951a;

    /* JADX INFO: renamed from: b */
    public static final C19503f f61952b;

    static {
        AtomicBoolean atomicBoolean = AbstractC19505h.f61953a;
        f61951a = 12451000;
        f61952b = new C19503f();
    }

    /* JADX INFO: renamed from: a */
    public static int m20600a(Context context) {
        AtomicBoolean atomicBoolean = AbstractC19505h.f61953a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC15256t.m16482t("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public Intent m20601b(int i10, Context context, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && AbstractC1616b.m2473e(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f61951a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                C2360b c2360bM3449a = C2361c.m3449a(context);
                sb2.append(c2360bM3449a.f7317Y.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(ParameterNames.f31999ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0153  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:80:0x015a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0188  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ab  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0153, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0163, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public int m20602c(Context context, int i10) {
        boolean z6;
        PackageInfo packageInfo;
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = AbstractC19505h.f61953a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            AbstractC15256t.m16465c("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zM20603a = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !AbstractC19505h.f61956d.get()) {
            synchronized (AbstractC20502t.f65099a) {
                try {
                    if (!AbstractC20502t.f65100b) {
                        AbstractC20502t.f65100b = true;
                        try {
                            Bundle bundle = C2361c.m3449a(context).f7317Y.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                AbstractC20502t.f65101c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            AbstractC15256t.m16485w("MetadataValueReader", "This should never happen.", e10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i13 = AbstractC20502t.f65101c;
            if (i13 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i13 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(AbstractC0168G.m532u("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", f61951a, " but found ", i13, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
            }
        }
        if (AbstractC1616b.m2473e(context)) {
            z6 = false;
        } else {
            if (AbstractC1616b.f4572d == null) {
                AbstractC1616b.f4572d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (AbstractC1616b.f4572d.booleanValue()) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        AbstractC20502t.m21151b(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i14 = 9;
        if (z6) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                AbstractC15256t.m16482t("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C19506i.m20604V(context);
            if (!C19506i.m20607c0(packageInfo2, true)) {
                AbstractC15256t.m16482t("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z6) {
                AbstractC20502t.m21157h(packageInfo);
                if (!C19506i.m20607c0(packageInfo, true)) {
                    AbstractC15256t.m16482t("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z6 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i11 = packageInfo2.versionCode;
                    if (i11 == -1) {
                        i12 = -1;
                    } else {
                        i12 = i11 / 1000;
                    }
                    if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                        AbstractC15256t.m16482t("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                        i14 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                AbstractC15256t.m16485w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                i14 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i14 = 0;
                        } else {
                            i14 = 3;
                        }
                    }
                } else {
                    AbstractC15256t.m16482t("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z6) {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    AbstractC15256t.m16482t("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                    i14 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i14 = 3;
                    } else {
                        i14 = 0;
                    }
                }
            } else {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    AbstractC15256t.m16482t("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                    i14 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i14 = 3;
                    } else {
                        i14 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            AbstractC15256t.m16482t("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i14 != 18) {
            zM20603a = i14 == 1 ? AbstractC19505h.m20603a(context) : false;
        }
        if (zM20603a) {
            return 18;
        }
        return i14;
    }
}
