package p1156zj;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p080D0.C1825q0;
import p1039ud.C20198o;
import p125Ej.C2565i;
import p125Ej.C2567k;
import p125Ej.InterfaceC2564h;
import p140Fa.C2685e;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8215v5;
import p531Vj.AbstractC8367f0;
import p531Vj.EnumC8334D;
import p729ej.C13421l;
import p729ej.C13430u;
import p909nm.AbstractC17681o;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.R0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22120R0 {
    /* JADX INFO: renamed from: a */
    public static final void m22354a(C13421l c13421l) {
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69889Z));
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC22180o0 m22355b(C13430u c13430u, boolean z6) {
        AbstractC16544l.m18094g(c13430u, "<this>");
        return z6 ? (AbstractC22180o0) c13430u.f42521b : ((AbstractC22180o0) c13430u.f42521b).mo22377c();
    }

    /* JADX INFO: renamed from: c */
    public static final String m22356c(C22192s0 c22192s0, EnumC22128V0 side, String selectedId) {
        AbstractC16544l.m18094g(c22192s0, "<this>");
        AbstractC16544l.m18094g(side, "side");
        AbstractC16544l.m18094g(selectedId, "selectedId");
        StringBuilder sb2 = new StringBuilder();
        String str = side.f69952Y;
        sb2.append(str);
        sb2.append("-");
        sb2.append(selectedId);
        String string = sb2.toString();
        LinkedHashMap linkedHashMap = c22192s0.f70295e;
        String str2 = (String) linkedHashMap.get(string);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) linkedHashMap.get(str);
        return str3 == null ? "" : str3;
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC22169k1 m22357d(C22195t0 renderProps, EnumC22128V0 currentSide) {
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(currentSide, "currentSide");
        if (currentSide == EnumC22128V0.PassportSignature) {
            return EnumC22169k1.f70147Z;
        }
        return (AbstractC16544l.m18089b(renderProps.f70336b, "US") || currentSide != EnumC22128V0.Back) ? EnumC22169k1.f70148o0 : EnumC22169k1.f70147Z;
    }

    /* JADX INFO: renamed from: e */
    public static final String m22358e(C22192s0 c22192s0, InterfaceC2564h interfaceC2564h) {
        if (AbstractC16544l.m18089b(interfaceC2564h, C2565i.f7997Y)) {
            return c22192s0.f70267F;
        }
        if (AbstractC16544l.m18089b(interfaceC2564h, C2567k.f7999Y)) {
            return c22192s0.f70268G;
        }
        if (interfaceC2564h == null) {
            return null;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: f */
    public static final void m22359f(C13421l c13421l, C2685e c2685e) {
        AbstractC16544l.m18094g(c13421l, "<this>");
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C22109L0(1, 6)));
    }

    /* JADX INFO: renamed from: g */
    public static final void m22360g(Context context, C13421l c13421l, C22195t0 renderProps, boolean z6) {
        AbstractC16544l.m18094g(renderProps, "renderProps");
        ArrayList arrayListM19384m = AbstractC17681o.m19384m(EnumC8334D.f25983Y);
        if (z6 && AbstractC8012V5.m8333f(context)) {
            arrayListM19384m.add(EnumC8334D.f25984Z);
        }
        ArrayList arrayListM8938a = AbstractC8367f0.m8938a(context, arrayListM19384m);
        if (arrayListM8938a.isEmpty()) {
            return;
        }
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1825q0(15, arrayListM8938a)));
    }

    /* JADX INFO: renamed from: h */
    public static void m22361h(AbstractC22180o0 renderState, C13421l c13421l, C22195t0 renderProps, InterfaceC22096F interfaceC22096F, C22130W0 id2, C2685e videoCaptureHelper, C18428A cameraProperties, boolean z6, ArrayList arrayList, int i10, int i11) {
        boolean z10 = (i11 & 128) != 0 ? true : z6;
        List parts = (i11 & 256) != 0 ? renderState.mo22380g() : arrayList;
        int iMo22379f = (i11 & 512) != 0 ? renderState.mo22379f() : i10;
        AbstractC16544l.m18094g(renderState, "renderState");
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(videoCaptureHelper, "videoCaptureHelper");
        AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
        AbstractC16544l.m18094g(parts, "parts");
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C22117P0(renderState, interfaceC22096F, iMo22379f, parts, renderProps, videoCaptureHelper, id2, z10, C2685e.m3662l(renderProps), cameraProperties, null, c13421l)));
    }

    /* JADX INFO: renamed from: i */
    public static final void m22362i(C13421l c13421l, AbstractC22208y0 output, C2685e videoCaptureHelper) {
        AbstractC16544l.m18094g(output, "output");
        AbstractC16544l.m18094g(videoCaptureHelper, "videoCaptureHelper");
        if (!(output instanceof C22206x0) && !(output instanceof C22198u0)) {
            boolean z6 = output instanceof C22204w0;
        }
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C20198o(output, 20)));
    }

    /* JADX INFO: renamed from: j */
    public static final EnumC22094E m22363j(EnumC22128V0 enumC22128V0) {
        AbstractC16544l.m18094g(enumC22128V0, "<this>");
        int iOrdinal = enumC22128V0.ordinal();
        if (iOrdinal == 0) {
            return EnumC22094E.f69838Y;
        }
        if (iOrdinal == 1) {
            return EnumC22094E.f69839Z;
        }
        if (iOrdinal == 2) {
            return EnumC22094E.f69838Y;
        }
        if (iOrdinal == 3) {
            return EnumC22094E.f69839Z;
        }
        if (iOrdinal == 4) {
            return EnumC22094E.f69839Z;
        }
        throw new C0644w();
    }
}
