package p938p2;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p082D2.AbstractC1854a;
import p193Hf.C3321N;
import p229J0.EnumC3898D3;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p594Y9.AbstractC9787P3;
import p615Z6.AbstractC10224l0;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import pe.AbstractC18382c;

/* JADX INFO: renamed from: p2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18290d {

    /* JADX INFO: renamed from: a */
    public static volatile C18288b f58385a;

    /* JADX INFO: renamed from: b */
    public static volatile ArrayList f58386b;

    /* JADX INFO: renamed from: a */
    public static final void m19831a(InterfaceC1426a onDismiss, InterfaceC1426a onShare, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onShare, "onShare");
        c6021p.m6526U(1873215543);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(onDismiss) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onShare) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC9787P3.m10401a(onDismiss, AbstractC8411c.m8969c(-1522258907, c6021p, new C3321N(13, onShare)), c10456n, null, EnumC3898D3.f11878Z, AbstractC18382c.f58657b, c6021p, (i12 & 14) | 221232 | (i12 & 896), 8);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(onDismiss, onShare, interfaceC10459q2, i10, 24);
        }
    }

    /* JADX INFO: renamed from: c */
    public static List m19832c(Context context) {
        Bundle bundle;
        String string;
        if (f58386b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, AbstractC18290d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (f58386b == null) {
                f58386b = arrayList;
            }
        }
        return f58386b;
    }

    /* JADX INFO: renamed from: d */
    public static C18288b m19833d(Context context) {
        if (f58385a == null) {
            try {
                f58385a = (C18288b) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, AbstractC18290d.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f58385a == null) {
                f58385a = new C18288b();
            }
        }
        return f58385a;
    }

    /* JADX INFO: renamed from: f */
    public static void m19834f(Application application, String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            AbstractC1854a.m2717f(application.getSystemService(AbstractC1854a.m2718g())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) m19832c(application)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean mo10801b(AbstractC10224l0 abstractC10224l0) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo10800e(String str);
}
