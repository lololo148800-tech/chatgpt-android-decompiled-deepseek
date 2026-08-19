package p871lf;

import ao.AbstractC11137K;
import bo.AbstractC11523k;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import p559Wn.C8976h;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: lf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C16928l extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C16928l f54365d = new C16928l(AbstractC16526C.f51263a.mo5693b(AbstractC16927k.class));

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        AbstractC16643b abstractC16643b = (AbstractC16643b) AbstractC11523k.m12917j(element).get("status");
        String strMo12922f = abstractC16643b != null ? AbstractC11523k.m12918k(abstractC16643b).mo12922f() : null;
        if (AbstractC16544l.m18089b(strMo12922f, "SUCCESS")) {
            return C16926j.Companion.serializer();
        }
        if (AbstractC16544l.m18089b(strMo12922f, "ERROR")) {
            return C16923g.Companion.serializer();
        }
        throw new C8976h(AbstractC9306j0.m9889h("Unknown status: ", strMo12922f));
    }
}
