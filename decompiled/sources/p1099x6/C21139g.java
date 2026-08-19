package p1099x6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.C0017I0;
import p049Bm.InterfaceC1436k;
import p1034u6.AbstractC20125c;
import p1034u6.C20124b;
import p1057v6.C20461a;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17665J;
import p909nm.C17691y;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.InterfaceC17835C;
import p917o6.InterfaceC17841I;
import p917o6.InterfaceC17842J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21139g extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f67173Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17853f f67174Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17852e f67175o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21143k f67176p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17867t f67177q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Set f67178r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21139g(C17853f c17853f, C17852e c17852e, C21143k c21143k, C17867t c17867t, Set set, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f67174Z = c17853f;
        this.f67175o0 = c17852e;
        this.f67176p0 = c21143k;
        this.f67177q0 = c17867t;
        this.f67178r0 = set;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C21139g(this.f67174Z, this.f67175o0, this.f67176p0, this.f67177q0, this.f67178r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C21139g) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Set set;
        C0017I0 c0017i0;
        LinkedHashSet linkedHashSetM19266f;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67173Y;
        C21143k c21143k = this.f67176p0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C17853f c17853f = this.f67174Z;
        if (c17853f.f56933c != null) {
            C17852e c17852e = this.f67175o0;
            AbstractC16544l.m18094g(c17852e, "<this>");
            C20124b c20124b = AbstractC20125c.f63752a;
            InterfaceC17835C interfaceC17835C = c17852e.f56923c;
            if (interfaceC17835C.mo4141d(c20124b) != null) {
                throw new ClassCastException();
            }
            C20461a cacheHeaders = C20461a.f64952b;
            if (c17853f.f56937g.mo4141d(c20124b) != null) {
                throw new ClassCastException();
            }
            cacheHeaders.getClass();
            AbstractC16544l.m18094g(cacheHeaders, "cacheHeaders");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(cacheHeaders.f64953a);
            linkedHashMap.putAll(cacheHeaders.f64953a);
            C20461a c20461a = new C20461a(linkedHashMap);
            if (interfaceC17835C.mo4141d(AbstractC20125c.f63757f) != null) {
                throw new ClassCastException();
            }
            C0017I0 c0017i1 = c21143k.f67190b;
            InterfaceC17842J interfaceC17842J = c17852e.f56921a;
            InterfaceC17841I interfaceC17841I = c17853f.f56933c;
            AbstractC16544l.m18091d(interfaceC17841I);
            this.f67173Y = 1;
            obj = c0017i1.m68G(interfaceC17842J, interfaceC17841I, this.f67177q0, c20461a, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            set = C17691y.f56482Y;
        }
        c0017i0 = c21143k.f67190b;
        linkedHashSetM19266f = AbstractC17665J.m19266f(set, this.f67178r0);
        this.f67173Y = 2;
        if (c0017i0.m87z(linkedHashSetM19266f, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
        set = (Set) obj;
        c0017i0 = c21143k.f67190b;
        linkedHashSetM19266f = AbstractC17665J.m19266f(set, this.f67178r0);
        this.f67173Y = 2;
        if (c0017i0.m87z(linkedHashSetM19266f, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
