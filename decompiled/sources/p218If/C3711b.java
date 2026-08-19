package p218If;

import android.app.Application;
import gd.C13993t2;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import p1081wc.InterfaceC20904w;
import p220Ih.C3720b;
import p220Ih.InterfaceC3721c;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p269Kh.C4676c;
import p337Nd.C5710c;
import p364Oh.C6226E;
import p405Qf.C6689d;
import p750fe.C13629a;
import p787he.C14473b0;
import p836jh.C16210b;
import p876lm.InterfaceC17068a;
import p925oe.C18077B;
import p925oe.C18095U;
import p948pi.C18418a;
import sk.C19662a;
import vi.C20620b;

/* JADX INFO: renamed from: If.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3711b implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11259a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f11260b;

    /* JADX INFO: renamed from: c */
    public final C4474e f11261c;

    public C3711b(C4474e context, InterfaceC17068a layerManager, int i10) {
        this.f11259a = i10;
        switch (i10) {
            case 2:
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(layerManager, "layerManager");
                this.f11261c = context;
                this.f11260b = layerManager;
                break;
            case 3:
            default:
                AbstractC16544l.m18094g(context, "conversationInfo");
                AbstractC16544l.m18094g(layerManager, "analyticsService");
                this.f11261c = context;
                this.f11260b = layerManager;
                break;
            case 4:
                AbstractC16544l.m18094g(context, "accountSession");
                AbstractC16544l.m18094g(layerManager, "servicesConfig");
                this.f11261c = context;
                this.f11260b = layerManager;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f11259a) {
            case 0:
                Object obj = this.f11261c.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f11260b.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C3710a((C5710c) obj, (InterfaceC20904w) obj2);
            case 1:
                Object obj3 = this.f11260b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f11261c.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                C19662a c19662a = new C19662a(C4676c.Companion.serializer());
                C3720b c3720b = InterfaceC3721c.f11274a;
                boolean zM22325d = ((C18418a) obj4).f58774b.m22325d();
                c3720b.getClass();
                return new C6689d((C20620b) obj3, "models", c19662a, C3720b.m4419a(zM22325d));
            case 2:
                Object obj5 = this.f11261c.f14617a;
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f11260b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C13629a((Application) obj5, (C13993t2) obj6);
            case 3:
                Object obj7 = this.f11260b.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f11261c.f14617a;
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C14473b0((C18077B) obj7, (C17627a) obj8);
            case 4:
                Object obj9 = this.f11261c.f14617a;
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = this.f11260b.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C16210b((C18418a) obj9, (C6226E) obj10);
            default:
                Object obj11 = this.f11260b.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = this.f11261c.f14617a;
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C18095U((Application) obj12, (InterfaceC20904w) obj11);
        }
    }

    public C3711b(InterfaceC17068a repository, C4474e accountUserCoroutineScope, int i10) {
        this.f11259a = i10;
        switch (i10) {
            case 3:
                AbstractC16544l.m18094g(repository, "repository");
                AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
                this.f11260b = repository;
                this.f11261c = accountUserCoroutineScope;
                break;
            case 4:
            default:
                AbstractC16544l.m18094g(repository, "dependencies");
                AbstractC16544l.m18094g(accountUserCoroutineScope, "accountSession");
                this.f11260b = repository;
                this.f11261c = accountUserCoroutineScope;
                break;
            case 5:
                AbstractC16544l.m18094g(repository, "analyticsService");
                AbstractC16544l.m18094g(accountUserCoroutineScope, "context");
                this.f11260b = repository;
                this.f11261c = accountUserCoroutineScope;
                break;
        }
    }
}
