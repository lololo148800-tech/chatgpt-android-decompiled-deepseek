package p672c3;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;
import p174Gk.uSfJ.HpucjswO;
import p544W9.AbstractC8584X3;
import p571X9.AbstractC9300i0;
import p676c7.EnumC11684c;

/* JADX INFO: renamed from: c3.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11616l0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35163Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f35164Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f35165o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11616l0(int i10, Context context, String str) {
        super(0);
        this.f35163Y = i10;
        this.f35164Z = context;
        this.f35165o0 = str;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        boolean z6 = false;
        boolean z10 = true;
        String str = this.f35165o0;
        Context context = this.f35164Z;
        switch (this.f35163Y) {
            case 0:
                return AbstractC8584X3.m9250b(context, str);
            case 1:
                return AbstractC9300i0.m9879b(context, str);
            case 2:
                return new File(context.getCacheDir(), String.format(Locale.US, "datadog-%s", Arrays.copyOf(new Object[]{str}, 1)));
            default:
                Object systemService = context.getSystemService("uimode");
                UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
                if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC16544l.m18093f(packageManager, "appContext.packageManager");
                    if (!packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.tv")) {
                        Locale US = Locale.US;
                        AbstractC16544l.m18093f(US, "US");
                        String lowerCase = str.toLowerCase(US);
                        String str2 = HpucjswO.YtVoGQNHVQVHc;
                        AbstractC16544l.m18093f(lowerCase, str2);
                        if (AbstractC21322p.m21667A(lowerCase, "tablet", false) || AbstractC21322p.m21667A(lowerCase, "sm-t", false) || context.getResources().getConfiguration().smallestScreenWidthDp >= 800) {
                            return EnumC11684c.f35435Z;
                        }
                        String lowerCase2 = str.toLowerCase(US);
                        AbstractC16544l.m18093f(lowerCase2, str2);
                        if (!AbstractC21322p.m21667A(lowerCase2, "phone", false)) {
                            Object systemService2 = context.getSystemService("phone");
                            TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                            if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                                z6 = true;
                            }
                            z10 = true ^ z6;
                        }
                        return z10 ? EnumC11684c.f35434Y : EnumC11684c.f35437p0;
                    }
                }
                return EnumC11684c.f35436o0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11616l0(Context context, String str) {
        super(0);
        this.f35163Y = 3;
        this.f35165o0 = str;
        this.f35164Z = context;
    }
}
