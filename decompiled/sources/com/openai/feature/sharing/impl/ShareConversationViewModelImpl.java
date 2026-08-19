package com.openai.feature.sharing.impl;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.feature.sharing.ShareConversationViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p093Dd.C2017i;
import p098Di.C2055d;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1081wc.C20855A;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C22013h2;
import p129En.C2604o;
import p195Hh.C3430e;
import p216Id.AbstractC3693a;
import p216Id.C3694b;
import p216Id.C3696d;
import p216Id.InterfaceC3702j;
import p338Ne.C5718f;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6659u;
import p403Qd.C6600F;
import p403Qd.C6621a0;
import p403Qd.C6627d0;
import p403Qd.C6636i;
import p479Td.C7315A;
import p479Td.C7323I;
import p479Td.C7373x;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p552Wg.C8849k;
import p552Wg.C8850l;
import p552Wg.C8851m;
import p552Wg.C8852n;
import p552Wg.C8853o;
import p552Wg.C8854p;
import p552Wg.C8856r;
import p552Wg.InterfaceC8855q;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p708dh.C13145X;
import p787he.C14459O;
import p909nm.AbstractC17659D;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/sharing/impl/ShareConversationViewModelImpl;", "Lcom/openai/feature/sharing/ShareConversationViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ShareConversationViewModelImpl extends ShareConversationViewModel {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f39773m = 0;

    /* JADX INFO: renamed from: i */
    public final C14459O f39774i;

    /* JADX INFO: renamed from: j */
    public final C5718f f39775j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC20904w f39776k;

    /* JADX INFO: renamed from: l */
    public final C3430e f39777l;

    /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ShareConversationViewModelImpl$2", m20656f = "ShareConversationViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lzi/P1;", "Lzi/h2;", "it", "Lmm/C;", "<anonymous>", "(Lzi/P1;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125102 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39778Y;

        /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$2$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/r;", "invoke", "(LWg/r;)LWg/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21952P1 f39780Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C21952P1 c21952p1) {
                super(1);
                this.f39780Y = c21952p1;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C8856r setState = (C8856r) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C8856r.m9546e(setState, null, null, false, null, (C22013h2) this.f39780Y.f69511a, null, null, false, null, false, 1007);
            }
        }

        public C125102(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125102 c125102 = ShareConversationViewModelImpl.this.new C125102(interfaceC18770c);
            c125102.f39778Y = obj;
            return c125102;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C125102 c125102 = (C125102) create((C21952P1) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c125102.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((C21952P1) this.f39778Y);
            int i10 = ShareConversationViewModelImpl.f39773m;
            ShareConversationViewModelImpl.this.m14397m(anonymousClass1);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ShareConversationViewModelImpl$3", m20656f = "ShareConversationViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "conversationCoordinatorState", "Lmm/C;", "<anonymous>", "(LId/b;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125113 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39781Y;

        /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$3$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/r;", "invoke", "(LWg/r;)LWg/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C3694b f39783Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ ShareConversationViewModelImpl f39784Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C3694b c3694b, ShareConversationViewModelImpl shareConversationViewModelImpl) {
                super(1);
                this.f39783Y = c3694b;
                this.f39784Z = shareConversationViewModelImpl;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                boolean z6;
                C8856r setState = (C8856r) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C3694b c3694b = this.f39783Y;
                String str = c3694b.f11223h;
                List list = c3694b.f11224i;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((AbstractC6601G) obj2).m7160b()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<AbstractC6659u> arrayListM4405e = AbstractC3693a.m4405e(list);
                int i10 = ShareConversationViewModelImpl.f39773m;
                this.f39784Z.getClass();
                boolean z10 = false;
                if (!arrayListM4405e.isEmpty()) {
                    for (AbstractC6659u abstractC6659u : arrayListM4405e) {
                        if ((abstractC6659u.m7172d().f23291f instanceof C7323I) || (abstractC6659u.m7172d().f23291f instanceof C7373x) || (abstractC6659u.m7172d().f23291f instanceof C7315A) || ((((z6 = abstractC6659u instanceof C6600F)) && (((C6600F) abstractC6659u).f21314f instanceof C6621a0)) || (z6 && (((C6600F) abstractC6659u).f21314f instanceof C6627d0)))) {
                            z10 = true;
                            break;
                        }
                    }
                }
                return C8856r.m9546e(setState, null, str, z10, arrayList, null, null, null, false, null, false, 1009);
            }
        }

        public C125113(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125113 c125113 = ShareConversationViewModelImpl.this.new C125113(interfaceC18770c);
            c125113.f39781Y = obj;
            return c125113;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C125113 c125113 = (C125113) create((C3694b) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c125113.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C3694b c3694b = (C3694b) this.f39781Y;
            ShareConversationViewModelImpl shareConversationViewModelImpl = ShareConversationViewModelImpl.this;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c3694b, shareConversationViewModelImpl);
            int i10 = ShareConversationViewModelImpl.f39773m;
            shareConversationViewModelImpl.m14397m(anonymousClass1);
            InterfaceC3702j interfaceC3702j = c3694b.f11220e;
            if (interfaceC3702j instanceof C3696d) {
                shareConversationViewModelImpl.m14393h(new C2059h(((C3696d) interfaceC3702j).f11230a));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$4 */
    @InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ShareConversationViewModelImpl$4", m20656f = "ShareConversationViewModelImpl.kt", m20657l = {69, 71}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125124 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39785Y;

        public C125124(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ShareConversationViewModelImpl.this.new C125124(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125124) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39785Y;
            ShareConversationViewModelImpl shareConversationViewModelImpl = ShareConversationViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C2604o c2604o = shareConversationViewModelImpl.f39774i.f45521t;
            this.f39785Y = 1;
            obj = AbstractC2124C.m3221t(c2604o, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            C6636i c6636i = (C6636i) obj;
            if (c6636i != null) {
                ShareConversationViewModelImpl$4$1$1 shareConversationViewModelImpl$4$1$1 = new ShareConversationViewModelImpl$4$1$1(c6636i);
                int i11 = ShareConversationViewModelImpl.f39773m;
                shareConversationViewModelImpl.m14397m(shareConversationViewModelImpl$4$1$1);
                this.f39785Y = 2;
                if (ShareConversationViewModelImpl.m14366o(shareConversationViewModelImpl, c6636i, true, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m18067d2 = {"Lcom/openai/feature/sharing/impl/ShareConversationViewModelImpl$Companion;", "", "()V", "HelpUrl", "", "MaxTitleCharacters", "", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public ShareConversationViewModelImpl(C13145X c13145x, C14459O c14459o, C5718f c5718f, InterfaceC20904w interfaceC20904w) {
        super(new C8856r(null, null, false, C17689w.f56480Y, null, null, null, false, null, false));
        this.f39774i = c14459o;
        this.f39775j = c5718f;
        this.f39776k = interfaceC20904w;
        this.f39777l = AbstractC8168p6.m8749b("SharedConversationViewModel", null);
        final C2127D0 c2127d0 = c13145x.f41737e;
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$special$$inlined$mapNotNull$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C125132<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f39810Y;

                /* JADX INFO: renamed from: com.openai.feature.sharing.impl.ShareConversationViewModelImpl$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ShareConversationViewModelImpl$special$$inlined$mapNotNull$1$2", m20656f = "ShareConversationViewModelImpl.kt", m20657l = {52}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f39811Y;

                    /* JADX INFO: renamed from: Z */
                    public int f39812Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f39811Y = obj;
                        this.f39812Z |= Integer.MIN_VALUE;
                        return C125132.this.mo395a(null, this);
                    }
                }

                public C125132(InterfaceC2186j interfaceC2186j) {
                    this.f39810Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f39812Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f39812Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f39811Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f39812Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
                        C21952P1 c21952p1 = abstractC21955Q1 instanceof C21952P1 ? (C21952P1) abstractC21955Q1 : null;
                        if (c21952p1 != null) {
                            anonymousClass1.f39812Z = 1;
                            if (this.f39810Y.mo395a(c21952p1, anonymousClass1) == enumC19250a) {
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
                Object objMo3141d = c2127d0.mo3141d(new C125132(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, 5, new C125102(null)), ViewModelKt.m12143a(this));
        AbstractC2124C.m3226y(new C1970n(c14459o.f45526y, 5, new C125113(null)), ViewModelKt.m12143a(this));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C125124(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14365n(ShareConversationViewModelImpl shareConversationViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        ShareConversationViewModelImpl$deleteLink$1 shareConversationViewModelImpl$deleteLink$1;
        shareConversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ShareConversationViewModelImpl$deleteLink$1) {
            shareConversationViewModelImpl$deleteLink$1 = (ShareConversationViewModelImpl$deleteLink$1) abstractC19687c;
            int i10 = shareConversationViewModelImpl$deleteLink$1.f39791p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                shareConversationViewModelImpl$deleteLink$1.f39791p0 = i10 - Integer.MIN_VALUE;
            } else {
                shareConversationViewModelImpl$deleteLink$1 = new ShareConversationViewModelImpl$deleteLink$1(shareConversationViewModelImpl, abstractC19687c);
            }
        } else {
            shareConversationViewModelImpl$deleteLink$1 = new ShareConversationViewModelImpl$deleteLink$1(shareConversationViewModelImpl, abstractC19687c);
        }
        Object objM6153b = shareConversationViewModelImpl$deleteLink$1.f39789Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = shareConversationViewModelImpl$deleteLink$1.f39791p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM6153b);
            shareConversationViewModelImpl$deleteLink$1.f39788Y = shareConversationViewModelImpl;
            shareConversationViewModelImpl$deleteLink$1.f39791p0 = 1;
            objM6153b = shareConversationViewModelImpl.f39775j.m6153b(str, shareConversationViewModelImpl$deleteLink$1);
            if (objM6153b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shareConversationViewModelImpl = shareConversationViewModelImpl$deleteLink$1.f39788Y;
            AbstractC9233X.m9807c(objM6153b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM6153b;
        if (abstractC21955Q1 instanceof C21952P1) {
            shareConversationViewModelImpl.m14392g(C8849k.f27104a);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8731f(shareConversationViewModelImpl.f39777l, "Failed to delete conversation", abstractC21933K1.f69485a, null, 4);
            shareConversationViewModelImpl.m14393h(new C2059h(abstractC21933K1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14366o(ShareConversationViewModelImpl shareConversationViewModelImpl, C6636i c6636i, boolean z6, AbstractC19687c abstractC19687c) {
        ShareConversationViewModelImpl$makeShareLink$1 shareConversationViewModelImpl$makeShareLink$1;
        shareConversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ShareConversationViewModelImpl$makeShareLink$1) {
            shareConversationViewModelImpl$makeShareLink$1 = (ShareConversationViewModelImpl$makeShareLink$1) abstractC19687c;
            int i10 = shareConversationViewModelImpl$makeShareLink$1.f39795p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                shareConversationViewModelImpl$makeShareLink$1.f39795p0 = i10 - Integer.MIN_VALUE;
            } else {
                shareConversationViewModelImpl$makeShareLink$1 = new ShareConversationViewModelImpl$makeShareLink$1(shareConversationViewModelImpl, abstractC19687c);
            }
        } else {
            shareConversationViewModelImpl$makeShareLink$1 = new ShareConversationViewModelImpl$makeShareLink$1(shareConversationViewModelImpl, abstractC19687c);
        }
        Object objM6152a = shareConversationViewModelImpl$makeShareLink$1.f39793Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = shareConversationViewModelImpl$makeShareLink$1.f39795p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM6152a);
            String str = c6636i.f21379a;
            String str2 = c6636i.f21383e;
            if (str2 == null) {
                str2 = null;
            }
            shareConversationViewModelImpl$makeShareLink$1.f39792Y = shareConversationViewModelImpl;
            shareConversationViewModelImpl$makeShareLink$1.f39795p0 = 1;
            objM6152a = shareConversationViewModelImpl.f39775j.m6152a(str, str2, shareConversationViewModelImpl$makeShareLink$1, z6);
            if (objM6152a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shareConversationViewModelImpl = shareConversationViewModelImpl$makeShareLink$1.f39792Y;
            AbstractC9233X.m9807c(objM6152a);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM6152a;
        if (abstractC21955Q1 instanceof C21952P1) {
            shareConversationViewModelImpl.m14397m(new ShareConversationViewModelImpl$makeShareLink$2$1((C2017i) ((C21952P1) abstractC21955Q1).f69511a));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8731f(shareConversationViewModelImpl.f39777l, "Failed to fetch conversation", abstractC21933K1.f69485a, null, 4);
            shareConversationViewModelImpl.m14393h(new C2059h(abstractC21933K1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: p */
    public static final Object m14367p(ShareConversationViewModelImpl shareConversationViewModelImpl, String str, boolean z6, String str2, AbstractC19687c abstractC19687c) {
        ShareConversationViewModelImpl$publishConversation$1 shareConversationViewModelImpl$publishConversation$1;
        shareConversationViewModelImpl.getClass();
        if (abstractC19687c instanceof ShareConversationViewModelImpl$publishConversation$1) {
            shareConversationViewModelImpl$publishConversation$1 = (ShareConversationViewModelImpl$publishConversation$1) abstractC19687c;
            int i10 = shareConversationViewModelImpl$publishConversation$1.f39806p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                shareConversationViewModelImpl$publishConversation$1.f39806p0 = i10 - Integer.MIN_VALUE;
            } else {
                shareConversationViewModelImpl$publishConversation$1 = new ShareConversationViewModelImpl$publishConversation$1(shareConversationViewModelImpl, abstractC19687c);
            }
        } else {
            shareConversationViewModelImpl$publishConversation$1 = new ShareConversationViewModelImpl$publishConversation$1(shareConversationViewModelImpl, abstractC19687c);
        }
        Object objM6155d = shareConversationViewModelImpl$publishConversation$1.f39804Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = shareConversationViewModelImpl$publishConversation$1.f39806p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM6155d);
            shareConversationViewModelImpl.m14397m(ShareConversationViewModelImpl$publishConversation$2.f39807Y);
            shareConversationViewModelImpl$publishConversation$1.f39803Y = shareConversationViewModelImpl;
            shareConversationViewModelImpl$publishConversation$1.f39806p0 = 1;
            objM6155d = shareConversationViewModelImpl.f39775j.m6155d(str, str2, shareConversationViewModelImpl$publishConversation$1, z6);
            if (objM6155d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shareConversationViewModelImpl = shareConversationViewModelImpl$publishConversation$1.f39803Y;
            AbstractC9233X.m9807c(objM6155d);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM6155d;
        if (abstractC21955Q1 instanceof C21952P1) {
            C8856r c8856r = (C8856r) shareConversationViewModelImpl.f40343c.getValue();
            C20855A c20855a = C20855A.f66297c;
            String str3 = c8856r.f27110a;
            if (str3 == null) {
                str3 = "";
            }
            C17309l c17309l = new C17309l("url", str3);
            String str4 = c8856r.f27118i;
            shareConversationViewModelImpl.f39776k.mo21447a(c20855a, AbstractC17659D.m19244f(c17309l, new C17309l("share_id", str4 != null ? str4 : ""), new C17309l("location", "standard_share_sheet")));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TITLE", c8856r.f27111b);
            intent.putExtra("android.intent.extra.TEXT", c8856r.f27110a);
            Intent intentCreateChooser = Intent.createChooser(intent, null);
            AbstractC16544l.m18091d(intentCreateChooser);
            shareConversationViewModelImpl.m14393h(new C2055d(intentCreateChooser));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8731f(shareConversationViewModelImpl.f39777l, "Failed to publish conversation", abstractC21933K1.f69485a, null, 4);
            shareConversationViewModelImpl.m14393h(new C2059h(abstractC21933K1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        shareConversationViewModelImpl.m14397m(ShareConversationViewModelImpl$publishConversation$5.f39808Y);
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC8855q intent = (InterfaceC8855q) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C8852n) {
            m14397m(new ShareConversationViewModelImpl$onIntent$1(intent));
            return;
        }
        if (intent instanceof C8854p) {
            m14397m(ShareConversationViewModelImpl$toggleAnonymity$1.f39814Y);
            return;
        }
        if (intent instanceof C8853o) {
            m14394i(new ShareConversationViewModelImpl$onIntent$2(this, null));
            return;
        }
        if (intent instanceof C8851m) {
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, "https://help.openai.com/en/articles/7925741-chatgpt-shared-links-faq");
            m14393h(new C2055d(intent2));
        } else if (intent instanceof C8850l) {
            m14394i(new ShareConversationViewModelImpl$onIntent$3(this, intent, null));
        }
    }
}
