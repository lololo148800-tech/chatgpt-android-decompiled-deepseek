package p131F1;

import mm.C17296C;
import p230J1.AbstractC4194u;
import p230J1.C4199z;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: F1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2633k {

    /* JADX INFO: renamed from: a */
    public int f8149a;

    /* JADX INFO: renamed from: b */
    public float f8150b;

    /* JADX INFO: renamed from: c */
    public final Object f8151c;

    public C2633k(int i10, C2627e c2627e) {
        this.f8149a = i10;
        this.f8151c = c2627e;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: a */
    public float m3621a(int i10, boolean z6, boolean z10, boolean z11) {
        boolean z12;
        int i11 = 1;
        C4199z c4199z = (C4199z) this.f8151c;
        if (z6) {
            int iM4891c = AbstractC4194u.m4891c(c4199z.f13640f, i10, z6);
            int lineStart = c4199z.f13640f.getLineStart(iM4891c);
            int iM4899f = c4199z.m4899f(iM4891c);
            if (i10 == lineStart || i10 == iM4899f) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        int i12 = i10 * 4;
        if (!z11) {
            i11 = z12 ? 2 : 3;
        } else if (z12) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f8149a == i13) {
            return this.f8150b;
        }
        float fM4901h = z11 ? c4199z.m4901h(i10, z6) : c4199z.m4902i(i10, z6);
        if (z10) {
            this.f8149a = i13;
            this.f8150b = fM4901h;
        }
        return fM4901h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m3622b(float f10, AbstractC19687c abstractC19687c) {
        C2632j c2632j;
        C2633k c2633k;
        if (abstractC19687c instanceof C2632j) {
            c2632j = (C2632j) abstractC19687c;
            int i10 = c2632j.f8148p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2632j.f8148p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2632j = new C2632j(this, abstractC19687c);
            }
        } else {
            c2632j = new C2632j(this, abstractC19687c);
        }
        Object objInvoke = c2632j.f8146Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2632j.f8148p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objInvoke);
            Float f11 = new Float(f10);
            c2632j.f8145Y = this;
            c2632j.f8148p0 = 1;
            objInvoke = ((C2627e) this.f8151c).invoke(f11, c2632j);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
            c2633k = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2633k = c2632j.f8145Y;
            AbstractC9233X.m9807c(objInvoke);
        }
        c2633k.f8150b += ((Number) objInvoke).floatValue();
        return C17296C.f55119a;
    }

    public C2633k(C4199z c4199z) {
        this.f8151c = c4199z;
        this.f8149a = -1;
    }
}
