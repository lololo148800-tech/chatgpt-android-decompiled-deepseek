package p530Vi;

import ao.C11200y;
import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p1113xn.C21317k;
import p523V9.AbstractC7981R5;
import p559Wn.C8969a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Vi.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C8318n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C8318n f25931Z = new C8318n(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8318n f25932o0 = new C8318n(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25933Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8318n(int i10, int i11) {
        super(i10);
        this.f25933Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f25933Y) {
            case 0:
                EnumC8319o[] values = EnumC8319o.values();
                String[] strArr = {"track", "screen", "alias", "identify", "group"};
                Annotation[][] annotationArr = {null, null, null, null, null};
                AbstractC16544l.m18094g(values, "values");
                C11200y c11200y = new C11200y("com.segment.analytics.kotlin.core.EventType", values.length);
                int length = values.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    EnumC8319o enumC8319o = values[i10];
                    int i12 = i11 + 1;
                    String strName = (String) AbstractC17678l.m19278A(i11, strArr);
                    if (strName == null) {
                        strName = enumC8319o.name();
                    }
                    c11200y.m18453j(strName, false);
                    Annotation[] annotationArr2 = (Annotation[]) AbstractC17678l.m19278A(i11, annotationArr);
                    if (annotationArr2 != null) {
                        for (Annotation annotation : annotationArr2) {
                            c11200y.m18454k(annotation);
                        }
                    }
                    i10++;
                    i11 = i12;
                }
                return new C8969a("com.segment.analytics.kotlin.core.EventType", values, c11200y);
            default:
                String osVersion = System.getProperty("os.version");
                Pattern patternCompile = Pattern.compile("android[0-9][0-9]");
                AbstractC16544l.m18093f(patternCompile, "compile(...)");
                AbstractC16544l.m18093f(osVersion, "osVersion");
                Matcher matcher = patternCompile.matcher(osVersion);
                AbstractC16544l.m18093f(matcher, "matcher(...)");
                C21317k c21317kM8287d = AbstractC7981R5.m8287d(matcher, 0, osVersion);
                if (c21317kM8287d != null) {
                    osVersion = c21317kM8287d.m21659c();
                } else {
                    Pattern patternCompile2 = Pattern.compile("[0-9]+");
                    AbstractC16544l.m18093f(patternCompile2, "compile(...)");
                    Matcher matcher2 = patternCompile2.matcher(osVersion);
                    AbstractC16544l.m18093f(matcher2, "matcher(...)");
                    C21317k c21317kM8287d2 = AbstractC7981R5.m8287d(matcher2, 0, osVersion);
                    if (c21317kM8287d2 != null) {
                        osVersion = c21317kM8287d2.m21659c();
                    }
                }
                return AbstractC17659D.m19244f(new C17309l("os", System.getProperty("os.name") + '-' + osVersion), new C17309l("interpreter", System.getProperty("java.vendor") + '-' + System.getProperty("java.version")), new C17309l("library", "analytics.kotlin"), new C17309l("library_version", "1.18.2"));
        }
    }
}
