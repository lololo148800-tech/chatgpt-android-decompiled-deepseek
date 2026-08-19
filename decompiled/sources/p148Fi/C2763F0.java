package p148Fi;

import android.app.Application;
import ci.C11759b;
import io.livekit.android.room.C15102a;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17629c;
import p025An.AbstractC0563B;
import p046Bk.C1342O;
import p071Ch.C1676g;
import p092Dc.C1991h;
import p1155zi.EnumC21895B;
import p151Fl.AbstractC2897c;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p273Kl.C4750V0;
import p273Kl.InterfaceC4766d;
import p336Nc.C5706b;
import p625Zh.C10396b;
import p708dh.C13149c;
import p708dh.C13167u;
import p728ei.C13406b;
import p948pi.C18422e;

/* JADX INFO: renamed from: Fi.F0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2763F0 implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8465a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f8466b;

    /* JADX INFO: renamed from: c */
    public final C4474e f8467c;

    public C2763F0(C4474e context, C1342O c1342o, InterfaceC4478i interfaceC4478i) {
        this.f8465a = 4;
        AbstractC16544l.m18094g(context, "context");
        this.f8467c = context;
        this.f8466b = interfaceC4478i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f8465a) {
            case 0:
                return new C2761E0((Application) this.f8467c.f14617a, (C17629c) this.f8466b.get());
            case 1:
                return new C15102a((C4750V0) this.f8466b.get(), (InterfaceC4766d) this.f8467c.f14617a, (AbstractC0563B) AbstractC2897c.f8708a.get());
            case 2:
                return new C5706b(EnumC21895B.f69419Z, (Application) this.f8467c.f14617a, (C1676g) this.f8466b.get());
            case 3:
                Object obj = this.f8467c.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f8466b.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C10396b((Application) obj, (C13406b) obj2);
            case 4:
                Object obj3 = this.f8467c.f14617a;
                AbstractC16544l.m18093f(obj3, "get(...)");
                EnumC21895B enumC21895B = EnumC21895B.f69419Z;
                Object obj4 = this.f8466b.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C11759b((Application) obj3, enumC21895B, (C1991h) obj4);
            default:
                Object obj5 = this.f8467c.f14617a;
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f8466b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C13149c((C18422e) obj5, (C13167u) obj6);
        }
    }

    public C2763F0(InterfaceC4478i interfaceC4478i, C4474e c4474e) {
        this.f8465a = 1;
        this.f8466b = interfaceC4478i;
        this.f8467c = c4474e;
    }

    public C2763F0(C4474e application, InterfaceC4478i interfaceC4478i, int i10) {
        this.f8465a = i10;
        switch (i10) {
            case 3:
                AbstractC16544l.m18094g(application, "application");
                this.f8467c = application;
                this.f8466b = interfaceC4478i;
                break;
            case 4:
            default:
                this.f8467c = application;
                this.f8466b = interfaceC4478i;
                break;
            case 5:
                AbstractC16544l.m18094g(application, "authSession");
                this.f8467c = application;
                this.f8466b = interfaceC4478i;
                break;
        }
    }

    public C2763F0(C1342O c1342o, C4474e c4474e, InterfaceC4478i interfaceC4478i) {
        this.f8465a = 2;
        this.f8467c = c4474e;
        this.f8466b = interfaceC4478i;
    }
}
