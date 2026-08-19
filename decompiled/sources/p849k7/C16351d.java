package p849k7;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17314q;
import p049Bm.InterfaceC1426a;
import p1058v7.C20476h;
import p1113xn.C21307a;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8206u4;
import p544W9.AbstractC8712t;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p743f7.C13579e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p984r8.C18887a;

/* JADX INFO: renamed from: k7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16351d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50745Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16352e f50746Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16351d(C16352e c16352e, int i10) {
        super(0);
        this.f50745Y = i10;
        this.f50746Z = c16352e;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[PHI: r14
      0x0063: PHI (r14v5 Ib.s) = (r14v0 Ib.s), (r14v0 Ib.s), (r14v3 Ib.s) binds: [B:17:0x0061, B:20:0x0073, B:23:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        File file;
        int i10 = 2;
        C16352e c16352e = this.f50746Z;
        switch (this.f50745Y) {
            case 0:
                File file2 = (File) c16352e.f50757H.getValue();
                InterfaceC11256c interfaceC11256c = c16352e.f50762a;
                boolean zM8824f = AbstractC8206u4.m8824f(file2, interfaceC11256c);
                C3676s c3676sM4390m = null;
                C17314q c17314q = c16352e.f50757H;
                if (zM8824f) {
                    file = (File) c17314q.getValue();
                } else {
                    File file3 = new File(new File(c16352e.m17951c(), "ndk_crash_reports_v2"), "last_view_event");
                    file = AbstractC8206u4.m8824f(file3, interfaceC11256c) ? file3 : null;
                }
                if (file != null) {
                    List listM21125e = new C20476h(interfaceC11256c).m21125e(file);
                    if (!listM21125e.isEmpty()) {
                        String str = new String(((C13579e) AbstractC17680n.m19351a0(listM21125e)).f42929a, C21307a.f67720a);
                        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
                        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
                        try {
                            c3676sM4390m = AbstractC8712t.m9423e(str).m4390m();
                        } catch (C3677t e10) {
                            AbstractC7889G0.m8185c(interfaceC11256c, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18887a(str, i10), e10, 48);
                        } catch (IllegalStateException e11) {
                            AbstractC7889G0.m8185c(interfaceC11256c, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18887a(str, 3), e11, 48);
                        }
                    }
                }
                if (c3676sM4390m != null) {
                    if (AbstractC8206u4.m8824f((File) c17314q.getValue(), interfaceC11256c)) {
                        AbstractC8206u4.m8823e((File) c17314q.getValue(), interfaceC11256c);
                    } else {
                        File file4 = new File(new File(c16352e.m17951c(), "ndk_crash_reports_v2"), "last_view_event");
                        if (AbstractC8206u4.m8824f(file4, interfaceC11256c)) {
                            AbstractC8206u4.m8823e(file4, interfaceC11256c);
                        }
                    }
                }
                return c3676sM4390m;
            case 1:
                return new File(c16352e.m17951c(), "last_view_event");
            case 2:
                InterfaceC11256c internalLogger = c16352e.f50762a;
                AbstractC16544l.m18094g(internalLogger, "internalLogger");
                return new C20476h(internalLogger);
            default:
                return (C3676s) c16352e.f50756G.getValue();
        }
    }
}
