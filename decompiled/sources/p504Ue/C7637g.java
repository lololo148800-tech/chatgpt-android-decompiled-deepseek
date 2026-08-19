package p504Ue;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p033B5.AbstractC0833q;
import p033B5.C0816A;
import p033B5.C0840x;
import p1155zi.C21907E;
import p160G5.InterfaceC3001g;
import p364Oh.AbstractC6224C;
import p364Oh.C6223B;
import p374P5.C6361n;
import p480Te.C7392q;
import p571X9.AbstractC9233X;
import p991rh.C19003l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ue.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7637g implements InterfaceC3001g {

    /* JADX INFO: renamed from: a */
    public final C7392q f24144a;

    /* JADX INFO: renamed from: b */
    public final String f24145b;

    /* JADX INFO: renamed from: c */
    public final C6361n f24146c;

    /* JADX INFO: renamed from: d */
    public final C0840x f24147d;

    public C7637g(C7392q c7392q, String data, C6361n options, C0840x c0840x) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(options, "options");
        this.f24144a = c7392q;
        this.f24145b = data;
        this.f24146c = options;
        this.f24147d = c0840x;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p160G5.InterfaceC3001g
    /* JADX INFO: renamed from: a */
    public final Object mo3829a(AbstractC19687c abstractC19687c) {
        C7636f c7636f;
        C7637g c7637g;
        String str;
        if (abstractC19687c instanceof C7636f) {
            c7636f = (C7636f) abstractC19687c;
            int i10 = c7636f.f24143p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7636f.f24143p0 = i10 - Integer.MIN_VALUE;
            } else {
                c7636f = new C7636f(this, abstractC19687c);
            }
        } else {
            c7636f = new C7636f(this, abstractC19687c);
        }
        Object objM7792b = c7636f.f24141Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7636f.f24143p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c7637g = c7636f.f24140Y;
                AbstractC9233X.m9807c(objM7792b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM7792b);
            }
        }
        AbstractC9233X.m9807c(objM7792b);
        String strM22337a = C21907E.m22337a(this.f24145b);
        c7636f.f24140Y = this;
        c7636f.f24143p0 = 1;
        objM7792b = this.f24144a.m7792b(strM22337a, c7636f);
        if (objM7792b == enumC19250a) {
            return enumC19250a;
        }
        c7637g = this;
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM7792b;
        if (!(abstractC6224C instanceof C6223B) || (str = ((C19003l) ((C6223B) abstractC6224C).f20258a).f60582b) == null) {
            return null;
        }
        C0816A c0816aM1896i = AbstractC0833q.m1896i(str);
        C0840x c0840x = c7637g.f24147d;
        C17309l c17309lM1883a = c0840x.f2345c.m1883a(c0816aM1896i, c7637g.f24146c, c0840x, 0);
        if (c17309lM1883a == null) {
            return null;
        }
        InterfaceC3001g interfaceC3001g = (InterfaceC3001g) c17309lM1883a.f55136Y;
        c7636f.f24140Y = null;
        c7636f.f24143p0 = 2;
        objM7792b = interfaceC3001g.mo3829a(c7636f);
        return objM7792b == enumC19250a ? enumC19250a : objM7792b;
    }
}
