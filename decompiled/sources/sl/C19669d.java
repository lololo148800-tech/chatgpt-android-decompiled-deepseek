package sl;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15066B;
import io.ktor.utils.p815io.InterfaceC15088n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p488Tn.C7518a;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8694q;
import p544W9.AbstractC8706s;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: sl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C19669d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Object f62337Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC15066B f62338Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC15066B f62339o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC15088n f62340p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC7526i f62341q0;

    /* JADX INFO: renamed from: r0 */
    public int f62342r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC15088n f62343s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C15085k f62344t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C15085k f62345u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19669d(InterfaceC15088n interfaceC15088n, C15085k c15085k, C15085k c15085k2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62343s0 = interfaceC15088n;
        this.f62344t0 = c15085k;
        this.f62345u0 = c15085k2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19669d(this.f62343s0, this.f62344t0, this.f62345u0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19669d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:32|(1:34)|35|36|85|37|(1:39)(3:40|41|(1:43)(6:44|49|26|(2:28|30)|56|(6:58|(1:60)|61|(1:63)|72|73)(1:64)))) */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[Catch: all -> 0x0065, TryCatch #4 {all -> 0x0065, blocks: (B:49:0x00de, B:26:0x006b, B:28:0x0071, B:30:0x0077, B:32:0x007d, B:35:0x0093, B:54:0x00e5, B:55:0x00e8, B:56:0x00e9, B:64:0x010d, B:21:0x0061, B:36:0x0096, B:48:0x00d5, B:52:0x00e3), top: B:91:0x0061, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x010d A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0065, blocks: (B:49:0x00de, B:26:0x006b, B:28:0x0071, B:30:0x0077, B:32:0x007d, B:35:0x0093, B:54:0x00e5, B:55:0x00e8, B:56:0x00e9, B:64:0x010d, B:21:0x0061, B:36:0x0096, B:48:0x00d5, B:52:0x00e3), top: B:91:0x0061, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0131 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        r6 = r2;
        r1 = r3;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cd -> B:49:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d5 -> B:49:0x00de). Please report as a decompilation issue!!! */
    @Override // sm.AbstractC19685a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC7526i interfaceC7526i;
        InterfaceC15088n interfaceC15088n;
        InterfaceC15066B interfaceC15066B;
        InterfaceC15066B interfaceC15066B2;
        AutoCloseable autoCloseable;
        Throwable th2;
        AutoCloseable autoCloseable2;
        InterfaceC15066B interfaceC15066B3;
        InterfaceC15066B interfaceC15066B4;
        InterfaceC15088n interfaceC15088n2;
        C7518a c7518aM9394a;
        C7518a c7518aM9394a2;
        Throwable thMo1137a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62342r0;
        C15085k c15085k = this.f62345u0;
        InterfaceC15088n interfaceC15088n3 = this.f62343s0;
        C15085k c15085k2 = this.f62344t0;
        switch (i10) {
            case 0:
                AbstractC9233X.m9807c(obj);
                if (!interfaceC15088n3.mo1141e() || (c15085k2.m16207l() && c15085k.m16207l())) {
                    thMo1137a = interfaceC15088n3.mo1137a();
                    if (thMo1137a == null) {
                        throw thMo1137a;
                    }
                    this.f62337Y = null;
                    this.f62338Z = null;
                    this.f62339o0 = null;
                    this.f62340p0 = null;
                    this.f62341q0 = null;
                    this.f62342r0 = 4;
                    if (c15085k2.m16204i(this) == enumC19250a) {
                        return enumC19250a;
                    }
                    this.f62342r0 = 5;
                    if (c15085k.m16204i(this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return C17296C.f55119a;
                }
                this.f62337Y = null;
                this.f62338Z = null;
                this.f62339o0 = null;
                this.f62340p0 = null;
                this.f62341q0 = null;
                this.f62342r0 = 1;
                obj = AbstractC15070F.m16185m(interfaceC15088n3, 4096L, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                autoCloseable2 = (AutoCloseable) obj;
                interfaceC7526i = (InterfaceC7526i) autoCloseable2;
                c7518aM9394a2 = AbstractC8694q.m9394a(interfaceC7526i);
                this.f62337Y = autoCloseable2;
                this.f62338Z = c15085k2;
                this.f62339o0 = c15085k;
                this.f62340p0 = interfaceC15088n3;
                this.f62341q0 = interfaceC7526i;
                this.f62342r0 = 2;
                if (AbstractC15070F.m16192t(c15085k2, c7518aM9394a2, this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC15066B = c15085k;
                interfaceC15088n = interfaceC15088n3;
                autoCloseable = autoCloseable2;
                interfaceC15066B2 = c15085k2;
                c7518aM9394a = AbstractC8694q.m9394a(interfaceC7526i);
                this.f62337Y = autoCloseable;
                this.f62338Z = interfaceC15066B2;
                this.f62339o0 = interfaceC15066B;
                this.f62340p0 = interfaceC15088n;
                this.f62341q0 = null;
                this.f62342r0 = 3;
                if (AbstractC15070F.m16192t(interfaceC15066B, c7518aM9394a, this) == enumC19250a) {
                    return enumC19250a;
                }
                autoCloseable2 = autoCloseable;
                AbstractC8706s.m9414b(autoCloseable2, null);
                if (interfaceC15088n3.mo1141e()) {
                }
                thMo1137a = interfaceC15088n3.mo1137a();
                if (thMo1137a == null) {
                    throw thMo1137a;
                }
                this.f62337Y = null;
                this.f62338Z = null;
                this.f62339o0 = null;
                this.f62340p0 = null;
                this.f62341q0 = null;
                this.f62342r0 = 4;
                if (c15085k2.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                this.f62342r0 = 5;
                if (c15085k.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            case 1:
                try {
                    AbstractC9233X.m9807c(obj);
                    autoCloseable2 = (AutoCloseable) obj;
                    interfaceC7526i = (InterfaceC7526i) autoCloseable2;
                    c7518aM9394a2 = AbstractC8694q.m9394a(interfaceC7526i);
                    this.f62337Y = autoCloseable2;
                    this.f62338Z = c15085k2;
                    this.f62339o0 = c15085k;
                    this.f62340p0 = interfaceC15088n3;
                    this.f62341q0 = interfaceC7526i;
                    this.f62342r0 = 2;
                    if (AbstractC15070F.m16192t(c15085k2, c7518aM9394a2, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    interfaceC15066B = c15085k;
                    interfaceC15088n = interfaceC15088n3;
                    autoCloseable = autoCloseable2;
                    interfaceC15066B2 = c15085k2;
                    c7518aM9394a = AbstractC8694q.m9394a(interfaceC7526i);
                    this.f62337Y = autoCloseable;
                    this.f62338Z = interfaceC15066B2;
                    this.f62339o0 = interfaceC15066B;
                    this.f62340p0 = interfaceC15088n;
                    this.f62341q0 = null;
                    this.f62342r0 = 3;
                    if (AbstractC15070F.m16192t(interfaceC15066B, c7518aM9394a, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    autoCloseable2 = autoCloseable;
                    AbstractC8706s.m9414b(autoCloseable2, null);
                    if (interfaceC15088n3.mo1141e()) {
                        break;
                    }
                    thMo1137a = interfaceC15088n3.mo1137a();
                    if (thMo1137a == null) {
                        throw thMo1137a;
                    }
                    this.f62337Y = null;
                    this.f62338Z = null;
                    this.f62339o0 = null;
                    this.f62340p0 = null;
                    this.f62341q0 = null;
                    this.f62342r0 = 4;
                    if (c15085k2.m16204i(this) == enumC19250a) {
                        return enumC19250a;
                    }
                    this.f62342r0 = 5;
                    if (c15085k.m16204i(this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return C17296C.f55119a;
                } catch (Throwable th3) {
                    try {
                        AbstractC15070F.m16175c(c15085k2, th3);
                        AbstractC15070F.m16175c(c15085k, th3);
                        this.f62337Y = null;
                        this.f62338Z = null;
                        this.f62339o0 = null;
                        this.f62340p0 = null;
                        this.f62341q0 = null;
                        this.f62342r0 = 6;
                        if (c15085k2.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        this.f62342r0 = 7;
                        if (c15085k.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        this.f62337Y = th;
                        this.f62338Z = null;
                        this.f62339o0 = null;
                        this.f62340p0 = null;
                        this.f62341q0 = null;
                        this.f62342r0 = 8;
                        if (c15085k2.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                break;
            case 2:
                interfaceC7526i = this.f62341q0;
                interfaceC15088n = this.f62340p0;
                interfaceC15066B = this.f62339o0;
                interfaceC15066B2 = this.f62338Z;
                autoCloseable = (AutoCloseable) this.f62337Y;
                try {
                    AbstractC9233X.m9807c(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                    interfaceC15088n2 = interfaceC15088n;
                    interfaceC15066B4 = interfaceC15066B;
                    interfaceC15066B3 = interfaceC15066B2;
                    autoCloseable2 = autoCloseable;
                    try {
                        interfaceC15088n2.mo1138b(th2);
                        AbstractC15070F.m16175c(interfaceC15066B3, th2);
                        AbstractC15070F.m16175c(interfaceC15066B4, th2);
                        AbstractC8706s.m9414b(autoCloseable2, null);
                        if (interfaceC15088n3.mo1141e()) {
                            break;
                        }
                        thMo1137a = interfaceC15088n3.mo1137a();
                        if (thMo1137a == null) {
                            throw thMo1137a;
                        }
                        this.f62337Y = null;
                        this.f62338Z = null;
                        this.f62339o0 = null;
                        this.f62340p0 = null;
                        this.f62341q0 = null;
                        this.f62342r0 = 4;
                        if (c15085k2.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        this.f62342r0 = 5;
                        if (c15085k.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return C17296C.f55119a;
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            AbstractC8706s.m9414b(autoCloseable2, th6);
                            throw th7;
                        }
                    }
                }
                c7518aM9394a = AbstractC8694q.m9394a(interfaceC7526i);
                this.f62337Y = autoCloseable;
                this.f62338Z = interfaceC15066B2;
                this.f62339o0 = interfaceC15066B;
                this.f62340p0 = interfaceC15088n;
                this.f62341q0 = null;
                this.f62342r0 = 3;
                if (AbstractC15070F.m16192t(interfaceC15066B, c7518aM9394a, this) == enumC19250a) {
                    return enumC19250a;
                }
                autoCloseable2 = autoCloseable;
                AbstractC8706s.m9414b(autoCloseable2, null);
                if (interfaceC15088n3.mo1141e()) {
                    break;
                }
                thMo1137a = interfaceC15088n3.mo1137a();
                if (thMo1137a == null) {
                    throw thMo1137a;
                }
                this.f62337Y = null;
                this.f62338Z = null;
                this.f62339o0 = null;
                this.f62340p0 = null;
                this.f62341q0 = null;
                this.f62342r0 = 4;
                if (c15085k2.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                this.f62342r0 = 5;
                if (c15085k.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            case 3:
                interfaceC15088n2 = this.f62340p0;
                interfaceC15066B4 = this.f62339o0;
                interfaceC15066B3 = this.f62338Z;
                autoCloseable2 = (AutoCloseable) this.f62337Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    break;
                } catch (Throwable th8) {
                    th2 = th8;
                    interfaceC15088n2.mo1138b(th2);
                    AbstractC15070F.m16175c(interfaceC15066B3, th2);
                    AbstractC15070F.m16175c(interfaceC15066B4, th2);
                }
                AbstractC8706s.m9414b(autoCloseable2, null);
                if (interfaceC15088n3.mo1141e()) {
                    break;
                }
                thMo1137a = interfaceC15088n3.mo1137a();
                if (thMo1137a == null) {
                    throw thMo1137a;
                }
                this.f62337Y = null;
                this.f62338Z = null;
                this.f62339o0 = null;
                this.f62340p0 = null;
                this.f62341q0 = null;
                this.f62342r0 = 4;
                if (c15085k2.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                this.f62342r0 = 5;
                if (c15085k.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            case 4:
                AbstractC9233X.m9807c(obj);
                this.f62342r0 = 5;
                if (c15085k.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            case 5:
            case 7:
                AbstractC9233X.m9807c(obj);
                return C17296C.f55119a;
            case 6:
                AbstractC9233X.m9807c(obj);
                this.f62342r0 = 7;
                if (c15085k.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            case 8:
                Throwable th9 = (Throwable) this.f62337Y;
                AbstractC9233X.m9807c(obj);
                th = th9;
                this.f62337Y = th;
                this.f62342r0 = 9;
                if (c15085k.m16204i(this) == enumC19250a) {
                    return enumC19250a;
                }
                throw th;
            case 9:
                Throwable th10 = (Throwable) this.f62337Y;
                AbstractC9233X.m9807c(obj);
                throw th10;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
