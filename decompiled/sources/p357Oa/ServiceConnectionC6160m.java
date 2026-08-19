package p357Oa;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractBinderC11955g;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11924X1;
import com.google.android.gms.internal.play_billing.C11951f;
import com.google.android.gms.internal.play_billing.InterfaceC11959h;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p005A3.C0326m;
import p1160zp.AbstractC22225a;
import p410Ql.BinderC6758b;
import p425Ra.C6831d;
import p500Ua.C7595d;
import p524Va.C8255g;
import p524Va.C8256h;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p572Xa.C9407a;
import p572Xa.C9408b;
import p817j$.util.Objects;
import p826j6.AbstractC16142K;
import p826j6.C16139H;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Oa.m */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC6160m implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20048b;

    public /* synthetic */ ServiceConnectionC6160m(Object obj, int i10) {
        this.f20047a = i10;
        this.f20048b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder binder) {
        InterfaceC11959h c11951f;
        switch (this.f20047a) {
            case 0:
                C6161n c6161n = (C6161n) this.f20048b;
                c6161n.f20051b.m7758K("ServiceConnectionImpl.onServiceConnected(%s)", name);
                c6161n.m6717a().post(new C6159l(this, binder));
                return;
            case 1:
                AbstractC16544l.m18094g(name, "name");
                AbstractC16544l.m18094g(binder, "binder");
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26116Y;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18570i(new Object[0]);
                }
                C0326m c0326m = (C0326m) this.f20048b;
                c0326m.f1141c = ((BinderC6758b) binder).f21689a;
                synchronized (c0326m) {
                    try {
                        c0326m.f1139a = true;
                        Iterator it = ((LinkedHashSet) c0326m.f1142d).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC18770c) it.next()).resumeWith(C17296C.f55119a);
                        }
                        ((LinkedHashSet) c0326m.f1142d).clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 2:
                C8256h c8256h = (C8256h) this.f20048b;
                c8256h.f25744b.m5360c("ServiceConnectionImpl.onServiceConnected(%s)", name);
                c8256h.m8892a().post(new C7595d(this, binder));
                return;
            case 3:
                C9408b c9408b = (C9408b) this.f20048b;
                c9408b.f28368b.m10000b("ServiceConnectionImpl.onServiceConnected(%s)", name);
                c9408b.m9985a().post(new C6831d(this, binder));
                return;
            default:
                AbstractC11988o0.m13511f("BillingClientTesting", "Billing Override Service connected.");
                C16139H c16139h = (C16139H) this.f20048b;
                int i10 = AbstractBinderC11955g.f36264b;
                if (binder == null) {
                    c11951f = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    c11951f = iInterfaceQueryLocalInterface instanceof InterfaceC11959h ? (InterfaceC11959h) iInterfaceQueryLocalInterface : new C11951f(binder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 6);
                }
                c16139h.f50068H = c11951f;
                ((C16139H) this.f20048b).f50067G = 2;
                C16139H c16139h2 = (C16139H) this.f20048b;
                c16139h2.getClass();
                C11924X1 c11924x1M17719d = AbstractC16142K.m17719d(26);
                Objects.requireNonNull(c11924x1M17719d, YladLSetV.DQvTOuDJLJ);
                c16139h2.f50118g.m16155v(c11924x1M17719d);
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        int i10 = 1;
        switch (this.f20047a) {
            case 0:
                C6161n c6161n = (C6161n) this.f20048b;
                c6161n.f20051b.m7758K("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                c6161n.m6717a().post(new C6158k(this, i10));
                break;
            case 1:
                AbstractC16544l.m18094g(name, "name");
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26116Y;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18570i(new Object[0]);
                }
                C0326m c0326m = (C0326m) this.f20048b;
                c0326m.f1139a = false;
                c0326m.f1141c = null;
                break;
            case 2:
                C8256h c8256h = (C8256h) this.f20048b;
                c8256h.f25744b.m5360c("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                c8256h.m8892a().post(new C8255g(this, i10));
                break;
            case 3:
                C9408b c9408b = (C9408b) this.f20048b;
                c9408b.f28368b.m10000b("ServiceConnectionImpl.onServiceDisconnected(%s)", name);
                c9408b.m9985a().post(new C9407a(this, 0));
                break;
            default:
                AbstractC11988o0.m13512g("BillingClientTesting", "Billing Override Service disconnected.");
                ((C16139H) this.f20048b).f50068H = null;
                ((C16139H) this.f20048b).f50067G = 0;
                break;
        }
    }
}
