package p1149zc;

import p103Dn.AbstractC2124C;
import p571X9.AbstractC9233X;
import p905nd.C17572E;
import p905nd.C17589q;
import p948pi.C18422e;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: zc.z */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21864z {

    /* JADX INFO: renamed from: a */
    public final C17572E f69335a;

    public AbstractC21864z(C17572E c17572e) {
        this.f69335a = c17572e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m22317a(AbstractC19687c abstractC19687c) {
        C21863y c21863y;
        if (abstractC19687c instanceof C21863y) {
            c21863y = (C21863y) abstractC19687c;
            int i10 = c21863y.f69334o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21863y.f69334o0 = i10 - Integer.MIN_VALUE;
            } else {
                c21863y = new C21863y(this, abstractC19687c);
            }
        } else {
            c21863y = new C21863y(this, abstractC19687c);
        }
        Object objM3221t = c21863y.f69332Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21863y.f69334o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3221t);
            c21863y.f69334o0 = 1;
            objM3221t = AbstractC2124C.m3221t(((C17589q) this).f56308o, c21863y);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM3221t);
        }
        return Boolean.valueOf(objM3221t instanceof C18422e);
    }
}
