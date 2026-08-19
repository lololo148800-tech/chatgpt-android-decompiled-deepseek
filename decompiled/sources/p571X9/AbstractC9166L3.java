package p571X9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import io.sentry.EnumC15375i1;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p060C6.AbstractC1604a;
import p060C6.C1606c;
import p1006s6.InterfaceC19455e;
import p1096x2.C21109d;
import p283L5.AbstractC4941g;
import p468T2.C7211c;
import p468T2.C7225q;
import p468T2.C7226r;
import p523V9.AbstractC8034Z;
import p909nm.C17690x;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.C17870w;
import p917o6.InterfaceC17842J;
import p959q8.C18639a;

/* JADX INFO: renamed from: X9.L3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9166L3 {
    /* JADX INFO: renamed from: a */
    public static C7226r m9716a(Context context) {
        ProviderInfo providerInfo;
        C21109d c21109d;
        ApplicationInfo applicationInfo;
        C18639a c7211c = Build.VERSION.SDK_INT >= 28 ? new C7211c(16) : new C18639a(16);
        PackageManager packageManager = context.getPackageManager();
        AbstractC4941g.m5558Q(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c21109d = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo7602r = c7211c.mo7602r(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo7602r) {
                    arrayList.add(signature.toByteArray());
                }
                c21109d = new C21109d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                AbstractC15256t.m16463a("emoji2.text.DefaultEmojiConfig", EnumC15375i1.ERROR, null, e10);
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                c21109d = null;
            }
        }
        if (c21109d == null) {
            return null;
        }
        return new C7226r(new C7225q(context, c21109d));
    }

    /* JADX INFO: renamed from: b */
    public static final C17853f m9717b(Set set, UUID uuid, C17867t customScalarAdapters, InterfaceC17842J interfaceC17842J, InterfaceC19455e interfaceC19455e) {
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        try {
            return AbstractC8034Z.m8388c(set, uuid, customScalarAdapters, interfaceC17842J, interfaceC19455e);
        } catch (Throwable th2) {
            AbstractC1604a c1606c = th2 instanceof AbstractC1604a ? th2 : new C1606c("Error while reading JSON response", th2);
            if (uuid == null) {
                uuid = UUID.randomUUID();
                AbstractC16544l.m18093f(uuid, "randomUUID(...)");
            }
            return new C17853f(uuid, interfaceC17842J, null, null, c1606c, C17690x.f56481Y, C17870w.f56967a, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: c */
    public static final C17853f m9718c(Set set, UUID uuid, C17867t customScalarAdapters, InterfaceC17842J interfaceC17842J, InterfaceC19455e interfaceC19455e) {
        ?? r6;
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        C17853f th2 = null;
        try {
            C17853f c17853fM9717b = m9717b(set, uuid, customScalarAdapters, interfaceC17842J, interfaceC19455e);
            try {
                interfaceC19455e.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            C17853f c17853f = th2;
            th2 = c17853fM9717b;
            r6 = c17853f;
        } catch (Throwable th4) {
            try {
                interfaceC19455e.close();
                r6 = th4;
            } catch (Throwable th5) {
                AbstractC9221V.m9789a(th4, th5);
                r6 = th4;
            }
        }
        if (r6 == 0) {
            return th2;
        }
        throw r6;
    }
}
