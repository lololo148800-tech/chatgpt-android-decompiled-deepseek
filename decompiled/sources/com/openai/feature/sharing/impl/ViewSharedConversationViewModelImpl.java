package com.openai.feature.sharing.impl;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.feature.sharing.ViewSharedConversationViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13895T1;
import gd.C13987s0;
import gd.C13993t2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p015Ad.C0431f;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2055d;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1081wc.C20907z;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C21966U1;
import p1155zi.C22007g0;
import p1155zi.C22011h0;
import p195Hh.C3430e;
import p318Mh.C5356C0;
import p338Ne.C5718f;
import p403Qd.C6604J;
import p403Qd.C6636i;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p552Wg.C8838B;
import p552Wg.C8857s;
import p552Wg.C8858t;
import p552Wg.C8859u;
import p552Wg.C8860v;
import p552Wg.C8861w;
import p552Wg.InterfaceC8862x;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p576Xe.C9473F;
import p909nm.C17689w;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/sharing/impl/ViewSharedConversationViewModelImpl;", "Lcom/openai/feature/sharing/ViewSharedConversationViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ViewSharedConversationViewModelImpl extends ViewSharedConversationViewModel {

    /* JADX INFO: renamed from: i */
    public final InterfaceC20904w f39820i;

    /* JADX INFO: renamed from: j */
    public final C5718f f39821j;

    /* JADX INFO: renamed from: k */
    public final Application f39822k;

    /* JADX INFO: renamed from: l */
    public final C3430e f39823l;

    /* JADX INFO: renamed from: m */
    public final String f39824m;

    /* JADX INFO: renamed from: n */
    public final Map f39825n;

    /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ViewSharedConversationViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ViewSharedConversationViewModelImpl$1", m20656f = "ViewSharedConversationViewModelImpl.kt", m20657l = {67, 70}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125141 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39826Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f39827Z;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ C18418a f39829p0;

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ C0431f f39830q0;

        /* JADX INFO: renamed from: r0 */
        public final /* synthetic */ C9473F f39831r0;

        /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ViewSharedConversationViewModelImpl$1$3, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/B;", "invoke", "(LWg/B;)LWg/B;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass3 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass3 f39842Y = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C8838B setState = (C8838B) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C8838B.m9545e(setState, null, null, null, null, null, false, 509);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125141(C18418a c18418a, C0431f c0431f, C9473F c9473f, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39829p0 = c18418a;
            this.f39830q0 = c0431f;
            this.f39831r0 = c9473f;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125141 c125141 = ViewSharedConversationViewModelImpl.this.new C125141(this.f39829p0, this.f39830q0, this.f39831r0, interfaceC18770c);
            c125141.f39827Z = obj;
            return c125141;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125141) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            InterfaceC0571F interfaceC0571F;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39826Y;
            ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl = ViewSharedConversationViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC0571F = (InterfaceC0571F) this.f39827Z;
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                viewSharedConversationViewModelImpl.m14397m(AnonymousClass3.f39842Y);
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            interfaceC0571F = (InterfaceC0571F) this.f39827Z;
            C5718f c5718f = viewSharedConversationViewModelImpl.f39821j;
            this.f39827Z = interfaceC0571F;
            this.f39826Y = 1;
            obj = c5718f.m6154c(viewSharedConversationViewModelImpl.f39824m, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof C21952P1) {
                C6604J c6604j = (C6604J) ((C21952P1) abstractC21955Q1).f69511a;
                if (((C8838B) viewSharedConversationViewModelImpl.m14391f()).f27026a) {
                    this.f39827Z = null;
                    this.f39826Y = 2;
                    if (ViewSharedConversationViewModelImpl.m14368n(viewSharedConversationViewModelImpl, c6604j, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    viewSharedConversationViewModelImpl.m14397m(new ViewSharedConversationViewModelImpl$1$1$1(c6604j, this.f39830q0, viewSharedConversationViewModelImpl));
                    String str = c6604j.f21323a.f21389k;
                    if (str != null && !this.f39829p0.f58773a.f58783b) {
                        AbstractC0575H.m1156D(interfaceC0571F, null, null, new ViewSharedConversationViewModelImpl$1$1$2(this.f39831r0, str, viewSharedConversationViewModelImpl, null), 3);
                    }
                }
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                AbstractC8160o6.m8727b(viewSharedConversationViewModelImpl.f39823l, SfpOlmlMATQ.ncnl, abstractC21933K1.f69485a, 4);
                viewSharedConversationViewModelImpl.m14393h(new C2059h(abstractC21933K1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            viewSharedConversationViewModelImpl.m14397m(AnonymousClass3.f39842Y);
            return C17296C.f55119a;
        }
    }

    public ViewSharedConversationViewModelImpl(C11082S c11082s, C9473F c9473f, C0431f c0431f, InterfaceC13849E interfaceC13849E, C13993t2 c13993t2, C18418a c18418a, InterfaceC20904w interfaceC20904w, C5718f c5718f, Application application) {
        super(new C8838B(((Boolean) c13993t2.m15479a(C13895T1.f43944d)).booleanValue(), true, null, null, C17689w.f56480Y, null, null, ((C14005w2) interfaceC13849E).m15481a(C13987s0.f44051c), false));
        this.f39820i = interfaceC20904w;
        this.f39821j = c5718f;
        this.f39822k = application;
        this.f39823l = AbstractC8168p6.m8749b("ViewSharedConversationViewModel", null);
        C5356C0.f17585g.getClass();
        String str = ((C21966U1) C5356C0.f17586h.m5892c(c11082s)).f69541a;
        this.f39824m = str;
        Map mapM535x = AbstractC0168G.m535x("share_link_id", str);
        this.f39825n = mapM535x;
        interfaceC20904w.mo21447a(C20907z.f66644h, mapM535x);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C125141(c18418a, c0431f, c9473f, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: n */
    public static final Object m14368n(ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl, C6604J c6604j, AbstractC19687c abstractC19687c) throws Throwable {
        ViewSharedConversationViewModelImpl$navigateToConversation$1 viewSharedConversationViewModelImpl$navigateToConversation$1;
        ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl2 = viewSharedConversationViewModelImpl;
        viewSharedConversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ViewSharedConversationViewModelImpl$navigateToConversation$1) {
            viewSharedConversationViewModelImpl$navigateToConversation$1 = (ViewSharedConversationViewModelImpl$navigateToConversation$1) abstractC19687c;
            int i10 = viewSharedConversationViewModelImpl$navigateToConversation$1.f39846p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                viewSharedConversationViewModelImpl$navigateToConversation$1.f39846p0 = i10 - Integer.MIN_VALUE;
            } else {
                viewSharedConversationViewModelImpl$navigateToConversation$1 = new ViewSharedConversationViewModelImpl$navigateToConversation$1(viewSharedConversationViewModelImpl2, abstractC19687c);
            }
        } else {
            viewSharedConversationViewModelImpl$navigateToConversation$1 = new ViewSharedConversationViewModelImpl$navigateToConversation$1(viewSharedConversationViewModelImpl2, abstractC19687c);
        }
        Object objM3176e = viewSharedConversationViewModelImpl$navigateToConversation$1.f39844Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = viewSharedConversationViewModelImpl$navigateToConversation$1.f39846p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3176e);
            viewSharedConversationViewModelImpl$navigateToConversation$1.f39843Y = viewSharedConversationViewModelImpl2;
            viewSharedConversationViewModelImpl$navigateToConversation$1.f39846p0 = 1;
            C5718f c5718f = viewSharedConversationViewModelImpl2.f39821j;
            c5718f.getClass();
            C22011h0.Companion.getClass();
            objM3176e = c5718f.f18522b.f57657c.m3176e(C6636i.m7162a(c6604j.f21323a, C22007g0.m22342a(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, 2097150), false, viewSharedConversationViewModelImpl$navigateToConversation$1);
            if (objM3176e == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewSharedConversationViewModelImpl2 = viewSharedConversationViewModelImpl$navigateToConversation$1.f39843Y;
            AbstractC9233X.m9807c(objM3176e);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM3176e;
        if (abstractC21955Q1 instanceof C21952P1) {
            viewSharedConversationViewModelImpl2.m14392g(new C8857s(viewSharedConversationViewModelImpl2.f39824m, ((C22011h0) ((C21952P1) abstractC21955Q1).f69511a).f69652a));
        }
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(viewSharedConversationViewModelImpl2.f39823l, "Shared conversation not cached: " + abstractC21933K1.f69485a, null, 6);
            viewSharedConversationViewModelImpl2.m14393h(new C2059h(abstractC21933K1));
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC8862x intent = (InterfaceC8862x) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C8858t) {
            m14394i(new ViewSharedConversationViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        boolean zEquals = intent.equals(C8860v.f27124a);
        Map map = this.f39825n;
        InterfaceC20904w interfaceC20904w = this.f39820i;
        if (zEquals) {
            interfaceC20904w.mo21447a(C20907z.f66641e, map);
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, "https://help.openai.com/en/articles/7925741-chatgpt-shared-links-faq");
            m14393h(new C2055d(intent2));
            return;
        }
        if (intent.equals(C8861w.f27125a)) {
            interfaceC20904w.mo21447a(C20907z.f66642f, map);
            m14397m(ViewSharedConversationViewModelImpl$onIntent$2.f39850Y);
        } else if (intent.equals(C8859u.f27123a)) {
            interfaceC20904w.mo21447a(C20907z.f66640d, map);
            m14397m(ViewSharedConversationViewModelImpl$onIntent$3.f39851Y);
        }
    }
}
