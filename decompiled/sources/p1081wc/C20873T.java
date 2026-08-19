package p1081wc;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import cn.UfGr.EhBykzn;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0593T;
import p103Dn.AbstractC2124C;
import p1068vo.C20659i;
import p1072w2.C20793e;
import p1072w2.C20796h;
import p1072w2.InterfaceC20795g;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p523V9.AbstractC8135l5;
import p523V9.AbstractC8154o0;
import p523V9.AbstractC8168p6;
import p529Vh.C8290c;
import p529Vh.C8291d;
import p571X9.AbstractC9138H;
import p571X9.AbstractC9233X;
import p829j9.InterfaceC16179c;
import p865l6.ServiceConnectionC16827a;
import p893n.AbstractC17378j;
import p893n.AbstractC17379k;
import p909nm.AbstractC17659D;
import p972qm.AbstractC18773f;
import p972qm.C18778k;
import p972qm.InterfaceC18770c;
import p985r9.C18903m;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: wc.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C20873T implements DefaultLifecycleObserver, InterfaceC19018a {

    /* JADX INFO: renamed from: Y */
    public final Application f66450Y;

    /* JADX INFO: renamed from: Z */
    public final C8291d f66451Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC20904w f66452o0;

    /* JADX INFO: renamed from: p0 */
    public final C3430e f66453p0 = AbstractC8168p6.m8749b("LaunchTracker", null);

    /* JADX INFO: renamed from: q0 */
    public final LinkedHashSet f66454q0 = new LinkedHashSet();

    public C20873T(Application application, C8291d c8291d, InterfaceC20904w interfaceC20904w) {
        this.f66450Y = application;
        this.f66451Z = c8291d;
        this.f66452o0 = interfaceC20904w;
    }

    /* JADX INFO: renamed from: d */
    public static String m21449d(Intent intent, String str) {
        Uri data = intent.getData();
        if (data != null) {
            if (data.getQueryParameter(str) != null) {
                data = data.buildUpon().appendQueryParameter(str, "removed").build();
            }
            if (data != null) {
                return data.toString();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff  */
    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: a */
    public final Object mo4158a(InterfaceC18770c interfaceC18770c) {
        C20871Q c20871q;
        C20793e c20793e;
        C20873T c20873t;
        ServiceInfo serviceInfo;
        C20873T c20873t2;
        C18903m c18903m;
        Map map;
        if (interfaceC18770c instanceof C20871Q) {
            c20871q = (C20871Q) interfaceC18770c;
            int i10 = c20871q.f66445q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20871q.f66445q0 = i10 - Integer.MIN_VALUE;
            } else {
                c20871q = new C20871Q(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c20871q = new C20871Q(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM3221t = c20871q.f66443o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20871q.f66445q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c20873t = c20871q.f66441Y;
                AbstractC9233X.m9807c(objM3221t);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c18903m = c20871q.f66442Z;
                c20873t2 = c20871q.f66441Y;
                AbstractC9233X.m9807c(objM3221t);
            }
            map = (Map) objM3221t;
            if (map != null) {
                c20873t2.f66451Z.f25843a.m21030c(C20872S.f66446Z);
                c20873t2.f66452o0.mo21447a(C20887f.f66533h, map);
            }
            c18903m.f60267a = 3;
            if (((ServiceConnectionC16827a) c18903m.f60270d) != null) {
                AbstractC9138H.m9682a("Unbinding from service.");
                ((Context) c18903m.f60268b).unbindService((ServiceConnectionC16827a) c18903m.f60270d);
                c18903m.f60270d = null;
            }
            c18903m.f60269c = null;
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM3221t);
        Application application = this.f66450Y;
        LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(new C17309l("HapticsAvailable", Boolean.valueOf(AbstractC18773f.m20050b(application))));
        InterfaceC20795g interfaceC20795g = AbstractC8135l5.m8657e(application.getResources().getConfiguration()).f66056a;
        int size = interfaceC20795g.size();
        for (int i12 = 0; i12 < size; i12++) {
            Locale locale = interfaceC20795g.get(i12);
            if (locale != null) {
                String strM11048f = AbstractC10763a.m11048f(i12, "user_locale_");
                String languageTag = locale.toLanguageTag();
                AbstractC16544l.m18093f(languageTag, "toLanguageTag(...)");
                linkedHashMapM19246h.put(strM11048f, languageTag);
            }
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM19060b = AbstractC17379k.m19060b();
            if (objM19060b != null) {
                c20793e = new C20793e(new C20796h(AbstractC17378j.m19057a(objM19060b)));
            } else {
                c20793e = C20793e.f66055b;
            }
        } else {
            c20793e = AbstractC17379k.f55486o0;
            if (c20793e == null) {
                c20793e = C20793e.f66055b;
            }
        }
        AbstractC16544l.m18093f(c20793e, "getApplicationLocales(...)");
        InterfaceC20795g interfaceC20795g2 = c20793e.f66056a;
        int size2 = interfaceC20795g2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Locale locale2 = interfaceC20795g2.get(i13);
            if (locale2 != null) {
                String strM11048f2 = AbstractC10763a.m11048f(i13, "chatgpt_locale_");
                String languageTag2 = locale2.toLanguageTag();
                AbstractC16544l.m18093f(languageTag2, "toLanguageTag(...)");
                linkedHashMapM19246h.put(strM11048f2, languageTag2);
            }
        }
        this.f66452o0.mo21447a(C20897p.f66605e, linkedHashMapM19246h);
        C8291d c8291d = this.f66451Z;
        c20871q.f66441Y = this;
        c20871q.f66445q0 = 1;
        objM3221t = AbstractC2124C.m3221t(c8291d.f25844b, c20871q);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c20873t = this;
        if (((C8290c) objM3221t).f25842a) {
            C18903m c18903m2 = new C18903m(c20873t.f66450Y);
            c20871q.f66441Y = c20873t;
            c20871q.f66442Z = c18903m2;
            c20871q.f66445q0 = 2;
            C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(c20871q));
            C20659i c20659i = new C20659i(c18903m2, c18778k, c20873t);
            int i14 = c18903m2.f60267a;
            if (i14 == 2 && ((InterfaceC16179c) c18903m2.f60269c) != null && ((ServiceConnectionC16827a) c18903m2.f60270d) != null) {
                AbstractC9138H.m9682a("Service connection is valid. No need to re-initialize.");
                c20659i.m21207a(0);
            } else if (i14 == 1) {
                AbstractC9138H.m9683b("Client is already in the process of connecting to the service.");
                c20659i.m21207a(3);
            } else if (i14 == 3) {
                AbstractC9138H.m9683b("Client was already closed and can't be reused. Please create another instance.");
                c20659i.m21207a(3);
            } else {
                AbstractC9138H.m9682a("Starting install referrer service setup.");
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                Context context = (Context) c18903m2.f60268b;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
                    c18903m2.f60267a = 0;
                    AbstractC9138H.m9682a("Install Referrer service unavailable on device.");
                    c20659i.m21207a(2);
                } else {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        AbstractC9138H.m9683b("Play Store missing or incompatible. Version 8.3.73 or later required.");
                        c18903m2.f60267a = 0;
                        c20659i.m21207a(2);
                    } else {
                        try {
                            if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                                Intent intent2 = new Intent(intent);
                                ServiceConnectionC16827a serviceConnectionC16827a = new ServiceConnectionC16827a(c18903m2, c20659i);
                                c18903m2.f60270d = serviceConnectionC16827a;
                                try {
                                    if (context.bindService(intent2, serviceConnectionC16827a, 1)) {
                                        AbstractC9138H.m9682a("Service was bonded successfully.");
                                    } else {
                                        AbstractC9138H.m9683b("Connection to service is blocked.");
                                        c18903m2.f60267a = 0;
                                        c20659i.m21207a(1);
                                    }
                                } catch (SecurityException unused) {
                                    AbstractC9138H.m9683b(EhBykzn.yNzpZsBsH);
                                    c18903m2.f60267a = 0;
                                    c20659i.m21207a(4);
                                }
                            } else {
                                AbstractC9138H.m9683b("Play Store missing or incompatible. Version 8.3.73 or later required.");
                                c18903m2.f60267a = 0;
                                c20659i.m21207a(2);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
            }
            objM3221t = c18778k.m20051a();
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            c20873t2 = c20873t;
            c18903m = c18903m2;
            map = (Map) objM3221t;
            if (map != null) {
                c20873t2.f66451Z.f25843a.m21030c(C20872S.f66446Z);
                c20873t2.f66452o0.mo21447a(C20887f.f66533h, map);
            }
            c18903m.f60267a = 3;
            if (((ServiceConnectionC16827a) c18903m.f60270d) != null) {
                AbstractC9138H.m9682a("Unbinding from service.");
                ((Context) c18903m.f60268b).unbindService((ServiceConnectionC16827a) c18903m.f60270d);
                c18903m.f60270d = null;
            }
            c18903m.f60269c = null;
        }
        return C17296C.f55119a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: b */
    public final C3516e mo4159b() {
        return AbstractC0593T.f1824a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: c */
    public final Object mo4160c(InterfaceC18770c interfaceC18770c) {
        return C17296C.f55119a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12156d(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
        this.f66454q0.clear();
    }
}
