package p228J;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: J.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3843j0 {

    /* JADX INFO: renamed from: b */
    public static final C3841i0 f11625b = new C3841i0(true, null, null);

    /* JADX INFO: renamed from: c */
    public static final C3843j0 f11626c = new C3843j0();

    /* JADX INFO: renamed from: a */
    public final C3827b0 f11627a;

    public C3843j0() {
        C3841i0 c3841i0 = f11625b;
        C3827b0 c3827b0 = new C3827b0();
        c3827b0.f11589o0 = new Object();
        c3827b0.f11588Z = 0;
        c3827b0.f11587Y = false;
        c3827b0.f11591q0 = new HashMap();
        c3827b0.f11592r0 = new CopyOnWriteArraySet();
        c3827b0.f11590p0 = new AtomicReference(c3841i0);
        this.f11627a = c3827b0;
    }
}
