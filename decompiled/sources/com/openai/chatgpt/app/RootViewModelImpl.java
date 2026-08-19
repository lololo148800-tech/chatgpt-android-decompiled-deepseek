package com.openai.chatgpt.app;

import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.lifecycle.ViewModelKt;
import com.openai.feature.rootviewmodel.RootViewModel;
import com.openai.viewmodel.ViewModelFactoryProvider;
import com.squareup.anvil.annotations.ContributesBinding;
import gd.C13850E0;
import gd.C14005w2;
import gd.EnumC13846D;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p092Dc.C1996m;
import p092Dc.C2005v;
import p092Dc.C2007x;
import p096Dg.C2046c;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1026ti.C19995a;
import p1026ti.C19996b;
import p1026ti.InterfaceC19998d;
import p103Dn.AbstractC2124C;
import p103Dn.C2217y0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1149zc.AbstractC21864z;
import p1153zg.C21889f;
import p1155zi.AbstractC21933K1;
import p1155zi.EnumC21895B;
import p122Eg.C2435d;
import p129En.AbstractC2592c;
import p129En.C2604o;
import p190Hc.C3287h;
import p190Hc.InterfaceC3283d;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9248Z2;
import p948pi.C18418a;
import p948pi.C18423f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import si.AbstractC19651c;
import si.C19650b;
import si.C19653e;
import si.C19655g;
import si.C19658j;
import si.InterfaceC19652d;
import si.InterfaceC19659k;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ug.AbstractC20236s;
import ug.C20218a;
import ug.C20221d;
import ug.C20222e;
import ug.C20223f;
import ug.C20225h;
import ug.C20226i;
import ug.C20227j;
import ug.C20230m;
import ug.C20232o;
import ug.C20233p;
import ug.InterfaceC20224g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/chatgpt/app/RootViewModelImpl;", "Lcom/openai/feature/rootviewmodel/RootViewModel;", "Companion", "app_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@ContributesBinding.Container({@ContributesBinding(scope = AbstractC9248Z2.class), @ContributesBinding(boundType = RootViewModel.class, scope = AbstractC9248Z2.class)})
public final class RootViewModelImpl extends RootViewModel {

    /* JADX INFO: renamed from: l */
    public static final Companion f37186l = new Companion(0);

    /* JADX INFO: renamed from: i */
    public final C3287h f37187i;

    /* JADX INFO: renamed from: j */
    public final AbstractC21864z f37188j;

