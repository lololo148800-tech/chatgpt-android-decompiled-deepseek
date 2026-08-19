package p071Ch;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p072Ci.C1705j;
import p072Ci.EnumC1696a;
import p1081wc.C20865K;
import p1081wc.C20879Z;
import p1081wc.C20881a0;
import p1081wc.C20884c;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p364Oh.C6226E;
import p364Oh.InterfaceC6247u;
import p409Qk.C6752c;
import p432Rh.C6888a;
import p432Rh.C6889b;
import p432Rh.C6892e;
import p432Rh.C6895h;
import p432Rh.C6901n;
import p481Tf.C7401f;
import p481Tf.C7409n;
import p625Zh.C10396b;
import p708dh.C13132J;
import p708dh.C13134L;
import p708dh.C13135M;
import p854kf.C16385c;
import p854kf.C16390h;
import p854kf.C16391i;
import p876lm.InterfaceC17068a;
import p900n6.C17507d;
import p905nd.C17570C;
import sk.C19662a;
import vi.C20620b;

/* JADX INFO: renamed from: Ch.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C1685p implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4766a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f4767b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f4768c;

    public C1685p(InterfaceC4478i interfaceC4478i, InterfaceC17068a networkErrorMapper, int i10) {
        this.f4766a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(networkErrorMapper, "networkErrorMapper");
                this.f4767b = interfaceC4478i;
                this.f4768c = networkErrorMapper;
                break;
            case 5:
                AbstractC16544l.m18094g(networkErrorMapper, "networkErrorMapper");
                this.f4767b = interfaceC4478i;
                this.f4768c = networkErrorMapper;
                break;
            case 6:
                AbstractC16544l.m18094g(networkErrorMapper, "connectivityChecker");
                this.f4767b = interfaceC4478i;
                this.f4768c = networkErrorMapper;
                break;
            default:
                AbstractC16544l.m18094g(networkErrorMapper, "servicesConfig");
                this.f4767b = interfaceC4478i;
                this.f4768c = networkErrorMapper;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f4766a) {
            case 0:
                Object obj = this.f4767b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f4768c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C1684o((C1692w) obj, (C6226E) obj2);
            case 1:
                Object obj3 = this.f4767b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f4768c.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C6888a((C17507d) obj3, (InterfaceC6247u) obj4);
            case 2:
                Object obj5 = this.f4768c.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f4767b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C6889b((C6752c) obj5, (InterfaceC6247u) obj6);
            case 3:
                Object obj7 = this.f4768c.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f4767b.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C6892e((InterfaceC6247u) obj7, (C17570C) obj8);
            case 4:
                Object obj9 = this.f4768c.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = this.f4767b.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C6895h((C6752c) obj9, (InterfaceC6247u) obj10);
            case 5:
                Object obj11 = this.f4767b.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = this.f4768c.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C6901n((C6752c) obj11, (InterfaceC6247u) obj12);
            case 6:
                Object obj13 = this.f4767b.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                Object obj14 = this.f4768c.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                return new C7409n((C7401f) obj13, (C10396b) obj14);
            case 7:
                Object obj15 = this.f4768c.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                C20620b c20620b = (C20620b) obj15;
                Object obj16 = this.f4767b.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                C13135M c13135m = new C13135M(c20620b, "user_settings", new C19662a(C1705j.Companion.serializer()), new C1705j(false, null, EnumC1696a.System, false, false, false, false, false, false, false, false, false, false, false, false, false, null, true, false, false, false));
                AbstractC0575H.m1156D(c20620b.f65455b, null, null, new C13134L(c13135m, (C13132J) obj16, null), 3);
                return c13135m;
            case 8:
                Object obj17 = this.f4768c.get();
                AbstractC16544l.m18093f(obj17, "get(...)");
                Object obj18 = this.f4767b.get();
                AbstractC16544l.m18093f(obj18, "get(...)");
                return new C16390h((C16385c) obj17, (C16391i) obj18);
            case 9:
                Object obj19 = this.f4768c.get();
                AbstractC16544l.m18093f(obj19, "get(...)");
                Object obj20 = this.f4767b.get();
                AbstractC16544l.m18093f(obj20, "get(...)");
                return new C20865K((C20881a0) obj19, (C20879Z) obj20);
            default:
                Object obj21 = this.f4768c.get();
                AbstractC16544l.m18093f(obj21, "get(...)");
                Object obj22 = this.f4767b.get();
                AbstractC16544l.m18093f(obj22, "get(...)");
                return new C20865K((C20881a0) obj21, (C20879Z) obj22);
        }
    }

    public C1685p(InterfaceC17068a networkErrorMapper, InterfaceC4478i interfaceC4478i, int i10) {
        this.f4766a = i10;
        switch (i10) {
            case 3:
                AbstractC16544l.m18094g(networkErrorMapper, "networkErrorMapper");
                this.f4768c = networkErrorMapper;
                this.f4767b = interfaceC4478i;
                break;
            case 4:
                AbstractC16544l.m18094g(networkErrorMapper, "httpClient");
                this.f4768c = networkErrorMapper;
                this.f4767b = interfaceC4478i;
                break;
            case 5:
            case 6:
            default:
                AbstractC16544l.m18094g(networkErrorMapper, "httpClient");
                this.f4768c = networkErrorMapper;
                this.f4767b = interfaceC4478i;
                break;
            case 7:
                AbstractC16544l.m18094g(networkErrorMapper, "dependencies");
                this.f4768c = networkErrorMapper;
                this.f4767b = interfaceC4478i;
                break;
            case 8:
                AbstractC16544l.m18094g(networkErrorMapper, "api");
                this.f4768c = networkErrorMapper;
                this.f4767b = interfaceC4478i;
                break;
        }
    }

    public C1685p(C20884c c20884c, InterfaceC17068a statsigService, InterfaceC4478i interfaceC4478i) {
        this.f4766a = 9;
        AbstractC16544l.m18094g(statsigService, "statsigService");
        this.f4768c = statsigService;
        this.f4767b = interfaceC4478i;
    }

    public C1685p(C20884c c20884c, InterfaceC17068a statsigService, InterfaceC4478i interfaceC4478i, byte b) {
        this.f4766a = 10;
        AbstractC16544l.m18094g(statsigService, "statsigService");
        this.f4768c = statsigService;
        this.f4767b = interfaceC4478i;
    }
}
