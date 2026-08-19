package p143Fd;

import java.util.ArrayList;
import kotlin.jvm.internal.C16525B;
import p040Bd.EnumC0940I4;
import p092Dc.C1991h;
import p1113xn.AbstractC21322p;
import p403Qd.AbstractC6653q0;
import p403Qd.C6609O;
import p403Qd.C6627d0;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7351f0;
import p575Xd.C9440I;
import p658b5.C11241l;
import p690cp.C12911B;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Fd.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2718h extends C11241l {
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: E */
    public final AbstractC6653q0 mo3703E(C1991h c1991h) {
        String str;
        C7351f0 c7351f0 = (C7351f0) AbstractC17680n.m19341Q((ArrayList) this.f34016Y);
        AbstractC7343b0 abstractC7343b0 = c7351f0.f23291f;
        if (!(abstractC7343b0 instanceof C7320F)) {
            abstractC7343b0 = null;
        }
        C7320F c7320f = (C7320F) abstractC7343b0;
        if (c7320f == null || c7320f.mo7777a()) {
            c7320f = null;
        }
        EnumC0940I4 enumC0940I4 = c7351f0.f23299n;
        int i10 = enumC0940I4 == null ? -1 : AbstractC2716f.f8359a[enumC0940I4.ordinal()];
        C9440I c9440i = c7351f0.f23300o;
        if (i10 == -1) {
            C16525B c16525b = new C16525B();
            if (c7320f != null) {
                c7320f.m7778d().mo14588a(new C2717g(c16525b, 0));
            }
            C12911B c12911b = (C12911B) c16525b.f51262Y;
            if (c12911b != null) {
                C16525B c16525b2 = new C16525B();
                c16525b2.f51262Y = "";
                new C2717g(c16525b2, 1).mo3707D(c12911b);
                str = (String) c16525b2.f51262Y;
                if (str != null) {
                    if (AbstractC21322p.m21681O(str)) {
                        str = null;
                    }
                    if (str == null) {
                        if (c9440i != null) {
                            str = c9440i.f28437h;
                        } else {
                            str = null;
                        }
                    }
                } else if (c9440i != null) {
                    str = c9440i.f28437h;
                } else {
                    str = null;
                }
            } else if (c9440i != null) {
                str = c9440i.f28437h;
            } else {
                str = null;
            }
        } else if (c9440i == null || (str = c9440i.f28438i) == null) {
            if (c9440i != null) {
                str = c9440i.f28437h;
            } else {
                str = null;
            }
        }
        String str2 = c9440i != null ? c9440i.f28439j : null;
        return (str2 == null || enumC0940I4 == EnumC0940I4.f2702p0) ? new C6627d0(str, c7320f, true) : new C6609O(str2, str, c7320f, c7351f0.f23297l);
    }
}
