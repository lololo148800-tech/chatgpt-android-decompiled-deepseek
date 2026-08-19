package p1117y1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import java.util.HashSet;
import p1071w0.C20714I0;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21684c;
import p392Q0.C6546d;
import p523V9.AbstractC8111i5;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: y1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21364d {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f67836a;

    /* JADX INFO: renamed from: b */
    public final C6546d f67837b = new C6546d(new C21684c[16]);

    /* JADX INFO: renamed from: c */
    public final C6546d f67838c = new C6546d(new C21368h[16]);

    /* JADX INFO: renamed from: d */
    public final C6546d f67839d = new C6546d(new C21658D[16]);

    /* JADX INFO: renamed from: e */
    public final C6546d f67840e = new C6546d(new C21368h[16]);

    /* JADX INFO: renamed from: f */
    public boolean f67841f;

    public C21364d(AndroidComposeView androidComposeView) {
        this.f67836a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: b */
    public static void m21755b(AbstractC10458p abstractC10458p, C21368h c21368h, HashSet hashSet) {
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30960Y;
        if (!abstractC10458p2.f30972y0) {
            AbstractC8111i5.m8592c("visitSubtreeIf called on an unattached node");
            throw null;
        }
        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
        AbstractC10458p abstractC10458p3 = abstractC10458p2.f30965r0;
        if (abstractC10458p3 == null) {
            AbstractC21690f.m22197b(c6546d, abstractC10458p2);
        } else {
            c6546d.m7099c(abstractC10458p3);
        }
        while (c6546d.m7109n()) {
            AbstractC10458p abstractC10458p4 = (AbstractC10458p) c6546d.m7111p(c6546d.f21184o0 - 1);
            if ((abstractC10458p4.f30963p0 & 32) != 0) {
                AbstractC10458p abstractC10458p5 = abstractC10458p4;
                while (true) {
                    if (abstractC10458p5 != null) {
                        if ((abstractC10458p5.f30962o0 & 32) != 0) {
                            ?? c6546d2 = 0;
                            ?? M22201f = abstractC10458p5;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC21365e) {
                                    InterfaceC21365e interfaceC21365e = (InterfaceC21365e) M22201f;
                                    if (interfaceC21365e instanceof C21684c) {
                                        C21684c c21684c = (C21684c) interfaceC21365e;
                                        if ((c21684c.f68828z0 instanceof InterfaceC21363c) && c21684c.f68827B0.contains(c21368h)) {
                                            hashSet.add(interfaceC21365e);
                                        }
                                    }
                                    if (interfaceC21365e.mo15081S().mo8311b(c21368h)) {
                                        break;
                                    }
                                } else if ((M22201f.f30962o0 & 32) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p6 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i10 = 0;
                                    while (abstractC10458p6 != null) {
                                        if ((abstractC10458p6.f30962o0 & 32) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                M22201f = M22201f;
                                                c6546d2 = c6546d2;
                                                c6546d2 = c6546d2;
                                                M22201f = abstractC10458p6;
                                            } else {
                                                if (c6546d2 == 0) {
                                                    c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d2.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d2.m7099c(abstractC10458p6);
                                            }
                                        } else {
                                            M22201f = M22201f;
                                            c6546d2 = c6546d2;
                                        }
                                        abstractC10458p6 = abstractC10458p6.f30965r0;
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                    if (i10 == 1) {
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    } else {
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                }
                                M22201f = AbstractC21690f.m22201f(c6546d2);
                            }
                        }
                        abstractC10458p5 = abstractC10458p5.f30965r0;
                    }
                }
            }
            AbstractC21690f.m22197b(c6546d, abstractC10458p4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21756a() {
        if (this.f67841f) {
            return;
        }
        this.f67841f = true;
        C20714I0 c20714i0 = new C20714I0(this, 4);
        C6546d c6546d = this.f67836a.f32753B1;
        if (c6546d.m7105j(c20714i0)) {
            return;
        }
        c6546d.m7099c(c20714i0);
    }
}
