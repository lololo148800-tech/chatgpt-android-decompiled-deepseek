package p364Oh;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Oh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6230d extends Exception {

    /* JADX INFO: renamed from: Y */
    public final Object f20292Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6230d(List errors) {
        super(AbstractC9306j0.m9889h("Apollo errors: ", AbstractC17680n.m19349Y(errors, null, null, null, 0, null, C6229c.f20287Z, 31)));
        AbstractC16544l.m18094g(errors, "errors");
        this.f20292Y = errors;
    }
}
