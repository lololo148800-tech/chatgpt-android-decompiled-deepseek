package com.openai.feature.gizmos.impl.store;

import af.C10546B;
import af.C10547C;
import af.C10548D;
import af.C10549E;
import af.C10550F;
import af.C10571a0;
import af.C10573b0;
import af.C10575c0;
import af.InterfaceC10551G;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bf.C11349D;
import bf.C11363S;
import bf.C11364T;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.Iterator;
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
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.InterfaceC21925I1;
import p318Mh.C5378Q;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p576Xe.C9473F;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/store/GizmoStoreViewModelImpl;", "Lcom/openai/feature/gizmos/impl/store/GizmoStoreViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmoStoreViewModelImpl extends GizmoStoreViewModel {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f38231l = 0;

    /* JADX INFO: renamed from: i */
    public final C9473F f38232i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f38233j;

    /* JADX INFO: renamed from: k */
    public final C2153Q0 f38234k;

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$1", m20656f = "GizmoStoreViewModel.kt", m20657l = {110}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123661 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f38235Y;

        public C123661(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return GizmoStoreViewModelImpl.this.new C123661(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C123661) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38235Y;
            GizmoStoreViewModelImpl gizmoStoreViewModelImpl = GizmoStoreViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C9473F c9473f = gizmoStoreViewModelImpl.f38232i;
                this.f38235Y = 1;
                obj = c9473f.m10010i(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof C21952P1) {
                GizmoStoreViewModelImpl$1$1$1 gizmoStoreViewModelImpl$1$1$1 = new GizmoStoreViewModelImpl$1$1$1((List) ((C21952P1) abstractC21955Q1).f69511a);
                int i11 = GizmoStoreViewModelImpl.f38231l;
                gizmoStoreViewModelImpl.m14397m(gizmoStoreViewModelImpl$1$1$1);
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                C2059h c2059h = new C2059h((AbstractC21933K1) abstractC21955Q1);
                int i12 = GizmoStoreViewModelImpl.f38231l;
                gizmoStoreViewModelImpl.m14393h(c2059h);
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$2", m20656f = "GizmoStoreViewModel.kt", m20657l = {117}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123672 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f38238Y;

        public C123672(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return GizmoStoreViewModelImpl.this.new C123672(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C123672) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38238Y;
            GizmoStoreViewModelImpl gizmoStoreViewModelImpl = GizmoStoreViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C9473F c9473f = gizmoStoreViewModelImpl.f38232i;
                this.f38238Y = 1;
                obj = c9473f.m10012k(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof C21952P1) {
                GizmoStoreViewModelImpl$2$1$1 gizmoStoreViewModelImpl$2$1$1 = new GizmoStoreViewModelImpl$2$1$1((C11363S) ((C21952P1) abstractC21955Q1).f69511a);
                int i11 = GizmoStoreViewModelImpl.f38231l;
                gizmoStoreViewModelImpl.m14397m(gizmoStoreViewModelImpl$2$1$1);
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                C2059h c2059h = new C2059h((AbstractC21933K1) abstractC21955Q1);
                int i12 = GizmoStoreViewModelImpl.f38231l;
                gizmoStoreViewModelImpl.m14393h(c2059h);
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$4 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$4", m20656f = "GizmoStoreViewModel.kt", m20657l = {126}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "it", "Lmm/C;", "<anonymous>", "(Ljava/lang/String;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123684 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f38241Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f38242Z;

        public C123684(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C123684 c123684 = GizmoStoreViewModelImpl.this.new C123684(interfaceC18770c);
            c123684.f38242Z = obj;
            return c123684;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C123684) create((String) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38241Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                String str = (String) this.f38242Z;
                this.f38241Y = 1;
                if (GizmoStoreViewModelImpl.m14283p(GizmoStoreViewModelImpl.this, str, this) == enumC19250a) {
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

    /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$6 */
    @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$6", m20656f = "GizmoStoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "it", "Lmm/C;", "<anonymous>", "(Ljava/lang/String;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123696 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$6$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Laf/b0;", "invoke", "(Laf/b0;)Laf/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f38245Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C10573b0 setState = (C10573b0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C10573b0.m10982e(setState, null, null, null, null, 7);
            }
        }

        public C123696(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return GizmoStoreViewModelImpl.this.new C123696(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C123696 c123696 = (C123696) create((String) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c123696.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.f38245Y;
            int i10 = GizmoStoreViewModelImpl.f38231l;
            GizmoStoreViewModelImpl.this.m14397m(anonymousClass1);
            return C17296C.f55119a;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/store/GizmoStoreViewModelImpl$Companion;", "", "()V", "SearchDebounceMs", "", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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

    public GizmoStoreViewModelImpl(C9473F c9473f, InterfaceC20904w interfaceC20904w) {
        super(new C10573b0(C17689w.f56480Y, null, new C10575c0((InterfaceC21925I1) null, 3), null));
        this.f38232i = c9473f;
        this.f38233j = interfaceC20904w;
        final C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c("");
        this.f38234k = c2153q0M3204c;
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C123661(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C123672(null), 3);
        final InterfaceC2184i interfaceC2184iM3214m = AbstractC2124C.m3214m(c2153q0M3204c, 400L);
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123762<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f38299Y;

                /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$1$2", m20656f = "GizmoStoreViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f38300Y;

                    /* JADX INFO: renamed from: Z */
                    public int f38301Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f38300Y = obj;
                        this.f38301Z |= Integer.MIN_VALUE;
                        return C123762.this.mo395a(null, this);
                    }
                }

                public C123762(InterfaceC2186j interfaceC2186j) {
                    this.f38299Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f38301Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f38301Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f38300Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f38301Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (!AbstractC21322p.m21681O((String) obj)) {
                            anonymousClass1.f38301Z = 1;
                            if (this.f38299Y.mo395a(obj, anonymousClass1) == enumC19250a) {
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
                Object objMo3141d = interfaceC2184iM3214m.mo3141d(new C123762(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, 5, new C123684(null)), ViewModelKt.m12143a(this));
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$2$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C123772<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f38304Y;

                /* JADX INFO: renamed from: com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$2$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.store.GizmoStoreViewModelImpl$special$$inlined$filter$2$2", m20656f = "GizmoStoreViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f38305Y;

                    /* JADX INFO: renamed from: Z */
                    public int f38306Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f38305Y = obj;
                        this.f38306Z |= Integer.MIN_VALUE;
                        return C123772.this.mo395a(null, this);
                    }
                }

                public C123772(InterfaceC2186j interfaceC2186j) {
                    this.f38304Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f38306Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f38306Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f38305Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f38306Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (AbstractC21322p.m21681O((String) obj)) {
                            anonymousClass1.f38306Z = 1;
                            if (this.f38304Y.mo395a(obj, anonymousClass1) == enumC19250a) {
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
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
                c2153q0M3204c.mo3141d(new C123772(interfaceC2186j), interfaceC18770c);
                return EnumC19250a.f61036Y;
            }
        }, 5, new C123696(null)), ViewModelKt.m12143a(this));
    }

    /* JADX INFO: renamed from: n */
    public static final C10573b0 m14281n(GizmoStoreViewModelImpl gizmoStoreViewModelImpl, C10573b0 c10573b0, C11364T c11364t, InterfaceC1436k interfaceC1436k) {
        C10571a0 c10571a0;
        gizmoStoreViewModelImpl.getClass();
        List list = c10573b0.f31397a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C10575c0 c10575c0 = (C10575c0) it.next();
            C11363S c11363s = c10575c0.f31411c;
            if (AbstractC16544l.m18089b(c11363s != null ? c11363s.f34359a : null, c11364t)) {
                c10575c0 = (C10575c0) interfaceC1436k.invoke(c10575c0);
            }
            arrayList.add(c10575c0);
        }
        C10571a0 c10571a1 = c10573b0.f31400d;
        if (c10571a1 != null) {
            C10575c0 category = c10571a1.f31387b;
            C11363S c11363s2 = category.f31411c;
            if (AbstractC16544l.m18089b(c11363s2 != null ? c11363s2.f34359a : null, c11364t)) {
                category = (C10575c0) interfaceC1436k.invoke(category);
            }
            String query = c10571a1.f31386a;
            AbstractC16544l.m18094g(query, "query");
            AbstractC16544l.m18094g(category, "category");
            String id2 = c10571a1.f31388c;
            AbstractC16544l.m18094g(id2, "id");
            c10571a0 = new C10571a0(query, category, id2);
        } else {
            c10571a0 = null;
        }
        C10575c0 c10575c1 = c10573b0.f31399c;
        C11363S c11363s3 = c10575c1.f31411c;
        if (AbstractC16544l.m18089b(c11363s3 != null ? c11363s3.f34359a : null, c11364t)) {
            c10575c1 = (C10575c0) interfaceC1436k.invoke(c10575c1);
        }
        return C10573b0.m10982e(c10573b0, arrayList, null, c10575c1, c10571a0, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: o */
    public static final Object m14282o(GizmoStoreViewModelImpl gizmoStoreViewModelImpl, C11363S c11363s, AbstractC19687c abstractC19687c) {
        GizmoStoreViewModelImpl$onCategoryLoadMoreShown$1 gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1;
        gizmoStoreViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmoStoreViewModelImpl$onCategoryLoadMoreShown$1) {
            gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1 = (GizmoStoreViewModelImpl$onCategoryLoadMoreShown$1) abstractC19687c;
            int i10 = gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38250q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38250q0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1 = new GizmoStoreViewModelImpl$onCategoryLoadMoreShown$1(gizmoStoreViewModelImpl, abstractC19687c);
            }
        } else {
            gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1 = new GizmoStoreViewModelImpl$onCategoryLoadMoreShown$1(gizmoStoreViewModelImpl, abstractC19687c);
        }
        Object objM10014m = gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38248o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38250q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10014m);
            if (c11363s.f34361c != null) {
                gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onCategoryLoadMoreShown$2(gizmoStoreViewModelImpl, c11363s));
                gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38246Y = gizmoStoreViewModelImpl;
                gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38247Z = c11363s;
                gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38250q0 = 1;
                objM10014m = gizmoStoreViewModelImpl.f38232i.m10014m(c11363s, gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1);
                if (objM10014m == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c11363s = gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38247Z;
        gizmoStoreViewModelImpl = gizmoStoreViewModelImpl$onCategoryLoadMoreShown$1.f38246Y;
        AbstractC9233X.m9807c(objM10014m);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10014m;
        if (abstractC21955Q1 instanceof C21952P1) {
            C11363S c11363s2 = (C11363S) ((C21952P1) abstractC21955Q1).f69511a;
            InterfaceC20904w interfaceC20904w = gizmoStoreViewModelImpl.f38233j;
            C20893l c20893l = C20893l.f66571i;
            String str = c11363s.f34359a.f34364a;
            if (str == null) {
                str = "";
            }
            interfaceC20904w.mo21447a(c20893l, AbstractC17659D.m19244f(new C17309l("cutId", str), new C17309l("count", new Integer(c11363s2.f34360b.size()))));
            gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onCategoryLoadMoreShown$3$1(gizmoStoreViewModelImpl, c11363s, c11363s2));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            gizmoStoreViewModelImpl.m14393h(new C2059h(abstractC21933K1));
            gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onCategoryLoadMoreShown$4$1(gizmoStoreViewModelImpl, c11363s, abstractC21933K1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: p */
    public static final Object m14283p(GizmoStoreViewModelImpl gizmoStoreViewModelImpl, String str, AbstractC19687c abstractC19687c) {
        GizmoStoreViewModelImpl$onSearch$1 gizmoStoreViewModelImpl$onSearch$1;
        gizmoStoreViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmoStoreViewModelImpl$onSearch$1) {
            gizmoStoreViewModelImpl$onSearch$1 = (GizmoStoreViewModelImpl$onSearch$1) abstractC19687c;
            int i10 = gizmoStoreViewModelImpl$onSearch$1.f38276q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmoStoreViewModelImpl$onSearch$1.f38276q0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmoStoreViewModelImpl$onSearch$1 = new GizmoStoreViewModelImpl$onSearch$1(gizmoStoreViewModelImpl, abstractC19687c);
            }
        } else {
            gizmoStoreViewModelImpl$onSearch$1 = new GizmoStoreViewModelImpl$onSearch$1(gizmoStoreViewModelImpl, abstractC19687c);
        }
        Object objM10019r = gizmoStoreViewModelImpl$onSearch$1.f38274o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmoStoreViewModelImpl$onSearch$1.f38276q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10019r);
            gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onSearch$2(str));
            gizmoStoreViewModelImpl$onSearch$1.f38272Y = gizmoStoreViewModelImpl;
            gizmoStoreViewModelImpl$onSearch$1.f38273Z = str;
            gizmoStoreViewModelImpl$onSearch$1.f38276q0 = 1;
            objM10019r = gizmoStoreViewModelImpl.f38232i.m10019r(str, null, gizmoStoreViewModelImpl$onSearch$1);
            if (objM10019r == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = gizmoStoreViewModelImpl$onSearch$1.f38273Z;
            gizmoStoreViewModelImpl = gizmoStoreViewModelImpl$onSearch$1.f38272Y;
            AbstractC9233X.m9807c(objM10019r);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10019r;
        if (abstractC21955Q1 instanceof C21952P1) {
            C11363S c11363s = (C11363S) ((C21952P1) abstractC21955Q1).f69511a;
            gizmoStoreViewModelImpl.f38233j.mo21447a(C20893l.f66575m, AbstractC17659D.m19244f(new C17309l("query", str), new C17309l("count", new Integer(c11363s.f34360b.size()))));
            gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onSearch$3$1(str, c11363s));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmoStoreViewModelImpl.m14397m(GizmoStoreViewModelImpl$onSearch$4$1.f38280Y);
            gizmoStoreViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            gizmoStoreViewModelImpl.m14397m(GizmoStoreViewModelImpl$onSearch$5$1.f38281Y);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: q */
    public static final Object m14284q(GizmoStoreViewModelImpl gizmoStoreViewModelImpl, C11363S c11363s, AbstractC19687c abstractC19687c) {
        GizmoStoreViewModelImpl$onSearchLoadMore$1 gizmoStoreViewModelImpl$onSearchLoadMore$1;
        gizmoStoreViewModelImpl.getClass();
        if (abstractC19687c instanceof GizmoStoreViewModelImpl$onSearchLoadMore$1) {
            gizmoStoreViewModelImpl$onSearchLoadMore$1 = (GizmoStoreViewModelImpl$onSearchLoadMore$1) abstractC19687c;
            int i10 = gizmoStoreViewModelImpl$onSearchLoadMore$1.f38286q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gizmoStoreViewModelImpl$onSearchLoadMore$1.f38286q0 = i10 - Integer.MIN_VALUE;
            } else {
                gizmoStoreViewModelImpl$onSearchLoadMore$1 = new GizmoStoreViewModelImpl$onSearchLoadMore$1(gizmoStoreViewModelImpl, abstractC19687c);
            }
        } else {
            gizmoStoreViewModelImpl$onSearchLoadMore$1 = new GizmoStoreViewModelImpl$onSearchLoadMore$1(gizmoStoreViewModelImpl, abstractC19687c);
        }
        Object objM10019r = gizmoStoreViewModelImpl$onSearchLoadMore$1.f38284o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = gizmoStoreViewModelImpl$onSearchLoadMore$1.f38286q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10019r);
            C10571a0 c10571a0 = ((C10573b0) gizmoStoreViewModelImpl.f40343c.getValue()).f31400d;
            String str = c10571a0 != null ? c10571a0.f31386a : null;
            if (c11363s.f34361c != null && str != null) {
                gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onSearchLoadMore$2(gizmoStoreViewModelImpl, c11363s));
                gizmoStoreViewModelImpl$onSearchLoadMore$1.f38282Y = gizmoStoreViewModelImpl;
                gizmoStoreViewModelImpl$onSearchLoadMore$1.f38283Z = c11363s;
                gizmoStoreViewModelImpl$onSearchLoadMore$1.f38286q0 = 1;
                objM10019r = gizmoStoreViewModelImpl.f38232i.m10019r(str, c11363s, gizmoStoreViewModelImpl$onSearchLoadMore$1);
                if (objM10019r == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c11363s = gizmoStoreViewModelImpl$onSearchLoadMore$1.f38283Z;
        gizmoStoreViewModelImpl = gizmoStoreViewModelImpl$onSearchLoadMore$1.f38282Y;
        AbstractC9233X.m9807c(objM10019r);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10019r;
        if (abstractC21955Q1 instanceof C21952P1) {
            C11363S c11363s2 = (C11363S) ((C21952P1) abstractC21955Q1).f69511a;
            InterfaceC20904w interfaceC20904w = gizmoStoreViewModelImpl.f38233j;
            C20893l c20893l = C20893l.f66571i;
            String str2 = c11363s.f34359a.f34364a;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC20904w.mo21447a(c20893l, AbstractC17659D.m19244f(new C17309l("cutId", str2), new C17309l("count", new Integer(c11363s2.f34360b.size()))));
            gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onSearchLoadMore$3$1(gizmoStoreViewModelImpl, c11363s, c11363s2));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            gizmoStoreViewModelImpl.m14393h(new C2059h(abstractC21933K1));
            gizmoStoreViewModelImpl.m14397m(new GizmoStoreViewModelImpl$onSearchLoadMore$4$1(gizmoStoreViewModelImpl, c11363s, abstractC21933K1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC10551G intent = (InterfaceC10551G) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C10549E) {
            m14394i(new GizmoStoreViewModelImpl$onIntent$1(this, intent, null));
            return;
        }
        boolean z6 = intent instanceof C10546B;
        InterfaceC20904w interfaceC20904w = this.f38233j;
        if (z6) {
            C20893l c20893l = C20893l.f66576n;
            C11363S c11363s = ((C10546B) intent).f31310a;
            String str = c11363s != null ? c11363s.f34362d : null;
            interfaceC20904w.mo21448b(c20893l, str != null ? str : "", C17690x.f56481Y);
            m14397m(new GizmoStoreViewModelImpl$onIntent$2(intent));
            return;
        }
        if (!(intent instanceof C10548D)) {
            if (intent instanceof C10550F) {
                m14394i(new GizmoStoreViewModelImpl$onIntent$3(this, intent, null));
                return;
            } else {
                if (intent instanceof C10547C) {
                    m14394i(new GizmoStoreViewModelImpl$onIntent$4(this, intent, null));
                    return;
                }
                return;
            }
        }
        C10548D c10548d = (C10548D) intent;
        C20893l c20893l2 = C20893l.f66586x;
        C11349D c11349d = c10548d.f31313b;
        C17309l c17309l = new C17309l("gizmo_id", c11349d.f34318a);
        String str2 = c10548d.f31312a.f34364a;
        interfaceC20904w.mo21447a(c20893l2, AbstractC17659D.m19244f(c17309l, new C17309l("section", str2 != null ? str2 : "")));
        m14393h(new C2058g(C5378Q.f17630i.m5898d(c11349d.f34318a), true));
    }
}
