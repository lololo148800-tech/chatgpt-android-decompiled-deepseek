package com.openai.feature.settings.impl.memory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bf.AbstractC11372a0;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13894T0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.C1699d;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1042uh.C20263a0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p406Qg.C6692C;
import p406Qg.C6693D;
import p406Qg.C6694E;
import p406Qg.C6695F;
import p406Qg.C6696G;
import p406Qg.C6697H;
import p406Qg.C6698I;
import p406Qg.C6704O;
import p406Qg.InterfaceC6699J;
import p456Sg.C7132c;
import p506Ug.C7671f;
import p506Ug.C7674i;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p576Xe.C9473F;
import p708dh.C13132J;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/memory/ViewMemoryViewModelImpl;", "Lcom/openai/feature/settings/impl/memory/ViewMemoryViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ViewMemoryViewModelImpl extends ViewMemoryViewModel {

    /* JADX INFO: renamed from: i */
    public final C7132c f39652i;

    /* JADX INFO: renamed from: j */
    public final C13132J f39653j;

    /* JADX INFO: renamed from: k */
    public final C9473F f39654k;

    /* JADX INFO: renamed from: l */
    public final C3430e f39655l;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$1", m20656f = "ViewMemoryViewModel.kt", m20657l = {75}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124971 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39656Y;

        public C124971(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ViewMemoryViewModelImpl.this.new C124971(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124971) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39656Y;
            ViewMemoryViewModelImpl viewMemoryViewModelImpl = ViewMemoryViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C13132J c13132j = viewMemoryViewModelImpl.f39653j;
                this.f39656Y = 1;
                obj = c13132j.m14807d(this);
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
                viewMemoryViewModelImpl.m14397m(new ViewMemoryViewModelImpl$1$1$1((C1699d) ((C21952P1) abstractC21955Q1).f69511a));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC8160o6.m8731f(viewMemoryViewModelImpl.f39655l, "Failed to get user settings", ((AbstractC21933K1) abstractC21955Q1).f69485a, null, 4);
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$2 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$2", m20656f = "ViewMemoryViewModel.kt", m20657l = {81}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124982 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39659Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$2$3, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LQg/O;", "invoke", "(LQg/O;)LQg/O;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass3 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass3 f39662Y = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C6704O setState = (C6704O) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C6704O.m7183e(setState, null, false, false, null, null, null, false, null, null, 1021);
            }
        }

        public C124982(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ViewMemoryViewModelImpl.this.new C124982(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124982) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39659Y;
            ViewMemoryViewModelImpl viewMemoryViewModelImpl = ViewMemoryViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C7132c c7132c = viewMemoryViewModelImpl.f39652i;
                this.f39659Y = 1;
                obj = c7132c.m7523b(null, true, this);
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
                viewMemoryViewModelImpl.m14397m(new ViewMemoryViewModelImpl$2$1$1((C7674i) ((C21952P1) abstractC21955Q1).f69511a));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                viewMemoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            viewMemoryViewModelImpl.m14397m(AnonymousClass3.f39662Y);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$3 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$3", m20656f = "ViewMemoryViewModel.kt", m20657l = {88}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124993 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f39663Y;

        public C124993(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return ViewMemoryViewModelImpl.this.new C124993(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124993) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39663Y;
            ViewMemoryViewModelImpl viewMemoryViewModelImpl = ViewMemoryViewModelImpl.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C9473F c9473f = viewMemoryViewModelImpl.f39654k;
                this.f39663Y = 1;
                obj = c9473f.m10011j(this);
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
                viewMemoryViewModelImpl.m14397m(new ViewMemoryViewModelImpl$3$1$1((List) ((C21952P1) abstractC21955Q1).f69511a));
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                viewMemoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            AbstractC8160o6.m8728c(viewMemoryViewModelImpl.f39655l, "anton " + ((C6704O) viewMemoryViewModelImpl.m14391f()).f21545i, null, null, 6);
            return C17296C.f55119a;
        }
    }

    public ViewMemoryViewModelImpl(InterfaceC13849E interfaceC13849E, C7132c c7132c, C13132J c13132j, C9473F c9473f) {
        super(new C6704O(null, true, false, ((C14005w2) interfaceC13849E).m15481a(C13894T0.f43943c), null, null, "", false, C17689w.f56480Y, null));
        this.f39652i = c7132c;
        this.f39653j = c13132j;
        this.f39654k = c9473f;
        this.f39655l = AbstractC8168p6.m8749b("ViewMemoryViewModel", null);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124971(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124982(null), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C124993(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14359n(ViewMemoryViewModelImpl viewMemoryViewModelImpl, C7671f c7671f, AbstractC19687c abstractC19687c) {
        ViewMemoryViewModelImpl$delete$1 viewMemoryViewModelImpl$delete$1;
        viewMemoryViewModelImpl.getClass();
        if (abstractC19687c instanceof ViewMemoryViewModelImpl$delete$1) {
            viewMemoryViewModelImpl$delete$1 = (ViewMemoryViewModelImpl$delete$1) abstractC19687c;
            int i10 = viewMemoryViewModelImpl$delete$1.f39670q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                viewMemoryViewModelImpl$delete$1.f39670q0 = i10 - Integer.MIN_VALUE;
            } else {
                viewMemoryViewModelImpl$delete$1 = new ViewMemoryViewModelImpl$delete$1(viewMemoryViewModelImpl, abstractC19687c);
            }
        } else {
            viewMemoryViewModelImpl$delete$1 = new ViewMemoryViewModelImpl$delete$1(viewMemoryViewModelImpl, abstractC19687c);
        }
        Object objM7522a = viewMemoryViewModelImpl$delete$1.f39668o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = viewMemoryViewModelImpl$delete$1.f39670q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7522a);
            C20263a0 c20263a0 = ((C6704O) viewMemoryViewModelImpl.f40343c.getValue()).f21546j;
            String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
            viewMemoryViewModelImpl$delete$1.f39666Y = viewMemoryViewModelImpl;
            viewMemoryViewModelImpl$delete$1.f39667Z = c7671f;
            viewMemoryViewModelImpl$delete$1.f39670q0 = 1;
            objM7522a = viewMemoryViewModelImpl.f39652i.m7522a(strM12782a, c7671f, viewMemoryViewModelImpl$delete$1);
            if (objM7522a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7671f = viewMemoryViewModelImpl$delete$1.f39667Z;
            viewMemoryViewModelImpl = viewMemoryViewModelImpl$delete$1.f39666Y;
            AbstractC9233X.m9807c(objM7522a);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM7522a;
        if (abstractC21955Q1 instanceof C21952P1) {
            viewMemoryViewModelImpl.m14397m(new ViewMemoryViewModelImpl$delete$2$1(c7671f));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            viewMemoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14360o(ViewMemoryViewModelImpl viewMemoryViewModelImpl, AbstractC19687c abstractC19687c) {
        ViewMemoryViewModelImpl$deleteAll$1 viewMemoryViewModelImpl$deleteAll$1;
        viewMemoryViewModelImpl.getClass();
        if (abstractC19687c instanceof ViewMemoryViewModelImpl$deleteAll$1) {
            viewMemoryViewModelImpl$deleteAll$1 = (ViewMemoryViewModelImpl$deleteAll$1) abstractC19687c;
            int i10 = viewMemoryViewModelImpl$deleteAll$1.f39675p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                viewMemoryViewModelImpl$deleteAll$1.f39675p0 = i10 - Integer.MIN_VALUE;
            } else {
                viewMemoryViewModelImpl$deleteAll$1 = new ViewMemoryViewModelImpl$deleteAll$1(viewMemoryViewModelImpl, abstractC19687c);
            }
        } else {
            viewMemoryViewModelImpl$deleteAll$1 = new ViewMemoryViewModelImpl$deleteAll$1(viewMemoryViewModelImpl, abstractC19687c);
        }
        Object objM14806c = viewMemoryViewModelImpl$deleteAll$1.f39673Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = viewMemoryViewModelImpl$deleteAll$1.f39675p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM14806c);
            viewMemoryViewModelImpl.m14397m(ViewMemoryViewModelImpl$deleteAll$2.f39676Y);
            C20263a0 c20263a0 = ((C6704O) viewMemoryViewModelImpl.f40343c.getValue()).f21546j;
            String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
            viewMemoryViewModelImpl$deleteAll$1.f39672Y = viewMemoryViewModelImpl;
            viewMemoryViewModelImpl$deleteAll$1.f39675p0 = 1;
            objM14806c = viewMemoryViewModelImpl.f39653j.m14806c(strM12782a, viewMemoryViewModelImpl$deleteAll$1);
            if (objM14806c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewMemoryViewModelImpl = viewMemoryViewModelImpl$deleteAll$1.f39672Y;
            AbstractC9233X.m9807c(objM14806c);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM14806c;
        if (abstractC21955Q1 instanceof C21952P1) {
            viewMemoryViewModelImpl.m14397m(ViewMemoryViewModelImpl$deleteAll$3$1.f39677Y);
            viewMemoryViewModelImpl.m14392g(C6692C.f21521a);
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            viewMemoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        viewMemoryViewModelImpl.m14397m(ViewMemoryViewModelImpl$deleteAll$5.f39678Y);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: p */
    public static final Object m14361p(ViewMemoryViewModelImpl viewMemoryViewModelImpl, AbstractC19687c abstractC19687c) {
        ViewMemoryViewModelImpl$refresh$1 viewMemoryViewModelImpl$refresh$1;
        viewMemoryViewModelImpl.getClass();
        if (abstractC19687c instanceof ViewMemoryViewModelImpl$refresh$1) {
            viewMemoryViewModelImpl$refresh$1 = (ViewMemoryViewModelImpl$refresh$1) abstractC19687c;
            int i10 = viewMemoryViewModelImpl$refresh$1.f39697p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                viewMemoryViewModelImpl$refresh$1.f39697p0 = i10 - Integer.MIN_VALUE;
            } else {
                viewMemoryViewModelImpl$refresh$1 = new ViewMemoryViewModelImpl$refresh$1(viewMemoryViewModelImpl, abstractC19687c);
            }
        } else {
            viewMemoryViewModelImpl$refresh$1 = new ViewMemoryViewModelImpl$refresh$1(viewMemoryViewModelImpl, abstractC19687c);
        }
        Object objM7523b = viewMemoryViewModelImpl$refresh$1.f39695Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = viewMemoryViewModelImpl$refresh$1.f39697p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7523b);
            viewMemoryViewModelImpl.m14397m(ViewMemoryViewModelImpl$refresh$2.f39698Y);
            C20263a0 c20263a0 = ((C6704O) viewMemoryViewModelImpl.f40343c.getValue()).f21546j;
            String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
            viewMemoryViewModelImpl$refresh$1.f39694Y = viewMemoryViewModelImpl;
            viewMemoryViewModelImpl$refresh$1.f39697p0 = 1;
            objM7523b = viewMemoryViewModelImpl.f39652i.m7523b(strM12782a, true, viewMemoryViewModelImpl$refresh$1);
            if (objM7523b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewMemoryViewModelImpl = viewMemoryViewModelImpl$refresh$1.f39694Y;
            AbstractC9233X.m9807c(objM7523b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM7523b;
        if (abstractC21955Q1 instanceof C21952P1) {
            viewMemoryViewModelImpl.m14397m(new ViewMemoryViewModelImpl$refresh$3$1((C7674i) ((C21952P1) abstractC21955Q1).f69511a));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            viewMemoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        viewMemoryViewModelImpl.m14397m(ViewMemoryViewModelImpl$refresh$5.f39700Y);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: q */
    public static final Object m14362q(ViewMemoryViewModelImpl viewMemoryViewModelImpl, C20263a0 c20263a0, AbstractC19687c abstractC19687c) {
        ViewMemoryViewModelImpl$selectGizmo$1 viewMemoryViewModelImpl$selectGizmo$1;
        viewMemoryViewModelImpl.getClass();
        if (abstractC19687c instanceof ViewMemoryViewModelImpl$selectGizmo$1) {
            viewMemoryViewModelImpl$selectGizmo$1 = (ViewMemoryViewModelImpl$selectGizmo$1) abstractC19687c;
            int i10 = viewMemoryViewModelImpl$selectGizmo$1.f39704p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                viewMemoryViewModelImpl$selectGizmo$1.f39704p0 = i10 - Integer.MIN_VALUE;
            } else {
                viewMemoryViewModelImpl$selectGizmo$1 = new ViewMemoryViewModelImpl$selectGizmo$1(viewMemoryViewModelImpl, abstractC19687c);
            }
        } else {
            viewMemoryViewModelImpl$selectGizmo$1 = new ViewMemoryViewModelImpl$selectGizmo$1(viewMemoryViewModelImpl, abstractC19687c);
        }
        Object objM7523b = viewMemoryViewModelImpl$selectGizmo$1.f39702Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = viewMemoryViewModelImpl$selectGizmo$1.f39704p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7523b);
            viewMemoryViewModelImpl.m14397m(new ViewMemoryViewModelImpl$selectGizmo$2(c20263a0));
            String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
            viewMemoryViewModelImpl$selectGizmo$1.f39701Y = viewMemoryViewModelImpl;
            viewMemoryViewModelImpl$selectGizmo$1.f39704p0 = 1;
            objM7523b = viewMemoryViewModelImpl.f39652i.m7523b(strM12782a, true, viewMemoryViewModelImpl$selectGizmo$1);
            if (objM7523b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewMemoryViewModelImpl = viewMemoryViewModelImpl$selectGizmo$1.f39701Y;
            AbstractC9233X.m9807c(objM7523b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM7523b;
        if (abstractC21955Q1 instanceof C21952P1) {
            viewMemoryViewModelImpl.m14397m(new ViewMemoryViewModelImpl$selectGizmo$3$1((C7674i) ((C21952P1) abstractC21955Q1).f69511a));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            viewMemoryViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        viewMemoryViewModelImpl.m14397m(ViewMemoryViewModelImpl$selectGizmo$5.f39707Y);
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC6699J intent = (InterfaceC6699J) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C6695F) {
            m14394i(new ViewMemoryViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C6693D) {
            m14394i(new ViewMemoryViewModelImpl$onIntent$2(this, intent, null));
            return;
        }
        if (intent instanceof C6694E) {
            m14397m(new ViewMemoryViewModelImpl$onIntent$3(intent));
            return;
        }
        if (intent instanceof C6698I) {
            m14394i(new ViewMemoryViewModelImpl$onIntent$4(this, intent, null));
        } else if (intent instanceof C6696G) {
            m14394i(new ViewMemoryViewModelImpl$onIntent$5(this, null));
        } else if (intent instanceof C6697H) {
            m14394i(new ViewMemoryViewModelImpl$onIntent$6(this, intent, null));
        }
    }
}
