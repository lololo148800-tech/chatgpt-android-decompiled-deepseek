package p672c3;

import android.content.Context;
import java.io.File;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p351O2.C6084G;
import p351O2.C6090d;
import p544W9.AbstractC8584X3;
import p571X9.AbstractC9393x3;
import p717e3.C13279l;
import p845k3.InterfaceC16330g;
import p909nm.C17689w;
import p959q8.C18639a;

/* JADX INFO: renamed from: c3.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11618m0 implements InterfaceC16330g {

    /* JADX INFO: renamed from: a */
    public static final C11618m0 f35180a = new C11618m0();

    @Override // p845k3.InterfaceC16330g
    /* JADX INFO: renamed from: a */
    public final File mo12996a(Context context, String str) {
        return AbstractC8584X3.m9250b(context, str);
    }

    @Override // p845k3.InterfaceC16330g
    /* JADX INFO: renamed from: b */
    public final Object mo12997b(Context context, String str) {
        C13279l c13279l = C13279l.f41976a;
        C11616l0 c11616l0 = new C11616l0(0, context, str);
        C17689w c17689w = C17689w.f56480Y;
        C3516e c3516e = AbstractC0593T.f1824a;
        C2925c c2925cM1174c = AbstractC0575H.m1174c(ExecutorC3515d.f10633Z.plus(AbstractC0575H.m1176e()));
        return new C6084G(c11616l0, c13279l, AbstractC9393x3.m9974d(new C6090d(c17689w, null)), new C18639a(13), c2925cM1174c);
    }
}