    /* JADX INFO: renamed from: k */
    public final C3430e f37189k;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/chatgpt/app/RootViewModelImpl$Companion;", "", "<init>", "()V", "app_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static AbstractC20236s m14228a(EnumC21895B enumC21895B, InterfaceC3283d interfaceC3283d, C1996m c1996m, EnumC13846D enumC13846D) {
            if (!(interfaceC3283d instanceof C2005v)) {
                if (interfaceC3283d instanceof C2007x) {
                    return ((C2007x) interfaceC3283d).f6151a instanceof C18423f ? new C20233p((ViewModelFactoryProvider) interfaceC3283d) : new C20232o((ViewModelFactoryProvider) interfaceC3283d);
                }
                throw new C0644w();
            }
            if (c1996m == null) {
                return new C20230m(interfaceC3283d);
            }
            C18418a c18418a = c1996m.f5936a;
            if (!c18418a.f58773a.f58785d && enumC13846D != EnumC13846D.f43883Z) {
                return new C20230m(c1996m);
            }
            if (c18418a.f58778f) {
                boolean zM15481a = ((C14005w2) c1996m.mo3166d()).m15481a(C13850E0.f43887c);
                if (enumC21895B == EnumC21895B.f69419Z && !zM15481a) {
                    return new C20227j(c1996m);
                }
            }
            if (c18418a.f58780h) {
                return new C20225h(c1996m);
            }
            return new C20226i(c1996m, c18418a.f58775c, c18418a.f58773a.f58783b, c18418a.f58774b.m22325d());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RootViewModelImpl(C2435d sunsetService, InterfaceC19652d serverStatusService, C2046c networkCertificateStatusService, final EnumC21895B appType, C3287h userComponentManager, AbstractC21864z logoutObserver) {
        AbstractC16544l.m18094g(sunsetService, "sunsetService");
        AbstractC16544l.m18094g(serverStatusService, "serverStatusService");
        AbstractC16544l.m18094g(networkCertificateStatusService, "networkCertificateStatusService");
        AbstractC16544l.m18094g(appType, "appType");
        AbstractC16544l.m18094g(userComponentManager, "userComponentManager");
        AbstractC16544l.m18094g(logoutObserver, "logoutObserver");
        C2217y0 c2217y0 = userComponentManager.f10025s0;
        InterfaceC3283d interfaceC3283d = (InterfaceC3283d) c2217y0.f6797Y.getValue();
        f37186l.getClass();
        super(Companion.m14228a(appType, interfaceC3283d, null, null));
        this.f37187i = userComponentManager;
        this.f37188j = logoutObserver;
        this.f37189k = AbstractC8168p6.m8749b("RootViewModel", null);
        C2604o c2604oM3201E = AbstractC2124C.m3201E(c2217y0, new RootViewModelImpl$special$$inlined$flatMapLatest$1(3, null));
        C2604o c2604oM3201E2 = AbstractC2124C.m3201E(c2217y0, new RootViewModelImpl$special$$inlined$flatMapLatest$2(3, null));
        final InterfaceC2184i[] interfaceC2184iArr = {((C21889f) serverStatusService).f69407p0, sunsetService.f7571c, c2217y0, c2604oM3201E, AbstractC2124C.m3201E(c2604oM3201E, new RootViewModelImpl$special$$inlined$flatMapLatest$3(3, null)), c2604oM3201E2, networkCertificateStatusService.f6263b};
        AbstractC2124C.m3226y(new InterfaceC2184i() { // from class: com.openai.chatgpt.app.RootViewModelImpl$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.openai.chatgpt.app.RootViewModelImpl$special$$inlined$combine$1$3 */
            @InterfaceC19689e(m20655c = "com.openai.chatgpt.app.RootViewModelImpl$special$$inlined$combine$1$3", m20656f = "RootViewModelImpl.kt", m20657l = {234}, m20658m = "invokeSuspend")
            @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {TokenNames.f32017R, TokenNames.f32019T, "LDn/j;", "", "it", "Lmm/C;", "<anonymous>", "(LDn/j;Lkotlin/Array;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
            public final class C122163 extends AbstractC19694j implements InterfaceC1440o {

                /* JADX INFO: renamed from: Y */
                public int f37208Y;

                /* JADX INFO: renamed from: Z */
                public /* synthetic */ InterfaceC2186j f37209Z;

                /* JADX INFO: renamed from: o0 */
                public /* synthetic */ Object[] f37210o0;

                /* JADX INFO: renamed from: p0 */
                public final /* synthetic */ RootViewModelImpl f37211p0;

                /* JADX INFO: renamed from: q0 */
                public final /* synthetic */ EnumC21895B f37212q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C122163(InterfaceC18770c interfaceC18770c, RootViewModelImpl rootViewModelImpl, EnumC21895B enumC21895B) {
                    super(3, interfaceC18770c);
                    this.f37211p0 = rootViewModelImpl;
                    this.f37212q0 = enumC21895B;
                }

                @Override // p049Bm.InterfaceC1440o
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C122163 c122163 = new C122163((InterfaceC18770c) obj3, this.f37211p0, this.f37212q0);
                    c122163.f37209Z = (InterfaceC2186j) obj;
                    c122163.f37210o0 = (Object[]) obj2;
                    return c122163.invokeSuspend(C17296C.f55119a);
                }

                @Override // sm.AbstractC19685a
                public final Object invokeSuspend(Object obj) {
                    ViewModelFactoryProvider viewModelFactoryProvider;
                    String str;
                    String str2;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i10 = this.f37208Y;
                    C17296C c17296c = C17296C.f55119a;
                    if (i10 == 0) {
                        AbstractC9233X.m9807c(obj);
                        InterfaceC2186j interfaceC2186j = this.f37209Z;
                        Object[] objArr = this.f37210o0;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        Object obj7 = objArr[5];
                        AbstractC19651c abstractC19651c = (AbstractC19651c) objArr[6];
                        AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) obj7;
                        EnumC13846D enumC13846D = (EnumC13846D) obj6;
                        C1996m c1996m = (C1996m) obj5;
                        InterfaceC3283d interfaceC3283d = (InterfaceC3283d) obj4;
                        InterfaceC19998d interfaceC19998d = (InterfaceC19998d) obj3;
                        InterfaceC19659k interfaceC19659k = (InterfaceC19659k) obj2;
                        if (c1996m != null) {
                            viewModelFactoryProvider = c1996m;
                        } else {
                            viewModelFactoryProvider = interfaceC3283d instanceof ViewModelFactoryProvider ? (ViewModelFactoryProvider) interfaceC3283d : null;
                        }
                        RootViewModelImpl rootViewModelImpl = this.f37211p0;
                        if (abstractC21933K1 != null) {
                            AbstractC8160o6.m8731f(rootViewModelImpl.f37189k, "App initialization failed", abstractC21933K1.f69485a, null, 4);
                            rootViewModelImpl.m14397m(new RootViewModelImpl$2$1(abstractC21933K1));
                        } else if (viewModelFactoryProvider == null) {
                            RootViewModelImpl$2$2 rootViewModelImpl$2$2 = RootViewModelImpl$2$2.f37191Y;
                            RootViewModelImpl.Companion companion = RootViewModelImpl.f37186l;
                            rootViewModelImpl.m14397m(rootViewModelImpl$2$2);
                        } else if (interfaceC19659k instanceof C19653e) {
                            RootViewModelImpl$2$3 rootViewModelImpl$2$3 = new RootViewModelImpl$2$3(viewModelFactoryProvider);
                            RootViewModelImpl.Companion companion2 = RootViewModelImpl.f37186l;
                            rootViewModelImpl.m14397m(rootViewModelImpl$2$3);
                        } else if (interfaceC19659k instanceof C19658j) {
                            RootViewModelImpl$2$4 rootViewModelImpl$2$4 = new RootViewModelImpl$2$4(viewModelFactoryProvider);
                            RootViewModelImpl.Companion companion3 = RootViewModelImpl.f37186l;
                            rootViewModelImpl.m14397m(rootViewModelImpl$2$4);
                        } else if (interfaceC19998d instanceof C19995a) {
                            RootViewModelImpl$2$5 rootViewModelImpl$2$5 = new RootViewModelImpl$2$5(viewModelFactoryProvider);
                            RootViewModelImpl.Companion companion4 = RootViewModelImpl.f37186l;
                            rootViewModelImpl.m14397m(rootViewModelImpl$2$5);
                        } else if (abstractC19651c instanceof C19650b) {
                            RootViewModelImpl$2$6 rootViewModelImpl$2$6 = new RootViewModelImpl$2$6(viewModelFactoryProvider);
                            RootViewModelImpl.Companion companion5 = RootViewModelImpl.f37186l;
                            rootViewModelImpl.m14397m(rootViewModelImpl$2$6);
                        } else {
                            if ((interfaceC19998d instanceof C19996b) && (str2 = ((C19996b) interfaceC19998d).f63312a) != null) {
                                C2059h c2059h = new C2059h(str2);
                                RootViewModelImpl.Companion companion6 = RootViewModelImpl.f37186l;
                                rootViewModelImpl.m14393h(c2059h);
                            }
                            if ((interfaceC19659k instanceof C19655g) && (str = ((C19655g) interfaceC19659k).f62308a) != null) {
                                C2059h c2059h2 = new C2059h(str);
                                RootViewModelImpl.Companion companion7 = RootViewModelImpl.f37186l;
                                rootViewModelImpl.m14393h(c2059h2);
                            }
                            RootViewModelImpl$2$9 rootViewModelImpl$2$9 = new RootViewModelImpl$2$9(this.f37212q0, interfaceC3283d, c1996m, enumC13846D);
                            RootViewModelImpl.Companion companion8 = RootViewModelImpl.f37186l;
                            rootViewModelImpl.m14397m(rootViewModelImpl$2$9);
                        }
                        this.f37208Y = 1;
                        if (interfaceC2186j.mo395a(c17296c, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    return c17296c;
                }
            }

            @Override // p103Dn.InterfaceC2184i
            /* JADX INFO: renamed from: d */
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
                final InterfaceC2184i[] interfaceC2184iArr2 = interfaceC2184iArr;
                Object objM3613a = AbstractC2592c.m3613a(new InterfaceC1426a() { // from class: com.openai.chatgpt.app.RootViewModelImpl$special$$inlined$combine$1.2
                    @Override // p049Bm.InterfaceC1426a
                    public final Object invoke() {
                        return new Object[interfaceC2184iArr2.length];
                    }
                }, new C122163(null, this, appType), interfaceC2186j, interfaceC18770c, interfaceC2184iArr2);
                return objM3613a == EnumC19250a.f61036Y ? objM3613a : C17296C.f55119a;
            }
        }, ViewModelKt.m12143a(this));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC20224g intent = (InterfaceC20224g) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C20221d) {
            m14392g(new C20218a(((C20221d) intent).f64013a));
        } else if (intent instanceof C20223f) {
            m14394i(new RootViewModelImpl$onIntent$1(this, null));
        } else if (intent instanceof C20222e) {
            m14394i(new RootViewModelImpl$onIntent$2(this, null));
        }
    }
}
