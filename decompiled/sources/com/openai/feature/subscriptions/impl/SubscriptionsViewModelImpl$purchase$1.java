package com.openai.feature.subscriptions.impl;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1081wc.C20856B;
import p1155zi.EnumC21905D1;
import p1155zi.EnumC21909E1;
import p178H.AbstractC3137c;
import p195Hh.C3430e;
import p571X9.AbstractC9233X;
import p624Zg.AbstractC10345O;
import p624Zg.AbstractC10357a0;
import p624Zg.C10332B;
import p624Zg.C10338H;
import p624Zg.C10346P;
import p624Zg.C10367f0;
import p624Zg.C10379l0;
import p624Zg.C10394z;
import p624Zg.InterfaceC10333C;
import p624Zg.InterfaceC10347Q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$purchase$1", m20656f = "SubscriptionsViewModelImpl.kt", m20657l = {128}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SubscriptionsViewModelImpl$purchase$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f39916Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SubscriptionsViewModelImpl f39917Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Activity f39918o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f39919p0;

    /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$purchase$1$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LZg/l0;", "LZg/m0;", "invoke", "(LZg/l0;)LZg/m0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125211 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ String f39920Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125211(String str) {
            super(1);
            this.f39920Y = str;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C10379l0 setStateIfLoaded = (C10379l0) obj;
            AbstractC16544l.m18094g(setStateIfLoaded, "$this$setStateIfLoaded");
            return C10379l0.m10893f(setStateIfLoaded, this.f39920Y, null, 27);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl$purchase$1$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LZg/l0;", "LZg/m0;", "invoke", "(LZg/l0;)LZg/m0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125222 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C125222 f39921Y = new C125222();

        public C125222() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C10379l0 setStateIfLoaded = (C10379l0) obj;
            AbstractC16544l.m18094g(setStateIfLoaded, "$this$setStateIfLoaded");
            return C10379l0.m10893f(setStateIfLoaded, null, null, 19);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionsViewModelImpl$purchase$1(SubscriptionsViewModelImpl subscriptionsViewModelImpl, Activity activity, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39917Z = subscriptionsViewModelImpl;
        this.f39918o0 = activity;
        this.f39919p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new SubscriptionsViewModelImpl$purchase$1(this.f39917Z, this.f39918o0, this.f39919p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((SubscriptionsViewModelImpl$purchase$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
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
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC10333C c10394z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39916Y;
        SubscriptionsViewModelImpl subscriptionsViewModelImpl = this.f39917Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = this.f39919p0;
            C125211 c125211 = new C125211(str);
            subscriptionsViewModelImpl.getClass();
            subscriptionsViewModelImpl.m14397m(new SubscriptionsViewModelImpl$setStateIfLoaded$1(c125211));
            if (subscriptionsViewModelImpl.f39895k.f58774b.m22327f() == EnumC21905D1.FREE) {
                c10394z = C10332B.f30662a;
            } else {
                EnumC21909E1 enumC21909E1 = EnumC21909E1.Plus;
                c10394z = new C10394z();
            }
            this.f39916Y = 1;
            obj = subscriptionsViewModelImpl.f39893i.m12795d(this.f39918o0, str, c10394z, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC10347Q interfaceC10347Q = (InterfaceC10347Q) obj;
        if (interfaceC10347Q instanceof C10346P) {
            subscriptionsViewModelImpl.f39896l.mo21447a(C20856B.f66310m, subscriptionsViewModelImpl.f39897m);
            subscriptionsViewModelImpl.m14392g(C10367f0.f30723a);
        } else if (AbstractC16544l.m18089b(interfaceC10347Q, C10338H.f30673Y)) {
            subscriptionsViewModelImpl.f39896l.mo21447a(C20856B.f66308k, subscriptionsViewModelImpl.f39897m);
            subscriptionsViewModelImpl.m14397m(new SubscriptionsViewModelImpl$setStateIfLoaded$1(C125222.f39921Y));
        } else if (interfaceC10347Q instanceof AbstractC10345O) {
            subscriptionsViewModelImpl.f39896l.mo21447a(C20856B.f66309l, subscriptionsViewModelImpl.f39897m);
            C3430e c3430e = AbstractC10357a0.f30702o0;
            SubscriptionsViewModelImpl.m14373p(subscriptionsViewModelImpl, AbstractC3137c.m3981d((AbstractC10345O) interfaceC10347Q));
        }
        return C17296C.f55119a;
    }
}
