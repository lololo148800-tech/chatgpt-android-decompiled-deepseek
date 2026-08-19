package p059C5;

import coil3.compose.AsyncImagePainter;
import com.openai.voice.VoiceModeViewModel;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.util.List;
import java.util.UUID;
import ke.C16382j;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import ml.C17284b;
import mm.C17296C;
import np.InterfaceC17710b;
import p008A6.C0386f;
import p025An.C0566C0;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.C0642v;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p025An.InterfaceC0638t;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p049Bm.InterfaceC1442q;
import p060C6.AbstractC1604a;
import p071Ch.C1684o;
import p071Ch.C1692w;
import p072Ci.C1699d;
import p072Ci.C1708m;
import p086D6.C1970n;
import p094De.C2025h;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2182h;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1089wl.AbstractC21011e;
import p1111xl.C21296a;
import p1155zi.C21936L0;
import p1155zi.C22011h0;
import p124Ei.C2546u0;
import p148Fi.C2786R0;
import p172Gi.C3077j;
import p235J6.C4265b;
import p235J6.C4268e;
import p235J6.C4270g;
import p235J6.C4271h;
import p235J6.InterfaceC4267d;
import p349O0.InterfaceC5985X;
import p364Oh.AbstractC6241o;
import p364Oh.C6240n;
import p409Qk.C6752c;
import p434Rk.C6911c;
import p556Wk.AbstractC8887A;
import p556Wk.AbstractC8899M;
import p556Wk.AbstractC8900N;
import p571X9.AbstractC9233X;
import p582Xk.C9525b;
import p582Xk.C9531h;
import p582Xk.C9533j;
import p628Zk.AbstractC10419r;
import p666bl.AbstractC11497m;
import p666bl.C11488d;
import p666bl.C11503s;
import p666bl.EnumC11489e;
import p754fl.C13693c;
import p759g1.C13800b;
import p787he.C14459O;
import p792hl.AbstractC14527b;
import p792hl.C14526a;
import p792hl.C14528c;
import p857kl.C16452T;
import p857kl.C16464l;
import p860l0.C16685J0;
import p860l0.C16749j;
import p860l0.C16758m;
import p860l0.C16771q0;
import p860l0.C16779t;
import p873lh.C16961l;
import p909nm.C17690x;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17870w;
import p917o6.InterfaceC17842J;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;
import p996rm.EnumC19250a;
import sh.C19614c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: C5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1592j extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4463Y;

    /* JADX INFO: renamed from: Z */
    public int f4464Z;

    /* JADX INFO: renamed from: o0 */
    public Object f4465o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f4466p0;

    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ Object f4467q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1592j(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f4463Y = 2;
        this.f4467q0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r1v8, types: [Bm.o, java.lang.Object] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4463Y) {
            case 0:
                C1592j c1592j = new C1592j((InterfaceC18770c) obj3, (AsyncImagePainter) this.f4467q0, 0);
                c1592j.f4465o0 = (InterfaceC2186j) obj;
                c1592j.f4466p0 = obj2;
                return c1592j.invokeSuspend(C17296C.f55119a);
            case 1:
                C1592j c1592j2 = new C1592j((C1684o) this.f4466p0, (C6752c) this.f4467q0, (InterfaceC18770c) obj3, 1);
                c1592j2.f4465o0 = (AbstractC21011e) obj;
                return c1592j2.invokeSuspend(C17296C.f55119a);
            case 2:
                C1592j c1592j3 = new C1592j((InterfaceC1439n) this.f4467q0, (InterfaceC18770c) obj3);
                c1592j3.f4465o0 = (InterfaceC2186j) obj;
                c1592j3.f4466p0 = obj2;
                return c1592j3.invokeSuspend(C17296C.f55119a);
            case 3:
                C1592j c1592j4 = new C1592j((InterfaceC18770c) obj3, (InterfaceC1441p) this.f4467q0, 3);
                c1592j4.f4465o0 = (InterfaceC2186j) obj;
                c1592j4.f4466p0 = (Object[]) obj2;
                return c1592j4.invokeSuspend(C17296C.f55119a);
            case 4:
                C1592j c1592j5 = new C1592j((InterfaceC1440o) this.f4466p0, (InterfaceC18770c) obj3);
                c1592j5.f4465o0 = (InterfaceC2186j) obj;
                c1592j5.f4467q0 = (Object[]) obj2;
                return c1592j5.invokeSuspend(C17296C.f55119a);
            case 5:
                long j10 = ((C13800b) obj2).f43584a;
                C1592j c1592j6 = new C1592j((InterfaceC5985X) this.f4466p0, (InterfaceC1436k) this.f4467q0, (InterfaceC18770c) obj3, 5);
                c1592j6.f4465o0 = (C16685J0) obj;
                return c1592j6.invokeSuspend(C17296C.f55119a);
            case 6:
                C1592j c1592j7 = new C1592j((InterfaceC17842J) this.f4467q0, (InterfaceC18770c) obj3, 6);
                c1592j7.f4465o0 = (InterfaceC2186j) obj;
                c1592j7.f4466p0 = (Throwable) obj2;
                return c1592j7.invokeSuspend(C17296C.f55119a);
            case 7:
                long j11 = ((C13800b) obj2).f43584a;
                C1592j c1592j8 = new C1592j((VoiceModeViewModel) this.f4466p0, (InterfaceC5985X) this.f4467q0, (InterfaceC18770c) obj3, 7);
                c1592j8.f4465o0 = (C16685J0) obj;
                return c1592j8.invokeSuspend(C17296C.f55119a);
            case 8:
                C1592j c1592j9 = new C1592j((C17852e) this.f4467q0, (InterfaceC18770c) obj3, 8);
                c1592j9.f4465o0 = (InterfaceC2186j) obj;
                c1592j9.f4466p0 = (InterfaceC4267d) obj2;
                return c1592j9.invokeSuspend(C17296C.f55119a);
            case 9:
                C1592j c1592j10 = new C1592j((C6752c) this.f4467q0, (InterfaceC18770c) obj3, 9);
                c1592j10.f4465o0 = (AbstractC21011e) obj;
                c1592j10.f4466p0 = obj2;
                return c1592j10.invokeSuspend(C17296C.f55119a);
            case 10:
                C1592j c1592j11 = new C1592j((InterfaceC1439n) this.f4467q0, (InterfaceC18770c) obj3, 10);
                c1592j11.f4465o0 = (AbstractC21011e) obj;
                c1592j11.f4466p0 = (AbstractC14527b) obj2;
                return c1592j11.invokeSuspend(C17296C.f55119a);
            case 11:
                C1592j c1592j12 = new C1592j((List) this.f4467q0, (InterfaceC18770c) obj3, 11);
                c1592j12.f4465o0 = (C9531h) obj;
                c1592j12.f4466p0 = (C13693c) obj2;
                return c1592j12.invokeSuspend(C17296C.f55119a);
            case 12:
                C1592j c1592j13 = new C1592j((C9525b) this.f4467q0, (InterfaceC18770c) obj3, 12);
                c1592j13.f4465o0 = (C9531h) obj;
                c1592j13.f4466p0 = (C13693c) obj2;
                return c1592j13.invokeSuspend(C17296C.f55119a);
            case 13:
                C1592j c1592j14 = new C1592j((C9525b) this.f4467q0, (InterfaceC18770c) obj3, 13);
                c1592j14.f4466p0 = (C13693c) obj;
                c1592j14.f4465o0 = (InterfaceC1436k) obj2;
                return c1592j14.invokeSuspend(C17296C.f55119a);
            case 14:
                C1592j c1592j15 = new C1592j((InterfaceC1442q) this.f4467q0, (InterfaceC18770c) obj3, 14);
                c1592j15.f4466p0 = (AbstractC21011e) obj;
                return c1592j15.invokeSuspend(C17296C.f55119a);
            case 15:
                C1592j c1592j16 = new C1592j((EnumC11489e) this.f4467q0, (InterfaceC18770c) obj3, 15);
                c1592j16.f4466p0 = (C11503s) obj;
                c1592j16.f4465o0 = (C6911c) obj2;
                return c1592j16.invokeSuspend(C17296C.f55119a);
            case 16:
                C1592j c1592j17 = new C1592j((InterfaceC18770c) obj3, (C14459O) this.f4467q0, 16);
                c1592j17.f4465o0 = (InterfaceC2186j) obj;
                c1592j17.f4466p0 = obj2;
                return c1592j17.invokeSuspend(C17296C.f55119a);
            case 17:
                C1592j c1592j18 = new C1592j((InterfaceC18770c) obj3, (C16382j) this.f4467q0, 17);
                c1592j18.f4465o0 = (InterfaceC2186j) obj;
                c1592j18.f4466p0 = obj2;
                return c1592j18.invokeSuspend(C17296C.f55119a);
            case 18:
                C1592j c1592j19 = new C1592j((C16771q0) this.f4466p0, (C16758m) this.f4467q0, (InterfaceC18770c) obj3, 18);
                c1592j19.f4465o0 = (C16779t) obj;
                return c1592j19.invokeSuspend(C17296C.f55119a);
            default:
                C1592j c1592j20 = new C1592j((C16961l) this.f4467q0, (InterfaceC18770c) obj3, 19);
                c1592j20.f4465o0 = (C1699d) obj;
                c1592j20.f4466p0 = (C2786R0) obj2;
                return c1592j20.invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01de  */
    /* JADX WARN: Code duplicated, block: B:367:0x0751  */
    /* JADX WARN: Code duplicated, block: B:443:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
    
        if (r2 == r1) goto L92;
     */
    /* JADX WARN: Type inference failed for: r3v14, types: [Bm.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM10906a;
        C1692w c1692w;
        InterfaceC2186j interfaceC2186j;
        Object objInvoke;
        InterfaceC2186j interfaceC2186j2;
        Object objMo985d;
        InterfaceC2186j interfaceC2186j3;
        Object objInvoke2;
        Object objM21467a;
        AbstractC21011e abstractC21011e;
        Object obj2;
        AbstractC21011e abstractC21011e2;
        Object objInvoke3;
        Object objMo9562a;
        C9531h c9531h;
        C13693c c13693c;
        Object objMo9562a2;
        Object objM9560a;
        InterfaceC0638t interfaceC0638t;
        C21296a c21296a;
        Object objMo2052j;
        AbstractC21011e abstractC21011e3;
        C6911c c6911c;
        Object objMo21464c;
        C6911c c6911c2;
        Throwable th2;
        C11488d c11488d;
        String string;
        Throwable th3;
        C11488d c11488d2;
        C1699d c1699d;
        Object objM18592c;
        C2786R0 c2786r0;
        List list;
        boolean z6 = false;
        Object obj3 = null;
        Object obj4 = null;
        c3077j = null;
        C3077j c3077j = null;
        C17296C c17296c = C17296C.f55119a;
        int i10 = 1;
        switch (this.f4463Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = this.f4464Z;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j4 = (InterfaceC2186j) this.f4465o0;
                C2153Q0 c2153q0 = ((AsyncImagePainter) this.f4467q0).f35904D0;
                this.f4464Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j4, c2153q0, this) == enumC19250a ? enumC19250a : c17296c;
            case 1:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i12 = this.f4464Z;
                C1684o c1684o = (C1684o) this.f4466p0;
                if (i12 == 0) {
                    AbstractC9233X.m9807c(obj);
                    AbstractC21011e abstractC21011e4 = (AbstractC21011e) this.f4465o0;
                    if (((C13693c) abstractC21011e4.f66872Y).f43200f.m20648b(AbstractC6241o.f20322d)) {
                        return c17296c;
                    }
                    InterfaceC1436k interfaceC1436k = c1684o.f4764b.f20276h;
                    C13693c c13693c2 = (C13693c) abstractC21011e4.f66872Y;
                    if (!((Boolean) interfaceC1436k.invoke(c13693c2.f43195a.f51018a)).booleanValue()) {
                        return c17296c;
                    }
                    C16452T c16452tM18021b = c13693c2.f43195a.m18021b();
                    this.f4464Z = 1;
                    objM10906a = AbstractC10419r.m10906a((C6752c) this.f4467q0, c16452tM18021b, this);
                    if (objM10906a != enumC19250a2) {
                    }
                    return enumC19250a2;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                objM10906a = obj;
                List list2 = (List) objM10906a;
                InterfaceC17710b interfaceC17710b = AbstractC10419r.f30884a;
                AbstractC16544l.m18094g(list2, "<this>");
                for (Object obj5 : list2) {
                    if (AbstractC16544l.m18089b(((C16464l) obj5).f51070a, "_playintegrity")) {
                        obj3 = obj5;
                        if (((C16464l) obj3) != null) {
                            return c17296c;
                        }
                        c1692w = c1684o.f4763a;
                        this.f4464Z = 2;
                        if (c1692w.m2509c(false, this) != enumC19250a2) {
                            return c17296c;
                        }
                        return enumC19250a2;
                    }
                }
                if (((C16464l) obj3) != null) {
                    return c17296c;
                }
                c1692w = c1684o.f4763a;
                this.f4464Z = 2;
                if (c1692w.m2509c(false, this) != enumC19250a2) {
                    return c17296c;
                }
                return enumC19250a2;
            case 2:
                EnumC19250a enumC19250a3 = EnumC19250a.f61036Y;
                int i13 = this.f4464Z;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj);
                    interfaceC2186j = (InterfaceC2186j) this.f4465o0;
                    Object obj6 = this.f4466p0;
                    this.f4465o0 = interfaceC2186j;
                    this.f4464Z = 1;
                    objInvoke = ((AbstractC19694j) this.f4467q0).invoke(obj6, this);
                    if (objInvoke != enumC19250a3) {
                    }
                    return enumC19250a3;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                interfaceC2186j = (InterfaceC2186j) this.f4465o0;
                AbstractC9233X.m9807c(obj);
                objInvoke = obj;
                this.f4465o0 = null;
                this.f4464Z = 2;
                if (interfaceC2186j.mo395a(objInvoke, this) != enumC19250a3) {
                    return c17296c;
                }
                return enumC19250a3;
            case 3:
                EnumC19250a enumC19250a4 = EnumC19250a.f61036Y;
                int i14 = this.f4464Z;
                if (i14 == 0) {
                    AbstractC9233X.m9807c(obj);
                    interfaceC2186j2 = (InterfaceC2186j) this.f4465o0;
                    Object[] objArr = (Object[]) this.f4466p0;
                    Object obj7 = objArr[0];
                    Object obj8 = objArr[1];
                    Object obj9 = objArr[2];
                    this.f4465o0 = interfaceC2186j2;
                    this.f4464Z = 1;
                    objMo985d = ((InterfaceC1441p) this.f4467q0).mo985d(obj7, obj8, obj9, this);
                    if (objMo985d != enumC19250a4) {
                    }
                    return enumC19250a4;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                InterfaceC2186j interfaceC2186j5 = (InterfaceC2186j) this.f4465o0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j2 = interfaceC2186j5;
                objMo985d = obj;
                this.f4465o0 = null;
                this.f4464Z = 2;
                if (interfaceC2186j2.mo395a(objMo985d, this) != enumC19250a4) {
                    return c17296c;
                }
                return enumC19250a4;
            case 4:
                EnumC19250a enumC19250a5 = EnumC19250a.f61036Y;
                int i15 = this.f4464Z;
                if (i15 == 0) {
                    AbstractC9233X.m9807c(obj);
                    interfaceC2186j3 = (InterfaceC2186j) this.f4465o0;
                    Object[] objArr2 = (Object[]) this.f4467q0;
                    Object obj10 = objArr2[0];
                    Object obj11 = objArr2[1];
                    this.f4465o0 = interfaceC2186j3;
                    this.f4464Z = 1;
                    objInvoke2 = this.f4466p0.invoke(obj10, obj11, this);
                    if (objInvoke2 != enumC19250a5) {
                    }
                    return enumC19250a5;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                InterfaceC2186j interfaceC2186j6 = (InterfaceC2186j) this.f4465o0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j3 = interfaceC2186j6;
                objInvoke2 = obj;
                this.f4465o0 = null;
                this.f4464Z = 2;
                if (interfaceC2186j3.mo395a(objInvoke2, this) != enumC19250a5) {
                    return c17296c;
                }
                return enumC19250a5;
            case 5:
                EnumC19250a enumC19250a6 = EnumC19250a.f61036Y;
                int i16 = this.f4464Z;
                if (i16 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C16685J0 c16685j0 = (C16685J0) this.f4465o0;
                    this.f4464Z = 1;
                    if (c16685j0.m18501a(this) == enumC19250a6) {
                        return enumC19250a6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f4466p0;
                if (!((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    return c17296c;
                }
                interfaceC5985X.setValue(Boolean.FALSE);
                ((InterfaceC1436k) this.f4467q0).invoke(new C2546u0(false));
                return c17296c;
            case 6:
                EnumC19250a enumC19250a7 = EnumC19250a.f61036Y;
                int i17 = this.f4464Z;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j7 = (InterfaceC2186j) this.f4465o0;
                Throwable th4 = (Throwable) this.f4466p0;
                if (!(th4 instanceof AbstractC1604a)) {
                    return c17296c;
                }
                UUID uuidRandomUUID = UUID.randomUUID();
                AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID(...)");
                C17853f c17853f = new C17853f(uuidRandomUUID, (InterfaceC17842J) this.f4467q0, null, null, (AbstractC1604a) th4, C17690x.f56481Y, C17870w.f56967a, false);
                this.f4465o0 = null;
                this.f4464Z = 1;
                return interfaceC2186j7.mo395a(c17853f, this) == enumC19250a7 ? enumC19250a7 : c17296c;
            case 7:
                EnumC19250a enumC19250a8 = EnumC19250a.f61036Y;
                int i18 = this.f4464Z;
                if (i18 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C16685J0 c16685j1 = (C16685J0) this.f4465o0;
                    this.f4464Z = 1;
                    if (c16685j1.m18501a(this) == enumC19250a8) {
                        return enumC19250a8;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) this.f4467q0;
                if (!((Boolean) interfaceC5985X2.getValue()).booleanValue()) {
                    return c17296c;
                }
                interfaceC5985X2.setValue(Boolean.FALSE);
                ((VoiceModeViewModel) this.f4466p0).m14395k(new C2546u0(false));
                return c17296c;
            case 8:
                EnumC19250a enumC19250a9 = EnumC19250a.f61036Y;
                int i19 = this.f4464Z;
                if (i19 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC2186j interfaceC2186j8 = (InterfaceC2186j) this.f4465o0;
                    InterfaceC4267d interfaceC4267d = (InterfaceC4267d) this.f4466p0;
                    if (!(interfaceC4267d instanceof C4271h) && !(interfaceC4267d instanceof C4265b)) {
                        if (interfaceC4267d instanceof C4270g) {
                            this.f4465o0 = null;
                            this.f4464Z = 1;
                            if (interfaceC2186j8.mo395a(interfaceC4267d, this) == enumC19250a9) {
                                return enumC19250a9;
                            }
                        } else {
                            if (interfaceC4267d instanceof C4268e) {
                                System.out.println((Object) ("Received general error while executing operation " + ((C17852e) this.f4467q0).f56921a.name() + ": " + ((C4268e) interfaceC4267d).f13928a));
                            } else {
                                this.f4465o0 = null;
                                this.f4464Z = 2;
                                if (interfaceC2186j8.mo395a(interfaceC4267d, this) == enumC19250a9) {
                                    return enumC19250a9;
                                }
                            }
                            z6 = true;
                        }
                    }
                } else if (i19 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i19 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 9:
                EnumC19250a enumC19250a10 = EnumC19250a.f61036Y;
                int i20 = this.f4464Z;
                if (i20 == 0) {
                    AbstractC9233X.m9807c(obj);
                    AbstractC21011e abstractC21011e5 = (AbstractC21011e) this.f4465o0;
                    Object obj12 = this.f4466p0;
                    if (!(obj12 instanceof C6911c)) {
                        throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj12 + '(' + AbstractC16526C.f51263a.mo5693b(obj12.getClass()) + ").").toString());
                    }
                    C14526a c14526a = ((C6752c) this.f4467q0).f21674u0;
                    AbstractC14527b abstractC14527bM7297d = ((C6911c) obj12).m7297d();
                    this.f4465o0 = abstractC21011e5;
                    this.f4466p0 = obj12;
                    this.f4464Z = 1;
                    objM21467a = c14526a.m21467a(c17296c, abstractC14527bM7297d, this);
                    if (objM21467a != enumC19250a10) {
                        abstractC21011e = abstractC21011e5;
                        obj2 = obj12;
                    }
                    return enumC19250a10;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                obj2 = this.f4466p0;
                AbstractC21011e abstractC21011e6 = (AbstractC21011e) this.f4465o0;
                AbstractC9233X.m9807c(obj);
                abstractC21011e = abstractC21011e6;
                objM21467a = obj;
                AbstractC14527b response = (AbstractC14527b) objM21467a;
                C6911c c6911c3 = (C6911c) obj2;
                c6911c3.getClass();
                AbstractC16544l.m18094g(response, "response");
                c6911c3.f22166o0 = response;
                this.f4465o0 = null;
                this.f4466p0 = null;
                this.f4464Z = 2;
                if (abstractC21011e.mo21465d(obj2, this) != enumC19250a10) {
                    return c17296c;
                }
                return enumC19250a10;
            case 10:
                EnumC19250a enumC19250a11 = EnumC19250a.f61036Y;
                int i21 = this.f4464Z;
                if (i21 == 0) {
                    AbstractC9233X.m9807c(obj);
                    abstractC21011e2 = (AbstractC21011e) this.f4465o0;
                    AbstractC14527b abstractC14527b = (AbstractC14527b) this.f4466p0;
                    this.f4465o0 = abstractC21011e2;
                    this.f4464Z = 1;
                    objInvoke3 = ((InterfaceC1439n) this.f4467q0).invoke(abstractC14527b, this);
                    if (objInvoke3 != enumC19250a11) {
                    }
                    return enumC19250a11;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                abstractC21011e2 = (AbstractC21011e) this.f4465o0;
                AbstractC9233X.m9807c(obj);
                objInvoke3 = obj;
                AbstractC14527b abstractC14527b2 = (AbstractC14527b) objInvoke3;
                if (abstractC14527b2 == null) {
                    return c17296c;
                }
                this.f4465o0 = null;
                this.f4464Z = 2;
                if (abstractC21011e2.mo21465d(abstractC14527b2, this) != enumC19250a11) {
                    return c17296c;
                }
                return enumC19250a11;
            case 11:
                EnumC19250a enumC19250a12 = EnumC19250a.f61036Y;
                int i22 = this.f4464Z;
                if (i22 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C9531h c9531h2 = (C9531h) ((InterfaceC0571F) this.f4465o0);
                    C13693c c13693c3 = (C13693c) this.f4466p0;
                    this.f4465o0 = null;
                    this.f4464Z = 1;
                    objMo9562a = c9531h2.f28682Y.mo9562a(c13693c3, this);
                    if (objMo9562a == enumC19250a12) {
                        return enumC19250a12;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6911c c6911c4 = (C6911c) ((InterfaceC0571F) this.f4465o0);
                        AbstractC9233X.m9807c(obj);
                        return c6911c4;
                    }
                    AbstractC9233X.m9807c(obj);
                    objMo9562a = obj;
                }
                C6911c c6911c5 = (C6911c) objMo9562a;
                AbstractC14527b abstractC14527bM7297d2 = c6911c5.m7297d();
                this.f4465o0 = c6911c5;
                this.f4464Z = 2;
                return AbstractC8887A.m9558b((List) this.f4467q0, abstractC14527bM7297d2, this) == enumC19250a12 ? enumC19250a12 : c6911c5;
            case 12:
                EnumC19250a enumC19250a13 = EnumC19250a.f61036Y;
                int i23 = this.f4464Z;
                if (i23 != 0) {
                    if (i23 == 1) {
                        c13693c = (C13693c) this.f4466p0;
                        c9531h = (C9531h) this.f4465o0;
                        AbstractC9233X.m9807c(obj);
                        objMo9562a2 = obj;
                    } else {
                        if (i23 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                        objM9560a = obj;
                    }
                    return objM9560a;
                }
                AbstractC9233X.m9807c(obj);
                c9531h = (C9531h) this.f4465o0;
                c13693c = (C13693c) this.f4466p0;
                this.f4465o0 = c9531h;
                this.f4466p0 = c13693c;
                this.f4464Z = 1;
                objMo9562a2 = c9531h.f28682Y.mo9562a(c13693c, this);
                if (objMo9562a2 == enumC19250a13) {
                    return enumC19250a13;
                }
                C6911c c6911c6 = (C6911c) objMo9562a2;
                if (!AbstractC8899M.f27237a.contains(c6911c6.m7296c().getMethod())) {
                    return c6911c6;
                }
                C6752c c6752c = ((C9525b) this.f4467q0).f28663a;
                this.f4465o0 = null;
                this.f4466p0 = null;
                this.f4464Z = 2;
                objM9560a = AbstractC8899M.m9560a(c9531h, c13693c, c6911c6, c6752c, this);
                if (objM9560a == enumC19250a13) {
                    return enumC19250a13;
                }
                return objM9560a;
            case 13:
                EnumC19250a enumC19250a14 = EnumC19250a.f61036Y;
                int i24 = this.f4464Z;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0638t = (InterfaceC0638t) this.f4466p0;
                    try {
                        AbstractC9233X.m9807c(obj);
                        ((C0631p0) interfaceC0638t).m1279g0();
                        return c17296c;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            C0631p0 c0631p0 = (C0631p0) interfaceC0638t;
                            c0631p0.getClass();
                            c0631p0.m1298O(new C0642v(th, false));
                            throw th;
                        } catch (Throwable th6) {
                            ((C0631p0) interfaceC0638t).m1279g0();
                            throw th6;
                        }
                    }
                }
                AbstractC9233X.m9807c(obj);
                C13693c c13693c4 = (C13693c) this.f4466p0;
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) this.f4465o0;
                C0566C0 c0566c0 = new C0566C0(c13693c4.f43199e);
                InterfaceC18774g interfaceC18774g = ((C9525b) this.f4467q0).f28663a.f21670q0.get(C0625m0.f1875Y);
                AbstractC16544l.m18091d(interfaceC18774g);
                InterfaceC17710b interfaceC17710b2 = AbstractC8900N.f27241a;
                c0566c0.mo1271H0(new C0386f(((InterfaceC0627n0) interfaceC18774g).mo1271H0(new C0386f(c0566c0, 14)), 15));
                try {
                    c13693c4.f43199e = c0566c0;
                    this.f4466p0 = c0566c0;
                    this.f4464Z = 1;
                    if (interfaceC1436k2.invoke(this) == enumC19250a14) {
                        return enumC19250a14;
                    }
                    interfaceC0638t = c0566c0;
                    ((C0631p0) interfaceC0638t).m1279g0();
                    return c17296c;
                } catch (Throwable th7) {
                    th = th7;
                    interfaceC0638t = c0566c0;
                    C0631p0 c0631p1 = (C0631p0) interfaceC0638t;
                    c0631p1.getClass();
                    c0631p1.m1298O(new C0642v(th, false));
                    throw th;
                }
            case 14:
                EnumC19250a enumC19250a15 = EnumC19250a.f61036Y;
                int i25 = this.f4464Z;
                if (i25 == 0) {
                    AbstractC9233X.m9807c(obj);
                    AbstractC21011e abstractC21011e7 = (AbstractC21011e) this.f4466p0;
                    C14528c c14528c = (C14528c) abstractC21011e7.mo21463b();
                    c21296a = c14528c.f45789a;
                    Object obj13 = c14528c.f45790b;
                    if (!(obj13 instanceof InterfaceC15088n)) {
                        return c17296c;
                    }
                    C9533j c9533j = new C9533j();
                    AbstractC14527b abstractC14527bM7297d3 = ((C6911c) abstractC21011e7.f66872Y).m7297d();
                    this.f4466p0 = abstractC21011e7;
                    this.f4465o0 = c21296a;
                    this.f4464Z = 1;
                    objMo2052j = ((InterfaceC1442q) this.f4467q0).mo2052j(c9533j, abstractC14527bM7297d3, obj13, c21296a, this);
                    if (objMo2052j != enumC19250a15) {
                        abstractC21011e3 = abstractC21011e7;
                    }
                    return enumC19250a15;
                }
                if (i25 != 1) {
                    if (i25 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                C21296a c21296a2 = (C21296a) this.f4465o0;
                abstractC21011e3 = (AbstractC21011e) this.f4466p0;
                AbstractC9233X.m9807c(obj);
                c21296a = c21296a2;
                objMo2052j = obj;
                if (objMo2052j == null) {
                    return c17296c;
                }
                if (!(objMo2052j instanceof C17284b) && !c21296a.f67700a.mo4449e(objMo2052j)) {
                    throw new IllegalStateException("transformResponseBody returned " + objMo2052j + " but expected value of type " + c21296a);
                }
                C14528c c14528c2 = new C14528c(c21296a, objMo2052j);
                this.f4466p0 = null;
                this.f4465o0 = null;
                this.f4464Z = 2;
                if (abstractC21011e3.mo21465d(c14528c2, this) != enumC19250a15) {
                    return c17296c;
                }
                return enumC19250a15;
            case 15:
                EnumC19250a enumC19250a16 = EnumC19250a.f61036Y;
                int i26 = this.f4464Z;
                EnumC11489e enumC11489e = (EnumC11489e) this.f4467q0;
                if (i26 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C11503s c11503s = (C11503s) this.f4466p0;
                    c6911c = (C6911c) this.f4465o0;
                    if (enumC11489e == EnumC11489e.f34774q0 || c6911c.m7299k().m20648b(AbstractC11497m.f34801b)) {
                        return c17296c;
                    }
                    try {
                        this.f4466p0 = c6911c;
                        this.f4464Z = 1;
                        objMo21464c = c11503s.f34818a.mo21464c(this);
                    } catch (Throwable th8) {
                        th2 = th8;
                        c6911c2 = c6911c;
                        StringBuilder sb2 = new StringBuilder();
                        c11488d = (C11488d) c6911c2.m7299k().m20649c(AbstractC11497m.f34800a);
                        AbstractC11497m.m12895b(enumC11489e, sb2, c6911c2.m7296c(), th2);
                        string = sb2.toString();
                        AbstractC16544l.m18093f(string, "toString(...)");
                        this.f4466p0 = th2;
                        this.f4465o0 = c11488d;
                        this.f4464Z = 2;
                        if (c11488d.m12892e(string, this) != enumC19250a16) {
                            th3 = th2;
                            c11488d2 = c11488d;
                            this.f4466p0 = th3;
                            this.f4465o0 = null;
                            this.f4464Z = 3;
                            if (c11488d2.m12889b(this) != enumC19250a16) {
                                throw th3;
                            }
                        }
                    }
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            if (i26 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th9 = (Throwable) this.f4466p0;
                            AbstractC9233X.m9807c(obj);
                            throw th9;
                        }
                        c11488d2 = (C11488d) this.f4465o0;
                        th3 = (Throwable) this.f4466p0;
                        AbstractC9233X.m9807c(obj);
                        this.f4466p0 = th3;
                        this.f4465o0 = null;
                        this.f4464Z = 3;
                        if (c11488d2.m12889b(this) != enumC19250a16) {
                            throw th3;
                        }
                        return enumC19250a16;
                    }
                    c6911c2 = (C6911c) this.f4466p0;
                    try {
                        AbstractC9233X.m9807c(obj);
                        c6911c = c6911c2;
                        objMo21464c = obj;
                    } catch (Throwable th10) {
                        th2 = th10;
                        StringBuilder sb3 = new StringBuilder();
                        c11488d = (C11488d) c6911c2.m7299k().m20649c(AbstractC11497m.f34800a);
                        AbstractC11497m.m12895b(enumC11489e, sb3, c6911c2.m7296c(), th2);
                        string = sb3.toString();
                        AbstractC16544l.m18093f(string, "toString(...)");
                        this.f4466p0 = th2;
                        this.f4465o0 = c11488d;
                        this.f4464Z = 2;
                        if (c11488d.m12892e(string, this) != enumC19250a16) {
                            th3 = th2;
                            c11488d2 = c11488d;
                            this.f4466p0 = th3;
                            this.f4465o0 = null;
                            this.f4464Z = 3;
                            if (c11488d2.m12889b(this) != enumC19250a16) {
                                throw th3;
                            }
                        }
                        return enumC19250a16;
                    }
                }
                return c17296c;
            case 16:
                EnumC19250a enumC19250a17 = EnumC19250a.f61036Y;
                int i27 = this.f4464Z;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j9 = (InterfaceC2186j) this.f4465o0;
                String conversationId = ((C22011h0) this.f4466p0).f69652a;
                C18077B c18077b = ((C14459O) this.f4467q0).f45503b;
                AbstractC16544l.m18094g(conversationId, "conversationId");
                C1970n c1970nM3175d = c18077b.f57657c.m3175d(conversationId);
                this.f4464Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j9, c1970nM3175d, this) == enumC19250a17 ? enumC19250a17 : c17296c;
            case 17:
                EnumC19250a enumC19250a18 = EnumC19250a.f61036Y;
                int i28 = this.f4464Z;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                InterfaceC2186j interfaceC2186j10 = (InterfaceC2186j) this.f4465o0;
                C21936L0 c21936l0 = (C21936L0) this.f4466p0;
                String str = c21936l0 != null ? c21936l0.f69488a : null;
                InterfaceC2184i c2025h = str != null ? new C2025h(((C16382j) this.f4467q0).f50874a.f28512b.m7286b(new C19614c(str), new C6240n()), 8) : C2182h.f6683Y;
                this.f4464Z = 1;
                return AbstractC2124C.m3217p(interfaceC2186j10, c2025h, this) == enumC19250a18 ? enumC19250a18 : c17296c;
            case 18:
                EnumC19250a enumC19250a19 = EnumC19250a.f61036Y;
                int i29 = this.f4464Z;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                AbstractC9233X.m9807c(obj);
                C16749j c16749j = new C16749j((C16758m) this.f4467q0, (C16779t) this.f4465o0, i10);
                this.f4464Z = 1;
                return ((C16771q0) this.f4466p0).invoke(c16749j, this) == enumC19250a19 ? enumC19250a19 : c17296c;
            default:
                EnumC19250a enumC19250a20 = EnumC19250a.f61036Y;
                int i30 = this.f4464Z;
                if (i30 == 0) {
                    AbstractC9233X.m9807c(obj);
                    c1699d = (C1699d) this.f4465o0;
                    C2786R0 c2786r1 = (C2786R0) this.f4466p0;
                    this.f4465o0 = c1699d;
                    this.f4466p0 = c2786r1;
                    this.f4464Z = 1;
                    objM18592c = ((C16961l) this.f4467q0).m18592c(this);
                    if (objM18592c == enumC19250a20) {
                        return enumC19250a20;
                    }
                    c2786r0 = c2786r1;
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2786r0 = (C2786R0) this.f4466p0;
                    c1699d = (C1699d) this.f4465o0;
                    AbstractC9233X.m9807c(obj);
                    C1708m c1708m = (C1708m) obj;
                    objM18592c = c1708m != null ? c1708m.f4890a : null;
                }
                String str2 = (String) objM18592c;
                if (c2786r0 != null && (list = c2786r0.f8502a) != null) {
                    for (Object obj14 : list) {
                        String str3 = ((C3077j) obj14).f9279b;
                        String str4 = c1699d.f4832f;
                        if (str4 == null) {
                            str4 = str2;
                        }
                        if (str4 == null ? false : AbstractC16544l.m18089b(str3, str4)) {
                            obj4 = obj14;
                            c3077j = (C3077j) obj4;
                        }
                    }
                    c3077j = (C3077j) obj4;
                }
                return c3077j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592j(InterfaceC1440o interfaceC1440o, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f4463Y = 4;
        this.f4466p0 = interfaceC1440o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1592j(Object obj, Object obj2, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f4463Y = i10;
        this.f4466p0 = obj;
        this.f4467q0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1592j(Object obj, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f4463Y = i10;
        this.f4467q0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1592j(InterfaceC18770c interfaceC18770c, Object obj, int i10) {
        super(3, interfaceC18770c);
        this.f4463Y = i10;
        this.f4467q0 = obj;
    }
}
