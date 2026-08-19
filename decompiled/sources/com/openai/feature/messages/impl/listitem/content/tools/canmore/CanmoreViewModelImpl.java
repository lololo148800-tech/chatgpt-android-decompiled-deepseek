package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import be.C11345b;
import com.auth0.android.result.Credentials;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13853F0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p003A1.C0254h0;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p077Cn.EnumC1733a;
import p086D6.C1970n;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2133G0;
import p103Dn.C2137I0;
import p103Dn.C2146N;
import p103Dn.C2197o0;
import p103Dn.C2207t0;
import p103Dn.C2215x0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p103Dn.InterfaceC2211v0;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p153Fn.C2942t;
import p168Gd.C3034b;
import p193Hf.AbstractC3409v;
import p193Hf.C3330S;
import p193Hf.C3332T;
import p193Hf.C3352c;
import p193Hf.C3355d;
import p193Hf.C3358e;
import p193Hf.C3361f;
import p193Hf.C3370i;
import p193Hf.C3373j;
import p193Hf.C3385n;
import p193Hf.C3388o;
import p193Hf.C3397r;
import p193Hf.C3406u;
import p193Hf.C3414w1;
import p193Hf.C3420z0;
import p193Hf.InterfaceC3364g;
import p195Hh.C3430e;
import p216Id.C3694b;
import p216Id.InterfaceC3698f;
import p364Oh.C6226E;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6653q0;
import p403Qd.AbstractC6659u;
import p403Qd.C6600F;
import p403Qd.C6615V;
import p427Rc.C6852i;
import p432Rh.C6906s;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8718u;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9315k3;
import p787he.C14459O;
import p857kl.C16464l;
import p905nd.C17589q;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import p948pi.C18418a;
import p956q3.C18621a;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p985r9.C18903m;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ye.C21514c;
import ye.C21515d;
import ye.C21525n;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/tools/canmore/CanmoreViewModelImpl;", "Lcom/openai/feature/messages/impl/listitem/content/tools/canmore/CanmoreViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CanmoreViewModelImpl extends CanmoreViewModel {

    /* JADX INFO: renamed from: i */
    public final Application f38865i;

    /* JADX INFO: renamed from: j */
    public final C20513d f38866j;

    /* JADX INFO: renamed from: k */
    public final C3332T f38867k;

    /* JADX INFO: renamed from: l */
    public final C14459O f38868l;

    /* JADX INFO: renamed from: m */
    public final C3414w1 f38869m;

    /* JADX INFO: renamed from: n */
    public final C3430e f38870n;

    /* JADX INFO: renamed from: o */
    public final C2215x0 f38871o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC2211v0 f38872p;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$1", m20656f = "CanmoreViewModel.kt", m20657l = {198}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124271 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38873Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ AbstractC21864z f38874Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ CanmoreViewModelImpl f38875o0;

        /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LHf/z0;", "invoke", "(LHf/z0;)LHf/z0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ Credentials f38876Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Credentials credentials) {
                super(1);
                this.f38876Y = credentials;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C3420z0 setState = (C3420z0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C3420z0.m4185e(setState, null, null, this.f38876Y, null, false, false, null, 991);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124271(AbstractC21864z abstractC21864z, CanmoreViewModelImpl canmoreViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f38874Z = abstractC21864z;
            this.f38875o0 = canmoreViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C124271(this.f38874Z, this.f38875o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C124271) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38873Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f38873Y = 1;
                obj = ((C17589q) this.f38874Z).m19219e(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            Credentials credentials = (Credentials) obj;
            C17296C c17296c = C17296C.f55119a;
            if (credentials == null) {
                return c17296c;
            }
            this.f38875o0.m14397m(new AnonymousClass1(credentials));
            return c17296c;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LHf/z0;", "Lye/d;", "it", "invoke", "(LHf/z0;Lye/d;)LHf/z0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124282 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124282 f38877Y = new C124282();

        public C124282() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C3420z0 setOnEach = (C3420z0) obj;
            C21515d it = (C21515d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C3420z0.m4185e(setOnEach, null, it, null, null, false, false, null, 1007);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LHf/z0;", "Lzi/h0;", "it", "invoke-mRA7E-s", "(LHf/z0;Ljava/lang/String;)LHf/z0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124293 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124293 f38878Y = new C124293();

        public C124293() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C3420z0 setOnEach = (C3420z0) obj;
            String it = ((C22011h0) obj2).f69652a;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C3420z0.m4185e(setOnEach, it, null, null, null, false, false, null, 1021);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$4 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$4", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "it", "", "<anonymous>", "(LId/b;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124304 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38879Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124304 c124304 = new C124304(2, interfaceC18770c);
            c124304.f38879Y = obj;
            return c124304;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124304) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(((C3694b) this.f38879Y).f11220e instanceof InterfaceC3698f);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$5 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LHf/z0;", "", "it", "invoke", "(LHf/z0;Z)LHf/z0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124315 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124315 f38880Y = new C124315();

        public C124315() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C3420z0 setOnEach = (C3420z0) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C3420z0.m4185e(setOnEach, null, null, null, null, zBooleanValue, false, null, 895);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$6 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$6", m20656f = "CanmoreViewModel.kt", m20657l = {210}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124326 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38881Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C6906s f38882Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ CanmoreViewModelImpl f38883o0;

        /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$6$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LHf/z0;", "invoke", "(LHf/z0;)LHf/z0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C16464l f38884Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C16464l c16464l) {
                super(1);
                this.f38884Y = c16464l;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C3420z0 setState = (C3420z0) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C3420z0.m4185e(setState, null, null, null, null, false, false, new C21952P1(AbstractC17681o.m19383l(this.f38884Y)), 511);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124326(C6906s c6906s, CanmoreViewModelImpl canmoreViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f38882Z = c6906s;
            this.f38883o0 = canmoreViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C124326(this.f38882Z, this.f38883o0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C124326) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38881Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f38881Y = 1;
                obj = this.f38882Z.m7293e("_playintegrity", this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            this.f38883o0.m14397m(new AnonymousClass1((C16464l) obj));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public CanmoreViewModelImpl(Application application, C20513d c20513d, C6226E c6226e, AbstractC21864z abstractC21864z, C18418a c18418a, C3332T c3332t, C11345b c11345b, C14459O c14459o, InterfaceC20904w interfaceC20904w, InterfaceC13849E interfaceC13849E, C6906s c6906s, C3414w1 c3414w1) {
        C6852i c6852i = c11345b.f34301c;
        super(new C3420z0("https://chatgpt.com/", ((C22011h0) c6852i.getValue()).f69652a, c18418a.f58775c, ((C14005w2) interfaceC13849E).m15481a(C13853F0.f43890c), new C21515d(), null, C17690x.f56481Y, false, false, null));
        this.f38865i = application;
        this.f38866j = c20513d;
        this.f38867k = c3332t;
        this.f38868l = c14459o;
        this.f38869m = c3414w1;
        this.f38870n = AbstractC8168p6.m8749b("CanmoreViewModel", null);
        CanmoreViewModelImpl$updatedOnNativeSideIds$1 canmoreViewModelImpl$updatedOnNativeSideIds$1 = new CanmoreViewModelImpl$updatedOnNativeSideIds$1(2, null);
        C2207t0 c2207t0 = c14459o.f45526y;
        final CanmoreViewModelImpl$special$$inlined$filter$1 canmoreViewModelImpl$special$$inlined$filter$1 = new CanmoreViewModelImpl$special$$inlined$filter$1(new CanmoreViewModelImpl$special$$inlined$filterIsInstance$1(AbstractC9206S2.m9771b(canmoreViewModelImpl$updatedOnNativeSideIds$1, c2207t0)));
        C1970n c1970n = new C1970n(new C1970n(new C2146N(AbstractC9206S2.m9771b(new CanmoreViewModelImpl$updatedOnNativeSideIds$4(2, null), new InterfaceC2184i() { // from class: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$special$$inlined$mapNotNull$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C124392<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f38928Y;

                /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$special$$inlined$mapNotNull$1$2", m20656f = "CanmoreViewModel.kt", m20657l = {53}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f38929Y;

                    /* JADX INFO: renamed from: Z */
                    public int f38930Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f38929Y = obj;
                        this.f38930Z |= Integer.MIN_VALUE;
                        return C124392.this.mo395a(null, this);
                    }
                }

                public C124392(InterfaceC2186j interfaceC2186j) {
                    this.f38928Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f38930Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f38930Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f38929Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f38930Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        AbstractC6659u abstractC6659u = (AbstractC6659u) obj;
                        if (!(abstractC6659u instanceof C6600F)) {
                            abstractC6659u = null;
                        }
                        if (abstractC6659u != null) {
                            anonymousClass1.f38930Z = 1;
                            if (this.f38928Y.mo395a(abstractC6659u, anonymousClass1) == enumC19250a) {
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
                Object objMo3141d = canmoreViewModelImpl$special$$inlined$filter$1.mo3141d(new C124392(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }), 2), 5, new CanmoreViewModelImpl$updatedOnNativeSideIds$5(interfaceC20904w, null)), 5, new CanmoreViewModelImpl$updatedOnNativeSideIds$6(this, null));
        C18621a c18621aM12143a = ViewModelKt.m12143a(this);
        C2137I0 c2137i0 = C2133G0.f6536a;
        C18903m c18903mM3213l = AbstractC2124C.m3213l(c1970n, 0);
        C2127D0 c2127d0M3202a = AbstractC2124C.m3202a(0, c18903mM3213l.f60267a, (EnumC1733a) c18903mM3213l.f60269c);
        C2942t c2942t = AbstractC2124C.f6496c;
        AbstractC0575H.m1155C(c18621aM12143a, (InterfaceC18776i) c18903mM3213l.f60270d, c2137i0.equals(c2137i0) ? EnumC0573G.f1790Y : EnumC0573G.f1793p0, new C2197o0(c2137i0, (InterfaceC2184i) c18903mM3213l.f60268b, c2127d0M3202a, c2942t, null));
        this.f38871o = new C2215x0(c2127d0M3202a);
        this.f38872p = c3332t.f10183b;
        m14394i(new C124271(abstractC21864z, this, null));
        m14396l(C124282.f38877Y, c3332t.f10182a);
        m14396l(C124293.f38878Y, c6852i);
        m14396l(C124315.f38880Y, AbstractC9206S2.m9771b(new C124304(2, null), c2207t0));
        m14394i(new C124326(c6906s, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14319n(CanmoreViewModelImpl canmoreViewModelImpl, AbstractC19687c abstractC19687c) {
        CanmoreViewModelImpl$handleStreamingFromWebFinished$1 canmoreViewModelImpl$handleStreamingFromWebFinished$1;
        AbstractC6601G abstractC6601G;
        AbstractC6659u abstractC6659u;
        AbstractC6659u abstractC6659u2;
        C6600F c6600f;
        AbstractC6653q0 abstractC6653q0;
        C3034b c3034b;
        String str;
        C21525n c21525n;
        String str2;
        boolean zEquals;
        canmoreViewModelImpl.getClass();
        if (abstractC19687c instanceof CanmoreViewModelImpl$handleStreamingFromWebFinished$1) {
            canmoreViewModelImpl$handleStreamingFromWebFinished$1 = (CanmoreViewModelImpl$handleStreamingFromWebFinished$1) abstractC19687c;
            int i10 = canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38908p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38908p0 = i10 - Integer.MIN_VALUE;
            } else {
                canmoreViewModelImpl$handleStreamingFromWebFinished$1 = new CanmoreViewModelImpl$handleStreamingFromWebFinished$1(canmoreViewModelImpl, abstractC19687c);
            }
        } else {
            canmoreViewModelImpl$handleStreamingFromWebFinished$1 = new CanmoreViewModelImpl$handleStreamingFromWebFinished$1(canmoreViewModelImpl, abstractC19687c);
        }
        Object objM3221t = canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38906Z;
        Object obj = EnumC19250a.f61036Y;
        int i11 = canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38908p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            canmoreViewModelImpl.m14397m(CanmoreViewModelImpl$handleStreamingFromWebFinished$2.f38909Y);
            canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38905Y = canmoreViewModelImpl;
            canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38908p0 = 1;
            if (AbstractC8718u.m9434c(canmoreViewModelImpl.f38868l, canmoreViewModelImpl$handleStreamingFromWebFinished$1) != obj) {
            }
            return obj;
        }
        if (i11 == 1) {
            canmoreViewModelImpl = canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38905Y;
            AbstractC9233X.m9807c(objM3221t);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            canmoreViewModelImpl = canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38905Y;
            AbstractC9233X.m9807c(objM3221t);
        }
        abstractC6601G = (AbstractC6601G) AbstractC17680n.m19353c0(((C3694b) objM3221t).f11224i);
        obj = C17296C.f55119a;
        if (abstractC6601G != null) {
            if (!(abstractC6601G instanceof AbstractC6659u)) {
                abstractC6601G = null;
            }
            abstractC6659u = (AbstractC6659u) abstractC6601G;
            if (abstractC6659u != null) {
                if (abstractC6659u instanceof C6600F) {
                    abstractC6659u2 = abstractC6659u;
                } else {
                    abstractC6659u2 = null;
                }
                c6600f = (C6600F) abstractC6659u2;
                if (c6600f != null) {
                    abstractC6653q0 = c6600f.f21314f;
                } else {
                    abstractC6653q0 = null;
                }
                if (abstractC6653q0 instanceof C6615V) {
                    c3034b = ((C6615V) abstractC6653q0).f21342b;
                    if (c3034b != null) {
                        str = c3034b.f9128a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        C3332T c3332t = canmoreViewModelImpl.f38867k;
                        c3332t.getClass();
                        c3332t.f10183b.mo3231f(new C21514c(str));
                    }
                    c21525n = ((C21515d) canmoreViewModelImpl.f38867k.f10182a.getValue()).f68137f;
                    if (c21525n != null) {
                        str2 = c21525n.f68169b;
                    } else {
                        str2 = null;
                    }
                    if (str != null) {
                        if (str2 == null) {
                            zEquals = false;
                        } else {
                            zEquals = str.equals(str2);
                        }
                        if (!zEquals) {
                            String messageId = abstractC6659u.m7172d().f23286a;
                            C3332T c3332t2 = canmoreViewModelImpl.f38867k;
                            c3332t2.getClass();
                            AbstractC16544l.m18094g(messageId, "messageId");
                            c3332t2.m4169b(new C0254h0(new C21525n(messageId, str, null, false), 20));
                        }
                    }
                } else {
                    canmoreViewModelImpl.f38867k.m4168a();
                }
            }
        }
        return obj;
        canmoreViewModelImpl.m14397m(CanmoreViewModelImpl$handleStreamingFromWebFinished$3.f38910Y);
        C2207t0 c2207t0 = canmoreViewModelImpl.f38868l.f45526y;
        canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38905Y = canmoreViewModelImpl;
        canmoreViewModelImpl$handleStreamingFromWebFinished$1.f38908p0 = 2;
        objM3221t = AbstractC2124C.m3221t(c2207t0, canmoreViewModelImpl$handleStreamingFromWebFinished$1);
        if (objM3221t != obj) {
            abstractC6601G = (AbstractC6601G) AbstractC17680n.m19353c0(((C3694b) objM3221t).f11224i);
            obj = C17296C.f55119a;
            if (abstractC6601G != null) {
                if (!(abstractC6601G instanceof AbstractC6659u)) {
                    abstractC6601G = null;
                }
                abstractC6659u = (AbstractC6659u) abstractC6601G;
                if (abstractC6659u != null) {
                    if (abstractC6659u instanceof C6600F) {
                        abstractC6659u2 = abstractC6659u;
                    } else {
                        abstractC6659u2 = null;
                    }
                    c6600f = (C6600F) abstractC6659u2;
                    if (c6600f != null) {
                        abstractC6653q0 = c6600f.f21314f;
                    } else {
                        abstractC6653q0 = null;
                    }
                    if (abstractC6653q0 instanceof C6615V) {
                        canmoreViewModelImpl.f38867k.m4168a();
                    } else {
                        c3034b = ((C6615V) abstractC6653q0).f21342b;
                        if (c3034b != null) {
                            str = c3034b.f9128a;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            C3332T c3332t3 = canmoreViewModelImpl.f38867k;
                            c3332t3.getClass();
                            c3332t3.f10183b.mo3231f(new C21514c(str));
                        }
                        c21525n = ((C21515d) canmoreViewModelImpl.f38867k.f10182a.getValue()).f68137f;
                        if (c21525n != null) {
                            str2 = c21525n.f68169b;
                        } else {
                            str2 = null;
                        }
                        if (str != null) {
                            if (str2 == null) {
                                zEquals = false;
                            } else {
                                zEquals = str.equals(str2);
                            }
                            if (!zEquals) {
                                String messageId2 = abstractC6659u.m7172d().f23286a;
                                C3332T c3332t4 = canmoreViewModelImpl.f38867k;
                                c3332t4.getClass();
                                AbstractC16544l.m18094g(messageId2, "messageId");
                                c3332t4.m4169b(new C0254h0(new C21525n(messageId2, str, null, false), 20));
                            }
                        }
                    }
                }
            }
        }
        return obj;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC3364g intent = (InterfaceC3364g) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C3352c) {
            return;
        }
        if (!(intent instanceof C3355d)) {
            if (intent instanceof C3358e) {
                m14397m(new CanmoreViewModelImpl$onIntent$1(intent));
                return;
            } else {
                if (intent instanceof C3361f) {
                    m14394i(new CanmoreViewModelImpl$onIntent$2(this, intent, null));
                    return;
                }
                return;
            }
        }
        C3373j c3373j = C3373j.INSTANCE;
        AbstractC3409v abstractC3409v = ((C3355d) intent).f10248a;
        boolean zM18089b = AbstractC16544l.m18089b(abstractC3409v, c3373j);
        C3332T c3332t = this.f38867k;
        if (zM18089b) {
            c3332t.m4168a();
            return;
        }
        if (!(abstractC3409v instanceof C3397r)) {
            if ((abstractC3409v instanceof C3385n) || AbstractC16544l.m18089b(abstractC3409v, C3370i.INSTANCE) || AbstractC16544l.m18089b(abstractC3409v, C3388o.INSTANCE) || !(abstractC3409v instanceof C3406u)) {
                return;
            }
            AbstractC8160o6.m8731f(this.f38870n, AbstractC9306j0.m9889h("Unknown message ", ((C3406u) abstractC3409v).f10380a), null, null, 6);
            return;
        }
        boolean z6 = ((C3420z0) m14391f()).f10420e.f68136e;
        C3397r c3397r = (C3397r) abstractC3409v;
        boolean z10 = c3397r.f10355a;
        c3332t.getClass();
        c3332t.m4169b(new C3330S(z10, 0));
        if (!z6 || c3397r.f10355a) {
            return;
        }
        m14394i(new CanmoreViewModelImpl$handleMessageFromWeb$1(this, null));
    }
}
