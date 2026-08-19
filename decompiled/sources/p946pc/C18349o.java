package p946pc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import kp.AbstractC16648c;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p911o0.C17767k0;

/* JADX INFO: renamed from: pc.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C18349o extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58582Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f58583Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f58584o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f58585p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f58586q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17302e f58587r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f58588s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18349o(int i10, float f10, C17767k0 c17767k0, C8410b c8410b, C8410b c8410b2, int i11) {
        super(2);
        this.f58583Z = i10;
        this.f58584o0 = f10;
        this.f58586q0 = c17767k0;
        this.f58587r0 = c8410b;
        this.f58588s0 = c8410b2;
        this.f58585p0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58582Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f58585p0 | 1);
                C8410b c8410b = (C8410b) this.f58587r0;
                C8410b c8410b2 = (C8410b) this.f58588s0;
                C17767k0 c17767k0 = (C17767k0) this.f58586q0;
                AbstractC18351q.m19858b(this.f58583Z, this.f58584o0, c17767k0, c8410b, c8410b2, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f58585p0 | 1);
                float f10 = this.f58584o0;
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f58588s0;
                AbstractC16648c.m18464a(this.f58583Z, (List) this.f58586q0, (InterfaceC1436k) this.f58587r0, f10, interfaceC10459q, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18349o(int i10, List list, InterfaceC1436k interfaceC1436k, float f10, InterfaceC10459q interfaceC10459q, int i11) {
        super(2);
        this.f58583Z = i10;
        this.f58586q0 = list;
        this.f58587r0 = interfaceC1436k;
        this.f58584o0 = f10;
        this.f58588s0 = interfaceC10459q;
        this.f58585p0 = i11;
    }
}
