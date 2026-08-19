package p1070w;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import kotlin.jvm.internal.AbstractC16544l;
import p1087wj.InterfaceC20971B;
import p1131yj.InterfaceC21546a;
import p757g.C13722a;
import p757g.InterfaceC13724c;
import p770gk.InterfaceC14185a;

/* JADX INFO: renamed from: w.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20694c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65550a;

    /* JADX INFO: renamed from: b */
    public final Object f65551b;

    /* JADX INFO: renamed from: c */
    public final Object f65552c;

    /* JADX INFO: renamed from: d */
    public final Object f65553d;

    public /* synthetic */ C20694c(Object obj, Comparable comparable, Object obj2, int i10) {
        this.f65550a = i10;
        this.f65551b = obj;
        this.f65552c = comparable;
        this.f65553d = obj2;
    }

    /* JADX INFO: renamed from: a */
    public C20696e m21213a(PendingIntent pendingIntent) {
        boolean zM15207d;
        BinderC20692a binderC20692a = new BinderC20692a();
        binderC20692a.attachInterface(binderC20692a, "android.support.customtabs.ICustomTabsCallback");
        new Handler(Looper.getMainLooper());
        InterfaceC13724c interfaceC13724c = (InterfaceC13724c) this.f65551b;
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zM15207d = ((C13722a) interfaceC13724c).m15208i(binderC20692a, bundle);
            } else {
                zM15207d = ((C13722a) interfaceC13724c).m15207d(binderC20692a);
            }
            if (zM15207d) {
                return new C20696e(binderC20692a, (ComponentName) this.f65552c, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public String toString() {
        switch (this.f65550a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f65551b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                String str = (String) this.f65552c;
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
                String str2 = (String) this.f65553d;
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "sb.toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20694c(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType(), 2);
        this.f65550a = 2;
        AbstractC16544l.m18094g(intent, "intent");
    }

    public C20694c(InterfaceC20971B service, InterfaceC21546a fallbackModeManager, InterfaceC14185a interfaceC14185a) {
        this.f65550a = 1;
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        this.f65551b = service;
        this.f65552c = fallbackModeManager;
        this.f65553d = interfaceC14185a;
    }
}
