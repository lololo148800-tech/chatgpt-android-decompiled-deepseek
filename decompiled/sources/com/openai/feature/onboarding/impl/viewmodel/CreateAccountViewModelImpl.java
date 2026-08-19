package com.openai.feature.onboarding.impl.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bg.C11422v;
import com.openai.chatgpt.R;
import com.squareup.anvil.annotations.ContributesMultibinding;
import eg.C13395r;
import eg.C13396s;
import kg.C16395a;
import kg.C16396b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p014Ac.C0425b;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p092Dc.C1991h;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC21895B;
import p115E9.AbstractC2359a;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9339o3;
import p623Zf.C10327w;
import p623Zf.EnumC10304F;
import p872lg.AbstractC16943c;
import p872lg.C16941a;
import p872lg.C16942b;
import p905nd.C17589q;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/CreateAccountViewModelImpl;", "Lcom/openai/feature/onboarding/impl/viewmodel/CreateAccountViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateAccountViewModelImpl extends CreateAccountViewModel {

    /* JADX INFO: renamed from: i */
    public final C11422v f39081i;

    /* JADX INFO: renamed from: j */
    public final AbstractC21864z f39082j;

    /* JADX INFO: renamed from: k */
    public final C1991h f39083k;

    /* JADX INFO: renamed from: l */
    public final EnumC21895B f39084l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC20904w f39085m;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.CreateAccountViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.CreateAccountViewModelImpl$1", m20656f = "CreateAccountViewModel.kt", m20657l = {57}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124511 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39086Y;

        public C124511(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return CreateAccountViewModelImpl.this.new C124511(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124511) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39086Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f39086Y = 1;
                if (CreateAccountViewModelImpl.m14323n(CreateAccountViewModelImpl.this, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    public CreateAccountViewModelImpl(C11422v c11422v, AbstractC21864z abstractC21864z, C1991h c1991h, EnumC21895B enumC21895B, InterfaceC20904w interfaceC20904w) {
        super(new C16396b(null));
        this.f39081i = c11422v;
        this.f39082j = abstractC21864z;
        this.f39083k = c1991h;
        this.f39084l = enumC21895B;
        this.f39085m = interfaceC20904w;
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124511(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14323n(CreateAccountViewModelImpl createAccountViewModelImpl, AbstractC19687c abstractC19687c) {
        CreateAccountViewModelImpl$createAccount$1 createAccountViewModelImpl$createAccount$1;
        C13395r c13395r;
        EnumC10304F enumC10304F;
        Object objM12787b;
        EnumC10304F enumC10304F2;
        createAccountViewModelImpl.getClass();
        if (abstractC19687c instanceof CreateAccountViewModelImpl$createAccount$1) {
            createAccountViewModelImpl$createAccount$1 = (CreateAccountViewModelImpl$createAccount$1) abstractC19687c;
            int i10 = createAccountViewModelImpl$createAccount$1.f39092q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                createAccountViewModelImpl$createAccount$1.f39092q0 = i10 - Integer.MIN_VALUE;
            } else {
                createAccountViewModelImpl$createAccount$1 = new CreateAccountViewModelImpl$createAccount$1(createAccountViewModelImpl, abstractC19687c);
            }
        } else {
            createAccountViewModelImpl$createAccount$1 = new CreateAccountViewModelImpl$createAccount$1(createAccountViewModelImpl, abstractC19687c);
        }
        Object objM12786a = createAccountViewModelImpl$createAccount$1.f39090o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = createAccountViewModelImpl$createAccount$1.f39092q0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        createAccountViewModelImpl = (CreateAccountViewModelImpl) createAccountViewModelImpl$createAccount$1.f39088Y;
                        AbstractC9233X.m9807c(objM12786a);
                        enumC10304F = EnumC10304F.f30595s0;
                        C11422v c11422v = createAccountViewModelImpl.f39081i;
                        createAccountViewModelImpl$createAccount$1.f39088Y = enumC10304F;
                        createAccountViewModelImpl$createAccount$1.f39089Z = createAccountViewModelImpl;
                        createAccountViewModelImpl$createAccount$1.f39092q0 = 4;
                        objM12787b = c11422v.m12787b(createAccountViewModelImpl$createAccount$1);
                        if (objM12787b == enumC19250a) {
                            return enumC19250a;
                        }
                        enumC10304F2 = enumC10304F;
                        objM12786a = objM12787b;
                    } else if (i11 == 4) {
                        createAccountViewModelImpl = createAccountViewModelImpl$createAccount$1.f39089Z;
                        enumC10304F2 = (EnumC10304F) createAccountViewModelImpl$createAccount$1.f39088Y;
                        AbstractC9233X.m9807c(objM12786a);
                    } else if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createAccountViewModelImpl.m14393h(new C2058g(AbstractC2359a.m3444c(enumC10304F2, (C10327w) objM12786a), true));
                }
                AbstractC9233X.m9807c(objM12786a);
            } else {
                createAccountViewModelImpl = (CreateAccountViewModelImpl) createAccountViewModelImpl$createAccount$1.f39088Y;
                AbstractC9233X.m9807c(objM12786a);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM12786a);
        createAccountViewModelImpl.m14397m(CreateAccountViewModelImpl$createAccount$2.f39093Y);
        createAccountViewModelImpl$createAccount$1.f39088Y = createAccountViewModelImpl;
        createAccountViewModelImpl$createAccount$1.f39092q0 = 1;
        objM12786a = createAccountViewModelImpl.f39081i.m12786a(createAccountViewModelImpl$createAccount$1);
        if (objM12786a == enumC19250a) {
            return enumC19250a;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM12786a;
        if (abstractC21955Q1 instanceof C21952P1) {
            AbstractC16943c abstractC16943c = (AbstractC16943c) ((C21952P1) abstractC21955Q1).f69511a;
            if (abstractC16943c instanceof C16941a) {
                createAccountViewModelImpl$createAccount$1.f39088Y = null;
                createAccountViewModelImpl$createAccount$1.f39092q0 = 2;
                if (createAccountViewModelImpl.m14324o(createAccountViewModelImpl$createAccount$1) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (abstractC16943c instanceof C16942b) {
                C11422v c11422v2 = createAccountViewModelImpl.f39081i;
                CreateAccountViewModelImpl$createAccount$3$1 createAccountViewModelImpl$createAccount$3$1 = new CreateAccountViewModelImpl$createAccount$3$1(abstractC16943c);
                createAccountViewModelImpl$createAccount$1.f39088Y = createAccountViewModelImpl;
                createAccountViewModelImpl$createAccount$1.f39092q0 = 3;
                if (c11422v2.m12791f(createAccountViewModelImpl$createAccount$3$1, createAccountViewModelImpl$createAccount$1) == enumC19250a) {
                    return enumC19250a;
                }
                enumC10304F = EnumC10304F.f30595s0;
                C11422v c11422v3 = createAccountViewModelImpl.f39081i;
                createAccountViewModelImpl$createAccount$1.f39088Y = enumC10304F;
                createAccountViewModelImpl$createAccount$1.f39089Z = createAccountViewModelImpl;
                createAccountViewModelImpl$createAccount$1.f39092q0 = 4;
                objM12787b = c11422v3.m12787b(createAccountViewModelImpl$createAccount$1);
                if (objM12787b == enumC19250a) {
                    return enumC19250a;
                }
                enumC10304F2 = enumC10304F;
                objM12786a = objM12787b;
                createAccountViewModelImpl.m14393h(new C2058g(AbstractC2359a.m3444c(enumC10304F2, (C10327w) objM12786a), true));
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            createAccountViewModelImpl.m14397m(new CreateAccountViewModelImpl$createAccount$4$1(abstractC21933K1));
            Throwable th2 = abstractC21933K1.f69485a;
            C13396s c13396s = th2 instanceof C13396s ? (C13396s) th2 : null;
            if (AbstractC16544l.m18089b((c13396s == null || (c13395r = c13396s.f42447Y) == null) ? null : c13395r.f42445d, "user_already_exists")) {
                createAccountViewModelImpl$createAccount$1.f39088Y = null;
                createAccountViewModelImpl$createAccount$1.f39092q0 = 5;
                if (createAccountViewModelImpl.m14324o(createAccountViewModelImpl$createAccount$1) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C1991h c1991h = createAccountViewModelImpl.f39083k;
                createAccountViewModelImpl.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, c1991h, createAccountViewModelImpl.f39084l, c1991h.m3160b(R.string.onboarding_account_create_error))));
            }
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C16395a intent = (C16395a) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C16395a) {
            m14393h(AbstractC2359a.m3445d(EnumC10304F.f30595s0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m14324o(AbstractC19687c abstractC19687c) {
        CreateAccountViewModelImpl$renewCredentials$1 createAccountViewModelImpl$renewCredentials$1;
        CreateAccountViewModelImpl createAccountViewModelImpl;
        if (abstractC19687c instanceof CreateAccountViewModelImpl$renewCredentials$1) {
            createAccountViewModelImpl$renewCredentials$1 = (CreateAccountViewModelImpl$renewCredentials$1) abstractC19687c;
            int i10 = createAccountViewModelImpl$renewCredentials$1.f39099p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                createAccountViewModelImpl$renewCredentials$1.f39099p0 = i10 - Integer.MIN_VALUE;
            } else {
                createAccountViewModelImpl$renewCredentials$1 = new CreateAccountViewModelImpl$renewCredentials$1(this, abstractC19687c);
            }
        } else {
            createAccountViewModelImpl$renewCredentials$1 = new CreateAccountViewModelImpl$renewCredentials$1(this, abstractC19687c);
        }
        Object objM19221g = createAccountViewModelImpl$renewCredentials$1.f39097Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = createAccountViewModelImpl$renewCredentials$1.f39099p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM19221g);
            createAccountViewModelImpl$renewCredentials$1.f39096Y = this;
            createAccountViewModelImpl$renewCredentials$1.f39099p0 = 1;
            objM19221g = ((C17589q) this.f39082j).m19221g(createAccountViewModelImpl$renewCredentials$1);
            if (objM19221g == enumC19250a) {
                return enumC19250a;
            }
            createAccountViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createAccountViewModelImpl = createAccountViewModelImpl$renewCredentials$1.f39096Y;
            AbstractC9233X.m9807c(objM19221g);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19221g;
        if (abstractC21955Q1 instanceof C21952P1) {
            if (((C0425b) ((C21952P1) abstractC21955Q1).f69511a).f1398a != null) {
                createAccountViewModelImpl.m14397m(CreateAccountViewModelImpl$renewCredentials$2$1.f39100Y);
                createAccountViewModelImpl.f39085m.mo21447a(C20857C.f66327i, AbstractC17660E.m19258c(new C17309l("is_auto_created", Boolean.TRUE)));
            } else {
                createAccountViewModelImpl.m14393h(new C2059h(createAccountViewModelImpl.f39083k.m3160b(R.string.onboarding_error_account_exists)));
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            createAccountViewModelImpl.m14397m(new CreateAccountViewModelImpl$renewCredentials$3$1((AbstractC21933K1) abstractC21955Q1));
            createAccountViewModelImpl.m14393h(new C2059h(createAccountViewModelImpl.f39083k.m3160b(R.string.onboarding_error_account_exists)));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            createAccountViewModelImpl.m14397m(CreateAccountViewModelImpl$renewCredentials$4$1.f39102Y);
        }
        return C17296C.f55119a;
    }
}
