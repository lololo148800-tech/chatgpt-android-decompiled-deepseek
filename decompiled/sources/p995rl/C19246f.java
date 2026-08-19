package p995rl;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15066B;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import p103Dn.InterfaceC2186j;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: rl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C19246f implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public int f61013Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC15066B f61014Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19241a f61015o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19249i f61016p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ KSerializer f61017q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Charset f61018r0;

    public C19246f(InterfaceC15066B interfaceC15066B, C19241a c19241a, C19249i c19249i, KSerializer kSerializer, Charset charset) {
        this.f61014Z = interfaceC15066B;
        this.f61015o0 = c19241a;
        this.f61016p0 = c19249i;
        this.f61017q0 = kSerializer;
        this.f61018r0 = charset;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws CharacterCodingException {
        C19245e c19245e;
        Object obj2;
        C19246f c19246f;
        C19246f c19246f2;
        byte[] bArrM9408d;
        InterfaceC15066B interfaceC15066B;
        if (interfaceC18770c instanceof C19245e) {
            c19245e = (C19245e) interfaceC18770c;
            int i10 = c19245e.f61009Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19245e.f61009Z = i10 - Integer.MIN_VALUE;
            } else {
                c19245e = new C19245e(this, interfaceC18770c);
            }
        } else {
            c19245e = new C19245e(this, interfaceC18770c);
        }
        Object obj3 = c19245e.f61008Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19245e.f61009Z;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = c19245e.f61012q0;
                c19246f2 = c19245e.f61011p0;
                AbstractC9233X.m9807c(obj3);
            } else if (i11 == 2) {
                c19246f = c19245e.f61011p0;
                AbstractC9233X.m9807c(obj3);
                interfaceC15066B = c19246f.f61014Z;
                c19245e.f61011p0 = null;
                c19245e.f61009Z = 3;
                if (((C15085k) interfaceC15066B).m16203h(c19245e) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj3);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj3);
        int i12 = this.f61013Y;
        this.f61013Y = i12 + 1;
        if (i12 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        if (i12 > 0) {
            byte[] bArr = this.f61015o0.f61001c;
            c19245e.f61011p0 = this;
            c19245e.f61012q0 = obj;
            c19245e.f61009Z = 1;
            if (AbstractC15070F.m16191s(this.f61014Z, bArr, 0, bArr.length, c19245e) == enumC19250a) {
                return enumC19250a;
            }
            c19246f2 = this;
        } else {
            obj2 = obj;
            c19246f = this;
        }
        bArrM9408d = AbstractC8700r.m9408d(c19246f.f61016p0.f61034a.m12905d(c19246f.f61017q0, obj2), c19246f.f61018r0);
        c19245e.f61011p0 = c19246f;
        c19245e.f61012q0 = null;
        c19245e.f61009Z = 2;
        if (AbstractC15070F.m16191s(c19246f.f61014Z, bArrM9408d, 0, bArrM9408d.length, c19245e) == enumC19250a) {
            return enumC19250a;
        }
        interfaceC15066B = c19246f.f61014Z;
        c19245e.f61011p0 = null;
        c19245e.f61009Z = 3;
        if (((C15085k) interfaceC15066B).m16203h(c19245e) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
        obj2 = obj;
        c19246f = c19246f2;
        bArrM9408d = AbstractC8700r.m9408d(c19246f.f61016p0.f61034a.m12905d(c19246f.f61017q0, obj2), c19246f.f61018r0);
        c19245e.f61011p0 = c19246f;
        c19245e.f61012q0 = null;
        c19245e.f61009Z = 2;
        if (AbstractC15070F.m16191s(c19246f.f61014Z, bArrM9408d, 0, bArrM9408d.length, c19245e) == enumC19250a) {
            return enumC19250a;
        }
        interfaceC15066B = c19246f.f61014Z;
        c19245e.f61011p0 = null;
        c19245e.f61009Z = 3;
        if (((C15085k) interfaceC15066B).m16203h(c19245e) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
