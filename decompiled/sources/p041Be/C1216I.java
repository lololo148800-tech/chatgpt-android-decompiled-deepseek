package p041Be;

import bo.AbstractC11523k;
import bo.C11527o;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16526C;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p003A1.C0227a;
import p003A1.C0254h0;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p1071w0.AbstractC20734X;
import p1126yd.C21446V;
import p1155zi.AbstractC21955Q1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6241o;
import p409Qk.C6752c;
import p523V9.AbstractC8056b6;
import p544W9.AbstractC8651i4;
import p556Wk.AbstractC8910Y;
import p571X9.AbstractC9233X;
import p754fl.AbstractC13695e;
import p754fl.C13693c;
import p792hl.C14535j;
import p857kl.AbstractC16457e;
import p857kl.AbstractC16459g;
import p857kl.C16438E;
import p857kl.C16447N;
import p909nm.AbstractC17659D;
import p929oi.AbstractC18201b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Be.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C1216I extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f3202Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f3203Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1219L f3204o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21446V f3205p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ EnumC1228V f3206q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC21955Q1 f3207r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1216I(C1219L c1219l, C21446V c21446v, EnumC1228V enumC1228V, AbstractC21955Q1 abstractC21955Q1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f3204o0 = c1219l;
        this.f3205p0 = c21446v;
        this.f3206q0 = enumC1228V;
        this.f3207r0 = abstractC21955Q1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1216I c1216i = new C1216I(this.f3204o0, this.f3205p0, this.f3206q0, this.f3207r0, interfaceC18770c);
        c1216i.f3203Z = obj;
        return c1216i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1216I) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3777y interfaceC3777yM18075c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f3202Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f3203Z;
            C6752c c6752c = this.f3204o0.f3216a;
            C13693c c13693c = new C13693c();
            c13693c.f43200f.m20652f(AbstractC6241o.f20320b, c17296c);
            C0227a c0227a = new C0227a(this.f3206q0, 2);
            C16447N c16447n = c13693c.f43195a;
            c0227a.invoke(c16447n, c16447n);
            AbstractC16645d abstractC16645dM12908a = AbstractC11523k.m12908a(Boolean.TRUE);
            C11527o c11527o = AbstractC18201b.f58034a;
            c11527o.getClass();
            LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(AbstractC11523k.m12917j(c11527o.m12904c(C21446V.Companion.serializer(), this.f3205p0)));
            linkedHashMapM19256r.put("stream", abstractC16645dM12908a);
            c13693c.f43198d = new C16644c(linkedHashMapM19256r);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(AbstractC16643b.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(AbstractC16643b.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
            AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
            AbstractC8056b6.m8451b(c13693c, AbstractC16459g.f51064b);
            AbstractC13695e.m15171a(c13693c, new C0254h0(this.f3207r0, 6));
            AbstractC8910Y.m9565b(c13693c, C1237i.f3258q0);
            C14535j c14535jM21254y = AbstractC20734X.m21254y(c13693c, C16438E.f50985c, c13693c, c6752c);
            C1215H c1215h = new C1215H(interfaceC2186j, null);
            this.f3202Y = 1;
            if (c14535jM21254y.m16037b(c1215h, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(lZYtIbClQJm.RaeOnOmuzBPlWy);
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
