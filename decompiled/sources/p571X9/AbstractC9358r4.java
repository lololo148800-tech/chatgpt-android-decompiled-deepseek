package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p486Tl.C7509h;
import p486Tl.C7510i;
import p486Tl.InterfaceC7508g;
import p594Y9.AbstractC9873d3;
import p919o8.C17894F;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: X9.r4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9358r4 {
    /* JADX INFO: renamed from: a */
    public static C17894F m9947a(C3676s c3676s) {
        try {
            Number width = c3676s.m4395w("width").mo4383q();
            Number height = c3676s.m4395w("height").mo4383q();
            AbstractC16544l.m18093f(width, "width");
            AbstractC16544l.m18093f(height, "height");
            return new C17894F(width, height);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Viewport", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Viewport", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Viewport", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m9948b(InterfaceC7508g interfaceC7508g, AbstractC19694j abstractC19694j) {
        Object objM3211j = AbstractC2124C.m3211j(new C1970n(AbstractC9873d3.m10529c(new C7509h(interfaceC7508g, InterfaceC7508g.class, "connectionState", "getConnectionState()Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", 0)), new C7510i(2, null)), abstractC19694j);
        return objM3211j == EnumC19250a.f61036Y ? objM3211j : C17296C.f55119a;
    }
}
