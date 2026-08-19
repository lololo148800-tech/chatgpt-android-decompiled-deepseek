package p221Ii;

import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import p099Dj.C2064b;
import p103Dn.C2153Q0;
import p1156zj.C22170l;
import p329N3.RunnableC5611a;
import p647ak.C10713l;
import p665bk.C11480a;
import p728ei.C13406b;
import p741f5.RunnableC13542a;
import p838jj.C16231l;
import p841k.C16288h;

/* JADX INFO: renamed from: Ii.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3727f implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11310Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f11311Z;

    public /* synthetic */ C3727f(Object obj, int i10) {
        this.f11310Y = i10;
        this.f11311Z = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f11310Y;
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC11112u owner) {
        switch (this.f11310Y) {
            case 0:
                AbstractC11095d.m12154b(this, owner);
                break;
            case 1:
                AbstractC11095d.m12154b(this, owner);
                break;
            case 2:
                AbstractC11095d.m12154b(this, owner);
                break;
            case 3:
                AbstractC16544l.m18094g(owner, "owner");
                ((C16231l) this.f11311Z).m17808a();
                break;
            case 4:
                AbstractC16544l.m18094g(owner, "owner");
                ((C16288h) this.f11311Z).m17824d();
                owner.mo7809i().mo7808c(this);
                break;
            case 5:
                AbstractC16544l.m18094g(owner, "owner");
                ((ExecutorService) this.f11311Z).shutdown();
                break;
            default:
                AbstractC11095d.m12154b(this, owner);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        int i10 = this.f11310Y;
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC11112u owner) {
        switch (this.f11310Y) {
            case 0:
                AbstractC11095d.m12156d(this, owner);
                break;
            case 1:
                AbstractC16544l.m18094g(owner, "owner");
                C10713l c10713l = (C10713l) this.f11311Z;
                C11480a c11480a = c10713l.f31833a;
                c11480a.f34719a.post(new RunnableC5611a(c10713l, 21));
                break;
            case 2:
                AbstractC11095d.m12156d(this, owner);
                break;
            case 3:
                AbstractC11095d.m12156d(this, owner);
                break;
            case 4:
                AbstractC11095d.m12156d(this, owner);
                break;
            case 5:
                AbstractC11095d.m12156d(this, owner);
                break;
            default:
                AbstractC16544l.m18094g(owner, "owner");
                C22170l c22170l = (C22170l) this.f11311Z;
                C2064b c2064b = c22170l.f70151a;
                c2064b.f6291a.post(new RunnableC13542a(c22170l, 15));
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC11112u owner) {
        switch (this.f11310Y) {
            case 0:
                AbstractC16544l.m18094g(owner, "owner");
                ((C3725d) this.f11311Z).setUpdateContinuously(false);
                break;
            case 1:
                AbstractC11095d.m12158f(this, owner);
                break;
            case 2:
                AbstractC16544l.m18094g(owner, "owner");
                C2153Q0 c2153q0 = ((C13406b) this.f11311Z).f42467a;
                Boolean bool = Boolean.FALSE;
                c2153q0.getClass();
                c2153q0.m3251l(null, bool);
                break;
            case 3:
                AbstractC11095d.m12158f(this, owner);
                break;
            case 4:
                AbstractC11095d.m12158f(this, owner);
                break;
            case 5:
                AbstractC11095d.m12158f(this, owner);
                break;
            default:
                AbstractC11095d.m12158f(this, owner);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC11112u owner) {
        switch (this.f11310Y) {
            case 0:
                AbstractC16544l.m18094g(owner, lZYtIbClQJm.tRNYAFmjeLlmGc);
                ((C3725d) this.f11311Z).setUpdateContinuously(true);
                break;
            case 1:
                AbstractC11095d.m12157e(this, owner);
                break;
            case 2:
                AbstractC16544l.m18094g(owner, "owner");
                C2153Q0 c2153q0 = ((C13406b) this.f11311Z).f42467a;
                Boolean bool = Boolean.TRUE;
                c2153q0.getClass();
                c2153q0.m3251l(null, bool);
                break;
            case 3:
                AbstractC11095d.m12157e(this, owner);
                break;
            case 4:
                AbstractC11095d.m12157e(this, owner);
                break;
            case 5:
                AbstractC11095d.m12157e(this, owner);
                break;
            default:
                AbstractC11095d.m12157e(this, owner);
                break;
        }
    }
}
