package p787he;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1126yd.C21406A0;
import p1126yd.EnumC21410C0;
import p1126yd.EnumC21414E0;
import p1126yd.EnumC21418G0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21984a1;
import p381Pe.C6397h;
import p403Qd.C6636i;
import p403Qd.C6657s0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C14469Z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45577Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14473b0 f45578Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6657s0 f45579o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6397h f45580p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6397h f45581q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C6636i f45582r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Integer f45583s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ List f45584t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14469Z(C14473b0 c14473b0, C6657s0 c6657s0, C6397h c6397h, C6397h c6397h2, C6636i c6636i, Integer num, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45578Z = c14473b0;
        this.f45579o0 = c6657s0;
        this.f45580p0 = c6397h;
        this.f45581q0 = c6397h2;
        this.f45582r0 = c6636i;
        this.f45583s0 = num;
        this.f45584t0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14469Z(this.f45578Z, this.f45579o0, this.f45580p0, this.f45581q0, this.f45582r0, this.f45583s0, this.f45584t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14469Z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC21414E0 enumC21414E0;
        EnumC21410C0 enumC21410C0;
        float f10;
        Object objM19702g;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45577Y;
        C14473b0 c14473b0 = this.f45578Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18077B c18077b = c14473b0.f45591a;
            C6657s0 c6657s0 = this.f45579o0;
            EnumC21418G0 enumC21418G0 = AbstractC16544l.m18089b(c6657s0.f21423b, "unskippable") ? EnumC21418G0.f67989o0 : EnumC21418G0.f67988Z;
            C6397h c6397h = this.f45580p0;
            String str = ((C21984a1) c6397h.f20819a).f69607Y;
            C6397h c6397h2 = this.f45581q0;
            String str2 = ((C21984a1) c6397h2.f20819a).f69607Y;
            String str3 = this.f45582r0.f21379a;
            Integer num = this.f45583s0;
            if (num != null && num.intValue() == 0) {
                enumC21414E0 = EnumC21414E0.f67981Z;
            } else {
                enumC21414E0 = (num != null && num.intValue() == 1) ? EnumC21414E0.f67982o0 : EnumC21414E0.f67983p0;
            }
            boolean z6 = c6657s0.f21425d;
            if (z6) {
                enumC21410C0 = EnumC21410C0.f67975Z;
            } else {
                if (z6) {
                    throw new C0644w();
                }
                enumC21410C0 = EnumC21410C0.f67976o0;
            }
            Map map = c6657s0.f21428g;
            Long l4 = (Long) map.get(c6397h.f20819a);
            long jLongValue = l4 != null ? l4.longValue() : 0L;
            Long l10 = (Long) map.get(c6397h2.f20819a);
            long jLongValue2 = l10 != null ? l10.longValue() : 0L;
            List list = this.f45584t0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        f10 = 1.0f;
                        break;
                    }
                    if (!((Boolean) it.next()).booleanValue()) {
                        f10 = 0.0f;
                        break;
                    }
                }
            } else {
                f10 = 1.0f;
                break;
            }
            Float f11 = new Float(f10);
            long j10 = c6657s0.f21426e;
            C21406A0 c21406a0 = new C21406A0(enumC21418G0, str, str2, str3, enumC21414E0, enumC21410C0, j10, j10, j10, jLongValue, c6657s0.f21426e, jLongValue2, f11);
            this.f45577Y = 1;
            objM19702g = c18077b.m19702g(c21406a0, this);
            if (objM19702g == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objM19702g = obj;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM19702g;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC8160o6.m8727b(c14473b0.f45593c, "Failed to send feedback", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
        }
        return C17296C.f55119a;
    }
}
