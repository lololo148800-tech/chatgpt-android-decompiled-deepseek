package p481Tf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import mm.C17309l;
import p025An.C0644w;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1111xl.C21296a;
import p1155zi.AbstractC21933K1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C22072w1;
import p1155zi.EnumC22040o1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p505Uf.C7659t;
import p505Uf.C7662w;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9752J4;
import p625Zh.C10396b;
import p909nm.AbstractC17660E;
import p909nm.C17689w;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Tf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C7409n {

    /* JADX INFO: renamed from: a */
    public final C7401f f23470a;

    /* JADX INFO: renamed from: b */
    public final C10396b f23471b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f23472c;

    /* JADX INFO: renamed from: d */
    public final C2153Q0 f23473d;

    public C7409n(C7401f c7401f, C10396b c10396b) {
        this.f23470a = c7401f;
        this.f23471b = c10396b;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C17689w.f56480Y);
        this.f23472c = c2153q0M3204c;
        this.f23473d = c2153q0M3204c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m7795a(String str, AbstractC19687c abstractC19687c) {
        C7404i c7404i;
        if (abstractC19687c instanceof C7404i) {
            c7404i = (C7404i) abstractC19687c;
            int i10 = c7404i.f23454o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7404i.f23454o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7404i = new C7404i(this, abstractC19687c);
            }
        } else {
            c7404i = new C7404i(this, abstractC19687c);
        }
        C7404i c7404i2 = c7404i;
        Object objM10353b = c7404i2.f23452Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7404i2.f23454o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10353b);
            C7405j c7405j = new C7405j(this, str, null, 0);
            c7404i2.f23454o0 = 1;
            objM10353b = AbstractC9752J4.m10353b(this.f23471b, 0, 0L, null, c7405j, c7404i2, 31);
            if (objM10353b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM10353b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM10353b;
        if (abstractC6224C instanceof C6223B) {
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC6224C instanceof C6248v) {
            return C21929J1.f69476a;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        abstractC6224C.getClass();
        return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7796b(AbstractC19687c abstractC19687c) {
        C7406k c7406k;
        C7409n c7409n;
        Object objM6734a;
        if (abstractC19687c instanceof C7406k) {
            c7406k = (C7406k) abstractC19687c;
            int i10 = c7406k.f23462p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7406k.f23462p0 = i10 - Integer.MIN_VALUE;
            } else {
                c7406k = new C7406k(this, abstractC19687c);
            }
        } else {
            c7406k = new C7406k(this, abstractC19687c);
        }
        Object objM9690b = c7406k.f23460Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7406k.f23462p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c7406k.f23459Y = this;
            c7406k.f23462p0 = 1;
            C7401f c7401f = this.f23470a;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C7398c c7398c = new C7398c(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C7659t.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C7659t.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c7401f.f23449a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c7398c, c7406k);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c7409n = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7409n = c7406k.f23459Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            List list = ((C7659t) ((C6223B) abstractC6224C).f20258a).f24182a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C22072w1) obj).f69785b != EnumC22040o1.None) {
                    arrayList.add(obj);
                }
            }
            objM6734a = new C21952P1(arrayList);
        } else if (abstractC6224C instanceof C6248v) {
            objM6734a = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (objM6734a instanceof C21952P1) {
            c7409n.f23472c.setValue((List) ((C21952P1) objM6734a).f69511a);
        }
        return objM6734a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m7797c(String str, AbstractC19687c abstractC19687c) {
        C7407l c7407l;
        if (abstractC19687c instanceof C7407l) {
            c7407l = (C7407l) abstractC19687c;
            int i10 = c7407l.f23465o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7407l.f23465o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7407l = new C7407l(this, abstractC19687c);
            }
        } else {
            c7407l = new C7407l(this, abstractC19687c);
        }
        C7407l c7407l2 = c7407l;
        Object objM10353b = c7407l2.f23463Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7407l2.f23465o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10353b);
            C7405j c7405j = new C7405j(this, str, null, 1);
            c7407l2.f23465o0 = 1;
            objM10353b = AbstractC9752J4.m10353b(this.f23471b, 0, 0L, null, c7405j, c7407l2, 31);
            if (objM10353b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM10353b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM10353b;
        if (abstractC6224C instanceof C6223B) {
            return new C21952P1(C17296C.f55119a);
        }
        if (abstractC6224C instanceof C6248v) {
            return C21929J1.f69476a;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        abstractC6224C.getClass();
        return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m7798d(EnumC22040o1 enumC22040o1, Map map, AbstractC19687c abstractC19687c) {
        C7408m c7408m;
        InterfaceC3777y interfaceC3777yM18075c;
        C7409n c7409n;
        Object objM6734a;
        if (abstractC19687c instanceof C7408m) {
            c7408m = (C7408m) abstractC19687c;
            int i10 = c7408m.f23469p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7408m.f23469p0 = i10 - Integer.MIN_VALUE;
            } else {
                c7408m = new C7408m(this, abstractC19687c);
            }
        } else {
            c7408m = new C7408m(this, abstractC19687c);
        }
        Object objM9690b = c7408m.f23467Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7408m.f23469p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            C7662w c7662w = new C7662w(AbstractC17660E.m19258c(new C17309l(enumC22040o1, map)));
            c7408m.f23466Y = this;
            c7408m.f23469p0 = 1;
            C7401f c7401f = this.f23470a;
            C7400e c7400e = new C7400e(c7662w, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C7659t.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C7659t.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            objM9690b = AbstractC9144I.m9690b(c7401f.f23449a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c7400e, c7408m);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c7409n = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7409n = c7408m.f23466Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            objM6734a = new C21952P1(((C6223B) abstractC6224C).f20258a);
        } else if (abstractC6224C instanceof C6248v) {
            objM6734a = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            objM6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        boolean z6 = objM6734a instanceof C21952P1;
        if (z6) {
            C7659t c7659t = (C7659t) ((C21952P1) objM6734a).f69511a;
            C2153Q0 c2153q0 = c7409n.f23472c;
            List list = c7659t.f24182a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C22072w1) obj).f69785b != EnumC22040o1.None) {
                    arrayList.add(obj);
                }
            }
            c2153q0.getClass();
            c2153q0.m3251l(null, arrayList);
        }
        if (z6) {
            return new C21952P1(C17296C.f55119a);
        }
        if ((objM6734a instanceof C21929J1) || (objM6734a instanceof AbstractC21933K1)) {
            return objM6734a;
        }
        throw new C0644w();
    }
}
