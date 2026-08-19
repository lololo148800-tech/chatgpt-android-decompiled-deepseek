package kotlin.jvm.internal;

import java.util.List;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3758f;
import p225Im.InterfaceC3759g;
import p225Im.InterfaceC3762j;
import p225Im.InterfaceC3764l;
import p225Im.InterfaceC3771s;
import p225Im.InterfaceC3773u;
import p225Im.InterfaceC3775w;
import p225Im.InterfaceC3777y;
import p225Im.InterfaceC3778z;

/* JADX INFO: renamed from: kotlin.jvm.internal.D */
/* JADX INFO: loaded from: classes3.dex */
public class C16527D {
    /* JADX INFO: renamed from: b */
    public InterfaceC3756d mo5693b(Class cls) {
        return new C16537e(cls);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC3758f mo5694c(Class cls, String str) {
        return new C16551s(cls, str);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC3777y mo5695d(InterfaceC3777y interfaceC3777y) {
        C16532I c16532i = (C16532I) interfaceC3777y;
        InterfaceC3757e classifier = interfaceC3777y.getClassifier();
        List arguments = interfaceC3777y.getArguments();
        c16532i.getClass();
        return new C16532I(classifier, arguments, c16532i.f51269o0 | 2);
    }

    /* JADX INFO: renamed from: j */
    public String mo5701j(InterfaceC16539g interfaceC16539g) {
        String string = interfaceC16539g.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: k */
    public String mo5702k(AbstractC16546n abstractC16546n) {
        return mo5701j(abstractC16546n);
    }

    /* JADX INFO: renamed from: l */
    public void mo5703l(InterfaceC3778z interfaceC3778z, List upperBounds) {
        C16530G c16530g = (C16530G) interfaceC3778z;
        c16530g.getClass();
        AbstractC16544l.m18094g(upperBounds, "upperBounds");
        if (c16530g.f51265Z == null) {
            c16530g.f51265Z = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + c16530g + "' have already been initialized.").toString());
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC3777y mo5704m(InterfaceC3757e classifier, List arguments, boolean z6) {
        AbstractC16544l.m18094g(classifier, "classifier");
        AbstractC16544l.m18094g(arguments, "arguments");
        return new C16532I(classifier, arguments, z6 ? 1 : 0);
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC3778z mo5705n(InterfaceC3756d interfaceC3756d) {
        EnumC3744C enumC3744C = EnumC3744C.f11394Y;
        return new C16530G(interfaceC3756d);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC3759g mo5692a(AbstractC16540h abstractC16540h) {
        return abstractC16540h;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC3762j mo5696e(AbstractC16547o abstractC16547o) {
        return abstractC16547o;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC3764l mo5697f(C16549q c16549q) {
        return c16549q;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC3771s mo5698g(AbstractC16552t abstractC16552t) {
        return abstractC16552t;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC3773u mo5699h(C16553u c16553u) {
        return c16553u;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC3775w mo5700i(C16554v c16554v) {
        return c16554v;
    }
}
