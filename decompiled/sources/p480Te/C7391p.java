package p480Te;

import kotlin.jvm.internal.AbstractC16526C;
import ml.AbstractC17288f;
import ml.C17284b;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.C6223B;
import p364Oh.C6251y;
import p409Qk.C6752c;
import p556Wk.AbstractC8918d;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.C16438E;
import p972qm.InterfaceC18770c;
import p991rh.C18987B;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Te.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C7391p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f23415Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f23416Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7392q f23417o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f23418p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ byte[] f23419q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7391p(C7392q c7392q, String str, byte[] bArr, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23417o0 = c7392q;
        this.f23418p0 = str;
        this.f23419q0 = bArr;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7391p c7391p = new C7391p(this.f23417o0, this.f23418p0, this.f23419q0, interfaceC18770c);
        c7391p.f23416Z = obj;
        return c7391p;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7391p) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1758z interfaceC1758z;
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3777y interfaceC3777yM18075c2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f23415Y;
        C17296C c17296c = C17296C.f55119a;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    interfaceC1758z = (InterfaceC1758z) this.f23416Z;
                    AbstractC9233X.m9807c(obj);
                } else if (r6 == 2) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (r6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
            }
            AbstractC9233X.m9807c(obj);
            interfaceC1758z = (InterfaceC1758z) this.f23416Z;
            C6752c c6752c = this.f23417o0.f23423d;
            String str = this.f23418p0;
            byte[] bArr = this.f23419q0;
            C13693c c13693c = new C13693c();
            AbstractC13695e.m15172b(c13693c, str);
            AbstractC13695e.m15171a(c13693c, C7389n.f23413Y);
            if (bArr == null) {
                c13693c.f43198d = C17284b.f55106a;
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(byte[].class);
                try {
                    interfaceC3777yM18075c2 = AbstractC16526C.m18075c(byte[].class);
                } catch (Throwable unused) {
                    interfaceC3777yM18075c2 = null;
                }
                c13693c.m15167b(new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c2));
            } else if (bArr instanceof AbstractC17288f) {
                c13693c.f43198d = bArr;
                c13693c.m15167b(null);
            } else {
                c13693c.f43198d = bArr;
                InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(byte[].class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(byte[].class);
                } catch (Throwable unused2) {
                    interfaceC3777yM18075c = null;
                }
                c13693c.m15167b(new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c));
            }
            c13693c.f43200f.m20652f(AbstractC8918d.f27287a, new C7390o(interfaceC1758z));
            c13693c.m15168c(C16438E.f50986d);
            C14535j c14535j = new C14535j(c13693c, c6752c);
            this.f23416Z = interfaceC1758z;
            this.f23415Y = 1;
            if (c14535j.m16038c(this) == enumC19250a) {
                return enumC19250a;
            }
            C18987B c18987b = new C18987B(new C6223B(c17296c));
            this.f23416Z = interfaceC1758z;
            this.f23415Y = 2;
            return ((C1757y) interfaceC1758z).f5030p0.mo2523o(c18987b, this) == enumC19250a ? enumC19250a : c17296c;
        } catch (Exception e10) {
            C18987B c18987b2 = new C18987B(new C6251y(e10));
            this.f23416Z = null;
            this.f23415Y = 3;
            if (((C1757y) r6).f5030p0.mo2523o(c18987b2, this) == enumC19250a) {
                return enumC19250a;
            }
        }
    }
}
