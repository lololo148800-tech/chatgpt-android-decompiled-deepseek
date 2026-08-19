package p071Ch;

import android.app.Application;
import gd.C13993t2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17629c;
import p033B5.InterfaceC0832p;
import p044Bh.InterfaceC1301n;
import p092Dc.C1991h;
import p097Dh.C2051d;
import p215Ic.C3688e;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p364Oh.C6226E;
import p432Rh.C6906s;
import p576Xe.C9473F;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Ch.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C1693x implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4802a;

    /* JADX INFO: renamed from: b */
    public final C4474e f4803b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f4804c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f4805d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f4806e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f4807f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f4808g;

    public C1693x(C4474e context, InterfaceC17068a experimentManager, InterfaceC4478i interfaceC4478i, InterfaceC17068a stringResolver, InterfaceC17068a layerManager, InterfaceC17068a imageLoader, int i10) {
        this.f4802a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(experimentManager, "experimentManager");
                AbstractC16544l.m18094g(stringResolver, "stringResolver");
                AbstractC16544l.m18094g(layerManager, "layerManager");
                AbstractC16544l.m18094g(imageLoader, "imageLoader");
                this.f4803b = context;
                this.f4804c = experimentManager;
                this.f4805d = interfaceC4478i;
                this.f4806e = stringResolver;
                this.f4807f = layerManager;
                this.f4808g = imageLoader;
                break;
            default:
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(experimentManager, "api");
                AbstractC16544l.m18094g(stringResolver, "persistentCookieStorage");
                AbstractC16544l.m18094g(layerManager, "servicesConfig");
                AbstractC16544l.m18094g(imageLoader, "scope");
                this.f4803b = context;
                this.f4804c = experimentManager;
                this.f4805d = interfaceC4478i;
                this.f4806e = stringResolver;
                this.f4807f = layerManager;
                this.f4808g = imageLoader;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f4802a) {
            case 0:
                Object obj = this.f4803b.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                Application application = (Application) obj;
                Object obj2 = this.f4804c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                C2051d c2051d = (C2051d) obj2;
                Object obj3 = this.f4805d.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                InterfaceC1301n interfaceC1301n = (InterfaceC1301n) obj3;
                Object obj4 = this.f4806e.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                C6906s c6906s = (C6906s) obj4;
                Object obj5 = this.f4807f.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                C6226E c6226e = (C6226E) obj5;
                Object obj6 = this.f4808g.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C1692w(application, c2051d, interfaceC1301n, c6906s, c6226e, (C17629c) obj6);
            default:
                Object obj7 = this.f4803b.f14617a;
                AbstractC16544l.m18093f(obj7, "get(...)");
                Application application2 = (Application) obj7;
                Object obj8 = this.f4804c.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj8;
                Object obj9 = this.f4805d.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                C9473F c9473f = (C9473F) obj9;
                Object obj10 = this.f4806e.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                C1991h c1991h = (C1991h) obj10;
                Object obj11 = this.f4807f.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                C13993t2 c13993t2 = (C13993t2) obj11;
                Object obj12 = this.f4808g.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C3688e(application2, interfaceC13849E, c9473f, c1991h, c13993t2, (InterfaceC0832p) obj12);
        }
    }
}
