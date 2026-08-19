package com.openai.viewmodel;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.viewmodel.BaseViewModel$setOnEach$1", m20656f = "BaseViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u008a@"}, m18067d2 = {TokenNames.f32019T, "LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "it", "Lmm/C;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class BaseViewModel$setOnEach$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f40359Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BaseViewModel f40360Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f40361o0;

    /* JADX INFO: renamed from: com.openai.viewmodel.BaseViewModel$setOnEach$1$1 */
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0004*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0005*\u00028\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {TokenNames.f32019T, "LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "invoke", "(LDi/k;)LDi/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125851 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ InterfaceC1439n f40362Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ Object f40363Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125851(Object obj, InterfaceC1439n interfaceC1439n) {
            super(1);
            this.f40362Y = interfaceC1439n;
            this.f40363Z = obj;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            InterfaceC2062k setState = (InterfaceC2062k) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return (InterfaceC2062k) this.f40362Y.invoke(setState, this.f40363Z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$setOnEach$1(BaseViewModel baseViewModel, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40360Z = baseViewModel;
        this.f40361o0 = interfaceC1439n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        BaseViewModel$setOnEach$1 baseViewModel$setOnEach$1 = new BaseViewModel$setOnEach$1(this.f40360Z, this.f40361o0, interfaceC18770c);
        baseViewModel$setOnEach$1.f40359Y = obj;
        return baseViewModel$setOnEach$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        BaseViewModel$setOnEach$1 baseViewModel$setOnEach$1 = (BaseViewModel$setOnEach$1) create(obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        baseViewModel$setOnEach$1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f40360Z.m14397m(new C125851(this.f40359Y, this.f40361o0));
        return C17296C.f55119a;
    }
}
