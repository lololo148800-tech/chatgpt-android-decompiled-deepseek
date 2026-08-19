package com.openai.viewmodel;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.viewmodel.BaseViewModel$launch$1", m20656f = "BaseViewModel.kt", m20657l = {129}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004*\u00020\u0006H\u008a@¢\u0006\u0004\b\b\u0010\t"}, m18067d2 = {"LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class BaseViewModel$launch$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f40357Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f40358Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModel$launch$1(InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40358Z = (AbstractC19694j) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new BaseViewModel$launch$1(this.f40358Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseViewModel$launch$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40357Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f40357Y = 1;
            if (this.f40358Z.invoke(this) == enumC19250a) {
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
