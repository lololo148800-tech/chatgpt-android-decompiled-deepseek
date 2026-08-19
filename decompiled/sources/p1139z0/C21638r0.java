package p1139z0;

import android.widget.ImageView;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.chatgpt.R;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p099Dj.C2069g;
import p1033u5.C20116a;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2211v0;
import p1071w0.C20748f0;
import p1075w5.C20830h;
import p1095x1.AbstractC21068W;
import p1116y0.C21353b;
import p1140z1.AbstractC21661G;
import p1140z1.AbstractC21668N;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21664J;
import p1140z1.C21665K;
import p1140z1.C21667M;
import p1140z1.C21695h0;
import p1140z1.C21703l0;
import p1140z1.InterfaceC21701k0;
import p1143z4.C21778h;
import p1143z4.C21780j;
import p1156zj.C22199u1;
import p156G1.C2963j;
import p204I1.C3581L;
import p349O0.C5960K;
import p350O1.C6067p;
import p392Q0.C6546d;
import p492U1.C7543h;
import p635a1.AbstractC10458p;
import p737f1.AbstractC13512d;
import p843k1.C16308b;
import p864l5.C16826m;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: z0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21638r0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68543Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f68544Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f68545o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21638r0(Object obj, int i10, Object obj2) {
        super(0);
        this.f68543Y = i10;
        this.f68544Z = obj;
        this.f68545o0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r4v16 */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InterfaceC2211v0 interfaceC2211v0M21989R0;
        AbstractC21068W placementScope;
        switch (this.f68543Y) {
            case 0:
                C21640s0 c21640s0 = (C21640s0) this.f68544Z;
                if (!c21640s0.m21990S0()) {
                    AbstractC13512d.m15028A(c21640s0);
                }
                C20748f0 c20748f0 = (C20748f0) this.f68545o0;
                if (!C6067p.m6643a(c20748f0.f65797c, 7) && !C6067p.m6643a(c20748f0.f65797c, 8) && (interfaceC2211v0M21989R0 = c21640s0.m21989R0()) != null) {
                    ((C2127D0) interfaceC2211v0M21989R0).mo3231f(C17296C.f55119a);
                }
                return Boolean.TRUE;
            case 1:
                C21582E0 c21582e0 = (C21582E0) this.f68544Z;
                c21582e0.getClass();
                C21353b c21353bM21750b = c21582e0.f68337a.m21750b();
                C21595S c21595s = (C21595S) c21582e0.f68340d.getValue();
                C5960K c5960k = new C5960K();
                c5960k.f19403a = new int[30];
                StringBuilder sb2 = new StringBuilder();
                int i10 = 0;
                boolean z6 = false;
                while (i10 < c21353bM21750b.f67817Y.length()) {
                    int iCodePointAt = Character.codePointAt(c21353bM21750b, i10);
                    ((C21596T) this.f68545o0).getClass();
                    int i11 = iCodePointAt == 10 ? 32 : iCodePointAt == 13 ? 65279 : iCodePointAt;
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (i11 != iCodePointAt) {
                        c5960k.m6401h(sb2.length(), sb2.length() + iCharCount, Character.charCount(i11));
                        z6 = true;
                    }
                    sb2.appendCodePoint(i11);
                    i10 += iCharCount;
                }
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                CharSequence charSequence = z6 ? string : c21353bM21750b;
                if (charSequence == c21353bM21750b) {
                    return null;
                }
                long jM21943b = C21596T.m21943b(c21353bM21750b.f67818Z, c5960k, c21595s);
                C3581L c3581l = c21353bM21750b.f67819o0;
                return new C21578C0(new C21353b(charSequence, jM21943b, c3581l != null ? new C3581L(C21596T.m21943b(c3581l.f10908a, c5960k, c21595s)) : null, 8), c5960k);
            case 2:
                C1313k c1313k = ((C21658D) this.f68544Z).f68638I0;
                if ((((AbstractC10458p) c1313k.f3471f).f30963p0 & 8) != 0) {
                    for (AbstractC10458p abstractC10458p = (C21703l0) c1313k.f3470e; abstractC10458p != null; abstractC10458p = abstractC10458p.f30964q0) {
                        if ((abstractC10458p.f30962o0 & 8) != 0) {
                            ?? M22201f = abstractC10458p;
                            ?? c6546d = 0;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC21701k0) {
                                    InterfaceC21701k0 interfaceC21701k0 = (InterfaceC21701k0) M22201f;
                                    boolean zMo425E = interfaceC21701k0.mo425E();
                                    C16525B c16525b = (C16525B) this.f68545o0;
                                    if (zMo425E) {
                                        C2963j c2963j = new C2963j();
                                        c16525b.f51262Y = c2963j;
                                        c2963j.f8882o0 = true;
                                    }
                                    if (interfaceC21701k0.mo432u0()) {
                                        ((C2963j) c16525b.f51262Y).f8881Z = true;
                                    }
                                    interfaceC21701k0.mo424B((C2963j) c16525b.f51262Y);
                                } else if ((M22201f.f30962o0 & 8) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p2 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i12 = 0;
                                    while (abstractC10458p2 != null) {
                                        if ((abstractC10458p2.f30962o0 & 8) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                M22201f = M22201f;
                                                c6546d = c6546d;
                                                c6546d = c6546d;
                                                M22201f = abstractC10458p2;
                                            } else {
                                                if (c6546d == 0) {
                                                    c6546d = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d.m7099c(abstractC10458p2);
                                            }
                                        } else {
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                        }
                                        abstractC10458p2 = abstractC10458p2.f30965r0;
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    }
                                    if (i12 == 1) {
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    } else {
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    }
                                }
                                M22201f = AbstractC21690f.m22201f(c6546d);
                            }
                        }
                    }
                }
                return C17296C.f55119a;
            case 3:
                C21665K c21665k = (C21665K) this.f68544Z;
                AbstractC21678Y abstractC21678Y = c21665k.m22107a().f68821z0;
                if (abstractC21678Y == null || (placementScope = abstractC21678Y.f68759u0) == null) {
                    placementScope = AbstractC21661G.m22082a(c21665k.f68729a).getPlacementScope();
                }
                C21664J c21664j = (C21664J) this.f68545o0;
                InterfaceC1436k interfaceC1436k = c21664j.f68713N0;
                C16308b c16308b = c21664j.f68714O0;
                if (c16308b != null) {
                    AbstractC21678Y abstractC21678YM22107a = c21665k.m22107a();
                    long j10 = c21664j.f68715P0;
                    float f10 = c21664j.f68716Q0;
                    placementScope.getClass();
                    AbstractC21068W.m21535a(placementScope, abstractC21678YM22107a);
                    abstractC21678YM22107a.mo21552Q(C7543h.m7882d(j10, abstractC21678YM22107a.f66985q0), f10, c16308b);
                } else if (interfaceC1436k == null) {
                    AbstractC21678Y abstractC21678YM22107a2 = c21665k.m22107a();
                    long j11 = c21664j.f68715P0;
                    float f11 = c21664j.f68716Q0;
                    placementScope.getClass();
                    AbstractC21068W.m21535a(placementScope, abstractC21678YM22107a2);
                    abstractC21678YM22107a2.mo21551N(C7543h.m7882d(j11, abstractC21678YM22107a2.f66985q0), f11, null);
                } else {
                    AbstractC21678Y abstractC21678YM22107a3 = c21665k.m22107a();
                    long j12 = c21664j.f68715P0;
                    float f12 = c21664j.f68716Q0;
                    placementScope.getClass();
                    AbstractC21068W.m21535a(placementScope, abstractC21678YM22107a3);
                    abstractC21678YM22107a3.mo21551N(C7543h.m7882d(j12, abstractC21678YM22107a3.f66985q0), f12, interfaceC1436k);
                }
                return C17296C.f55119a;
            case 4:
                InterfaceC1436k interfaceC1436kMo19807c = ((C21695h0) this.f68544Z).f68862Y.mo19807c();
                if (interfaceC1436kMo19807c != null) {
                    AbstractC21668N abstractC21668N = (AbstractC21668N) this.f68545o0;
                    abstractC21668N.getClass();
                    interfaceC1436kMo19807c.invoke(new C21667M(abstractC21668N));
                }
                return C17296C.f55119a;
            case 5:
                ((C21780j) this.f68544Z).m22270d((C21778h) this.f68545o0);
                return C17296C.f55119a;
            case 6:
                ((SwitchAccountViewModel) this.f68544Z).mo14218n((AbstractActivityC17375g) this.f68545o0);
                return C17296C.f55119a;
            default:
                C2069g c2069g = (C2069g) this.f68544Z;
                ImageView imageView = c2069g.f6372u;
                C22199u1 c22199u1 = (C22199u1) this.f68545o0;
                imageView.setTag(R.id.pi2_last_image_path, c22199u1.f70365f);
                ImageView imageView2 = c2069g.f6372u;
                String str = c22199u1.f70365f;
                File file = new File(str);
                C20830h c20830h = new C20830h(imageView2.getContext());
                c20830h.f66187c = file;
                c20830h.m21438d(imageView2);
                int measuredWidth = imageView2.getMeasuredWidth();
                if (measuredWidth > 2000) {
                    measuredWidth = 2000;
                }
                c20830h.m21437c(measuredWidth, measuredWidth);
                c20830h.f66189e = str != null ? new C20116a(str) : null;
                ((C16826m) c22199u1.f70361b).m18564b(c20830h.m21435a());
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21638r0(C21780j c21780j, C21778h c21778h, boolean z6) {
        super(0);
        this.f68543Y = 5;
        this.f68544Z = c21780j;
        this.f68545o0 = c21778h;
    }
}
