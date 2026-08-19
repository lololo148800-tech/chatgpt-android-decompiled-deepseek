package p577Xf;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import p025An.C0644w;
import p1111xl.C21296a;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p551Wf.C8836c;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p599Yf.C10057b;
import p599Yf.C10058c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C9508g {

    /* JADX INFO: renamed from: a */
    public final C10058c f28629a;

    public C9508g(C10058c c10058c) {
        this.f28629a = c10058c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m10025a(String str, Map map, AbstractC19687c abstractC19687c) {
        C9507f c9507f;
        if (abstractC19687c instanceof C9507f) {
            c9507f = (C9507f) abstractC19687c;
            int i10 = c9507f.f28628o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c9507f.f28628o0 = i10 - Integer.MIN_VALUE;
            } else {
                c9507f = new C9507f(this, abstractC19687c);
            }
        } else {
            c9507f = new C9507f(this, abstractC19687c);
        }
        Object objM9690b = c9507f.f28626Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c9507f.f28628o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c9507f.f28628o0 = 1;
            C10058c c10058c = this.f28629a;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C10057b c10057b = new C10057b(str, map, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8836c.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C8836c.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c10058c.f29782a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c10057b, c9507f);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            return new C21952P1(((C8836c) ((C6223B) abstractC6224C).f20258a).f27025a);
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
}
