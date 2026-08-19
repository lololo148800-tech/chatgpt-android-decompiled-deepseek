package p115E9;

import android.content.Context;
import p1016t3.AbstractC19754D;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1139z0.C21585H;
import p182H3.C3208i;
import p182H3.InterfaceC3209j;
import p182H3.InterfaceC3210k;
import p499U9.C7591u;
import p572Xa.InterfaceC9419m;
import p593Y8.AbstractC9686m;
import p593Y8.C9683j;
import p593Y8.C9687n;
import p593Y8.C9692s;
import p616Z8.C10257e;
import p616Z8.C10259g;
import p643a9.C10526a;
import p701d9.C13047b;
import p723e9.C13351i;
import p723e9.C13353k;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: E9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2360b implements InterfaceC3209j, InterfaceC9419m {

    /* JADX INFO: renamed from: Y */
    public Context f7317Y;

    public /* synthetic */ C2360b(Context context) {
        this.f7317Y = context;
    }

    /* JADX INFO: renamed from: a */
    public C9683j m3446a() {
        Context context = this.f7317Y;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C9683j c9683j = new C9683j();
        c9683j.f29192Z = C10526a.m10976a(AbstractC9686m.f29200a);
        C10257e c10257e = new C10257e(context, 3);
        c9683j.f29196r0 = c10257e;
        c9683j.f29193o0 = C10526a.m10976a(new C10259g(c10257e, new C10257e(c10257e, 0), 0));
        C10257e c10257e2 = (C10257e) c9683j.f29196r0;
        c9683j.f29197s0 = new C10257e(c10257e2, 2);
        InterfaceC17068a interfaceC17068aM10976a = C10526a.m10976a(new C10259g((C10257e) c9683j.f29197s0, C10526a.m10976a(new C10257e(c10257e2, 1)), 1));
        c9683j.f29194p0 = interfaceC17068aM10976a;
        C9687n c9687n = new C9687n(1);
        C10257e c10257e3 = (C10257e) c9683j.f29196r0;
        C9692s c9692s = new C9692s(c10257e3, interfaceC17068aM10976a, c9687n, 1);
        InterfaceC17068a interfaceC17068a = (InterfaceC17068a) c9683j.f29192Z;
        InterfaceC17068a interfaceC17068a2 = (InterfaceC17068a) c9683j.f29193o0;
        c9683j.f29195q0 = C10526a.m10976a(new C9692s(new C13047b(interfaceC17068a, interfaceC17068a2, c9692s, interfaceC17068aM10976a, interfaceC17068aM10976a), new C13351i(c10257e3, interfaceC17068a2, interfaceC17068aM10976a, c9692s, interfaceC17068a, interfaceC17068aM10976a, interfaceC17068aM10976a), new C13353k(interfaceC17068a, interfaceC17068aM10976a, c9692s, interfaceC17068aM10976a), 0));
        return c9683j;
    }

    @Override // p572Xa.InterfaceC9420n
    /* JADX INFO: renamed from: d */
    public Object mo3447d() {
        return this.f7317Y;
    }

    @Override // p182H3.InterfaceC3209j
    /* JADX INFO: renamed from: z */
    public InterfaceC3210k mo3448z(C3208i c3208i) {
        Context context;
        int i10 = AbstractC20817s.f66106a;
        if (i10 < 23 || (i10 < 31 && ((context = this.f7317Y) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new C7591u(6).mo3448z(c3208i);
        }
        int iM20707e = AbstractC19754D.m20707e(c3208i.f9699c.f62752m);
        AbstractC20800b.m21327o("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC20817s.m21423x(iM20707e));
        return new C21585H(iM20707e).mo3448z(c3208i);
    }
}
