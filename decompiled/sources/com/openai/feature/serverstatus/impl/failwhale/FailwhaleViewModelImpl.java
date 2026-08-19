package com.openai.feature.serverstatus.impl.failwhale;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.chatgpt.R;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p070Cg.AbstractC1657e;
import p070Cg.C1655c;
import p070Cg.C1656d;
import p070Cg.C1660h;
import p086D6.C1970n;
import p098Di.C2055d;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1081wc.C20897p;
import p1081wc.InterfaceC20904w;
import p1153zg.C21889f;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p571X9.AbstractC9339o3;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import si.InterfaceC19652d;
import si.InterfaceC19656h;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding.Container({@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class), @ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)})
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/failwhale/FailwhaleViewModelImpl;", "Lcom/openai/feature/serverstatus/impl/failwhale/FailwhaleViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FailwhaleViewModelImpl extends FailwhaleViewModel {

    /* JADX INFO: renamed from: i */
    public final InterfaceC19652d f39441i;

    /* JADX INFO: renamed from: j */
    public final C3430e f39442j;

    /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl$1", m20656f = "FailwhaleViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lsi/h;", "ss", "Lmm/C;", "<anonymous>", "(Lsi/h;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124741 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39443Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ Application f39444Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ FailwhaleViewModelImpl f39445o0;

        /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LCg/h;", "invoke", "(LCg/h;)LCg/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ String f39446Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ String f39447Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ Intent f39448o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2, Intent intent) {
                super(1);
                this.f39446Y = str;
                this.f39447Z = str2;
                this.f39448o0 = intent;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C1660h setState = (C1660h) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return new C1660h(this.f39446Y, this.f39447Z, this.f39448o0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124741(Application application, FailwhaleViewModelImpl failwhaleViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39444Z = application;
            this.f39445o0 = failwhaleViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124741 c124741 = new C124741(this.f39444Z, this.f39445o0, interfaceC18770c);
            c124741.f39443Y = obj;
            return c124741;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124741 c124741 = (C124741) create((InterfaceC19656h) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124741.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            Intent intent;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            InterfaceC19656h interfaceC19656h = (InterfaceC19656h) this.f39443Y;
            String strMo20627a = interfaceC19656h.mo20627a();
            Application application = this.f39444Z;
            if (strMo20627a == null) {
                strMo20627a = application.getString(R.string.failwhale_default_error_message);
                AbstractC16544l.m18093f(strMo20627a, "getString(...)");
            }
            String strMo20629c = interfaceC19656h.mo20629c();
            FailwhaleViewModelImpl failwhaleViewModelImpl = this.f39445o0;
            String strMo20628b = null;
            if (strMo20629c != null) {
                try {
                    intent = new Intent();
                    AbstractC9186P.m9748b(intent, strMo20629c);
                } catch (Exception e10) {
                    AbstractC8160o6.m8727b(failwhaleViewModelImpl.f39442j, "Failed to parse failwhale info url: ".concat(strMo20629c), e10, 4);
                    intent = null;
                }
            } else {
                intent = null;
            }
            if (intent != null && (strMo20628b = interfaceC19656h.mo20628b()) == null) {
                strMo20628b = application.getString(R.string.failwhale_default_more_info_button);
                AbstractC16544l.m18093f(strMo20628b, "getString(...)");
            }
            failwhaleViewModelImpl.m14397m(new AnonymousClass1(strMo20627a, strMo20628b, intent));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FailwhaleViewModelImpl(Application application, InterfaceC19652d interfaceC19652d, InterfaceC20904w interfaceC20904w) {
        String string = application.getString(R.string.failwhale_default_error_message);
        AbstractC16544l.m18093f(string, "getString(...)");
        super(new C1660h(string, null, null));
        this.f39441i = interfaceC19652d;
        this.f39442j = AbstractC8168p6.m8749b("FailwhaleViewModel", null);
        interfaceC20904w.mo21447a(C20897p.f66604d, C17690x.f56481Y);
        final C2153Q0 c2153q0 = ((C21889f) interfaceC19652d).f69407p0;
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl$special$$inlined$filterIsInstance$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C124752<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f39452Y;

                /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModelImpl$special$$inlined$filterIsInstance$1$2", m20656f = "FailwhaleViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f39453Y;

                    /* JADX INFO: renamed from: Z */
                    public int f39454Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f39453Y = obj;
                        this.f39454Z |= Integer.MIN_VALUE;
                        return C124752.this.mo395a(null, this);
                    }
                }

                public C124752(InterfaceC2186j interfaceC2186j) {
                    this.f39452Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f39454Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f39454Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f39453Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f39454Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (obj instanceof InterfaceC19656h) {
                            anonymousClass1.f39454Z = 1;
                            if (this.f39452Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj2);
                    }
                    return C17296C.f55119a;
                }
            }

            @Override // p103Dn.InterfaceC2184i
            /* JADX INFO: renamed from: d */
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
                Object objMo3141d = c2153q0.mo3141d(new C124752(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, 5, new C124741(application, this, null)), ViewModelKt.m12143a(this));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        AbstractC1657e intent = (AbstractC1657e) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (!(intent instanceof C1656d)) {
            if (intent instanceof C1655c) {
                m14394i(new FailwhaleViewModelImpl$onIntent$1(this, null));
            }
        } else {
            Intent intent2 = ((C1660h) m14391f()).f4689c;
            if (intent2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            m14393h(new C2055d(intent2));
        }
    }
}
