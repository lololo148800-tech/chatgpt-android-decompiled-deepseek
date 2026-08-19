package p330N4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.AbstractC12107L1;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p005A3.C0326m;
import p030B2.AbstractC0738T;
import p544W9.AbstractC8596Z3;
import p692d0.AbstractC12958K;
import p692d0.C12954G;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.C14329G;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.C14353i;
import p774h1.InterfaceC14362r;
import p821j1.InterfaceC16039d;
import p843k1.C16308b;
import p843k1.InterfaceC16310d;
import p985r9.C18903m;

/* JADX INFO: renamed from: N4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5667r implements InterfaceC5669t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18389a;

    public /* synthetic */ C5667r(int i10) {
        this.f18389a = i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public static final void m6091c(InterfaceC16039d interfaceC16039d, C16308b c16308b) {
        boolean z6;
        float f10;
        InterfaceC14362r interfaceC14362rM15196m = interfaceC16039d.mo17601f0().m15196m();
        C16308b c16308b2 = (C16308b) interfaceC16039d.mo17601f0().f43260o0;
        if (c16308b.f50536r) {
            return;
        }
        c16308b.m17831a();
        InterfaceC16310d interfaceC16310d = c16308b.f50519a;
        if (!interfaceC16310d.mo17856h()) {
            try {
                c16308b.m17835e();
            } catch (Throwable unused) {
            }
        }
        boolean z10 = interfaceC16310d.mo17846I() > 0.0f;
        if (z10) {
            interfaceC14362rM15196m.mo15721t();
        }
        Canvas canvasM15725a = AbstractC14348d.m15725a(interfaceC14362rM15196m);
        boolean zIsHardwareAccelerated = canvasM15725a.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasM15725a.save();
            long j10 = c16308b.f50537s;
            float f11 = (int) (j10 >> 32);
            float f12 = (int) (j10 & 4294967295L);
            long j11 = c16308b.f50538t;
            float f13 = f11 + ((int) (j11 >> 32));
            float f14 = f12 + ((int) (j11 & 4294967295L));
            float fMo17849a = interfaceC16310d.mo17849a();
            int iMo17848K = interfaceC16310d.mo17848K();
            if (fMo17849a < 1.0f || !AbstractC14334L.m15639q(iMo17848K, 3) || AbstractC8596Z3.m9257a(interfaceC16310d.mo17865q(), 1)) {
                C18903m c18903mM15630h = c16308b.f50533o;
                if (c18903mM15630h == null) {
                    c18903mM15630h = AbstractC14334L.m15630h();
                    c16308b.f50533o = c18903mM15630h;
                }
                c18903mM15630h.m20220d(fMo17849a);
                c18903mM15630h.m20221e(iMo17848K);
                c18903mM15630h.m20223g(null);
                canvasM15725a.saveLayer(f11, f12, f13, f14, (Paint) c18903mM15630h.f60268b);
                f10 = f12;
            } else {
                canvasM15725a.save();
                f10 = f12;
            }
            canvasM15725a.translate(f11, f10);
            canvasM15725a.concat(interfaceC16310d.mo17844G());
        }
        boolean z11 = !zIsHardwareAccelerated && c16308b.f50540v;
        if (z11) {
            interfaceC14362rM15196m.mo15706e();
            AbstractC14332J abstractC14332JM17833c = c16308b.m17833c();
            if (abstractC14332JM17833c instanceof C14330H) {
                interfaceC14362rM15196m.mo15709h(abstractC14332JM17833c.mo15611a(), 1);
            } else if (abstractC14332JM17833c instanceof C14331I) {
                C14353i c14353iM15631i = c16308b.f50531m;
                if (c14353iM15631i != null) {
                    c14353iM15631i.f45039a.rewind();
                } else {
                    c14353iM15631i = AbstractC14334L.m15631i();
                    c16308b.f50531m = c14353iM15631i;
                }
                AbstractC12107L1.m13812c(c14353iM15631i, ((C14331I) abstractC14332JM17833c).f44971a);
                interfaceC14362rM15196m.mo15722u(c14353iM15631i, 1);
            } else if (abstractC14332JM17833c instanceof C14329G) {
                interfaceC14362rM15196m.mo15722u(((C14329G) abstractC14332JM17833c).f44969a, 1);
            }
        }
        if (c16308b2 != null) {
            C0326m c0326m = c16308b2.f50535q;
            if (!c0326m.f1139a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            C12954G c12954g = (C12954G) c0326m.f1142d;
            if (c12954g != null) {
                c12954g.m14624a(c16308b);
            } else if (((C16308b) c0326m.f1140b) != null) {
                int i10 = AbstractC12958K.f41151a;
                C12954G c12954g2 = new C12954G();
                C16308b c16308b3 = (C16308b) c0326m.f1140b;
                AbstractC16544l.m18091d(c16308b3);
                c12954g2.m14624a(c16308b3);
                c12954g2.m14624a(c16308b);
                c0326m.f1142d = c12954g2;
                c0326m.f1140b = null;
            } else {
                c0326m.f1140b = c16308b;
            }
            C12954G c12954g3 = (C12954G) c0326m.f1143e;
            if (c12954g3 != null) {
                z6 = !c12954g3.m14633j(c16308b);
            } else if (((C16308b) c0326m.f1141c) != c16308b) {
                z6 = true;
            } else {
                c0326m.f1141c = null;
                z6 = false;
            }
            if (z6) {
                c16308b.f50534p++;
            }
        }
        interfaceC16310d.mo17866r(interfaceC14362rM15196m);
        if (z11) {
            interfaceC14362rM15196m.mo15719r();
        }
        if (z10) {
            interfaceC14362rM15196m.mo15707f();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasM15725a.restore();
    }

    @Override // p330N4.InterfaceC5669t
    /* JADX INFO: renamed from: a */
    public float mo6092a(ViewGroup viewGroup, View view) {
        return view.getTranslationY();
    }

    @Override // p330N4.InterfaceC5669t
    /* JADX INFO: renamed from: b */
    public final float mo6093b(ViewGroup viewGroup, View view) {
        switch (this.f18389a) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }
}
