package pn;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: pn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C18519f {

    /* JADX INFO: renamed from: a */
    public final Collection f59012a;

    /* JADX INFO: renamed from: b */
    public List f59013b;

    public C18519f(Collection allSupertypes) {
        AbstractC16544l.m18094g(allSupertypes, "allSupertypes");
        this.f59012a = allSupertypes;
        this.f59013b = AbstractC9393x3.m9974d(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
    }
}
