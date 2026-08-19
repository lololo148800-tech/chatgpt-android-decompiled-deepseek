package com.openai.feature.settings.impl.account.deactivated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mm.C17296C;
import p020Ai.C0515d;
import p049Bm.InterfaceC1436k;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p219Ig.C3714c;
import p219Ig.InterfaceC3718g;
import p544W9.AbstractC8736x;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModelImpl$onIntent$1", m20656f = "DeactivatedAccountViewModel.kt", m20657l = {76}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class DeactivatedAccountViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39483Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DeactivatedAccountViewModelImpl f39484Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeactivatedAccountViewModelImpl$onIntent$1(DeactivatedAccountViewModelImpl deactivatedAccountViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39484Z = deactivatedAccountViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new DeactivatedAccountViewModelImpl$onIntent$1(this.f39484Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((DeactivatedAccountViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM14351o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39483Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f39483Y = 1;
            DeactivatedAccountViewModelImpl deactivatedAccountViewModelImpl = this.f39484Z;
            InterfaceC3718g interfaceC3718g = (InterfaceC3718g) deactivatedAccountViewModelImpl.m14391f();
            if (interfaceC3718g instanceof C3714c) {
                C3714c c3714c = (C3714c) interfaceC3718g;
                c3714c.getClass();
                boolean zM9469b = AbstractC8736x.m9469b(c3714c);
                C0515d c0515d = c3714c.f11265a;
                if (zM9469b) {
                    objM14351o = deactivatedAccountViewModelImpl.m14350n(c0515d, this);
                    if (objM14351o != enumC19250a) {
                        objM14351o = c17296c;
                    }
                } else {
                    List list = c0515d.f1655b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C22038o c22038o = ((C21891A) it.next()).f69415a;
                        if (c22038o != null) {
                            arrayList.add(c22038o);
                        }
                    }
                    objM14351o = deactivatedAccountViewModelImpl.m14351o(arrayList, this);
                    EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                    if (objM14351o != enumC19250a2) {
                        objM14351o = c17296c;
                    }
                    if (objM14351o != enumC19250a2) {
                        objM14351o = c17296c;
                    }
                }
            } else {
                objM14351o = c17296c;
            }
            if (objM14351o == enumC19250a) {
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
