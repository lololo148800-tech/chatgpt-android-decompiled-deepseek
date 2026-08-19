package p544W9;

import android.content.Context;
import fo.C13711h;
import io.sentry.C15358g1;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import p1007s7.C19465d;
import p310M9.C5311e;
import p522V8.C7834a;
import p522V8.C7836c;
import p522V8.EnumC7837d;
import p523V9.C8248z6;
import p543W8.C8440a;
import p593Y8.C9689p;
import p593Y8.C9690q;
import p593Y8.C9691r;
import p658b5.C11242m;
import p890mb.C17216m;

/* JADX INFO: renamed from: W9.N4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8526N4 implements InterfaceC8508K4 {

    /* JADX INFO: renamed from: a */
    public final C17216m f26352a;

    /* JADX INFO: renamed from: b */
    public final C8502J4 f26353b;

    public C8526N4(Context context, C8502J4 c8502j4) {
        this.f26353b = c8502j4;
        C8440a c8440a = C8440a.f26277e;
        C9691r.m10283b(context);
        C9689p c9689pM10284c = C9691r.m10282a().m10284c(c8440a);
        if (C8440a.f26276d.contains(new C7836c("json"))) {
            new C17216m(new C8248z6(c9689pM10284c, 2));
        }
        this.f26352a = new C17216m(new C8248z6(c9689pM10284c, 3));
    }

    @Override // p544W9.InterfaceC8508K4
    /* JADX INFO: renamed from: a */
    public final void mo9170a(C15358g1 c15358g1) {
        C8502J4 c8502j4 = this.f26353b;
        c8502j4.getClass();
        C9690q c9690q = (C9690q) this.f26352a.get();
        c8502j4.getClass();
        ((C19465d) c15358g1.f47946Z).f61776u0 = false;
        C19465d c19465d = (C19465d) c15358g1.f47946Z;
        c19465d.f61774s0 = Boolean.FALSE;
        C8675m4 c8675m4 = new C8675m4(c19465d);
        C13711h c13711h = (C13711h) c15358g1.f47945Y;
        c13711h.f43259Z = c8675m4;
        try {
            C8544Q4.m9205b();
            C8544Q4 c8544q4 = C8544Q4.f26369o0;
            C8674m3 c8674m3 = new C8674m3(c13711h);
            C5311e c5311e = new C5311e(14);
            c8544q4.m9206a(c5311e);
            c9690q.m10281a(new C7834a(new C11242m(new HashMap((HashMap) c5311e.f17484Z), new HashMap((HashMap) c5311e.f17485o0), (C8622e) c5311e.f17486p0).m12611M(c8674m3), EnumC7837d.f24732Z, null));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
