package com.openai.feature.gizmoshome.impl.details;

import java.util.List;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmoshome.impl.details.SnorlaxHomeViewModelImpl$loadMore$3$1$1", m20656f = "SnorlaxHomeViewModelImpl.kt", m20657l = {160}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxHomeViewModelImpl$loadMore$3$1$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38344Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SnorlaxHomeViewModelImpl f38345Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f38346o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f38347p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxHomeViewModelImpl$loadMore$3$1$1(SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl, String str, List list, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38345Z = snorlaxHomeViewModelImpl;
        this.f38346o0 = str;
        this.f38347p0 = list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SnorlaxHomeViewModelImpl$loadMore$3$1$1(this.f38345Z, this.f38346o0, this.f38347p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((SnorlaxHomeViewModelImpl$loadMore$3$1$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38344Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f38344Y = 1;
            SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl = this.f38345Z;
            Object objM21029b = snorlaxHomeViewModelImpl.f38313k.m21029b(new SnorlaxHomeViewModelImpl$updateCache$2(this.f38346o0, this.f38347p0), this);
            if (objM21029b != enumC19250a) {
                objM21029b = c17296c;
            }
            if (objM21029b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
