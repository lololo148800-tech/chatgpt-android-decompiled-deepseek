package af;

import androidx.compose.p650ui.draw.ShadowGraphicsLayerElement;
import com.openai.feature.subscriptions.access.SubscriptionAccessCheckViewModel;
import eg.C13402y;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1699d;
import p072Ci.EnumC1711p;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p1135yn.C21555b;
import p1140z1.C21660F;
import p1140z1.EnumC21705m0;
import p1155zi.C22013h2;
import p1155zi.C22062u;
import p193Hf.C3350b0;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p349O0.C5994b0;
import p349O0.InterfaceC5982V0;
import p364Oh.C6223B;
import p492U1.C7545j;
import p620Zc.InterfaceC10277b;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p645ah.C10608b;
import p647ak.AbstractC10641F;
import p647ak.AbstractC10708i1;
import p647ak.AbstractC10712k0;
import p647ak.AbstractC10740y0;
import p647ak.C10637D;
import p647ak.C10652K0;
import p647ak.C10670U;
import p647ak.C10674W;
import p647ak.C10676X;
import p647ak.C10678Y;
import p647ak.C10689c0;
import p647ak.C10692d0;
import p647ak.C10695e0;
import p647ak.C10698f0;
import p647ak.C10710j0;
import p654b1.C11214h;
import p692d0.C12949B;
import p693d1.C12989b;
import p693d1.C12992e;
import p693d1.InterfaceC12993f;
import p709di.C13175c;
import p722e8.C13305O;
import p728ei.C13406b;
import p729ej.AbstractC13431v;
import p729ej.C13414e;
import p729ej.C13430u;
import p729ej.InterfaceC13410a;
import p736f0.C13493k;
import p737f1.EnumC13525q;
import p758g0.C13782q;
import p774h1.AbstractC14334L;
import p774h1.C14336N;
import p774h1.C14365u;
import p797i1.AbstractC14901c;
import p797i1.C14902d;
import p909nm.C17690x;
import p926of.yRae.sVDIzpC;
import p949pj.AbstractC18485q;

