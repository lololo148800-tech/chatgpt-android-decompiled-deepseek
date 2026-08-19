package sb;

import java.util.Date;
import java.util.HashMap;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18665f;
import p961qb.InterfaceC18666g;
import p987rb.InterfaceC18910a;

/* JADX INFO: renamed from: sb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C19517d implements InterfaceC18910a {

    /* JADX INFO: renamed from: r0 */
    public static final C19515b f61979r0;

    /* JADX INFO: renamed from: s0 */
    public static final C19515b f61980s0;

    /* JADX INFO: renamed from: Y */
    public final HashMap f61982Y;

    /* JADX INFO: renamed from: Z */
    public final HashMap f61983Z;

    /* JADX INFO: renamed from: o0 */
    public final C19514a f61984o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f61985p0;

    /* JADX INFO: renamed from: q0 */
    public static final C19514a f61978q0 = new C19514a(0);

    /* JADX INFO: renamed from: t0 */
    public static final C19516c f61981t0 = new C19516c();

    /* JADX WARN: Type inference failed for: r0v1, types: [sb.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [sb.b] */
    static {
        final int i10 = 0;
        f61979r0 = new InterfaceC18665f() { // from class: sb.b
            @Override // p961qb.InterfaceC18660a
            /* JADX INFO: renamed from: a */
            public final void mo3472a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((InterfaceC18666g) obj2).mo8335d((String) obj);
                        break;
                    default:
                        ((InterfaceC18666g) obj2).mo8336e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f61980s0 = new InterfaceC18665f() { // from class: sb.b
            @Override // p961qb.InterfaceC18660a
            /* JADX INFO: renamed from: a */
            public final void mo3472a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((InterfaceC18666g) obj2).mo8335d((String) obj);
                        break;
                    default:
                        ((InterfaceC18666g) obj2).mo8336e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C19517d() {
        HashMap map = new HashMap();
        this.f61982Y = map;
        HashMap map2 = new HashMap();
        this.f61983Z = map2;
        this.f61984o0 = f61978q0;
        this.f61985p0 = false;
        map2.put(String.class, f61979r0);
        map.remove(String.class);
        map2.put(Boolean.class, f61980s0);
        map.remove(Boolean.class);
        map2.put(Date.class, f61981t0);
        map.remove(Date.class);
    }

    @Override // p987rb.InterfaceC18910a
    /* JADX INFO: renamed from: l */
    public final InterfaceC18910a mo5857l(Class cls, InterfaceC18663d interfaceC18663d) {
        this.f61982Y.put(cls, interfaceC18663d);
        this.f61983Z.remove(cls);
        return this;
    }
}
