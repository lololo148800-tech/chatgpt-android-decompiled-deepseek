package p374P5;

import android.content.Context;
import android.javax.sip.C10808o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import gd.C13926d;
import gd.C13969n2;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.util.C15504i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0627n0;
import p033B5.C0838v;
import p334Na.AbstractC5695b;
import p334Na.C5697d;
import p334Na.C5698e;
import p334Na.C5700g;
import p349O0.C6016m0;
import p357Oa.C6161n;
import p357Oa.InterfaceC6150c;
import p378Pa.C6379a;
import p468T2.AbstractC7210b;
import p468T2.RunnableC7220l;
import p477Tb.C7296c;
import p523V9.AbstractC7854B5;
import p594Y9.AbstractC9753K;
import p746fa.AbstractC13600i;
import p746fa.C13599h;
import p746fa.C13606o;
import p869ld.C16843a;
import p893n.AbstractActivityC17375g;
import p960q9.C18655i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: P5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6358k implements InterfaceC6362o, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20693Y;

    /* JADX INFO: renamed from: Z */
    public final Object f20694Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f20695o0;

    public /* synthetic */ C6358k(Object obj, int i10, Object obj2) {
        this.f20693Y = i10;
        this.f20694Z = obj;
        this.f20695o0 = obj2;
    }

    @Override // p374P5.InterfaceC6362o
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo6969e() {
    }

    @Override // p374P5.InterfaceC6362o
    /* JADX INFO: renamed from: m */
    public void mo6970m() {
        ((AbstractC11105n) this.f20694Z).mo7808c(this);
    }

    @Override // p374P5.InterfaceC6362o
    /* JADX INFO: renamed from: n */
    public Object mo6971n(C0838v c0838v) throws Throwable {
        Object objM10354a = AbstractC9753K.m10354a((AbstractC11105n) this.f20694Z, c0838v);
        return objM10354a == EnumC19250a.f61036Y ? objM10354a : C17296C.f55119a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(InterfaceC11112u owner) {
        C10808o c10808o;
        C13606o c13606oM8116d;
        switch (this.f20693Y) {
            case 0:
                AbstractC11095d.m12153a(this, owner);
                return;
            case 1:
                AbstractC11095d.m12153a(this, owner);
                return;
            default:
                AbstractC16544l.m18094g(owner, "owner");
                AbstractActivityC17375g abstractActivityC17375g = owner instanceof AbstractActivityC17375g ? (AbstractActivityC17375g) owner : null;
                if (abstractActivityC17375g != null) {
                    int iIntValue = ((Number) ((C13969n2) this.f20694Z).m15477a(C13926d.f43976d)).intValue();
                    synchronized (AbstractC5695b.class) {
                        try {
                            if (AbstractC5695b.f18467a == null) {
                                Context applicationContext = abstractActivityC17375g.getApplicationContext();
                                if (applicationContext == null) {
                                    applicationContext = abstractActivityC17375g;
                                }
                                AbstractC5695b.f18467a = new C10808o(new C18655i(applicationContext, 14));
                            }
                            c10808o = AbstractC5695b.f18467a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C5697d c5697d = (C5697d) ((InterfaceC6150c) c10808o.f32040Z).mo3914a();
                    AbstractC16544l.m18093f(c5697d, "create(...)");
                    String packageName = c5697d.f18469b.getPackageName();
                    C7296c c7296c = C5700g.f18478e;
                    C5700g c5700g = c5697d.f18468a;
                    C6161n c6161n = c5700g.f18480a;
                    if (c6161n == null) {
                        Object[] objArr = {-9};
                        c7296c.getClass();
                        if (Log.isLoggable("PlayCore", 6)) {
                            AbstractC15256t.m16465c("PlayCore", C7296c.m7748L((String) c7296c.f23104Z, "onError(%d)", objArr));
                        }
                        c13606oM8116d = AbstractC7854B5.m8116d(new C6379a(-9));
                    } else {
                        c7296c.m7758K("requestUpdateInfo(%s)", packageName);
                        C13599h c13599h = new C13599h();
                        c6161n.m6717a().post(new C5698e(c6161n, c13599h, c13599h, new C5698e(c5700g, c13599h, packageName, c13599h)));
                        c13606oM8116d = c13599h.f42961a;
                    }
                    AbstractC16544l.m18093f(c13606oM8116d, "getAppUpdateInfo(...)");
                    c13606oM8116d.m15124c(new C16843a(this));
                    c13606oM8116d.m15126e(AbstractC13600i.f42962a, new C15504i(new C6016m0(iIntValue, this, c5697d, abstractActivityC17375g), 4));
                    return;
                }
                return;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC11112u interfaceC11112u) {
        switch (this.f20693Y) {
            case 0:
                ((InterfaceC0627n0) this.f20695o0).mo1275e(null);
                break;
            case 1:
                AbstractC11095d.m12154b(this, interfaceC11112u);
                break;
            default:
                AbstractC11095d.m12154b(this, interfaceC11112u);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f20693Y;
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC11112u interfaceC11112u) {
        switch (this.f20693Y) {
            case 0:
                AbstractC11095d.m12156d(this, interfaceC11112u);
                break;
            case 1:
                ((EmojiCompatInitializer) this.f20695o0).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC7210b.m7601a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC7220l(0), 500L);
                ((AbstractC11105n) this.f20694Z).mo7808c(this);
                break;
            default:
                AbstractC11095d.m12156d(this, interfaceC11112u);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f20693Y;
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f20693Y;
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }

    @Override // p374P5.InterfaceC6362o
    public void start() {
        ((AbstractC11105n) this.f20694Z).mo7806a(this);
    }

    public C6358k(EmojiCompatInitializer emojiCompatInitializer, AbstractC11105n abstractC11105n) {
        this.f20693Y = 1;
        this.f20695o0 = emojiCompatInitializer;
        this.f20694Z = abstractC11105n;
    }
}
