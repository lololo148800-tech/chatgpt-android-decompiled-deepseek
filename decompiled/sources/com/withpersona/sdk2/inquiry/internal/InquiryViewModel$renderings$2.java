package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModelKt;
import bj.C11447L;
import ck.C11773j;
import dk.C13181c;
import fj.C13676h;
import fk.C13686g;
import fo.C13711h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mk.C17282c;
import p021Aj.C0526k;
import p025An.AbstractC0575H;
import p045Bj.C1313k;
import p046Bk.C1326G;
import p046Bk.C1360X0;
import p046Bk.C1379e1;
import p046Bk.C1420z;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1747o;
import p086D6.C1970n;
import p1009s9.C19506i;
import p100Dk.InterfaceC2094u;
import p103Dn.AbstractC2124C;
import p103Dn.C2133G0;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2211v0;
import p1044uj.C20334f;
import p1044uj.C20359r0;
import p1070w.C20694c;
import p1087wj.InterfaceC20971B;
import p110E4.C2307e;
import p1131yj.InterfaceC21546a;
import p1156zj.C22102I;
import p1156zj.C22107K0;
import p117Eb.C2391u;
import p125Ej.C2563g;
import p126Ek.InterfaceC2568a;
import p149Fj.C2892z;
import p149Fj.InterfaceC2881o;
import p174Gk.uSfJ.HpucjswO;
import p223Ik.InterfaceC3740a;
import p247Jj.C4373B;
import p247Jj.C4390J0;
import p247Jj.C4432h;
import p247Jj.C4456t;
import p247Jj.InterfaceC4441l0;
import p248Jk.C4472c;
import p248Jk.InterfaceC4478i;
import p320Mj.C5461n;
import p342Nj.InterfaceC5816j;
import p361Oe.C6179f;
import p385Pj.C6435j;
import p408Qj.C6749o;
import p508Uj.C7704l;
import p531Vj.C8361c0;
import p544W9.AbstractC8446A2;
import p544W9.AbstractC8452B2;
import p588Y2.C9642z;
import p603Yj.C10069b;
import p604Yk.C10077b;
import p647ak.C10633B;
import p647ak.C10645H;
import p647ak.C10696e1;
import p658b5.C11234e;
import p658b5.C11238i;
import p658b5.C11242m;
import p658b5.C11248s;
import p720e6.C13287b;
import p720e6.C13288c;
import p729ej.C13414e;
import p729ej.C13415f;
import p729ej.C13416g;
import p729ej.C13417h;
import p769gj.C14160b;
import p769gj.C14175q;
import p770gk.InterfaceC14185a;
import p813ij.C15026j;
import p814ik.C15033e;
import p839jk.C16251h;
import p841k.AbstractC16283c;
import p856kk.C16433a;
import p864l5.InterfaceC16818e;
import p902n8.C17514a;
import p949pj.C18433F;
import p949pj.C18470i0;
import p956q3.C18621a;
import p960q9.C18655i;
import p972qm.InterfaceC18770c;
import p993rj.C19026F;
import sj.C19661b;
import sm.InterfaceC19693i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LDn/O0;", "", "invoke", "()LDn/O0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
public final class InquiryViewModel$renderings$2 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InquiryViewModel f40730Y;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$renderings$2$1 */
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    final /* synthetic */ class C128621 extends AbstractC16541i implements InterfaceC1439n, InterfaceC19693i {
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((InterfaceC1747o) this.receiver).mo2523o((InterfaceC4441l0) obj, (InterfaceC18770c) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryViewModel$renderings$2(InquiryViewModel inquiryViewModel) {
        super(0);
        this.f40730Y = inquiryViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C14175q c14175q;
        InquiryViewModel inquiryViewModel = this.f40730Y;
        C4456t c4456t = inquiryViewModel.f40709c;
        if (c4456t == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C11234e c11234e = new C11234e((InterfaceC5816j) c4456t.f14566s.get(), (C5461n) c4456t.f14570u.get());
        InterfaceC5816j service = (InterfaceC5816j) c4456t.f14566s.get();
        C15033e deviceIdProvider = (C15033e) c4456t.f14572v.get();
        C5461n fallbackModeManager = (C5461n) c4456t.f14570u.get();
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(deviceIdProvider, "deviceIdProvider");
        AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
        C11242m c11242m = new C11242m();
        c11242m.f34018Y = service;
        c11242m.f34019Z = deviceIdProvider;
        c11242m.f34020o0 = fallbackModeManager;
        C4432h c4432h = (C4432h) c4456t.f14574w.f14617a;
        InterfaceC5816j service2 = (InterfaceC5816j) c4456t.f14566s.get();
        AbstractC16544l.m18094g(service2, "service");
        C13288c c13288c = new C13288c();
        c13288c.f42001Y = service2;
        C13287b c13287b = c4456t.f14530a;
        Context contextM5169a = C4373B.m5169a(c13287b);
        InterfaceC16818e interfaceC16818e = (InterfaceC16818e) c4456t.f14576x.get();
        C2892z c2892z = (C2892z) c4456t.f14509F.f14617a;
        C6435j c6435j = new C6435j((AbstractC16283c) c4456t.f14510G.get(), C4373B.m5169a(c13287b));
        C2391u c2391u = new C2391u(C4373B.m5169a(c13287b), (C18433F) c4456t.f14512I.f14617a, (C19026F) c4456t.f14514K.f14617a, (C17282c) c4456t.f14516M.get());
        Context contextM5169a2 = C4373B.m5169a(c13287b);
        C18433F cameraXControllerFactory = (C18433F) c4456t.f14512I.f14617a;
        C19026F c19026f = (C19026F) c4456t.f14514K.f14617a;
        C17282c navigationStateManager = (C17282c) c4456t.f14516M.get();
        AbstractC16544l.m18094g(cameraXControllerFactory, "cameraXControllerFactory");
        AbstractC16544l.m18094g(c19026f, HpucjswO.loQq);
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        C11238i c11238i = new C11238i();
        c11238i.f34008Y = contextM5169a2;
        c11238i.f34009Z = cameraXControllerFactory;
        c11238i.f34010o0 = c19026f;
        c11238i.f34011p0 = navigationStateManager;
        C1313k c1313k = new C1313k(C4373B.m5169a(c13287b), c4456t.m5203a(), (C22102I) c4456t.f14522S.f14617a, (C2563g) c4456t.f14524U.f14617a, new C13288c((InterfaceC2568a) c4456t.f14525V.get()), (C18433F) c4456t.f14512I.f14617a, (C19026F) c4456t.f14514K.f14617a, (C17282c) c4456t.f14516M.get());
        C11248s c11248s = new C11248s((InterfaceC2881o) c4456t.f14578y.get(), (C16433a) c4456t.f14505B.get());
        C0526k c0526k = new C0526k((C17282c) c4456t.f14516M.get());
        InterfaceC4478i interfaceC4478iM9063b = AbstractC8452B2.m9063b(c4456t.f14506C);
        Object obj = (interfaceC4478iM9063b instanceof InterfaceC3740a ? (InterfaceC3740a) interfaceC4478iM9063b : new C4472c(interfaceC4478iM9063b)).get();
        AbstractC16544l.m18093f(obj, "get(...)");
        C22107K0 c22107k0 = new C22107K0(contextM5169a, interfaceC16818e, c2892z, c6435j, c2391u, c11238i, c1313k, c11248s, c0526k, (C19661b) obj, (C17282c) c4456t.f14516M.get(), (C16251h) c4456t.f14526W.get());
        Context contextM5169a3 = C4373B.m5169a(c13287b);
        C11773j c11773j = (C11773j) c4456t.f14529Z.f14617a;
        C13288c c13288c2 = new C13288c((InterfaceC2568a) c4456t.f14525V.get());
        C10633B c10633b = (C10633B) c4456t.f14537d0.f14617a;
        C10645H c10645h = new C10645H(new C18470i0(new C17514a(1), (InterfaceC2211v0) c4456t.f14531a0.get()));
        C8361c0 c8361c0M5203a = c4456t.m5203a();
        C13181c c13181c = new C13181c(C4373B.m5169a(c13287b), (C18433F) c4456t.f14512I.f14617a, (C19026F) c4456t.f14514K.f14617a, (C17282c) c4456t.f14516M.get());
        C18433F c18433f = (C18433F) c4456t.f14512I.f14617a;
        C19026F c19026f2 = (C19026F) c4456t.f14514K.f14617a;
        InterfaceC4478i interfaceC4478iM9063b2 = AbstractC8452B2.m9063b(c4456t.f14506C);
        Object obj2 = (interfaceC4478iM9063b2 instanceof InterfaceC3740a ? (InterfaceC3740a) interfaceC4478iM9063b2 : new C4472c(interfaceC4478iM9063b2)).get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C10696e1 c10696e1 = new C10696e1(contextM5169a3, c11773j, c13288c2, c10633b, c10645h, c8361c0M5203a, c13181c, c18433f, c19026f2, (C19661b) obj2, (C17282c) c4456t.f14516M.get(), (C16251h) c4456t.f14526W.get());
        Context contextM5169a4 = C4373B.m5169a(c13287b);
        InterfaceC2094u uiService = (InterfaceC2094u) c4456t.f14539e0.get();
        C11447L moshi = (C11447L) c4456t.f14542g.get();
        InterfaceC14185a interfaceC14185a = (InterfaceC14185a) c4456t.f14532b.f29833Z;
        AbstractC8446A2.m9048a(interfaceC14185a);
        InterfaceC21546a fallbackModeManager2 = (InterfaceC21546a) c4456t.f14504A.get();
        AbstractC16544l.m18094g(uiService, "uiService");
        AbstractC16544l.m18094g(moshi, "moshi");
        AbstractC16544l.m18094g(fallbackModeManager2, "fallbackModeManager");
        C11238i c11238i2 = new C11238i();
        c11238i2.f34008Y = uiService;
        c11238i2.f34009Z = moshi;
        c11238i2.f34010o0 = interfaceC14185a;
        c11238i2.f34011p0 = fallbackModeManager2;
        C1360X0 c1360x0 = new C1360X0(contextM5169a4, c11238i2, new C7704l((AbstractC16283c) c4456t.f14541f0.get(), C4373B.m5169a(c13287b)), (C1326G) c4456t.f14547i0.f14617a, (C1379e1) c4456t.f14551k0.f14617a, (C17282c) c4456t.f14516M.get(), c4456t.m5203a(), new C1420z(new C18655i((InterfaceC2094u) c4456t.f14539e0.get()), new C19506i((InterfaceC2094u) c4456t.f14539e0.get())), (C16251h) c4456t.f14526W.get());
        InterfaceC16818e interfaceC16818e2 = (InterfaceC16818e) c4456t.f14576x.get();
        Context contextM5169a5 = C4373B.m5169a(c13287b);
        C8361c0 c8361c0M5203a2 = c4456t.m5203a();
        C20334f c20334f = new C20334f((AbstractC16283c) c4456t.f14553l0.get(), C4373B.m5169a(c13287b));
        C13711h c13711h = new C13711h((AbstractC16283c) c4456t.f14555m0.get(), (AbstractC16283c) c4456t.f14557n0.get(), C4373B.m5169a(c13287b));
        C13414e c13414e = new C13414e((InterfaceC20971B) c4456t.f14559o0.get());
        C9642z c9642z = new C9642z((InterfaceC20971B) c4456t.f14559o0.get());
        InterfaceC20971B service3 = (InterfaceC20971B) c4456t.f14559o0.get();
        C13686g fileHelper = (C13686g) c4456t.f14561p0.get();
        AbstractC16544l.m18094g(service3, "service");
        AbstractC16544l.m18094g(fileHelper, "fileHelper");
        C15026j c15026j = new C15026j();
        c15026j.f46724Y = service3;
        c15026j.f46725Z = fileHelper;
        C10077b c10077b = new C10077b((InterfaceC20971B) c4456t.f14559o0.get());
        InterfaceC20971B interfaceC20971B = (InterfaceC20971B) c4456t.f14559o0.get();
        InterfaceC21546a interfaceC21546a = (InterfaceC21546a) c4456t.f14504A.get();
        AbstractC8446A2.m9048a(interfaceC14185a);
        C6749o c6749o = new C6749o(new C4390J0(c11234e, c11242m, c4432h, c13288c, c22107k0, c10696e1, c1360x0, new C20359r0(interfaceC16818e2, contextM5169a5, c8361c0M5203a2, c20334f, c13711h, c13414e, c9642z, c15026j, c10077b, new C20694c(interfaceC20971B, interfaceC21546a, interfaceC14185a), (C17282c) c4456t.f14516M.get(), (C16251h) c4456t.f14526W.get()), (C10069b) c4456t.f14548j.get(), (C2307e) c4456t.f14534c.f47885Y, (C17282c) c4456t.f14516M.get(), (C16251h) c4456t.f14526W.get()));
        C18621a c18621aM12143a = ViewModelKt.m12143a(inquiryViewModel);
        C2153Q0 c2153q0 = inquiryViewModel.f40710d;
        if (c2153q0 == null) {
            AbstractC16544l.m18103p("props");
            throw null;
        }
        C128621 c128621 = new C128621(2, 0, InterfaceC1747o.class, inquiryViewModel.f40711e, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        C11082S c11082s = inquiryViewModel.f40708b;
        C2391u c2391u2 = new C2391u(c18621aM12143a, c6749o, c2153q0, (c11082s == null || (c14175q = (C14175q) c11082s.m12131b("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : c14175q.f44561Y, C13415f.f42491a);
        C13676h c13676h = (C13676h) c2391u2.f7432q0;
        try {
            C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(new C13417h(c13676h.m15164b(c6749o, c2391u2.f7430o0), c13676h.m15165c(c6749o)));
            AbstractC0575H.m1156D(c18621aM12143a, null, null, new C13416g(c2391u2, c2153q0M3204c, c128621, null), 3);
            return AbstractC2124C.m3198B(new C6179f(new C1970n(c2153q0M3204c, 5, new C14160b(c11082s, null)), 1), c18621aM12143a, C2133G0.f6536a, ((C13417h) c2153q0M3204c.getValue()).f42497a);
        } catch (Throwable th2) {
            CancellationException cancellationExceptionM1172a = th2 instanceof CancellationException ? th2 : null;
            if (cancellationExceptionM1172a == null) {
                cancellationExceptionM1172a = AbstractC0575H.m1172a("Workflow runtime failed", th2);
            }
            AbstractC0575H.m1181j(c13676h.f43163q0, cancellationExceptionM1172a);
            throw th2;
        }
    }
}
