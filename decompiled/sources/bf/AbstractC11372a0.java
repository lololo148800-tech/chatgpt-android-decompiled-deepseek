package bf;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;
import p1107xh.EnumC21219I;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: bf.a0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11372a0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f34379a = 0;

    static {
        AbstractC9393x3.m9974d(EnumC21219I.REPORTABLE);
    }

    /* JADX INFO: renamed from: a */
    public static final String m12782a(C20263a0 c20263a0) {
        AbstractC16544l.m18094g(c20263a0, "<this>");
        String value = c20263a0.f64085b;
        AbstractC16544l.m18094g(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12783b(C20263a0 c20263a0) {
        AbstractC16544l.m18094g(c20263a0, "<this>");
        EnumC21219I enumC21219I = EnumC21219I.WORKSPACE_DISABLED;
        ArrayList arrayList = c20263a0.f64087d;
        return (arrayList.contains(enumC21219I) || arrayList.contains(EnumC21219I.INTERACTIONS_DISABLED)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m12784c(C20263a0 c20263a0) {
        return AbstractC16544l.m18089b(c20263a0 != null ? c20263a0.f64088e : null, "snorlax");
    }
}
