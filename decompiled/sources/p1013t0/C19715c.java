package p1013t0;

import mm.C17296C;
import p392Q0.C6546d;
import p523V9.AbstractC8166p4;
import p571X9.AbstractC9233X;
import p759g1.C13801c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: t0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19715c {

    /* JADX INFO: renamed from: a */
    public final C6546d f62415a = new C6546d(new C19716d[16]);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r8 >= r2) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20665a(C13801c c13801c, AbstractC19687c abstractC19687c) {
        C19714b c19714b;
        int i10;
        C13801c c13801c2;
        int i11;
        Object[] objArr;
        if (abstractC19687c instanceof C19714b) {
            c19714b = (C19714b) abstractC19687c;
            int i12 = c19714b.f62414s0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c19714b.f62414s0 = i12 - Integer.MIN_VALUE;
            } else {
                c19714b = new C19714b(this, abstractC19687c);
            }
        } else {
            c19714b = new C19714b(this, abstractC19687c);
        }
        Object obj = c19714b.f62412q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i13 = c19714b.f62414s0;
        if (i13 == 0) {
            AbstractC9233X.m9807c(obj);
            C6546d c6546d = this.f62415a;
            i10 = c6546d.f21184o0;
            if (i10 > 0) {
                Object[] objArr2 = c6546d.f21182Y;
                c13801c2 = c13801c;
                i11 = 0;
                objArr = objArr2;
                C19716d c19716d = (C19716d) objArr[i11];
                c19714b.f62408Y = c13801c2;
                c19714b.f62409Z = objArr;
                c19714b.f62410o0 = i10;
                c19714b.f62411p0 = i11;
                c19714b.f62414s0 = 1;
                if (AbstractC8166p4.m8735c(c19716d, c13801c2, c19714b) == enumC19250a) {
                    return enumC19250a;
                }
                i11++;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = c19714b.f62411p0;
            i10 = c19714b.f62410o0;
            objArr = c19714b.f62409Z;
            C13801c c13801c3 = c19714b.f62408Y;
            AbstractC9233X.m9807c(obj);
            c13801c2 = c13801c3;
            i11++;
        }
        return C17296C.f55119a;
    }
}
