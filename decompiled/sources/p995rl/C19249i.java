package p995rl;

import bo.AbstractC11516d;
import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15066B;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p103Dn.InterfaceC2184i;
import p1091wn.InterfaceC21029j;
import p1111xl.C21296a;
import p1113xn.C21307a;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import pl.C18512g;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C19249i {

    /* JADX INFO: renamed from: a */
    public final AbstractC11516d f61034a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f61035b;

    public C19249i(AbstractC11516d format) {
        AbstractC16544l.m18094g(format, "format");
        this.f61034a = format;
        this.f61035b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX INFO: renamed from: a */
    public static final Object m20330a(C19249i c19249i, InterfaceC2184i interfaceC2184i, KSerializer kSerializer, Charset charset, InterfaceC15066B interfaceC15066B, AbstractC19687c abstractC19687c) {
        C19248h c19248h;
        InterfaceC2184i interfaceC2184i2;
        C19249i c19249i2;
        C19241a c19241a;
        KSerializer kSerializer2;
        Charset charset2;
        InterfaceC15066B interfaceC15066B2;
        byte[] bArr;
        c19249i.getClass();
        if (abstractC19687c instanceof C19248h) {
            c19248h = (C19248h) abstractC19687c;
            int i10 = c19248h.f61033u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19248h.f61033u0 = i10 - Integer.MIN_VALUE;
            } else {
                c19248h = new C19248h(c19249i, abstractC19687c);
            }
        } else {
            c19248h = new C19248h(c19249i, abstractC19687c);
        }
        Object obj = c19248h.f61031s0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19248h.f61033u0;
        if (i11 != 0) {
            if (i11 == 1) {
                c19241a = c19248h.f61030r0;
                interfaceC15066B2 = c19248h.f61029q0;
                charset2 = c19248h.f61028p0;
                kSerializer2 = c19248h.f61027o0;
                interfaceC2184i2 = (InterfaceC2184i) c19248h.f61026Z;
                c19249i2 = (C19249i) c19248h.f61025Y;
                AbstractC9233X.m9807c(obj);
            } else if (i11 == 2) {
                c19241a = (C19241a) c19248h.f61026Z;
                interfaceC15066B2 = (InterfaceC15066B) c19248h.f61025Y;
                AbstractC9233X.m9807c(obj);
                bArr = c19241a.f61000b;
                c19248h.f61025Y = null;
                c19248h.f61026Z = null;
                c19248h.f61033u0 = 3;
                if (AbstractC15070F.m16191s(interfaceC15066B2, bArr, 0, bArr.length, c19248h) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        LinkedHashMap linkedHashMap = c19249i.f61035b;
        Object c19241a2 = linkedHashMap.get(charset);
        if (c19241a2 == null) {
            c19241a2 = new C19241a(charset);
            linkedHashMap.put(charset, c19241a2);
        }
        C19241a c19241a3 = (C19241a) c19241a2;
        c19248h.f61025Y = c19249i;
        c19248h.f61026Z = interfaceC2184i;
        c19248h.f61027o0 = kSerializer;
        c19248h.f61028p0 = charset;
        c19248h.f61029q0 = interfaceC15066B;
        c19248h.f61030r0 = c19241a3;
        c19248h.f61033u0 = 1;
        byte[] bArr2 = c19241a3.f60999a;
        if (AbstractC15070F.m16191s(interfaceC15066B, bArr2, 0, bArr2.length, c19248h) == enumC19250a) {
            return enumC19250a;
        }
        interfaceC2184i2 = interfaceC2184i;
        c19249i2 = c19249i;
        c19241a = c19241a3;
        kSerializer2 = kSerializer;
        charset2 = charset;
        interfaceC15066B2 = interfaceC15066B;
        C19246f c19246f = new C19246f(interfaceC15066B2, c19241a, c19249i2, kSerializer2, charset2);
        c19248h.f61025Y = interfaceC15066B2;
        c19248h.f61026Z = c19241a;
        c19248h.f61027o0 = null;
        c19248h.f61028p0 = null;
        c19248h.f61029q0 = null;
        c19248h.f61030r0 = null;
        c19248h.f61033u0 = 2;
        if (interfaceC2184i2.mo3141d(c19246f, c19248h) == enumC19250a) {
            return enumC19250a;
        }
        bArr = c19241a.f61000b;
        c19248h.f61025Y = null;
        c19248h.f61026Z = null;
        c19248h.f61033u0 = 3;
        if (AbstractC15070F.m16191s(interfaceC15066B2, bArr, 0, bArr.length, c19248h) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m20331b(Charset charset, C21296a c21296a, InterfaceC15088n interfaceC15088n, AbstractC19687c abstractC19687c) throws C18512g {
        C19244d c19244d;
        if (abstractC19687c instanceof C19244d) {
            c19244d = (C19244d) abstractC19687c;
            int i10 = c19244d.f61007o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19244d.f61007o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19244d = new C19244d(this, abstractC19687c);
            }
        } else {
            c19244d = new C19244d(this, abstractC19687c);
        }
        Object objM1168P = c19244d.f61005Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19244d.f61007o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM1168P);
                if (!AbstractC16544l.m18089b(charset, C21307a.f67720a) || !AbstractC16544l.m18089b(c21296a.f67700a, AbstractC16526C.f51263a.mo5693b(InterfaceC21029j.class))) {
                    return null;
                }
                AbstractC11516d abstractC11516d = this.f61034a;
                c19244d.f61007o0 = 1;
                C3516e c3516e = AbstractC0593T.f1824a;
                objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C19242b(interfaceC15088n, c21296a, abstractC11516d, null), c19244d);
                if (objM1168P == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM1168P);
            }
            return objM1168P;
        } catch (Throwable th2) {
            throw new C18512g("Illegal input: " + th2.getMessage(), th2);
        }
    }
}
