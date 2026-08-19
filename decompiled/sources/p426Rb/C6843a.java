package p426Rb;

import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p301M.RunnableC5228j;
import p451Sb.C7102a;
import p477Tb.C7295b;
import p477Tb.C7296c;
import p499U9.AbstractC7589s;
import p499U9.C7585o;
import p501Ub.C7599a;
import p501Ub.C7600b;
import p501Ub.C7602d;
import p501Ub.C7605g;
import p501Ub.C7609k;
import p525Vb.C8258a;
import p658b5.C11238i;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: Rb.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6843a implements InterfaceC17207d {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ C6843a f21940Z = new C6843a(0);

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C6843a f21941o0 = new C6843a(1);

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C6843a f21942p0 = new C6843a(2);

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C6843a f21943q0 = new C6843a(3);

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C6843a f21944r0 = new C6843a(4);

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ C6843a f21945s0 = new C6843a(5);

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ C6843a f21946t0 = new C6843a(6);

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ C6843a f21947u0 = new C6843a(7);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21948Y;

    public /* synthetic */ C6843a(int i10) {
        this.f21948Y = i10;
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public final Object mo391g(C11238i c11238i) {
        switch (this.f21948Y) {
            case 0:
                return new C8258a();
            case 1:
                return new C7605g();
            case 2:
                return new C7296c(c11238i.m12537E0(C7295b.class));
            case 3:
                return new C7602d(c11238i.mo12569o(C7605g.class));
            case 4:
                C7599a c7599a = new C7599a();
                ReferenceQueue referenceQueue = c7599a.f24029a;
                Set set = c7599a.f24030b;
                set.add(new C7609k(c7599a, referenceQueue, set));
                Thread thread = new Thread(new RunnableC5228j(referenceQueue, 11, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return c7599a;
            case 5:
                return new C7600b(0);
            case 6:
                synchronized (AbstractC7589s.class) {
                    byte b = (byte) (((byte) 1) | 2);
                    try {
                        if (b != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            if ((b & 1) == 0) {
                                sb2.append(" enableFirelog");
                            }
                            if ((b & 2) == 0) {
                                sb2.append(" firelogEventType");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        }
                        AbstractC7589s.m7933h(new C7585o());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new C7102a(0);
            default:
                return new C7295b(c11238i.mo12569o(C7102a.class));
        }
    }
}
