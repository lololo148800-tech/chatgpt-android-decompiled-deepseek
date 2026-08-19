package p344Nl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1440o;
import p103Dn.InterfaceC2186j;
import p566X4.AbstractC9045c;
import p566X4.C9043a;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17678l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nl.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C5854z extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19149Y;

    /* JADX INFO: renamed from: Z */
    public int f19150Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ InterfaceC2186j f19151o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object[] f19152p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5854z(int i10, InterfaceC18770c interfaceC18770c, int i11) {
        super(i10, interfaceC18770c);
        this.f19149Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC2186j interfaceC2186j = (InterfaceC2186j) obj;
        Object[] objArr = (Object[]) obj2;
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (this.f19149Y) {
            case 0:
                C5854z c5854z = new C5854z(3, interfaceC18770c, 0);
                c5854z.f19151o0 = interfaceC2186j;
                c5854z.f19152p0 = objArr;
                return c5854z.invokeSuspend(C17296C.f55119a);
            default:
                C5854z c5854z2 = new C5854z(3, interfaceC18770c, 1);
                c5854z2.f19151o0 = interfaceC2186j;
                c5854z2.f19152p0 = objArr;
                return c5854z2.invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC9045c abstractC9045c;
        AbstractC9045c abstractC9045c2;
        switch (this.f19149Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f19150Z;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC2186j interfaceC2186j = this.f19151o0;
                    List listM19291N = AbstractC17678l.m19291N((C17309l[]) this.f19152p0);
                    this.f19150Z = 1;
                    if (interfaceC2186j.mo395a(listM19291N, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f19150Z;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    InterfaceC2186j interfaceC2186j2 = this.f19151o0;
                    AbstractC9045c[] abstractC9045cArr = (AbstractC9045c[]) this.f19152p0;
                    int length = abstractC9045cArr.length;
                    int i12 = 0;
                    while (true) {
                        abstractC9045c = C9043a.f27615a;
                        if (i12 < length) {
                            abstractC9045c2 = abstractC9045cArr[i12];
                            if (AbstractC16544l.m18089b(abstractC9045c2, abstractC9045c)) {
                                i12++;
                            }
                        } else {
                            abstractC9045c2 = null;
                        }
                    }
                    if (abstractC9045c2 != null) {
                        abstractC9045c = abstractC9045c2;
                    }
                    this.f19150Z = 1;
                    if (interfaceC2186j2.mo395a(abstractC9045c, this) == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
        }
    }
}
