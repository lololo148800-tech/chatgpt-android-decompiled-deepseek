package p580Xi;

import ao.C11164g;
import bo.AbstractC11516d;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8130l0;
import p530Vi.C8304L;
import p530Vi.C8312h;
import p530Vi.EnumC8319o;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p594Y9.AbstractC9804S3;
import p646aj.AbstractC10628h;

/* JADX INFO: renamed from: Xi.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C9522h implements InterfaceC8882i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28658Y;

    /* JADX INFO: renamed from: Z */
    public C8312h f28659Z;

    public /* synthetic */ C9522h(int i10) {
        this.f28658Y = i10;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: a */
    public final AbstractC12774a mo7802a(AbstractC12774a abstractC12774a) {
        switch (this.f28658Y) {
            case 0:
                if (abstractC12774a.getF40475c() == EnumC8319o.f25938q0) {
                    mo7804c().f25906q0.f25879b = abstractC12774a.getF40473a();
                    C8312h c8312hMo7804c = mo7804c();
                    String strMo14506c = abstractC12774a.mo14506c();
                    C8304L c8304l = c8312hMo7804c.f25906q0;
                    c8304l.getClass();
                    c8304l.f25878a = strMo14506c;
                    mo7804c().f25906q0.f25880c = ((IdentifyEvent) abstractC12774a).f40474b;
                } else if (abstractC12774a.getF40475c() != EnumC8319o.f25937p0) {
                    if (mo7804c().f25906q0.f25879b != null) {
                        abstractC12774a.mo14519p(String.valueOf(mo7804c().f25906q0.f25879b));
                    }
                    if (mo7804c().f25906q0.f25878a != null) {
                        abstractC12774a.mo14514k(mo7804c().f25906q0.f25878a.toString());
                    }
                } else {
                    C8312h c8312hMo7804c2 = mo7804c();
                    String strMo14506c2 = abstractC12774a.mo14506c();
                    C8304L c8304l2 = c8312hMo7804c2.f25906q0;
                    c8304l2.getClass();
                    c8304l2.f25878a = strMo14506c2;
                }
                break;
            default:
                if (!abstractC12774a.mo14508e().containsKey("Segment.io")) {
                    AbstractC11516d.f34842d.getClass();
                    C11164g c11164g = C11164g.f33804a;
                    AbstractC8130l0.m8650e(abstractC12774a);
                } else {
                    Boolean boolM10999a = AbstractC10628h.m10999a("Segment.io", abstractC12774a.mo14508e());
                    if (boolM10999a != null && !boolM10999a.booleanValue()) {
                        AbstractC11516d.f34842d.getClass();
                        C11164g c11164g2 = C11164g.f33804a;
                        AbstractC8130l0.m8650e(abstractC12774a);
                    }
                }
                break;
        }
        return abstractC12774a;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: b */
    public final void mo7803b(Settings settings, int i10) {
        switch (this.f28658Y) {
            case 0:
                AbstractC9804S3.m10428b(settings, i10);
                break;
            default:
                AbstractC9804S3.m10428b(settings, i10);
                break;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: c */
    public final C8312h mo7804c() {
        switch (this.f28658Y) {
            case 0:
                C8312h c8312h = this.f28659Z;
                if (c8312h != null) {
                    return c8312h;
                }
                AbstractC16544l.m18103p("analytics");
                throw null;
            default:
                C8312h c8312h2 = this.f28659Z;
                if (c8312h2 != null) {
                    return c8312h2;
                }
                AbstractC16544l.m18103p("analytics");
                throw null;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: d */
    public final void mo7805d(C8312h c8312h) {
        switch (this.f28658Y) {
            case 0:
                m10028e(c8312h);
                break;
            default:
                m10028e(c8312h);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10028e(C8312h c8312h) {
        switch (this.f28658Y) {
            case 0:
                this.f28659Z = c8312h;
                break;
            default:
                this.f28659Z = c8312h;
                break;
        }
    }

    @Override // p554Wi.InterfaceC8882i
    public final EnumC8881h getType() {
        switch (this.f28658Y) {
            case 0:
                return EnumC8881h.f27183Y;
            default:
                return EnumC8881h.f27184Z;
        }
    }
}
