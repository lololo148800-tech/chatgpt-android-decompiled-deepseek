package p006A4;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p030B2.C0742X;
import p049Bm.InterfaceC1436k;
import p072Ci.EnumC1696a;
import p1143z4.C21779i;
import p1143z4.C21795y;
import p178H.C3169s;
import p334Na.AbstractC5695b;
import p482Tg.C7464u;
import p536W.C8408d;
import p544W9.AbstractC8476F2;
import p893n.AbstractC17379k;
import p909nm.C17677k;

/* JADX INFO: renamed from: A4.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0359t extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1234Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f1235Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0359t(Context context, int i10) {
        super(1);
        this.f1234Y = i10;
        this.f1235Z = context;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1234Y) {
            case 0:
                Bundle bundle = (Bundle) obj;
                C21795y c21795yM6134a = AbstractC5695b.m6134a(this.f1235Z);
                if (bundle != null) {
                    bundle.setClassLoader(c21795yM6134a.f33529a.getClassLoader());
                    c21795yM6134a.f33532d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    c21795yM6134a.f33533e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = c21795yM6134a.f33543o;
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            c21795yM6134a.f33542n.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                            i10++;
                            i11++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String id2 : stringArrayList2) {
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                            if (parcelableArray != null) {
                                AbstractC16544l.m18093f(id2, "id");
                                C17677k c17677k = new C17677k(parcelableArray.length);
                                C0742X c0742xM18098k = AbstractC16544l.m18098k(parcelableArray);
                                while (c0742xM18098k.hasNext()) {
                                    Parcelable parcelable = (Parcelable) c0742xM18098k.next();
                                    AbstractC16544l.m18092e(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    c17677k.addLast((C21779i) parcelable);
                                }
                                linkedHashMap.put(id2, c17677k);
                            }
                        }
                    }
                    c21795yM6134a.f33534f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return c21795yM6134a;
            case 1:
                C7464u effect = (C7464u) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect instanceof C7464u) {
                    int i12 = 2;
                    if (Build.VERSION.SDK_INT >= 31) {
                        Object systemService = this.f1235Z.getSystemService("uimode");
                        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
                        UiModeManager uiModeManager = (UiModeManager) systemService;
                        EnumC1696a enumC1696a = effect.f23718a;
                        AbstractC16544l.m18094g(enumC1696a, "<this>");
                        int iOrdinal = enumC1696a.ordinal();
                        if (iOrdinal == 0) {
                            i12 = 0;
                        } else if (iOrdinal == 1) {
                            i12 = 1;
                        } else if (iOrdinal != 2) {
                            throw new C0644w();
                        }
                        uiModeManager.setApplicationNightMode(i12);
                    } else {
                        EnumC1696a enumC1696a2 = effect.f23718a;
                        AbstractC16544l.m18094g(enumC1696a2, "<this>");
                        int iOrdinal2 = enumC1696a2.ordinal();
                        if (iOrdinal2 == 0) {
                            i12 = -1;
                        } else if (iOrdinal2 == 1) {
                            i12 = 1;
                        } else if (iOrdinal2 != 2) {
                            throw new C0644w();
                        }
                        AbstractC17379k.m19063l(i12);
                    }
                }
                return C17296C.f55119a;
            default:
                C3169s cameraX = (C3169s) obj;
                C8408d c8408d = C8408d.f26139g;
                AbstractC16544l.m18093f(cameraX, "cameraX");
                c8408d.f26143d = cameraX;
                Context contextM9110c = AbstractC8476F2.m9110c(this.f1235Z);
                AbstractC16544l.m18093f(contextM9110c, "getApplicationContext(context)");
                c8408d.f26144e = contextM9110c;
                return c8408d;
        }
    }
}
