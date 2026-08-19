package p787he;

import android.os.SystemClock;
import gd.C13862I0;
import gd.C13908Y;
import gd.C14003w0;
import gd.C14005w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p040Bd.C1032Y1;
import p040Bd.C1129m4;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p103Dn.C2130F;
import p103Dn.C2153Q0;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1126yd.C21446V;
import p1126yd.EnumC21452Y;
import p1155zi.C22031m0;
import p193Hf.C3327Q;
import p216Id.C3696d;
import p216Id.C3700h;
import p479Td.C7351f0;
import p523V9.AbstractC8202u0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p729ej.C13435z;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import ye.EnumC21517f;
import ye.EnumC21521j;

/* JADX INFO: renamed from: he.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C14491t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ String f45658A0;

    /* JADX INFO: renamed from: Y */
    public int f45659Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45660Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14459O f45661o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f45662p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f45663q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ List f45664r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ String f45665s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ EnumC21517f f45666t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ EnumC21521j f45667u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ boolean f45668v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ EnumC21452Y f45669w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ String f45670x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ String f45671y0;

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ List f45672z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14491t(C14459O c14459o, String str, String str2, List list, String str3, EnumC21517f enumC21517f, EnumC21521j enumC21521j, boolean z6, EnumC21452Y enumC21452Y, String str4, String str5, List list2, String str6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45661o0 = c14459o;
        this.f45662p0 = str;
        this.f45663q0 = str2;
        this.f45664r0 = list;
        this.f45665s0 = str3;
        this.f45666t0 = enumC21517f;
        this.f45667u0 = enumC21521j;
        this.f45668v0 = z6;
        this.f45669w0 = enumC21452Y;
        this.f45670x0 = str4;
        this.f45671y0 = str5;
        this.f45672z0 = list2;
        this.f45658A0 = str6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14491t c14491t = new C14491t(this.f45661o0, this.f45662p0, this.f45663q0, this.f45664r0, this.f45665s0, this.f45666t0, this.f45667u0, this.f45668v0, this.f45669w0, this.f45670x0, this.f45671y0, this.f45672z0, this.f45658A0, interfaceC18770c);
        c14491t.f45660Z = obj;
        return c14491t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14491t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        InterfaceC18770c interfaceC18770c;
        InterfaceC2184i c2219z0;
        InterfaceC0627n0 interfaceC0627n0;
        EnumC19250a enumC19250a;
        Object obj2;
        C0564B0 c0564b0;
        EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
        int i10 = this.f45659Y;
        C22031m0 c22031m0 = null;
        C14459O c14459o = this.f45661o0;
        if (i10 != 0) {
            if (i10 == 1) {
                InterfaceC0627n0 interfaceC0627n1 = (InterfaceC0627n0) this.f45660Z;
                AbstractC9233X.m9807c(obj);
                interfaceC0627n0 = interfaceC0627n1;
                enumC19250a = enumC19250a2;
                obj2 = null;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            if (c14459o.f45522u.getValue() instanceof C3696d) {
                c0564b0 = null;
            } else {
                C3700h c3700h = new C3700h(false);
                C2153Q0 c2153q0 = c14459o.f45522u;
                c2153q0.getClass();
                c0564b0 = null;
                c2153q0.m3251l(null, c3700h);
            }
            c14459o.f45501A = c0564b0;
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C0564B0 c0564b0M1156D = AbstractC0575H.m1156D((InterfaceC0571F) this.f45660Z, null, null, new C14490s(c14459o, null), 3);
        C14467X c14467x = c14459o.f45504c;
        String str2 = this.f45658A0;
        C14487p c14487p = new C14487p(c14459o, str2, 0);
        C14487p c14487p2 = new C14487p(c14459o, str2, 1);
        String parentMessageId = this.f45663q0;
        AbstractC16544l.m18094g(parentMessageId, "parentMessageId");
        List list = this.f45664r0;
        String model = this.f45665s0;
        AbstractC16544l.m18094g(model, "model");
        EnumC21517f forceSearch = this.f45666t0;
        AbstractC16544l.m18094g(forceSearch, "forceSearch");
        EnumC21452Y enumC21452Y = this.f45669w0;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8202u0.m8818d((C7351f0) it.next()));
        }
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = str2;
                    interfaceC18770c = null;
                    c2219z0 = new C2219z0(new C14461Q(2, null));
                    break;
                }
                if (!(((C1032Y1) it2.next()).f2853d instanceof C1129m4)) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    String str3 = this.f45671y0;
                    C22031m0 c22031m1 = str3 != null ? new C22031m0(str3) : c22031m0;
                    C13862I0 c13862i0 = C13862I0.f43900c;
                    C14005w2 c14005w2 = (C14005w2) c14467x.f45569e;
                    boolean zM15481a = c14005w2.m15481a(c13862i0);
                    String str4 = this.f45662p0;
                    boolean z6 = zM15481a && str4 == null;
                    List listM9974d = c14005w2.m15481a(C14003w0.f44080c) ? AbstractC9393x3.m9974d("v1") : null;
                    boolean zM15481a2 = c14005w2.m15481a(C13908Y.f43958c);
                    String id2 = TimeZone.getDefault().getID();
                    AbstractC16544l.m18091d(id2);
                    C21446V c21446v = new C21446V(str4, enumC21452Y, parentMessageId, arrayList, model, this.f45668v0, this.f45670x0, c22031m1, this.f45672z0, forceSearch, this.f45667u0, z6, listM9974d, zM15481a2, id2);
                    c14487p2.invoke(c21446v);
                    C16525B c16525b = new C16525B();
                    c16525b.f51262Y = str4;
                    str = str2;
                    c2219z0 = new C2130F(new C1970n(new C2219z0(new C14463T(c14467x, c14487p, str4, parentMessageId, c21446v, null)), 5, new C14464U(c16525b, null)), new C14466W(c14467x, jElapsedRealtime, c16525b, null));
                    interfaceC18770c = null;
                    break;
                }
                c22031m0 = null;
            }
        } else {
            str = str2;
            interfaceC18770c = null;
            c2219z0 = new C2219z0(new C14461Q(2, null));
            break;
        }
        C2130F c2130f = new C2130F(c2219z0, new C3327Q(c14459o, str, interfaceC18770c));
        C13435z c13435z = new C13435z(c14459o, 2, str);
        interfaceC0627n0 = c0564b0M1156D;
        this.f45660Z = interfaceC0627n0;
        this.f45659Y = 1;
        Object objMo3141d = c2130f.mo3141d(c13435z, this);
        enumC19250a = enumC19250a2;
        if (objMo3141d == enumC19250a) {
            return enumC19250a;
        }
        obj2 = null;
        this.f45660Z = obj2;
        this.f45659Y = 2;
        if (AbstractC0575H.m1182k(interfaceC0627n0, this) == enumC19250a) {
            return enumC19250a;
        }
        if (c14459o.f45522u.getValue() instanceof C3696d) {
            C3700h c3700h2 = new C3700h(false);
            C2153Q0 c2153q1 = c14459o.f45522u;
            c2153q1.getClass();
            c0564b0 = null;
            c2153q1.m3251l(null, c3700h2);
        } else {
            c0564b0 = null;
        }
        c14459o.f45501A = c0564b0;
        return C17296C.f55119a;
    }
}