/* JADX INFO: renamed from: af.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10564U extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31362Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f31363Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10564U(Object obj, int i10) {
        super(1);
        this.f31362Y = i10;
        this.f31363Z = obj;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31362Y) {
            case 0:
                EnumC13525q enumC13525q = (EnumC13525q) obj;
                AbstractC16544l.m18094g(enumC13525q, sVDIzpC.wrxMaJa);
                if (enumC13525q.m15074a()) {
                    ((InterfaceC20904w) this.f31363Z).mo21447a(C20893l.f66574l, C17690x.f56481Y);
                }
                return C17296C.f55119a;
            case 1:
                InterfaceC21098s it = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it, "it");
                ((C11214h) this.f31363Z).f33890b = AbstractC21075b0.m21565f(it);
                return C17296C.f55119a;
            case 2:
                ((Boolean) obj).booleanValue();
                ((SubscriptionAccessCheckViewModel) this.f31363Z).m14395k(C10608b.f31483a);
                return C17296C.f55119a;
            case 3:
                AbstractC18485q it2 = (AbstractC18485q) obj;
                AbstractC16544l.m18094g(it2, "it");
                ((C10652K0) this.f31363Z).f31620k.invoke(it2);
                return C17296C.f55119a;
            case 4:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Object obj2 = action.f42521b;
                C10674W c10674w = obj2 instanceof C10674W ? (C10674W) obj2 : null;
                if (c10674w != null) {
                    AbstractC10641F abstractC10641F = (AbstractC10641F) this.f31363Z;
                    if (abstractC10641F instanceof C10637D) {
                        action.f42521b = C10674W.m11016l(c10674w, 0, ((C10637D) abstractC10641F).f31561a, 125);
                    }
                }
                return C17296C.f55119a;
            case 5:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                Object obj3 = action2.f42521b;
                C10674W c10674w2 = obj3 instanceof C10674W ? (C10674W) obj3 : null;
                if (c10674w2 != null) {
                    int i10 = c10674w2.f31689Y;
                    if (i10 > 1) {
                        action2.f42521b = C10674W.m11016l(c10674w2, i10 - 1, c10674w2.f31690Z, 124);
                    } else {
                        action2.f42521b = new C10670U(null, c10674w2.f31691o0, c10674w2.f31690Z, c10674w2.f31692p0, false, ((C10674W) this.f31363Z).f31694r0, c10674w2.f31693q0, AbstractC10708i1.m11027a(action2, false), 17);
                    }
                }
                return C17296C.f55119a;
            case 6:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                C10689c0 c10689c0 = (C10689c0) this.f31363Z;
                action3.f42521b = new C10670U(c10689c0.f31744Y, c10689c0.f31745Z, null, System.currentTimeMillis(), c10689c0.f31746o0, c10689c0.f31748q0, c10689c0.f31747p0, AbstractC10708i1.m11027a(action3, false), 4);
                return C17296C.f55119a;
            case 7:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                Object obj4 = action4.f42521b;
                AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.selfie.SelfieState.StartCapture");
                C10692d0 c10692d0 = (C10692d0) obj4;
                action4.f42521b = new C10676X(3, null, c10692d0.f31763s0, c10692d0.f31759o0, System.currentTimeMillis(), c10692d0.f31761q0, ((C10692d0) this.f31363Z).f31762r0, AbstractC10708i1.m11027a(action4, false));
                return C17296C.f55119a;
            case 8:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                if (action5.f42521b instanceof C10695e0) {
                    C10695e0 c10695e0 = (C10695e0) this.f31363Z;
                    action5.f42521b = new C10674W(3, c10695e0.f31774Z, c10695e0.f31776p0, null, AbstractC10708i1.m11027a(action5, false), c10695e0.f31773Y, c10695e0.f31775o0);
                }
                return C17296C.f55119a;
            case 9:
                C13430u action6 = (C13430u) obj;
                AbstractC16544l.m18094g(action6, "$this$action");
                C10710j0 c10710j0 = (C10710j0) this.f31363Z;
                action6.f42521b = new C10698f0(c10710j0.f31828p0, AbstractC10708i1.m11027a(action6, false), c10710j0.f31826Z, c10710j0.f31825Y, c10710j0.f31827o0);
                return C17296C.f55119a;
            case 10:
                C13430u action7 = (C13430u) obj;
                AbstractC16544l.m18094g(action7, "$this$action");
                action7.m14964a((AbstractC10740y0) this.f31363Z);
                return C17296C.f55119a;
            case 11:
                C10330z it3 = (C10330z) obj;
                AbstractC16544l.m18094g(it3, "it");
                return C10330z.m10884a(it3, null, null, null, null, (C10327w) this.f31363Z, 15);
            case 12:
                C10330z it4 = (C10330z) obj;
                AbstractC16544l.m18094g(it4, "it");
                String value = ((C13402y) ((C6223B) this.f31363Z).f20258a).f42455a;
                AbstractC16544l.m18094g(value, "value");
                return C10330z.m10884a(it4, null, null, value, null, null, 27);
            case 13:
                ((C1757y) ((InterfaceC1758z) this.f31363Z)).mo2524p(null);
                return C17296C.f55119a;
            case 14:
                return obj == ((C12949B) this.f31363Z) ? "(this)" : String.valueOf(obj);
            case 15:
                C12992e c12992e = (C12992e) obj;
                if (!c12992e.f30960Y.f30972y0) {
                    return EnumC21705m0.f68878Z;
                }
                InterfaceC12993f interfaceC12993f = c12992e.f41244B0;
                if (interfaceC12993f != null) {
                    interfaceC12993f.mo14728w0((C12989b) this.f31363Z);
                }
                c12992e.f41244B0 = null;
                c12992e.f41243A0 = null;
                return EnumC21705m0.f68877Y;
            case 16:
                ((InterfaceC10277b) this.f31363Z).mo10871a();
                return C17296C.f55119a;
            case 17:
                return (C22062u) this.f31363Z;
            case 18:
                AbstractC16544l.m18094g((C1699d) obj, "it");
                return (C1699d) this.f31363Z;
            case 19:
                C1699d settings = (C1699d) obj;
                AbstractC16544l.m18094g(settings, "settings");
                return C1699d.m2511a(settings, null, null, null, null, null, null, null, null, (EnumC1711p) this.f31363Z, 1023);
            case 20:
                return (C22013h2) this.f31363Z;
            case 21:
                C13430u action8 = (C13430u) obj;
                AbstractC16544l.m18094g(action8, "$this$action");
                Object obj5 = action8.f42521b;
                C10678Y c10678y = obj5 instanceof C10678Y ? (C10678Y) obj5 : null;
                if (c10678y != null && c10678y.f31711p0) {
                    List listMo11015j = ((AbstractC10712k0) obj5).mo11015j();
                    C10678Y c10678y2 = (C10678Y) this.f31363Z;
                    action8.f42521b = new C10698f0(c10678y2.f31713r0, AbstractC10708i1.m11027a(action8, false), null, listMo11015j, c10678y2.f31712q0);
                }
                return C17296C.f55119a;
            case 22:
                C21660F c21660f = (C21660F) obj;
                ((C3350b0) this.f31363Z).invoke(c21660f);
                c21660f.m22080a();
                return C17296C.f55119a;
            case 23:
                C14336N c14336n = (C14336N) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f31363Z;
                c14336n.m15657j(c14336n.getDensity() * shadowGraphicsLayerElement.f32683Y);
                c14336n.m15658k(shadowGraphicsLayerElement.f32684Z);
                c14336n.m15651c(shadowGraphicsLayerElement.f32685o0);
                c14336n.m15650b(shadowGraphicsLayerElement.f32686p0);
                c14336n.m15659l(shadowGraphicsLayerElement.f32687q0);
                return C17296C.f55119a;
            case 24:
                Map it5 = (Map) obj;
                AbstractC16544l.m18094g(it5, "it");
                it5.putAll(((C13305O) this.f31363Z).m14928c().m13026b());
                return C17296C.f55119a;
            case 25:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C5551u.Companion.getClass();
                C5551u c5551u = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                C13406b c13406b = (C13406b) this.f31363Z;
                long jM5946b = c5551u.m5946b(c13406b.f42471e);
                c13406b.f42471e = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                return new C13175c(zBooleanValue, new C21555b(jM5946b));
            case 26:
                AbstractC13431v interceptedAction = (AbstractC13431v) obj;
                AbstractC16544l.m18094g(interceptedAction, "interceptedAction");
                ((InterfaceC13410a) ((C13414e) this.f31363Z).f42490Y).mo3400l().mo3393B(interceptedAction);
                return C17296C.f55119a;
            case 27:
                InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) ((C13493k) this.f31363Z).f42714e.m14619e(obj);
                return new C7545j(interfaceC5982V0 != null ? ((C7545j) interfaceC5982V0.getValue()).f23903a : 0L);
            case 28:
                C13782q c13782q = (C13782q) obj;
                float f10 = c13782q.f43523b;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = c13782q.f43524c;
                if (f11 < -0.5f) {
                    f11 = -0.5f;
                }
                if (f11 > 0.5f) {
                    f11 = 0.5f;
                }
                float f12 = c13782q.f43525d;
                float f13 = f12 >= -0.5f ? f12 : -0.5f;
                float f14 = f13 <= 0.5f ? f13 : 0.5f;
                float f15 = c13782q.f43522a;
                float f16 = f15 >= 0.0f ? f15 : 0.0f;
                return new C14365u(C14365u.m15773a(AbstractC14334L.m15624b(f10, f11, f14, f16 <= 1.0f ? f16 : 1.0f, C14902d.f46424t), (AbstractC14901c) this.f31363Z));
            default:
                InterfaceC21098s coordinates = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(coordinates, "coordinates");
                ((C5994b0) this.f31363Z).m6410h(((int) (coordinates.mo21524k() >> 32)) / ((int) (coordinates.mo21524k() & 4294967295L)));
                return C17296C.f55119a;
        }
    }
}
