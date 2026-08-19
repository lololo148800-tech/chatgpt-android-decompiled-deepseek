package p1000s0;

import p571X9.AbstractC9233X;
import p858ko.C16482A;
import p860l0.InterfaceC16661B0;
import p860l0.InterfaceC16694M0;
import p881m0.C17133j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: s0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C19404M implements InterfaceC16661B0 {

    /* JADX INFO: renamed from: a */
    public final C17133j f61480a;

    /* JADX INFO: renamed from: b */
    public final C19408d f61481b;

    public C19404M(C17133j c17133j, C19408d c19408d) {
        this.f61480a = c17133j;
        this.f61481b = c19408d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p860l0.InterfaceC16661B0
    /* JADX INFO: renamed from: a */
    public final Object mo18490a(InterfaceC16694M0 interfaceC16694M0, float f10, InterfaceC18770c interfaceC18770c) throws Throwable {
        C19403L c19403l;
        if (interfaceC18770c instanceof C19403L) {
            c19403l = (C19403L) interfaceC18770c;
            int i10 = c19403l.f61479o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19403l.f61479o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19403l = new C19403L(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c19403l = new C19403L(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM18899d = c19403l.f61477Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19403l.f61479o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM18899d);
            C16482A c16482a = new C16482A(this, interfaceC16694M0);
            c19403l.f61479o0 = 1;
            objM18899d = this.f61480a.m18899d(interfaceC16694M0, f10, c16482a, c19403l);
            if (objM18899d == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM18899d);
        }
        return new Float(((Number) objM18899d).floatValue());
    }
}
