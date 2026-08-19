package p268Kf;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p403Qd.C6617X;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C4653h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f15130Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4666u f15131Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f15132o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6617X f15133p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4653h(C4666u c4666u, InterfaceC1436k interfaceC1436k, C6617X c6617x, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15131Z = c4666u;
        this.f15132o0 = interfaceC1436k;
        this.f15133p0 = c6617x;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4653h c4653h = new C4653h(this.f15131Z, this.f15132o0, this.f15133p0, interfaceC18770c);
        c4653h.f15130Y = obj;
        return c4653h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C4653h) create((Intent) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return Boolean.TRUE;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        Intent intent = (Intent) this.f15130Y;
        C4668w c4668w = this.f15131Z.f15197c;
        AbstractC16544l.m18094g(intent, "intent");
        AbstractC8160o6.m8728c(c4668w.f15207b, "resolveIntent " + intent, null, null, 6);
        this.f15132o0.invoke(intent);
        return true;
    }
}
